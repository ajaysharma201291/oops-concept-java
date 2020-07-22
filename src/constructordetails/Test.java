package constructordetails;

// Constructor are used to initialize the object but not to create object JVM will create object when new
// keyword is used and initialize all variables with default value. After that constructor pictures came into
// existence and it will initialize variables from default to given values

// Constructor is called for each object and must have same name as class and should not have any return type
// even void. If any return type is applied then it is treated as method instead of constructor but it is not
// recommended

// Allowed access modifier for constructor are public,private,protected and default

// Every class including abstract class has default constructor provided by compiler not JVM if not written
// explicit constructor in class. Both default constructor and our constructor doesn't exist together

// Default constructor by compiler is always not argument constructor with access type of class but only
// applicable for public and default class types as top level class cannot be protected/private and final and
// other types not allowed for constructor. Default constructor only consist of one line super() and it is
// no-args call to super class constructor

// if we are generating default constructor but no statement inside this i.e no super() or this() call the
// compiler will automatically place this call inside the constructor. By default super() will be placed
// inside the constructor. The call of super() or this() must be first statement inside constructor and if
// we place it after any other line compile time error will be raised. Both super() and this() cannot be
// placed simultaneously in constructor else first line check for super() or this() will fail and result into
// compile time error

// We cannot call super() or this() inside any other method except the constructor but only inside constructor
// super() or this() are constructor call but super or this are keywords used to invoke parent or current
// object instance variables or method

import java.io.IOException;

// In constructor overloading is applicable but not overriding or inheritance concept is not applicable
// Abstract class constructor will be invoked when child class create instance
public class Test {
    /* Not allowed
    static  Test(){

    }
    final Test(){

    }
    etc.....
     */
    void Test(){
        //super();
        System.out.println("method");
    }
    Test(){
        super();
        // recursive constructor call is there result in compile time error
        //this(10);
        System.out.println("Constructor");
        //super();
    }
    Test(int i){
        this();
        System.out.println("int Constructor");
    }
    Test(double d){
        this(10);
        System.out.println("double Constructor");
    }

    public void m1(){
        m2();
    }

    public void m2(){
        m1();
    }


    public static void main(String[] args) {
        Test t=new Test();
        t.Test();
        Test t2=new Test(10.5);

        Child c=new Child(10);
        c.m1();

        //t.m1();
    }
}

// We cannot have constructor inside interface as it's task to initialize instance variable but interface
// members are public static final so no need of initialization inside interface so we get compile time error
/*interface I1{
    I1(){

    }
}*/

class Parent{
    String name="Parent";
    /*
    Parent constructor throws any checked exception than child constructor must handle it explicitly else
    compile time error will be there
    Parent() throws IOException {

    }*/
    Parent() {

    }
    Parent(int i){

    }
}

class Child extends  Parent{
    String name="Child";

    // parent class contains argument constructor hence must explicitly call that constructor
    // if no args constructor or no constructor is there it is valid
    Child(int i) {//throws  IOException{
        //super(10);
    }

    public void m1(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    /*
    we cannot use this or super inside static method only inside instance method or constructor
    public  static  void m2(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }*/
}

abstract  class  Test2{
    int x;
    Test2(int x){
        this.x=x;
    }
}
