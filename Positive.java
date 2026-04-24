/*
Problem: Count Positive Numbers

You are given an integer N and an array of N integers. Your task is to count how many numbers in the array are positive (greater than 0).

📥 Input Format

First line contains an integer N
Second line contains N space-separated integers

Output Format

Print a single integer representing the count of positive numbers

Example

Input

5
-1 2 0 4 -3


Output

2
/*
import java.util.*;
class Positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>0)
            {
                count++;
            }
            
        }
        System.out.println(count);
    }
}
