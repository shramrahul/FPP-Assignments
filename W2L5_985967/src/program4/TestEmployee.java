package program4;

public class TestEmployee {
    Payable payable;
    public static void main(String[] args){
        Payable[] employees=new Payable[5];

        employees[0]=new Invoice("123","Wheel",2,34);
        employees[1]= new ComissionEmployee("Shreeram","Chaulagain","12345678",20,.10);
        employees[2]=new HourlyEmployee("Sima","Chand","98654321",30,15);
        employees[3]=new SalariedEmployee("fi","Li","984537211",300);
        employees[4]= new BasePlusComissionEmployee("Adam","adam","23456743",24,.15,10000);

        for (Payable pay: employees) {
            System.out.println(pay.toString());
        }

    }

}
