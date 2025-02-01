package oops;


    class Car{
        public void sound()
        {
            System.out.println("pooo pooo");
        }
    }

    class Maruti extends Car{


        void horn()
        {
            super.sound();
            System.out.println("pee peee!");
        }

    }
    public class InheritanceTest {
        public static void main(String[] args) {
       //Child class object:
        Maruti mr=new Maruti();
//        mr.sound();
        mr.horn();
 /*
         //Parent class object
        Car cr=new Car();
        cr.sound();

         */
            //Dynamic dispatcher class object

            //Maruti mr=new Car();//wrong way
//            Car cr=new Maruti();//this is write way
//            cr.sound();


        }
    }

