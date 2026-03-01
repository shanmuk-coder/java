//write a java program to find cube of a number.
import java.util.*;
class Cube_Of_a_Number
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int cube = n * n * n;
        System.out.println("Cube of the number is: " + cube);
        sc.close();   
    }
}
