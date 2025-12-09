package srms;

public class Department {

    private String deptCode;
    private String deptName;

    public Department(String deptCode, String deptName) {
        this.deptCode = deptCode;
        this.deptName = deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName + " (" + deptCode + ")");
    }

    @Override
    public String toString() {
        return deptName + " (" + deptCode + ")";
    }
}
