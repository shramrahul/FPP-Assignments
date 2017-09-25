package prob1;

public class CustomerAccount {
    String cust_name;
    String acc_no;
    double Balance;

    public CustomerAccount(String cust_name, String acc_no, double balance) {
        this.cust_name = cust_name;
        this.acc_no = acc_no;
        Balance = balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void deposite(double amount){
        Balance=Balance+amount;
    }

    public void withDraw(double amount){
        try {
            if(amount>Balance)
                throw new MyException("withdraw amount is greater than current balance");

            Balance= Balance-amount;

            if(Balance <100)
                throw new MyException("Warning !!! Balance becomes less than $100");

        }catch(MyException ex){
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String [] args){
        CustomerAccount customer1= new CustomerAccount("Jack", "123456789",1000);
        customer1.deposite(230);
        customer1.withDraw(1200);
        customer1.withDraw(1300);
        System.out.println("Remaining balance= "+customer1.getBalance());
    }
}


//
//output
//
//        Warning !!! Balance becomes less than $100
//        withdraw amount is greater than current balance
//        Remaining balance= 30.0
