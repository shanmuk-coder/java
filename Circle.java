// Write a java program to calculate the area and circumference of the circle.
import java.util.*;
 class Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        sc.close();
    }
}
