package datahidingabstractionencapsulation;

// if all variables are private not depends on member access type then it is tightly encapsulated class
public class TightlyEncapsulatedStudent {
    private int studentId;
    private String name;
    /*
    if it is private then it is tightly encapsulated else it is not
    String gender;
    */

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

//if parent is not tightly encapsulated then child class is also not tightly encapsulated
class A{
    int x;
}

class B extends A{
    private int y;
}
