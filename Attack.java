/*
Problem: Single-use Attack

Chef is playing a video game and is fighting the final boss.

The boss has H health points.

Each normal attack by Chef decreases the boss's health by X points.

Chef also has a special attack that can be used at most once, which decreases the boss's health by Y points.

Chef wins when the boss's health becomes less than or equal to 0.

Find the minimum number of attacks Chef needs to defeat the boss.

Input Format:
- The first line contains an integer T, the number of test cases.
- Each test case contains three space-separated integers:
  H X Y

Output Format:
For each test case, print the minimum number of attacks required to defeat the boss.

Constraints:
1 ≤ T ≤ 1000
1 ≤ X < Y ≤ H ≤ 100

Sample Input:
4
100 25 40
100 29 45
46 1 2
78 15 78

Sample Output:
4
3
45
1
*/
code:
import java.util.Scanner;
class Attack
{
 public static void main (String[] args) {
     Scanner sc =new Scanner(System.in);
     int t=sc.nextInt();
     for(int i=1;i<=t;i++)
     {
         int Attack=0;
         int h=sc.nextInt();
         int x=sc.nextInt();
         int y=sc.nextInt();
         int r=h-y;
         Attack++;
         if(r<=0)
         {
             System.out.println(Attack);
             continue;
         }
         else{
             int normalAttack=(int)Math.ceil(r/(double)x);
             Attack=Attack + normalAttack;
            
         }
         System.out.println(Attack);
        
     }
 }
        
}
