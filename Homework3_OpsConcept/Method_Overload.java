package Homework3_OpsConcept;
// one thing can have many form

public class Method_Overload {
    //Declare a variable

    int x,y;
    double d;

    // crete a method but method name should be same
    void M1(){
        x=10;
        y=20;
        System.out.println(x+y);
    }
    //Declare a Parameter
    void M1(int a, int b){
        System.out.println(x+y);

    }


    void M1(int a,double c){
        x=a;
        d=c;
        System.out.println(x+c);
    }
    void M1(double c,int a){
        d=c;
        x=a;
        System.out.println(d+x);

    }


    public static void main(String[] args) {
        Method_Overload m=new Method_Overload();
        m.M1();//30
        m.M1(10,20);//30
        m.M1(10,10.5);//20.5
        m.M1(10.5,10);//20.5

    }
}
