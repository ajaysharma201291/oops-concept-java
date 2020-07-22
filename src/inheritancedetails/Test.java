package inheritancedetails;

public class Test {
    public static void main(String[] args) {
        //using parent reference we cannot call child methods
        Parent p=new Parent();
        p.m1();

        //using child reference we can call parent methods
        Child c=new Child();
        c.m1();
        c.m2();

        //using parent reference we cannot call child methods
        Parent p2=new Child();
        p2.m1();
    }
}
