package oops;



    abstract class Vehicle{
        public abstract void engine();

    }

    class BMW extends Vehicle {// or (abstract class BMW extends Vehicle):

        @Override
        public void engine() {
            System.out.println("4000c Engine----------");
        }
    }
    class Tata extends Vehicle{
        @Override
        public void engine() {
            System.out.println("2100c Engine----------");
        }
    }
    public class AbstractionDemo {
        public static void main(String[] args) {
            Vehicle v1=new BMW();
            v1.engine();

            Vehicle v2=new Tata();
            v2.engine();

            /* Vehicle v3=new Vehicle();// in abstract method there is no object creation of parent class so ,
             display only necessary information and other informations  are hide .

             */


        }
    }


