package classmembermodifier;

public class Test {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.test();

        //how this is working
        Vehicle v=new Vehicle() {
            @Override
            int getNumberOfTyres() {
                return 0;
            }
        };

        v.getNumberOfTyres();
        v.getColor();

        Car c=new Car();
        c.getNumberOfTyres();
        c.getColor();

        Parent p2=new Parent();
        p2.test();
        p2.test2();

        Child c2=new Child();
        c2.test();
        c2.test2();

        Parent p3=new Child();
        p3.test();
        p3.test2();
    }
}
