// Write a java program to print the area and perimeter of square
import java.util.Scanner;
class Square {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the side of the square:");
      int side=sc.nextInt();
      int perimeter=4*side;
      int area=side*side;
      System.out.println("Perimeter of the square:" +perimeter);
      System.out.println("Area of the square :" +area);
      sc.close();
    }
}
