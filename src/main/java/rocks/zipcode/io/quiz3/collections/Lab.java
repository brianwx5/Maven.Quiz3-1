package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable<Lab>{
    String labName;
    LabStatus labStatus;

    public Lab() {
        this("Duplicate Deleter");
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {
        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }


    public String getLabName() {
        return labName;
    }

    public LabStatus getLabStatus() {
        return labStatus;
    }

    @Override
    public int compareTo(Lab o) {
        return this.labName.compareTo(o.labName);
    }
}
