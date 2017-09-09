package program2;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String fname;
    private String lName;
    private LocalDate dob;

    private final int RHR = 70;
    private final int MHR = 220;
    private final float lowerBoundry = 0.5f;
    private final float upperBoundry = 0.85f;

    public HeartRates(String fname, String lName, LocalDate dob) {
        super();
        this.fname = fname;
        this.lName = lName;
        this.dob = dob;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // calculate age
    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(this.dob, today).getYears();
    }

    // calculate maximum heart rate
    public Integer getMaxmimumHeartRate() {
        return MHR - this.getAge();
    }

    // calculate average heart rate
    public Integer getAverageHeartRate() {
        return this.getMaxmimumHeartRate() - RHR;
    }

    // calculate range of heart beat
    public String getheartRateRange() {
        float lbthr = this.getAverageHeartRate()*lowerBoundry + RHR;
        float ubthr = this.getAverageHeartRate()*upperBoundry + RHR;

        return lbthr + " - " + ubthr;
    }

    @Override
    public String toString() {
        return "Person [fname=" + fname + ", lName=" + lName + ", dob=" + dob + ", getAge()=" + getAge()
                + ", getMaxmimumHeartRate()=" + getMaxmimumHeartRate() + ", getheartRateRange()=" + getheartRateRange() + "]";
    }



}

/*   output

Enter first name: Shreeram
Enter last name: Chaulagain
Enter dob in format yyyy-M-d1993-6-21

a. person's age: 24
b. person's max heart rate: 196
c. person's target heart range: 133.0 - 177.1
d. person's toString() data: Person [fname=Shreeram, lName=Chaulagain, dob=1993-06-21, getAge()=24, getMaxmimumHeartRate()=196, getheartRateRange()=133.0 - 177.1]
*/