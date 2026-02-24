// write a java program to print perimeter and area of rectangle.
import java.util.Scanner;
class Rectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length=sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth=sc.nextDouble();
        double perimeter= 2*(length+breadth);
        System.out.println("Perimeter of rectangle:" +perimeter);
        double area =length*breadth;
        System.out.println("Area  of rectangle:" +area);

        
    }
}
