//write a java program to check if a number is palindrome or not.
import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       int num=sc.nextInt();
       int orginal=num,reverse=0;
       while(num!=0)
       {
           int digit=num%10;
           reverse=reverse*10+digit;
           num=num/10;
       }
if(reverse==orginal)
{
    System.out.println("palindrome number");
}
else
{
    System.out.println("Not a Palindrome number");
}
  sc.close();
}
}
