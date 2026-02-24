//write a java program to swap two numbers using temporary variable
import java.util.Scanner;
class SwapNumber{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int temp;
    System.out.println("A & B before swaping:" +a +" " +b);
    temp=a;
    a=b;
    b=temp;
    System.out.println("A & B after swaping:" +a +" " +b);
    }
}
