/*
Problem: Calculate Average of N Numbers

You are given an integer N, representing the number of elements.

Then you are given N integers. Your task is to compute the average of these numbers and print the result.

📥 Input Format

First line contains an integer N
Second line contains N space-separated integers

📤 Output Format

Print the average of the given numbers as a floating-point value

🔒 Constraints
1≤N≤10

📌 Example

Input

5
10 20 30 40 50

Output

30.0
*/

import java.util.*;
class AvgArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        if(n == 0) 
        {
             System.out.println("Invalid input");
               return;
        }
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            sum=sum+num;
        }
        float avg=sum/n;
        System.out.println(avg);
        
    }
}
