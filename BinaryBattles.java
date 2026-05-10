/*
Binary Battles

Problem Statement

N teams have come to participate in a competitive coding event called “Binary Battles”. It is a single-elimination tournament consisting of several rounds.

It is guaranteed that N is a power of 2.

In each round:
- Every team competes against exactly one other team.
- If there are X teams before a round, then X/2 matches are played.
- The winner of each match advances to the next round.
- The losing teams are eliminated.

The tournament continues until only one team remains, who becomes the overall winner.

Each round takes A minutes to complete, and there is a break of B minutes between consecutive rounds. There is no break after the final round.

Your task is to determine the total time required to complete the tournament.

Input Format

- The first line contains an integer T — the number of test cases.
- Each test case contains three space-separated integers:
  N A B
  where:
  - N = number of teams
  - A = duration of each round in minutes
  - B = break time between rounds in minutes

Output Format

For each test case, print the total time required to complete the tournament.

Constraints

1 ≤ T ≤ 10^5
2 ≤ N ≤ 2^20
1 ≤ A ≤ 100
1 ≤ B ≤ 100

N is always a power of 2.

Sample Input

4
4 10 5
16 30 5
32 45 15
1024 23 9

Sample Output

25
135
285
311

*/
code:
import java.util.*;

class BinaryBattles
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i=1;i<=t;i++)
		{
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			int rounds = 0;

			while(n > 1)
			{
				rounds++;
				n = n / 2;
			}

			int totalTime = (rounds * a) + ((rounds - 1) * b);

			System.out.println(totalTime);
		}
	}
}
