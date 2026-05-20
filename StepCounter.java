/*
Problem: Daily Step Counter

A fitness app records the number of steps walked by a user each day.

Write a Java program to calculate:

- Total steps walked
- Number of active days
- Highest steps walked in a single day

A day is considered active if the user walks at least 5000 steps.

If the entered steps are less than or equal to 0, print:

Invalid Input

and terminate immediately.

Input Format

- First line contains an integer N representing number of days.
- Next N lines contain the number of steps walked each day.

Output Format

Display:

Total Steps: <total>
Active Days: <activeDays>
Highest Steps: <highest>

or

Invalid Input

Example 1

Input
5
4000
6000
8000
3000
7000

Output
Total Steps: 28000
Active Days: 3
Highest Steps: 8000
*/
code:
import java.util.Scanner;
class StepCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int totalsteps=0;
        int maxstep=0;
        int activedays=0;
        for(int i=1;i<=n;i++)
        {
            int steps=sc.nextInt();
              if(steps<=0)
            {
                System.out.println("Invalid Input");
                return;
            }
            totalsteps=totalsteps+steps;
            if(steps>=5000)
            {
                activedays++;
            }
          
            if(steps>maxstep)
            {
                maxstep=steps;
            }
         
        }
           System.out.println("Total Steps: " +totalsteps);
            System.out.println("Active Days: " +activedays);
            System.out.println("Highest Steps: " +maxstep);
    }
}
