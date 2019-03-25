package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable<Lab>{
    String labName;
    LabStatus labStatus;

    public Lab() {
        this("duplicate deleter");
        this.labStatus = LabStatus.INCOMPLETE;
    }

    public Lab(String labName) {
        this.labName = labName;
        this.labStatus = LabStatus.INCOMPLETE;
    }

    public String getName() {
        return this.labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getLabStatus() {
        return this.labStatus;
    }

    @Override
    public int compareTo(Lab o) {
        return this.labName.compareTo(o.labName);
    }
}
