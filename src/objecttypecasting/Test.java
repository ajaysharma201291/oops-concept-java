package objecttypecasting;

// A b=(C)d;
// here we are converting type d to c and assigning that to reference of type A
// Here compiler will do 2 checks and JVM do one check

// Compiler 1st check is there any relationship between C and d (either parent to child or child to parent or
// same type) if it's not there then compile time error

// Compiler 2nd check is the assignment is legal or not i.e C must be either of same type or child type else
// compile time error will come

// JVM check is the run time object of d either will be of type C or child type else runtime error class cast
// exception will be thrown

public class Test {
    public static void main(String[] args) {
        Object o=new String("hello");
        // no relation in StringBuffer and String so second compiler rule fails so compile time error
        // StringBuffer sb=(String)o;
        // here runtime object of o is string so JVM check is failed so Run time error will occur result in
        // class cast exception
        // StringBuffer sb=(StringBuffer)o;

        // this will work as all 3 rules are passed
        String s=(String)o;
        System.out.println(s);
        /*
        String s=new String("hello");
        // no relation in StringBuffer and String so first compiler rule fails so compile time error
        StringBuffer sb2=(StringBuffer)s;
         */

        /*
        String s=new String("hello");
        // no relation in StringBuffer and String so second compiler rule fails so compile time error
        StringBuffer sb2=(String)s;
         */

        Object o2=new StringBuffer("hello");
        StringBuffer sb2=(StringBuffer)o2;
        System.out.println(sb2.toString());

        Base2 b=new Der4();
        Der4 d=(Der4)b;

        // compile time error compiler check 1 fails
        // Base1 b1=(Base1)b;

        Base2 b2=(Base2)b;

        // jvm rule will be fail run time exception
        // Object o3=(Der3)b;

        // compile time error compiler check 1 fails
        // Base2 b3=(Base1)b;

        String s2=new String("Hello");
        //same object multiple reference to same object because of type casting
        Object o3=(Object)s2;
        System.out.println(s2==o3);

        Integer i=10;//new Integer(10);
        //same object multiple reference to same object because of type casting
        Number n=(Number)i;
        System.out.println(i==n);
        //same object multiple reference to same object because of type casting
        Object o4=(Object)n;
        System.out.println(o4==n);
        System.out.println(o4==i);

        Child c=new Child();
        c.m1();
        c.m2();
        ((Parent)c).m1();

        // compile time error as cannpt call child method from parent reference
        // ((Parent)c).m2();

        C c2=new C();
        c2.m1();
        ((B)c2).m1();
        ((A)((B)c2)).m1();

        c2.m2();
        ((B)c2).m2();
        ((A)((B)c2)).m2();

        System.out.println(c2.x);
        System.out.println(((B)c2).x);
        System.out.println(((A)((B)c2)).x);
    }
}

class Base1{}
class Base2{}
class Der1 extends  Base1{}
class Der2 extends  Base1{}
class Der3 extends  Base2{}
class Der4 extends  Base2{}

class  Parent{
    public  void m1(){
        System.out.println("parent");
    }
}

class  Child extends  Parent{
    public  void m2(){
        System.out.println("child");
    }
}

class A{
    public  void m1(){
        System.out.println("A");
    }
    public static void m2(){
        System.out.println("Static A");
    }
    int x=777;
}

class B extends A{
    public  void m1(){
        System.out.println("B");
    }
    public static void m2(){
        System.out.println("Static B");
    }
    int x=888;
}

class C extends B{
    public  void m1(){
        System.out.println("C");
    }
    public static void m2(){
        System.out.println("Static C");
    }
    int x=999;
}