/*
Treasure Hunt Adventure Game

Problem Statement:

A player is exploring a treasure island represented
as a series of locations.

Each location may contain:
- Gold coins
- Traps
- Bonus lives

Write a Java program to simulate the treasure hunt
and generate the final game report.

Initial Values:

Health = 100
Lives = 3
Score = 0

Game Rules:

Each location contains:

Gold Trap BonusLife

- Gold increases player score
- Trap decreases player health
- Bonus life increases player lives

Trap Rule:

If health becomes less than or equal to 0:
- One life is lost
- Health resets to 100

Print:
Life Lost at Location: X

Game Over Rule:

If lives become 0:

Game Over

Terminate the program immediately.

Treasure Bonus Rule:

If gold collected at a location exceeds 500:

Treasure Bonus Unlocked at Location: X

Add extra 100 points to score.

Input Format:

First line contains integer N
(number of locations)

Next N lines contain:

Gold Trap BonusLife

Output Format:

Print:

Final Score: X
Remaining Health: Y
Remaining Lives: Z
Total Gold Collected: A

Example Input:

5
100 20 0
600 30 1
200 90 0
150 10 0
500 40 0

Example Output:

Treasure Bonus Unlocked at Location: 2
Life Lost at Location: 3
Final Score: 1650
Remaining Health: 50
Remaining Lives: 3
Total Gold Collected: 1550
*/

import java.util.Scanner;

class TreasureHunt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int locations = sc.nextInt();

        int health = 100;
        int lives = 3;
        int score = 0;
        int totalgold = 0;

        for(int i = 1; i <= locations; i++) {

            int gold = sc.nextInt();
            int traps = sc.nextInt();
            int bonuslives = sc.nextInt();

            totalgold = totalgold + gold;

            if(gold > 500) {
                score = score + 100 + gold;
                System.out.println("Treasure Bonus Unlocked at Location:" + i);
            }
            else {
                score = score + gold;
            }

            health = health - traps;

            if(health <= 0) {
                lives--;
                health = 100;

                System.out.println("Life Lost at Location:" + i);
            }

            lives = lives + bonuslives;

            if(lives == 0) {
                System.out.println("Game Over");
                return;
            }
        }

        System.out.println("Final Score: " + score);
        System.out.println("Remaining Health: " + health);
        System.out.println("Remaining lives: " + lives);
        System.out.println("Total gold collected: " + totalgold);
    }
}
