// write a java program to check if a number is strong number or not.
import java.util.Scanner;
class StrongNumber{
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number:");
 int n=sc.nextInt();
 int sum=0;
 int original=n;
 while(n!=0)
  {
      int digit=n%10;
      int fact=1;
      for(int i=1;i<=digit;i++)
      {
      fact=fact*i;
      }
      sum=sum+fact;
      n=n/10;
  }
  if(sum==original)
  {
      System.out.println(original + " is a Strong number");
  }
  else
  {
      System.out.println(original + " is Not a Strong number");
  }
  sc.close();
    }
}
