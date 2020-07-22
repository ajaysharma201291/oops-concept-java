package polymorphismdetails;

public class Signature {
    //method overloading or compile time polymorphism or early binding
    public void m1(){
        System.out.println("m1 no parameter method");
    }

    public void m1(int m){
        System.out.println("m1 int method");
    }

    public void m1(double m1){
        System.out.println("m1 double method");
    }

    /* same method signature definition
    public  int m1(int m){
        System.out.println("not overloaded m1 method");
        return  0;
    }*/

    public void m2(String m){
        System.out.println("m2 string method");
    }
}

class Overloading{
    public  void m1(int m){
        System.out.println("m1 int method");
    }

    public void m1(float m1){
        System.out.println("m1 float method");
    }

    public void m2(Object o){
        System.out.println("m2 Object method");
    }

    public void m2(String s){
        System.out.println("m2 String method");
    }

    public  void m2(StringBuffer sb){
        System.out.println("m2 StringBuffer method");
    }

    public void m3(int i){
        System.out.println("m3 int method");
    }

    public void m3(int... i){
        System.out.println("m3 var-args int method");
    }

    public  void m4(int i,float f){
        System.out.println("m4 int float method");
    }

    public  void m4(float i,int f){
        System.out.println("m4 float int method");
    }

    public  void m5(Animal a){
        System.out.println("m5 Animal method");
    }

    public  void m5(Monkey a){
        System.out.println("m5 Monkey method");
    }
}

class Animal{

}

class Monkey extends Animal{

}



