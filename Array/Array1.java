// Data Structure :-
// A data structure is a storage that is used to store and organize data. It is a way of arranging data on a computer so that it 
// can be accessed and updated efficiently.
// Types :-
// Linear data structure
        // Static data structure
                // Array
        // Dynamic data structure
                // Queue, Stack
// Non Linear data structure
        // Trees and Graphs.


// Array :- An array is a collection of items stored at contiguous memory locations. The idea is to store multiple items of the 
// same type together.

// prob. 1  Rearrange an array such that arr[i] = i
            // Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
            // Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
        // Time :- O(n2)
        // Space :- O(1)

// prob. 2  Move all zeroes to end of array
            // Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
            // Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
        // Time :- n(log(n))
        // Space :- O(1)

// Prob. 3  Rearrange array such that even positioned are greater than odd
            // Input : A[] = {1, 2, 2, 1}
            // Output :  1 2 1 2  

            // Input  : A[] = {1, 3, 2, 2, 5}
            // Output : 1 5 2 3 2
        // Time :- O(n*log n)
        // Space :- O(n)

import java.util.*;
public class Array1 {
    public static void fixArray(int[] arr,int n){
        int temp=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[j]==i){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    break;
                }
            }
        }
        for(int i=0; i<n; i++){
            if (arr[i] != i){
                arr[i] = -1;
            }
        }
        System.out.println("Array after Rearranging");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        // Time :- O(n2)
        // Space :- O(1)
    }
    // First Function End..................
    
    public static void moveAllZeroToEnd(int[] arr,int n){
        Arrays.sort(arr);
        System.out.println("Array after pushing all zeros End of the Array");
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        // Time :- n(log(n))
        // Space :- O(1)
    }
    // Second Function End..................

    public static void reArrangingEvenOdd(int[] arr, int n){
        Arrays.sort(arr);
        int a[] = new int[n];
        // Two Pointer
        int ptr1 = 0, ptr2 = n - 1;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 0)
                a[i] = arr[ptr2--];
            else
                a[i] = arr[ptr1++];
        }
        System.out.println("Array after Rearranging");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        // Time :- O(n*log n)
        // Space :- O(n)
    }
    // Second Function End..................
    
    public static void main(String[] args){
        int arr[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        int n = arr.length;
        fixArray(arr, n);
        System.out.println("");
        System.out.println("");


        int arr2[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int n2 = arr2.length;
        moveAllZeroToEnd(arr2, n2);
        System.out.println("");
        System.out.println("");
        
        int arr3[] = {1, 3, 2, 2, 5};
        int n3 = arr3.length;
        reArrangingEvenOdd(arr3, n3);
    }
    
}
