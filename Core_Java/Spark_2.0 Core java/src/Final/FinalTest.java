
package Final;

    class FinalDemo{
        final void m1(){
            System.out.println("Hello");
        }
    }

    class FinalTestDemo extends FinalDemo{
//    void m1(){

//    }

    }

    public class FinalTest {
        public static void main(String[] args) {
            int a=20;
            a=30;
            System.out.println(a);
            final int b=12;
//        b=23;//not accessible
            System.out.println(b);

            FinalTestDemo fd=new FinalTestDemo();
            fd.m1();

        }
    }


