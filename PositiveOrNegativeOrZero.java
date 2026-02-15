// WRITE A PROGRAM TO CHECK WHETHER A NUMBER IS A POSITIVE ,NEGATIVE NUMBER OR ZERO.
import java.util.Scanner;
class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
      //create a scanner object to take input from the user.
         Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N :");
        int n=sc.nextInt(); 
     if(n>0)
     {
         System.out.println("Positive Number");
     }
     else if(n<0)
     {
         System.out.println("Negative number");
     }
     else 
     {
        System.out.println("Zero");
     }
        sc.close();
    }
}
