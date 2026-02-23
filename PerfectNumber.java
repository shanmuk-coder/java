// Program to check whether a number is a Perfect Number or not.

import java.util.Scanner;

class PerfectNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int original = number;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check perfect number
        if (sum == original) {
            System.out.println(original + " is a Perfect Number.");
        } else {
            System.out.println(original + " is NOT a Perfect Number.");
        }

        sc.close();
    }
}
