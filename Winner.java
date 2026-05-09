/*
The Lead Game

The game of billiards involves two players knocking 3 balls around on a green baize table. Well, there is more to it, but for our purposes this is sufficient.

The game consists of several rounds and in each round both players obtain a score, based on how well they played. Once all the rounds have been played, the total score of each player is determined by adding up the scores in all the rounds and the player with the higher total score is declared the winner.

The Siruseri Sports Club organises an annual billiards game where the top two players of Siruseri play against each other. The Manager of Siruseri Sports Club decided to add his own twist to the game by changing the rules for determining the winner. In his version, at the end of each round, the cumulative score for each player is calculated, and the leader and her current lead are found. Once all the rounds are over the player who had the maximum lead at the end of any round in the game is declared the winner.

Consider the following score sheet for a game with 5 rounds:

Round    Player 1    Player 2
1        140         82
2        89          134
3        90          110
4        112         106
5        88          90

The total scores of both players, the leader and the lead after each round for this game is given below:

Round    Player 1    Player 2    Leader      Lead
1        140         82          Player 1    58
2        229         216         Player 1    13
3        319         326         Player 2    7
4        431         432         Player 2    1
5        519         522         Player 2    3

Note that the above table contains the cumulative scores.

The winner of this game is Player 1 as he had the maximum lead (58 at the end of round 1) during the game.

Your task is to help the Manager find the winner and the winning lead. You may assume that the scores will be such that there will always be a single winner. That is, there are no ties.

Input

The first line of the input contains a single integer N (N ≤ 10000) indicating the number of rounds in the game.

The next N lines contain two integers Si and Ti, the scores of Player 1 and Player 2 respectively in round i.

Constraints

1 ≤ Si ≤ 1000
1 ≤ Ti ≤ 1000

Output

Print two integers:

W → the winner (1 or 2)
L → the maximum lead attained by the winner

Sample Input

5
140 82
89 134
90 110
112 106
88 90

Sample Output
1 58
*/
import java.util.Scanner;

class Winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalRounds = sc.nextInt();

        int totalScorePlayer1 = 0;
        int totalScorePlayer2 = 0;

        int maximumLead = 0;
        int winningPlayer = 0;

        for(int round = 1; round <= totalRounds; round++) {

            int currentScorePlayer1 = sc.nextInt();
            int currentScorePlayer2 = sc.nextInt();

            totalScorePlayer1 = totalScorePlayer1 + currentScorePlayer1;
            totalScorePlayer2 = totalScorePlayer2 + currentScorePlayer2;

            int scoreDifference = totalScorePlayer1 - totalScorePlayer2;

            if(Math.abs(scoreDifference) > maximumLead) {

                maximumLead = Math.abs(scoreDifference);

                if(scoreDifference > 0) {
                    winningPlayer = 1;
                }
                else {
                    winningPlayer = 2;
                }
            }
        }

        System.out.println(winningPlayer + " " + maximumLead);
    }
}

Sample Output

1 58
