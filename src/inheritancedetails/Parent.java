package inheritancedetails;

public class Parent {
    public  void m1(){
        System.out.println("parent m1");
    }
}

class A{

}
//single inheritance
//even every thing is child of object, but it is now indirect child of object class
class B extends A{

}
//multilevel inheritance
class C extends B{

}

//multiple inheritance not supported in classes but allowed in interface
/*
class D extends A,C{

}*/

//hierarchical inheritance
class E extends A{

}

//Hybrid inheritance is also not supported

//multiple inheritance allowed in interface
interface  I1{
    void m1();
}

interface I2{
    void m1();
}

interface I3 extends I1,I2{

}

class F implements I1,I2,I3{

    @Override
    public void m1() {

    }
}

//cyclic inheritance is also not supported
/*class G extends G{

}*/
/*
class G extends  H{

}

class H extends G{

}*/

