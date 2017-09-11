package program2;

public class Secretary extends DeptEmployee {
    private double overtimeHours;

     Secretary(double salary, double overtimeHours) {
        super(salary);
        this.overtimeHours=overtimeHours;
    }

    @Override
    public double  computeSalary(){

        return salary+ 12*overtimeHours;
    }
}
