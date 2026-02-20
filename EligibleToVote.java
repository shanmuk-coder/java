//Write a java program to check vote eligiblity.
import java.util.Scanner;
class {
class EligibleToVote{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age:");
     int age=sc.nextInt();
     if(age>=18)
     {
         System.out.println(" You're eligible to vote.");
     }
     else
     {
         System.out.println("You're not eligible to vote.");
     }
     sc.close();
    }
}
