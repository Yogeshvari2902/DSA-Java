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

import java.util.*;
public class Array1 {

    // prob. 1  Rearrange an array such that arr[i] = i
            // Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
            // Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

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
        // Time Complexity:- O(n2)
        // Auxiliary Space :- O(1)
    }
    
    
    // prob. 2  Move all zeroes to end of array
            // Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
            // Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};

    public static void moveAllZeroToEnd(int[] arr,int n){
        Arrays.sort(arr);
        System.out.println("Array after pushing all zeros End of the Array");
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        // Time Complexity:- n(log(n))
        // Auxiliary Space :- O(1)
    }
    
    
    // Prob. 3  Rearrange array such that even positioned are greater than odd
                // Input : A[] = {1, 2, 2, 1}
                // Output :  1 2 1 2  

                // Input  : A[] = {1, 3, 2, 2, 5}
                // Output : 1 5 2 3 2
          
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
        // Time Complexity:- O(n*log n)
        // Space Complexity:- O(n)
    }
    

    // Prob. 4 Rearrange an array in maximum minimum form using Two Pointer Technique
            // Input: arr[] = {1, 2, 3, 4, 5, 6, 7} 
            // Output: arr[] = {7, 1, 6, 2, 5, 3, 4}

    public static void reArrangingMaxMin(int[] arr, int n){
        // Two Pointer
        int ptr1=0, ptr2=n-1;
        int temp[] = new int[n];
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag)
                temp[i] = arr[ptr2--];
            else
                temp[i] = arr[ptr1++];
  
            flag = !flag;
        }
        System.out.println("Array after Rearranging");
        for(int i=0; i<n; i++){
            System.out.print(temp[i]+" ");
        }
        // Time Complexity:- O(n)
        // Auxiliary Space :- O(n)
    }
    

    // Prob. 5 Segregate even and odd numbers | Set 3
                // Input: arr[] = 1 9 5 3 2 6 7 11
                // Output: 2 6 5 3 1 9 7 11
      
    public static void segregateEvenOdd(int[] arr, int n){
        // Brute-Force Solution :
        
        // Time Complexity: O(n)
        // Auxiliary Space: O(n) 
        
        // int idx=0;
        // int A[]=new int[n];
        // for(int i=0; i<n; i++){
        //     if(arr[i]%2==0){
        //         A[idx]=arr[i];
        //         idx++;
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     if(arr[i]%2!=0){
        //         A[idx]=arr[i];
        //         idx++;
        //     }
        // }

        // Optimized Approach:

        // Time Complexity: O(n)
        // Auxiliary Space: O(1) 

        int h = -1, j = 0;
        while (j != n) {
            if (arr[j] % 2 == 0)
            {
                h++;
                int temp = arr[h];
                arr[h] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        System.out.println("Array after Segregate Even & Odd");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }


    // Prob. 6 Reversal algorithm for Array rotation
            // Input:  arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
            // Output: 3, 4, 5, 6, 7, 1, 2
       
    public static void leftRotate(int[] arr, int d){
        if(d==0)
            return;

        int n = arr.length;
        d = d % n;
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
        // Time Complexity: O(N)
        // Space Complexity: O(1)
    }
    static void reverseArray(int[]arr,int s,int e){
        int temp;
        while(s<e){
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }
    static void  printArray(int[] arr){
        System.out.println("Array after Rotating with Even Odd");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // Prob. 7 Print left rotation of array in O(n) time and O(1) space
        // Input : 
        // arr[] = {1, 3, 5, 7, 9}
        // k1 = 1
        // k2 = 3
        // k3 = 4
        // k4 = 6
        // Output : 
        // 3 5 7 9 1
        // 7 9 1 3 5
        // 9 1 3 5 7
        // 3 5 7 9 1

    public static void leftRotation(int arr[], int n, int k){
        int mod = k % n;
        System.out.println("Array after Rotating");
        for (int i = 0; i <n-1; ++i)
            System.out.print(arr[(i + mod) % n] + " ");
 
        System.out.println();
    }

    

    // Prob. 8 K???th Smallest/Largest Element in Unsorted Array
                // Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
                // Output: 7

    public static void kthSmallest(int[] arr, int K){
        Arrays.sort(arr);
        System.out.print("K'th smallest element is :- ");
        System.out.print(arr[K - 1]);

        // Time Complexity: O(N log N)
        // Auxiliary Space: O(1) 
    }


    // Prob. 9 Find the largest three distinct elements in an array
                // Input: arr[] = {10, 4, 3, 50, 23, 90}
                // Output: 90, 50, 23

    public static void find3Largest(int[] arr,int n){
        Arrays.sort(arr);
        int check = 0;
        int count = 1;
        System.out.println("3 Largest Elememnts are: ");
        for(int i=0; i<n; i++){
            if(count<4){
                if(check != arr[n-i]){
                    System.out.print(arr[n-i]+" ");
                    check = arr[n-i];
                    count++;
                }
            }
        }
    }

    // Prob. 10 Find Second largest element in an array
                    // Input: arr[] = {12, 35, 1, 10, 34, 1}
                    // Output: The second largest element is 34.

    public static void secondLargest(int[] arr,int n){
        if (n < 2){
          System.out.printf("lnvalid Input ");
          return;
        }
        Arrays.sort(arr);
        System.out.println("The 2nd Largest Elelment is: ");
        for(int i=n-2; i>=0; i--){
            if(arr[i]!=arr[n-1]){
                System.out.print(arr[i]);
                return;
            }
            else{
                System.out.print("There is no 2nd Largest Elelment");
            }
        }
        // Time Complexity: O(n log n). 
            // The time required to sort the array is O(n log n).
        // Auxiliary space: O(1). 
            // As no extra space is required.
    }

    // Prob. 11 Sort an array in wave form
                    //Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
                    // Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80}

    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void sortInWave(int arr[], int n){
        // Traverse all even elements
        for(int i = 0; i < n-1; i+=2){
            //swap odd and even positions
            if(i > 0 && arr[i - 1] > arr[i])
              swap(arr, i, i-1);
              if(i < n-1 && arr[i + 1] > arr[i])
              swap(arr, i, i+1);
        }
        // Time Complexity: O(N)
        // Auxiliary Space: O(1)
    }

    // Prob. 12 Sort an array which contain 1 to n values
                // Input : arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
                // Output : 1 2 3 4 5 6 7 8 9 10
    public static void sortArray(int[] arr){
        int i = 0;
        while (i < arr.length) {
            // Finding the correct index
            int cor = arr[i] - 1;
 
            // Element index and value not match
            // then swapping
            if (arr[cor] != arr[i]) {
                swap(arr, i, cor);
            }
            else {
                i++;
            }
        }
        // Time Complexity: O(n)
        // Auxiliary Space: O(1)
    }          
    
    // Prob. 13 Count the number of possible triangles
                // Input: arr= {4, 6, 3, 7}
                // Output: 3

    public static void findTriangles(int[] arr){
        // Two Pointer  It is effient Approach
        // We can also solve using 3 loops but it incresease time complexity O(N3)
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for(int i=n-1; i>=1; i--){
            int ptr1=0, ptr2=i-1;
            while(ptr1 < ptr2){
                if(arr[ptr1]+arr[ptr2]>arr[i]){
                    count+=ptr2-ptr1;
                    ptr2--;
                }
                else{
                    ptr1++;
                }
            }
        }
        System.out.print("No of possible Traingles: \n"+ count);
        // Time complexity: O(N2)
        // Auxiliary Space: O(1)
    } 

    
    // Prob. 14 Print All Distinct Elements of a given integer array
                // Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
                // Output: 12, 10, 9, 45, 2

    public static void printDistinct(int[] arr,int n){
        // Arrays.sort(arr);
        // System.out.print("Distinct Elememnts\n");
        // for(int i=0; i<n; i++){
        //     while(i<n-1 && arr[i]==arr[i+1]){
        //         i++;
        //     }
        //     System.out.print(arr[i]+" ");
        // }
        // Time Complexity: O(n log n).
        // Auxiliary Space: O(1)


        HashSet<Integer> ss = new HashSet<>();
        System.out.print("Distinct Elememnts\n");
        for (int i=0; i<arr.length; i++)
        {
            // If not present, then put it in hashtable and print it
            if (!ss.contains(arr[i]))
            {
                ss.add(arr[i]);
                System.out.print(arr[i] + " ");
            }
        }
        // Time Complexity: O(n).
        // Auxiliary Space: O(n)
    }

    // Prob. 15 Find the element that appears once in an array where every other element appears twice
                // Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
                // Output: 2
                
    public static int eleAppearsOnce(int[] arr,int n){
        for (int i = 0; i<n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
              if (arr[i] == arr[j]) {
                count++;
              }
            }
            if (count == 1) {
              return arr[i];
            }
          }
          // if no element exist at most once
          return -1;
    }

    // Prob. 16 Find Subarray with given sum | Set 1 (Non-negative Numbers)
                // Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
                // Output: Sum found between indexes 2 and 4

    public static void subarrayWithGivenSum(int[] arr,int sum){
        int n = arr.length, start = 0,currSum = 0;
        for(int i=0; i<n; i++){
            currSum+=arr[i];
            if(currSum > sum){
                currSum -= arr[start];
                start++;
            }
            if(currSum == sum){
                System.out.print("");
            }
        }
    }
    public static void main(String[] args){
        int arr[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
        int n = arr.length;
        fixArray(arr, n);
        System.out.println("\n");

        int arr2[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int n2 = arr2.length;
        moveAllZeroToEnd(arr2, n2);
        System.out.println("\n");
        
        int arr3[] = {1, 3, 2, 2, 5};
        int n3 = arr3.length;
        reArrangingEvenOdd(arr3, n3);
        System.out.println("\n");

        int arr4[] = {1, 2, 3, 4, 5, 6, 7};
        int n4 = arr4.length;
        reArrangingMaxMin(arr4,n4);
        System.out.println("\n");

        int arr5[] = {1, 9, 5, 3, 2, 6, 7, 11};
        int n5 = arr5.length;
        segregateEvenOdd(arr5, n5);
        System.out.println("\n");

        int arr6[] = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;
        leftRotate(arr6, d);
        printArray(arr6);
        System.out.println("\n");


        // int arr7[] = { 1, 3, 5, 7, 9 };
        // int n7 = arr.length-1;
        // int k = 2;
        // leftRotation(arr7, n7, k);
        // k = 3;
        // leftRotation(arr7, n7, k);
        // k = 4;
        // leftRotation(arr7, n7, k);


        int arr8 [] = {7, 10, 4, 3, 20, 15};
        int K = 3;
        kthSmallest(arr8, K);
        System.out.println("\n");
      
        int arr9[] = {10, 4, 3, 50, 23, 90};
        int n9 = arr9.length-1;
        find3Largest(arr9, n9);
        System.out.println("\n");

        int arr10[] = {12, 35, 1, 10, 34, 1};
        int n10 = arr10.length;
        secondLargest(arr10, n10);
        System.out.println("\n");

        int arr11[] = {10, 5, 6, 3, 2, 20, 100, 80};
        int n11 = arr.length-1;
        sortInWave(arr11,n11);
        System.out.println("Sorted Array in Wave form");
        for(int i : arr11){
            System.out.print(i+" ");
        }
        System.out.println("\n");

        int arr12[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
        sortArray(arr12);
        System.out.println("Sorted Array");
        System.out.print(Arrays.toString(arr12));
        System.out.println("\n");

        int arr13[] = { 10, 21, 22, 100, 101, 200, 300 };
        findTriangles(arr13);
        System.out.println("\n");

        int arr14[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n14 = arr14.length;
        printDistinct(arr14, n14);
        System.out.println("\n");

        int arr15[] = {2, 3, 5, 4, 5, 3, 4};
        int n15 = arr15.length;
        System.out.println("Element Once in an Array");
        System.out.print(eleAppearsOnce(arr15, n15));
        System.out.println("\n");
        

        int arr16[] = {1, 4, 20, 3, 10, 5};
        int n16 = arr.length;
        // printArray(arr16,n16);
    }
    
}
