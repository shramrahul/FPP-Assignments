package program1;

public class Test {
    public static void main(String [] args){
        MyTable table= new MyTable();
        table.add('a',"hello");
        table.add('b',"shreeram");
        table.add('d',"shreeram");
        table.add('x',"Nepal");
        System.out.println( "for key a: "+table.get('a'));
        System.out.println( "for key d: "+table.get('d'));
        System.out.println( "for key x: "+table.get('x'));
        System.out.println("\n");
        System.out.println(table.toString());
    }
}
