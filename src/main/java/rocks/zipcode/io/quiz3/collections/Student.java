package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student  {
    public List<Lab> labArrayList;


    public Student() {
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
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        for (Lab lab: labArrayList) {
            if(lab.labName.equals(labName)) {
                lab.setStatus(labStatus);
            }
        }
    }

    public void forkLab(Lab lab) {
        for (Lab labInList: labArrayList) {
           if(labInList.equals(lab)) {
               labInList.setStatus(LabStatus.PENDING);
           }
        }
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab lab: labArrayList) {
            if(lab.labName.equals(labName)) {
                return lab.getLabStatus();
            }
        }
        return null;
    }


}
