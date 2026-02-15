// Write a java program to check greatest of two numbers
import java.util.Scanner;
class Greatestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n1:");
        int n1=sc.nextInt();
         System.out.println("Enter the value of n2:");
        int n2=sc.nextInt();
        if(n1>n2)
        {
            System.out.println("N1 is greater than N2");
        }
        else if(n2>n1)
        {
            System.out.println("N2 is greater than N1");
        }
        else
        {
            System.out.println("Both Are Equal");
        }
    }
}
