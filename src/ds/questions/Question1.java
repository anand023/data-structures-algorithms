package ds.questions;

// there is a list of numbers, in that list find out the sum of any two number is 8.
// eg1: [1,2,3,9]  sum=8  not possible
// eg2: [1,2,4,4]  sum=8  possible
// Note: numbers are in ascending order

import java.util.ArrayList;

public class Question1 {
    // 1st approach is, we can use nested loop and find for the sum but here time complexity will be Big O(n^2)
    public static ArrayList<Integer> quadraticSolution(int[] intArray, int result){
        ArrayList<Integer> found = new ArrayList<>();
        for (int i=0; i<intArray.length; i++){
            for (int j=1; j<intArray.length-1; j++){
                if(result == intArray[i]+intArray[j]){
                    found.add(intArray[i]);
                    found.add(intArray[j]);
                    System.out.println("quadraticSolution : 1st "+intArray[i]+" 2nd "+intArray[j]);
                    return found;
                }
            }
        }
        return found.size() > 0 ? found : found.add(-1)?found:found;  // here Big O(n^2)
    }

    //2nd approach is binary search here big O(n log n)
    public static ArrayList<Integer> linearBinarySearchSolution(int[] intArray, int result){
        ArrayList<Integer> found = new ArrayList<>();
        int n=intArray.length;
        for (int i=0; i<n; i++){ // O(n)
            //binary search
            int l=0,r=n-1,mid=0;
            int temp = intArray[i];
            intArray[i]=0;
            while (l<r){  // O(log n)
                mid =(l+r)/2;
                if (result == (temp + intArray[mid])){
                    found.add(temp);
                    found.add(intArray[mid]);
                    System.out.println("linearBinarySearchSolution : 1st "+temp+" 2nd "+intArray[mid]);
                    return found;
                }else if (result < (temp + intArray[mid])){
                    r=mid-1;
                } else {
                    l=mid+1;
                }
            }
            intArray[i]=temp;
        }
        return found.size() > 0 ? found : found.add(-1)?found:found;
    }

    //3nd approach is linear search here big O(n)
    public static ArrayList<Integer> linearSearchSolution(int[] intArray, int result){
        ArrayList<Integer> found = new ArrayList<>();
        for (int i=0; i<intArray.length;i++){
            if (result < intArray[i]+intArray[intArray.length-1]) return found;
            if (result == intArray[i]+intArray[intArray.length-1]){
                found.add(intArray[i]);
                found.add(intArray[intArray.length-1]);
                System.out.println("linearSearchSolution : 1st "+intArray[i]+" 2nd "+intArray[intArray.length-1]);
                return found;
            }
        }
        return  found.size() > 0 ? found : found.add(-1)?found:found;
    }

    public static void main(String[] args) {
        ArrayList<Integer> found = linearSearchSolution(new int[]{1,2,3,9,}, 8 );
        ArrayList<Integer> found2 = linearSearchSolution(new int[]{1,2,4,4,}, 8 );
        ArrayList<Integer> found3 = quadraticSolution(new int[]{1,2,3,9,}, 8 );
        ArrayList<Integer> found4 = quadraticSolution(new int[]{1,2,4,4,}, 8 );
        ArrayList<Integer> found5 = linearBinarySearchSolution(new int[]{1,2,4,5,}, 8 );
        ArrayList<Integer> found6 = linearBinarySearchSolution(new int[]{1,2,4,4,}, 8 );

    }

}
