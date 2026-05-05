/*
Problem Statement: Bubble Sort Implementation

You are given an integer N representing the number of elements in an array.

Then you are given N integers. Your task is to sort the array in ascending order using the Bubble Sort algorithm.

Input Format

First line contains an integer N
Second line contains N space-separated integers

Output Format

Print the sorted array in ascending order

Example
Input:

5
5 2 9 1 3

Output:

1 2 3 5 9
*/
code:
import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
