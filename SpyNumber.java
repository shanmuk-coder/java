//write a java program to check if a number is spy number or not
import java.util.Scanner;
class SpyNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int original=n;
        int sum=0;
        int product=1;
        while(n!=0)
        {
            int digit=n%10;
            sum=sum+digit;
            product=product*digit;
            n=n/10;
        }
       if(sum==product)
       {
            System.out.println(original + " is a Spy number");
       }
       else
       {
            System.out.println(original + " is Not a Spy number");
       }
       sc.close();
    }
}
