package program1;

public class Circle extends Shapes {
    private static final double PI=Math.PI;

   private double radius;

   Circle(String color, double radius ){
       super(color);
       this.radius=radius;
   }
    @Override
    public double calculateArea(){
        return PI*radius*radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2*PI*radius;
    }
}
