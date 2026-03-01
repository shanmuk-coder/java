//write a java program to find the square of any number.
import java.util.*;
class Square_Of_a_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        int square = n * n;
        System.out.println("Square of the number is:" +square);
    }
}
