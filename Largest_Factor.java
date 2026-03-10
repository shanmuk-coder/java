//write a java program to find the largest factor of a given number.
import java.util.Scanner;
class Largest_Factor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int max=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                if(i>max)
                {
                    max=i;
                }
            }
        }
        System.out.println("Largest factor :" +max);
  
    }
}
