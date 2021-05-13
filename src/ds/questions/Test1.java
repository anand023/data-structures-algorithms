package ds.questions;

// there is a list of numbers, in that list find out the sum of any two number is 8.
// eg1: [1,2,3,9]  sum=8  not possible
// eg2: [1,2,4,4]  sum=8  possible
// Note: numbers are in ascending order

import java.util.ArrayList;

public class Test1 {
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
        return found;  // here Big O(n^2)
    }

    //2nd approach is binary search here big O(n log n)
    public static ArrayList<Integer> binarySearchSolution(int[] intArray, int result){
        ArrayList<Integer> found = new ArrayList<>();
        // TODO need to implement
        return  found;
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
        return  found;
    }

    public static void main(String[] args) {
        ArrayList<Integer> found = linearSearchSolution(new int[]{1,2,3,9,}, 8 );
        ArrayList<Integer> found2 = linearSearchSolution(new int[]{1,2,4,4,}, 8 );
        ArrayList<Integer> found3 = quadraticSolution(new int[]{1,2,3,9,}, 8 );
        ArrayList<Integer> found4 = quadraticSolution(new int[]{1,2,4,4,}, 8 );

    }

}
