/*
Problem: Calculate Discounted Price

An online store sells items and provides discounts based on the price of a single item.

Discount Rules
If the item price is greater than 1000, apply a 10% discount
If the item price is greater than 500 and less than or equal to 1000, apply a 5% discount
If the item price is 500 or less, no discount is applied
Task

Calculate and print the final price after applying the discount.

Input Format

A single integer representing the item price

Output Format

Print the final price after discount (as an integer)
Example

Input

1200

Output

1080
*/
import java.util.*;
class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int itemPrice=sc.nextInt();
        double discount=0;
        double totalPrice=0;
        if(itemPrice > 1000)
        {
             discount=itemPrice * (0.10);
             totalPrice=itemPrice - discount;
             System.out.println((int)totalPrice);
        }
        else if (itemPrice > 500 && itemPrice <=1000)
        {
            discount=itemPrice * (0.05);
            totalPrice=itemPrice - discount;
            System.out.println((int)totalPrice);
        }
        else
        {
            System.out.println((int)itemPrice);
        }
       
    }
}
