package program1;

public class Rectangle extends Shapes {
    private double width;
    private double length;

     Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea(){
        return width* length;
    }

    @Override
    public double calculatePerimeter(){

        return 2*(length+width);
    }
}
