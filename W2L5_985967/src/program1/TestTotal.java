package program1;

public class TestTotal {
    public static void main(String [] args){
     Shapes[] shapes = new Shapes[5];
     double totalArea=0.0;
     double totalPerimeter=0.0;
     shapes[0]=new Circle("red",1);
     shapes[1]=new Rectangle("blue",5,5);
     shapes[2]=new Square("red",1);
     shapes[3]=new Circle("blue",5);
     shapes[4]= new Square("black",3);

        for (Shapes shape : shapes) {
            totalArea+=shape.calculateArea();
            totalPerimeter+=shape.calculatePerimeter();
        }

        System.out.println("Total area="+ totalArea);
        System.out.println("Total perimeter= "+totalPerimeter);
    }
}

/*
 *  output

 Total area=116.68140899333463
 Total perimeter= 73.69911184307752

 */
