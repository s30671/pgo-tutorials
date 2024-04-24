import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProgramStudy {
    private String programName;
    private String programDescription;
    private int numberOfSemesters;
    private int itnLimit;

    public ProgramStudy(String programName, String programDescription, int numberOfSemesters, int itnLimit) {
        this.programName = programName;
        this.programDescription = programDescription;
        this.numberOfSemesters = numberOfSemesters;
        this.itnLimit = itnLimit;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramDescription() {
        return programDescription;
    }

    public void setProgramDescription(String programDescription) {
        this.programDescription = programDescription;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public void setNumberOfSemesters(int numberOfSemesters) {
        this.numberOfSemesters = numberOfSemesters;
    }

    public int getItnLimit() {
        return itnLimit;
    }

    public void setItnLimit(int itnLimit) {
        this.itnLimit = itnLimit;
    }
}