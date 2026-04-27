/*
Problem: Check if an Array is Sorted

You are given an integer N representing the number of elements in an array.

You are then given N integers. Your task is to determine whether the array is sorted in non-decreasing order (each element is greater than or equal to the previous one).

Input Format
First line contains an integer N
Second line contains N space-separated integers

Output Format
Print "The Array is sorted." if the array is sorted
Otherwise, print "The Array is not sorted."
*/
import java.util.Scanner;
class Sort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
         
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
            System.out.println("The Array is not sorted.");
            return;
            }
        }
        System.out.println("The Array is sorted.");
    }
}
