// package DSA-Java.Mock Evaluations;
import java.util.*;
public class Mock1 {

// Prob.1  "First bigger Ended"

// Description
// You are given n numbers and you have to answer q queries. In each query, you will be provided with a number k and you have to find the first number which is greater than k.
// For instance, if there are 7 numbers 9,5,8,1,2,3,4 and k is 6, then there are 2 numbers greater than 6 => 8 and 9, but the first element greater than it is 8. So, print 8.
// In case there is no number greater than k in the array, print -1

// Input
// Input Format
// The first line of input contains n
// Next line contains n space separated integers
// After that, you are given q
// In the next q lines, you are provided k in each line

// Constraints
// 1 <= n <= 1000000
// 1 <= values in array, k <= 10000000
// 1 <= q <= 10

// Output
// Output q numbers based on problem statement given above


// Sample Input 1 
// 10
// 13 89 81 66 81 63 71 76 73 81
// 2
// 65
// 15
// Sample Output 1
// 66
// 63
    public static void firstBagger(int[] arr,int n){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();        
        while(s-- >0){
            int t=sc.nextInt();
            int min = 10000000;
            int u=0;
            for(int i=0;i<n;i++){
                if(arr[i]>t){
                    if(min > arr[i]){
                        min=arr[i];
                    }
                u=1;
                }
            }
            if(u==0){
                System.out.println(-1);
            }
            else{
                System.out.println(min);
            }
        }
    }

    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        int arr1[] = {13, 89, 81, 66, 81, 63, 71, 76, 73, 81};            
        int n1 = arr1.length;
        firstBagger(arr1,n1);
           
    }
}
    

