package staticDemo;



    class Test{
        static int a=10;//class loading

        int b=20;
        //    static int b=20;//(we can achieve  value of b using static):(code45)
        public void display()
        {
            System.out.println(a);
        }
        public static void print()
        {
//        System.out.println(b);//error (nonstatic filed cna not be referenced from a static field):(code45)
        }
    }

    public class StaticTestDemo {
        public static void main(String[] args) {
            Test t=new Test();
//        System.out.println( t.a);//not showing error but wrong usees :
            t.display();
            System.out.println(Test.a);
            Test.print();

            Test t1=new Test();
            t1.a=100;

            Test t2=new Test();
            t2.a=200;

            System.out.println(t1.a);
            System.out.println(t2.a);
            Test t3=new Test();
            t3.a=500;
            System.out.println(t1.a);
            System.out.println(t2.a);
            System.out.println(t3.a);
            System.out.println("-------------------------------------------");
            t1.b=100;
//        t2.b=200;
//        t3.b=300;
            System.out.println(t1.b);
            System.out.println(t2.b);
            System.out.println(t3.b);


        }
    }


