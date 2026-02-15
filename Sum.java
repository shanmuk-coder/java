// WRITE A PROGRAM TO DISPLAY THE SUM OF TWO NUMBERS 
import java.util.Scanner;
class Sum {
    public static void main(String[] args) {
      //create a scanner object to take input from the user.
         Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF A :");
        int a=sc.nextInt(); 
        System.out.println("ENTER THE VALUE OF B :");
        int b=sc.nextInt();
        int sum=a+b;  //CALCULATE THE SUM OF TWO NUMBERS
        System.out.println("THE SUM OF TWO NUMBERS:" +sum);
        sc.close();
    }
}
