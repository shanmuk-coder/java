import java.util.Scanner;
class Largest_Digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int large=0;
        while(n!=0)
        {
            int digit=n%10;
            if(digit>large)
            {
               large=digit; 
            }
            n=n/10;
        }
        
        System.out.println("Largest Digit in a number:" +large);
    }
}
