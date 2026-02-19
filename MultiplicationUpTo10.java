//write a java program to print the multiplication table  (upto-10) of a given number.
import java.util.Scanner;
class MultiplicationUpTo10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int mul=1;
        System.out.println("Multiplication Table of " +n);
        for(int i=1;i<=10;i++)
        {
            mul=n*i;
            System.out.println(n + " x " + i  + " = " + mul);
            
        }
        sc.close();
    }
}
