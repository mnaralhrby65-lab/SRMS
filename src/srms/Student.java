package srms;

public class Student {
    
    private final String name;
    private final String studentID;
    private final Department department;
    private final  int year;
    private final double gpa;

    public Student(String name, String studentID, Department department, int year, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.department = department;
        this.year = year;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    
    public String getStudentID() {
        return studentID;
    }

    public Department getDepartment() {
        return department;
    }
    
    public int getYear() {
        return year;
    }

    public double getGpa() {
        return gpa;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + 
               " | ID: " + studentID + 
               " | Dept: " + department.getDeptName() + 
               " | Year: " + year + 
               " | GPA: " + gpa;
    }
}