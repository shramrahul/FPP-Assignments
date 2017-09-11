package program4;

public class ComissionEmployee extends Employee{
    private double grossSales;
    private double comissionRate;


     ComissionEmployee(String fname, String lname, String socialSecurityNumber, double grossSales, double comissionRate) {
        super(fname, lname, socialSecurityNumber);
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommisionRate() {
        return comissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "first name=" +getFname()+
                ", Last Name=" + getLname()+
                ", SSN="+ getSocialSecurityNumber()+
                ", grossSales=" + grossSales +
                ", commissionRate=" + comissionRate +
                ", payment Amount="+ getPaymentAmount()+
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return  grossSales * comissionRate;
    }
}
