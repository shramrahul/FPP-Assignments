package program4;

public class HourlyEmployee extends Employee {
    private double wages;
    private double hours;

     HourlyEmployee(String fname, String lname, String socialSecurityNumber, double wages, double hours) {
        super(fname, lname, socialSecurityNumber);
        this.wages = wages;
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        return wages*hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "first name=" +getFname()+
                "' Last Name=" + getLname()+
                ", SSN="+ getSocialSecurityNumber()+
                "wages=" + wages +
                ", hours=" + hours +
                ", payment Amount="+ getPaymentAmount()+
                '}';
    }
}
