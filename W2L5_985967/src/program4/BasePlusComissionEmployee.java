package program4;

public class BasePlusComissionEmployee extends ComissionEmployee {
    private double baseSalary;

     BasePlusComissionEmployee(String fname, String lname, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(fname, lname, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return  "BasePlusComissionEmployee{" +
                "first name=" +getFname()+
                "' Last Name=" + getLname()+
                ", SSN="+ getSocialSecurityNumber()+
                ", gross Sales="+getGrossSales()+
                ", Comission Rate="+getCommisionRate()+
                ", Base Salary= "+getBaseSalary()+
                ", baseSalary=" + baseSalary +
                ", payment Amount="+ getPaymentAmount()+

                '}';
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPaymentAmount() {
        return baseSalary+getGrossSales()*getCommisionRate();
    }
}
