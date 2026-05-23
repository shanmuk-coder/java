/*
Bank Account Transaction Tracker

Problem Statement

A bank tracks the daily transactions of a customer account.

You are given:

- Initial account balance
- Number of transactions N
- Transaction amount for each day

Rules:

- Positive value → money deposited
- Negative value → money withdrawn
- Bank deducts SMS service charge of 10 after every transaction
- If balance becomes less than 1000, an additional fine of 50 is deducted

Write a Java program to calculate:

1. Final account balance
2. Total deposited amount
3. Total withdrawn amount
4. Total fine amount deducted

Special Conditions

- If balance becomes negative at any point, print:

Insufficient Balance

and terminate immediately.

Input Format

- First line contains integer initialBalance
- Second line contains integer N
- Next N integers represent transaction amounts

Constraints

- 1 <= N <= 100

Output Format

Print:

Final Balance: X
Total Deposited: Y
Total Withdrawn: Z
Total Fine Amount: A


Sample Input 1

5000
5
1000
-4500
500
-300
200


Sample Output 1

Final Balance: 790
Total Deposited: 1700
Total Withdrawn: 4800
Total Fine Amount: 300


Sample Input 2

2000
3
-1000
-900
100
*/
import java.util.Scanner;

class Transaction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int initialBalance = sc.nextInt();
        int n = sc.nextInt();

        int balance = initialBalance;

        int deposited = 0;
        int withdrawn = 0;
        int fine = 0;

        for(int i = 1; i <= n; i++) {

            int amount = sc.nextInt();

            // Deposit
            if(amount > 0) {
                deposited = deposited + amount;
                balance = balance + amount;
            }

            // Withdrawal
            else {
                withdrawn = withdrawn + (-amount);
                balance = balance + amount;
            }

            // SMS charge
            balance = balance - 10;
            fine = fine + 10;

            // Low balance fine
            if(balance < 1000) {
                balance = balance - 50;
                fine = fine + 50;
            }

            // Insufficient balance check
            if(balance < 0) {
                System.out.println("Insufficient Balance");
                return;
            }
        }

        System.out.println("Final Balance: " + balance);
        System.out.println("Total Deposited: " + deposited);
        System.out.println("Total Withdrawn: " + withdrawn);
        System.out.println("Total Fine Amount: " + fine);
    }
}

Sample Output 2

Insufficient Balance
