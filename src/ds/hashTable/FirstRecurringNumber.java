package ds.hashTable;

//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1

//Given an array = [2,3,4,5]:
//It should return undefined

import org.jetbrains.annotations.NotNull;

import java.util.Hashtable;

public class FirstRecurringNumber {

    public static void main(String[] args) {
        System.out.println(findFirstRecurring2(new int[]{5,6,6,7,18,10,5}));
    }

    // Big O(n)
    public static int findFirstRecurring(int[] a){
        Hashtable<Integer, Integer> hash=new Hashtable(); //keeping {key : a[i], value : i}
        for (int i=0; i<a.length; i++){
            if (hash.containsKey(a[i])){ /* average case this will be O(1), and in worse case O(n) meaning: in case of collision and suppose we are having only 1 or 2 memory space assign for or remaining in heap. */
                return a[i];
            } else {
                hash.put(a[i], i);
            }
        }
        return -1;
    }
    // Big O(n^2)
    public static int findFirstRecurring2(int[] a){
        //{5,6,6,7,18,10,5}
        int index=-1;
        int value=-1;
        for (int i=0; i<a.length;i++){
            for (int j=i+1; j<a.length; j++){
                if (a[i] == a[j]){
                    if (index >= j){
                        index=j;
                        value= a[j];
                    }else {
                        value= a[j];
                    }
                }else{
                    index=j;
                }
            }
        }
        return value;
    }
}
