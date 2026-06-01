/* Candy Store

Problem Statement

Chef has started working at a candy store. Every day, he is assigned a sales target of X chocolates.

- For each chocolate sold up to the target, Chef earns 1 rupee.
- If Chef sells more than the target, he earns 2 rupees for each extra chocolate sold beyond the target.

Given the daily target X and the actual number of chocolates sold Y, determine the total amount Chef earns for the day.

Input Format

- The first line contains an integer T, the number of test cases.
- Each test case contains two space-separated integers:
  X — Chef's daily sales target.
  Y — Number of chocolates actually sold.

Output Format

For each test case, print the total amount Chef earns in a day.

Constraints

1 ≤ T ≤ 100
1 ≤ X, Y ≤ 10

Sample Input

4
3 1
5 5
4 7
2 3

Sample Output

1
5
10
4
*/
import java.util.Scanner;

public class Candy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            if(y<=x)
            {
                System.out.println(y);
            }
            else
            {
                int exceeded=y-x;
                System.out.println(y+exceeded);
            }
        }
    }
}


