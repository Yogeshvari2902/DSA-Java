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
    }
    public static void main(String[] args){
        int n, arr[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
            n = arr.length;

        fixArray(arr, n);
    }
    
}
