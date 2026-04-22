/*
X Jumps

Chef is currently standing at stair 0 and he wants to reach stair numbered X.
Chef can climb either Y steps or 1 step in one move.
Find the minimum number of moves required by him to reach exactly the stair numbered X.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single line of input containing two space-separated integers X and Y, denoting:
X → the stair Chef wants to reach
Y → the number of stairs he can climb in one move

Output Format
For each test case, output the minimum number of moves required.

Constraints
1≤T≤500
1≤X,Y≤100
*/

import java.util.*;

class XJumps
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i=1;i<=t;i++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                // Using integer division and modulo
                int result = (x / y) + (x % y);
                System.out.println(result);
            }
    }
}
