/*
Question: Move All Zeros to End

Given an array, move all 0s to the end while maintaining the order of non-zero elements.

Do this in-place (without using an extra array).

Input Format
First line: integer N
Second line: N space-separated integers
Output Format
Print the modified array
Example

Input:

7
0 1 0 3 12 0 5

Output:

1 3 12 5 0 0 0
*/
import java.util.Scanner;
class MoveZeroToEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int index=0;
        int arr []=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]!=0)
            {
              arr[index]=arr[j];
              index++;
            }
        }
         for(int i=index;i<n;i++)
        {
            arr[i]=0;
        }
      for(int i=0;i<n;i++)
        {
          System.out.print(arr[i] +" ");
   }
}
}
