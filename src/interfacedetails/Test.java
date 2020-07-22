package interfacedetails;

public class Test {
    public static void main(String[] args) {
      /*  Sample s=new Sample();
        s.m1();
        s.m2();*/

        Sample s=new Sample() {
            @Override
            public void m1() {
                super.m1();
            }

            @Override
            public void m2() {
                super.m2();
            }
        };
    }
}
