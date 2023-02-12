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
    //-------------------------------------------------------------------------------------//

//Prob. 2 "Man of the Match"

// Description
// Team RCB has successfully chased a total and finally won their first match in the IPL after a string of losses. Interestingly, the openers managed it comfortably and no wicket fell during their innings in this match.
// The openers Virat Kohli and AB de Villiers played a total of n overs to chase their target. You are presented with an array of size 6n (because 1 over is equal to 6 balls) which consists of the runs scored in that particular ball.
// You know that AB de Villiers took the strike initially and played the first ball.
// You have to find out who scored more runs during the match after n overs to decide the Man of the Match.
// Print "Virat Kohli" if Virat scored more, else "AB de Villiers".Print "Tie" incase when both scored equal runs.

// Note-
// The array consist of values {0,1,2,3,4,6}. There are no extras.
// The strike rotates after every 6 balls or if 1 or 3 run is taken.

// Input
// The first line of the input contains one integer t (1 ≤ t ≤ 100) — the number of test cases. Then t test cases follow.
// The first line of each test case contains a single integer n (1 ≤ n ≤ 20) — the number of overs played by the team.
// The second line of each test case contains 6n integers (Ai -> {0,1,2,3,4,6}) — The runs scored in each ball.

// Output
// For each test case, print the answer. The Man of the Match of the game.


// Sample Input 1 
// 3
// 2
// 1 2 0 0 1 1 6 6 4 1 6 1
// 3
// 0 0 0 0 0 1 0 0 0 0 1 1 6 6 6 1 4 4
// 1
// 0 1 0 1 0 0

// Sample Output 1
// AB de Villiers
// Virat Kohli
// Tie


    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        int arr1[] = {13, 89, 81, 66, 81, 63, 71, 76, 73, 81};            
        int n1 = arr1.length;
        firstBagger(arr1,n1);

        Scanner sc=new Scanner(System.in);
        int t=3;
        while(t-->0){
            int s=2;
            int n=s*6;
            int aa[]=new int[n];
            int a=0,v=0,b=0;
            boolean flag=true;
            for(int i=0;i<n;i++)
            aa[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                if(flag){
                    a+=aa[i];
                    b++;
                    if(aa[i]==1||aa[i]==3)
                    flag=false;
                }
                else {
                    v+=aa[i];
                    b++;
                    if(aa[i]==1||aa[i]==3)
                    flag=true;
                }
                if(b%6==0){
                    if(flag)
                    flag=false;
                    else
                    flag=true;
                }
            }
            if(v==a)
            System.out.println("Tie");
            else if(v>a)
             System.out.println("Virat Kohli");
            else
              System.out.println("AB de Villiers");
        }
           
    }
}
    

