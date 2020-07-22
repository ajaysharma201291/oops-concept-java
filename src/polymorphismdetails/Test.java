package polymorphismdetails;

public class Test {
    public static void main(String[] args) {
        Signature s=new Signature();
        s.m1(10);
        s.m2("Hello");
        /* only casting to specific type of method signature will work otherwise not
        * s.m1( 10.5); //not work
        * */
        s.m1((int) 10.5);
        s.m1(10.5);
        s.m1();
        s.m1(10.5f);

        Overloading o=new Overloading();
        o.m1(10);
        o.m1(10.5f);
        o.m1('a');
        o.m1(10L);
        /* only after casting to float from double will work as default casting will not work
        * o.m1(10.0); //not work
        * */
        o.m1((float) 10.0);

        o.m2(new Object());
        o.m2("Hello");
        o.m2(new StringBuffer());
        // if both parent and child came for parameter resolution then child will be invoked
        //now both can be resolved at compile time so compile time error
        //o.m2(null);

        o.m3();
        //if var-args method and exact match method matches then exact method will be invoked by compiler
        //because general method is older concept then var-args method which come 1.5 version
        //var-ags method will always get least priority in matching, if no other method matches then it is
        // matched it is like default case in switch case
        o.m3(10);
        o.m3(10,20);

        o.m4(10,10.5f);
        o.m4(10.5f,10);
        /* compile time error for below case
        * o.m4(10,10); //compile time error
        * o.m4(10.5f,10.5f);//compile time error
        * */

        o.m5(new Animal());
        o.m5(new Monkey());

        Animal a=new Monkey();
        //as overloading is resolved at compile time so reference type will invoke the method
        o.m5(a);
    }
}
