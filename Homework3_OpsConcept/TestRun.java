package Homework3_OpsConcept;



public class TestRun {
    public static void main(String[] args) {
        // Crete an Object
        System.out.println("B is Child Class");
        B b=new B();
        b.M1(10,"I am Tester");

        System.out.println("C is child class");
        C c=new C();
        c.M1(20,"Mona");
        c.M1();// here Method overrides



        System.out.println("D is child class");
        D d=new D();
        d.M1(30,"Aryan");
        d.M2();




            }
        }


