import java.util.Scanner;
class Smallest_Digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int smallest=n%10;
        while(n!=0)
        {
            int digit=n%10;
            if(digit<smallest)
            {
               smallest=digit; 
            }
            n=n/10;
        }
        
        System.out.println("Smallest Digit in a number:" +smallest);
    }
}
