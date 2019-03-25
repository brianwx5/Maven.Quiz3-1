package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student  {
    private List<Lab> labArrayList;


    public Student() {
        this(null);
        this.labArrayList = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labArrayList = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab: labArrayList) {
            if(lab.labName.equals(labName)) {
                return lab;
            }
        }
        throw new UnsupportedOperationException();
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab someLab = getLab(labName);
        someLab.setStatus(labStatus);
        //I can also use if null then throw the exception

    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labArrayList.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab lab: labArrayList) {
            if(lab.labName.equals(labName)) {
                return lab.getLabStatus();
            }
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        Collections.sort(labArrayList);
        String string = "";

        for (Lab lab: labArrayList) {
            string += lab.labName + " > " + lab.labStatus + "\n";
        } return string.trim();
    }
}
