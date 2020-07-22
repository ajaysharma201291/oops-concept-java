package datahidingabstractionencapsulation;

//encapsulation is data hiding and abstraction together
//grouping members and methods together in single unit
//encapsulation=data hiding+abstraction
public class Student {
    //private member for hiding data
    private int studentId;
    private String name;

    //abstraction to provide only relevant details only hiding internal details
    //it is done by providing only some specific methods or GUI screen
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
