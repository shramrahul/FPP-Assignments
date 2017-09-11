package program4;

public abstract class Employee implements  Payable {
    private String fname;
    private String lname;
    private String socialSecurityNumber;

    public Employee() {
    }

     Employee(String fname, String lname, String socialSecurityNumber) {
        this.fname = fname;
        this.lname = lname;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
