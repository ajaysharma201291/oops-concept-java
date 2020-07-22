package polymorphismdetails;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

// overriding is not applicable for private and final method

// if child method throws any checked exception then parent must throw it's same or parent exception for
// overriding to success. For unchecked exception nothing matter

// overriding is only applicable for methods not for variables, and variable resolution is taken care by
// compiler at compile time irrespective of variable is instance or static variable. It is also called
// variable hiding or shadowing

public class Overriding {

    public static void main(String[] args) {
        Parent p=new Parent();
        p.m1(10);
        p.m2();
        p.m3();
        p.m6();
        p.m13();
        p.m14(10);
        System.out.println(p.name);

        Child c=new Child();
        c.m1(10);
        c.m2();
        c.m3();
        c.m6();
        c.m13();
        c.m14(10);
        System.out.println(c.name);

        Parent p2=new Child();
        p2.m1(10);
        p2.m2();
        p2.m3();
        p2.m6();

        // in method hiding method invocation is handled by compile time reference not run time reference
        p2.m13();
        p2.m14(10);
        System.out.println(p2.name);
    }
}

class Parent {
    public  void m1(int i){
        System.out.println("m1 parent");
    }

    public  Object m2(){
        System.out.println("m2 parent");
        return null;
    }

    public double m3(){
        System.out.println("m3 parent");
        return 0;
    }

    public final void m4(){
        System.out.println("m4 parent");
    }

    public  void m5(){
        System.out.println("m5 parent");
    }

    protected  void m6(){
        System.out.println("m6 parent");
    }

    public  void m7 () throws Exception{}

    public void m8() throws Exception{}

    public void m9() throws Exception{}

    public void m10() throws IOException,Throwable{}

    public void m11() throws IOException{}

    public void m12() throws IOException{}

    // static to non static or vice versa method overriding not possible
    public  static void m13(){
        System.out.println("static m13 parent");
    }

    // var-args parameter in case of overriding is result into method overloading if child method is not
    // var-args else can be made into overriding if child method is also var-args
    public void m14(int... i){
        System.out.println("var-args m14 parent");
    }
    String name="Parent";
}

// for overriding method signature must be same in parent and child class till 1.4 version
// from 1.5 version covariant return type also allowed in method overriding so child class can have child
// return type in definition. Also covariant return type is only applicable for reference type but not
// for value types

class Child extends Parent {
    public  void m1(int i){
        System.out.println("m1 child");
    }

    public String m2(){
        System.out.println("m2 child");
        return "Hello";
    }

    /*
    Not applicable for value type covariant type
    public int m3(){
        System.out.println("m3 child");
        return 0;
    }*/

    public double m3(){
        System.out.println("m3 child");
        return 0;
    }

    /*
    parent method is final so overriding not possible
    public  void m4(){

    }*/

    /*
    we can make non abstract method as abstract in child class but then child class need to make abstract
    and then further child class must provide implementation for abstract method
    public abstract void m5();
     */

    // no rules on overriding for below method types in parent or child class

    // synchronized
    // native
    // strictfp

    /*
    if we are narrowing the scope of parent method in child class it is not allowed in child class or
    polymorphism but extending the scope is possible
    protected void m5(){
     }*/

    public  void m6(){
        System.out.println("m6 child");
    }

    public void m7(){}

    // compile time error as parent not throwing same or parent exception
    public void m8() throws  Exception{}

    public void m9() throws IOException {}

    public void m10() throws EOFException, FileNotFoundException,InterruptedException {}

    // as null pointer exception is unchecked exception so it will not impact parent method
    public void m11() throws EOFException,NullPointerException{}

    // both are unchecked exception so it will not impact parent method
    public void m12() throws ArithmeticException,NullPointerException{}

    // overriding static method of parent class in child class is called method hiding instead of method
    // overriding
    public static void m13(){
        System.out.println("static m13 child");
    }

    /*
    method overloading
    public void m14(int i){
        System.out.println("m14 child");
    }*/

    public void m14(int... i){
        System.out.println("var-args m14 child");
    }

    String name="Child";
}