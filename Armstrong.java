// write a java program to check if a number is Armstrong or not.
import java.util.*;
class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int sum=0;
        int original=n;
        int temp=n;
        int count=0;
        while(temp!=0)
        {
            int d=temp%10;
            count++;
            temp=temp/10;
        }
        while(n!=0)
        {
            int digit=n%10;
            sum=sum+(int)Math.pow(digit,count);
            n=n/10;
        }
        if(sum==original)
        {
            System.out.println("The Given Number Is Armstrong Number");
        }
        else
        {
            System.out.println("The Given Number Is Not Armstrong Number");
        }
        sc.close();
    }
}
