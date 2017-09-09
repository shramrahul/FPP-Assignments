package program4;

public final class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(double width, double length){
        this.length=length;
        this.width=width;

    }

    public double computeArea(){

       return length*width;
    }
}
