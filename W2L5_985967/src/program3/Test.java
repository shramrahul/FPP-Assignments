package program3;

public class Test {
    public static void main(String [] args){
        Figure [] figures= new Figure[5];
        figures[0]= new UpwardHat();
        figures[1]= new UpwardHat();
        figures[2]= new DownwardHat();
        figures[3]= new FaceMaker();
        figures[4]= new Vertical();

        for (Figure figure:figures) {
            System.out.println(figure.getClass().getName().substring(9)+":"+figure.getFigure());
        }
    }
}
