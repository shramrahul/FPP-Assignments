package program4;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

     SalariedEmployee(String fname, String lname, String socialSecurityNumber, double weeklySalary) {
        super(fname, lname, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "first name=" +getFname()+
                "' Last Name=" + getLname()+
                ", SSN="+ getSocialSecurityNumber()+
                ", weeklySalary=" + weeklySalary +
                ", payment Amount="+ getPaymentAmount()+
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }
}
