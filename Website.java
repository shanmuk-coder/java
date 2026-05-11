/*
Problem: Daily Website Visitors
Problem Statement

A website tracks the number of visitors it receives each day for N days.

Write a Java program to:

Calculate the total number of visitors.
Find the day with the highest number of visitors.
Find the day with the lowest number of visitors.

Note:

Days are numbered starting from 1.
Input Format
The first line contains an integer N — number of days.
The second line contains N space-separated integers representing the number of visitors each day.
Output Format

Print:
Total number of visitors
Day with maximum visitors
Day with minimum visitors

Example
Input
5
120 450 300 90 500
Output
Total Visitors: 1460
Day with Maximum Visitors: 5
Day with Minimum Visitors: 4
*/
import java.util.Scanner;

class Website
{
  public static void main(String[] args) {
        Scanner shannu = new Scanner(System.in);

        int n = shannu.nextInt();
        int arr[] = new int[n];

        int totalVisitors = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = shannu.nextInt();
            totalVisitors = totalVisitors + arr[i];
        }

        int min = arr[0];
        int max = arr[0];
        int minDay = 1;
        int maxDay = 1;

        for(int i = 0; i < n; i++) {

            if(arr[i] < min) {
                min = arr[i];
                minDay = i + 1;
            }

            if(arr[i] > max) {
                max = arr[i];
                maxDay = i + 1;
            }
        }

        System.out.println("Total Visitors: " + totalVisitors);
        System.out.println("Day with Maximum Visitors: " + maxDay);
        System.out.println("Day with Minimum Visitors: " + minDay);
    }
}
