/*
Student Attendance Evaluation

Problem Statement

A school wants to evaluate a student’s attendance performance over several days.

Attendance is represented as:

1 → Present
0 → Absent

Write a Java program to count the total number of present and absent days.

After counting:

- If present days are greater than absent days, print "Good Attendance".
- Otherwise, print "Poor Attendance".

Input Format

- First line contains an integer N representing the number of days.
- Second line contains N space-separated integers (0 or 1) representing attendance.

Output Format

- Print "Good Attendance" if present days are greater than absent days.
- Otherwise print "Poor Attendance".

Constraints

1 ≤ N ≤ 100

Example 1

Input
6
1 1 0 1 0 1

Output
Good Attendance

Explanation

Present days = 4
Absent days = 2

Since present days are greater than absent days, the output is "Good Attendance".

Example 2

Input
5
1 0 0 1 0

Output
Poor Attendance
*/
import java.util.Scanner;
class Attendance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int present=0;
        int absent=0;
        for(int i=1;i<=n;i++)
        {
            int attend=sc.nextInt();
            if(attend==1)
            {
                present++;
            }
            else
            {
                absent++;
            }
        }
        if(present>absent)
        {
            System.out.println("Good Attendance");
        }
        else
        {
            System.out.println("Poor Attendance");
        }
    }
}
