/*
Problem: Presents for Cheffina

Chef wants to buy N gifts.
Each gift costs 1 coin.
Offer:
For every 4 gifts bought, the 5th gift is free.

Logic:
For every 5 gifts, 1 gift is free.
So, free gifts = N / 5
Coins required = N - (N / 5)

Time Complexity: O(1) per test case
*/
 import java.util.*;

class CodeChef{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // number of gifts

            // For every 5 gifts, 1 is free
            int freeGifts = n / 5;

            // Coins needed = total gifts - free gifts
            int minCoins = n - freeGifts;

            System.out.println(minCoins);
        }
    }
}
