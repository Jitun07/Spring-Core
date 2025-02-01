package interfaceDemo;


    interface Demo{
        int a=10;// in interface all variables are by default in abstract ,public and final :
        void display();//in interface all methods are by default in abstract and public :
        //abstract : then i will depend on my child ,abstract and interface method has no body so we cant not create object:


    }

    class Test implements Demo{
        @Override
        public void display() {
            System.out.println("Hello");
            System.out.println(a);
        }
    }

    public class InterfaceTest {
        public static void main(String[] args) {
            Test t=new Test();
            t.display();


        }
    }


