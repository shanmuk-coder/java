/*
Problem Statement

Develop a Java program to calculate the final restaurant bill after applying discounts based on the bill amount.

Discount Rules
Below ₹200 → No discount
₹200 to ₹499 → 10% discount
₹500 and above → 20% discount

The program should display:

1.Original bill
2.Discount amount
3.Final bill after discount

Example
Input
550
Output
Original Bill: 550.0
Discount: 110.0
Final Bill: 440.0
*/
import java.util.*;

class Discount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double bill = sc.nextDouble();

        System.out.println("Original Bill: " + bill);

        if (bill >= 200 && bill < 500) {

            double discount = bill * 0.1;
            double finalBill = bill - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Final Bill: " + finalBill);

        } 
        else if (bill >= 500) {

            double discount = bill * 0.2;
            double finalBill = bill - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Final Bill: " + finalBill);

        } 
        else {

            System.out.println("Discount: 0");
            System.out.println("Final Bill: " + bill);

        }
    }
}
