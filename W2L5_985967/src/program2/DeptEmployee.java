package program2;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    double salary;
    private LocalDate hiredDate;

     DeptEmployee(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }

    void setHiredDate(LocalDate hiredDate) {
        this.hiredDate = hiredDate;
    }

    public double computeSalary(){
        return salary;
    }
}
