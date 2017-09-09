package program4;

public final class Circle {
    private static final double PI=Math.PI;
    private double radius;



    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea(){

        return PI*radius*radius;
    }
}
