## Question and solution : 
1. There is a list of numbers, in that list find out the sum of any two number is 8.
    + list is shorted.
    
   **Refer** Question1.java
2. Suppose we had an algorithm that took array of strings, sorted each string, and then sorted the full array. what would the runtime be?
    **Refer** Question2.jave
   
        void binarySearch(int[] intArray, int n){
            int l=0,r=n-1,mid=0;
            while (l<r){  // O(log n) bcz no. of operation is, suppose, if size of input 10 then 2^4=16 & 2^3=8 and 10 > 8 & 10<16 so here 2^4=16 => log 16 =4 will be correct and it can be represent in log like log n = 4 where n=16  
               mid =(l+r)/2; // floor value bcz of int
               if (result == (intArray[i] + intArray[mid])){
                  System.out.println("linearBinarySearchSolution : 1st "+intArray[i]+" 2nd "+intArray[mid]);
                  return ;
               }else if (result < (intArray[i] + intArray[mid])){
                  r=mid-1;
               } else {
                  l=mid+1;
               }
            }
        }
