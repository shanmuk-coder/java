//write a java program to print the sum of n natural numbers
import java.util.Scanner;
class Sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The value of n:")
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("THE SUM OF N NATURAL NUMBERS IS :" +sum);
        sc.close();
    }
}
