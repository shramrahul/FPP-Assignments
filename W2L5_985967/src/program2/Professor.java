package program2;

public class Professor extends DeptEmployee {
    Professor(double salary) {
        super(salary);
    }

    private int numberOfPublications;

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {

        this.numberOfPublications = numberOfPublications;
    }
}
