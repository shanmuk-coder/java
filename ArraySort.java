/*
Problem Statement: Sort an Array

You are given an integer N, representing the number of elements in an array.

Your task is to:

Read N integers from the user.

Sort the array in ascending order.

Print the sorted array, with each element on a new line.

Input Format

First line: An integer N (size of the array) .Second line: N space-separated integers

Output Format

Print the sorted array elements in ascending order
Each element should be printed on a new line

Example
Input
5
4 2 8 1 3
Output
1
2
3
4
8
*/

import java.util.*;
class ArraySort {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int [n];
for(int i=0;i<n;i++)
{
  arr[i]=sc.nextInt();
}
  Arrays.sort(arr);
for(int i=0;i<n;i++)
{
  System.out.print(arr[i] +" ");
}
}
}
