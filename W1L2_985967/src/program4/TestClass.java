package program4;

import java.util.Scanner;

public class TestClass {
    public static void main(String [] args){

        Scanner in= new Scanner(System.in);
        System.out.println("Enter C for Circle\nEnter R for Rectangle\nEnter T for Triangle");
        String var= in.nextLine();

        switch (var.toLowerCase()){
            case "c":System.out.println("Enter Radius for the cirle");
                     double radius=in.nextDouble();
                     Circle circle=new Circle(radius);
                     System.out.println("Area of cirle is : "+circle.computeArea());
                     break;

            case "r":System.out.println("Enter length for the rectangle: ");
                     double length=in.nextDouble();
                     System.out.println("Enter width for the rectangle: ");
                     double width=in.nextDouble();
                     Rectangle rectangle=new Rectangle(length,width);
                     System.out.println("Area of rectangle is : "+rectangle.computeArea());
                     break;

            case "t":System.out.println("Enter length for the triangle: ");
                     double triLength=in.nextDouble();
                     System.out.println("Enter width for the triangle: ");
                     double triHeight=in.nextDouble();
                     Triangle triangle=new Triangle(triLength,triHeight);
                     System.out.println("Area of triangle is : "+triangle.computeArea());
                     break;

            default:
                System.out.println("pleease,make a valid choice. Thank you");

        }
    }
}

/*output
* Enter C for Circle
 Enter R for Rectangle
 Enter T for Triangle
 c
 Enter Radius for the cirle
 2
 Area of cirle is : 12.566370614359172
*/
