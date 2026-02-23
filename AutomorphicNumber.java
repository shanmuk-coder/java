// Program to check whether a number is Automorphic or not

import java.util.Scanner;

class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int square = number * number;

        if (square % 10 == number % 10) {
            System.out.println(number + " is an Automorphic Number.");
        } else {
            System.out.println(number + " is NOT an Automorphic Number.");
        }

        sc.close();
    }
}
