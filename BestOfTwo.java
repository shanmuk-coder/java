/*
Best of Two
Alice and Bob are playing a game. Each player rolls a standard six-sided die three times. The score of a player is calculated as the sum of the two highest rolls. 
The player with the higher score wins. If both players have the same score, the game ends in a tie. Determine the winner of the game or if it is a tie.
*/
import java.util.*;

class BestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int b3 = sc.nextInt();
            
            int aliceScore = (a1 + a2 + a3) - Math.min(a1, Math.min(a2, a3));
            int bobScore = (b1 + b2 + b3) - Math.min(b1, Math.min(b2, b3));
            
            if (aliceScore > bobScore) {
                System.out.println("Alice");
            } else if (bobScore > aliceScore) {
                System.out.println("Bob");
            } else {
                System.out.println("Tie");
            }
        }
    }
}
