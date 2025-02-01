package exceptionHandling;


    class ExceptionDemo{
        void print1()
        {
            print2();
            System.out.println("Print 1");
        }
        void print2()
        {
            print3();
            System.out.println("Print 2");
        }
        void print3()
        {
            print4();
            System.out.println("Print 3");
        }
        void print4()
        {
            print5();
            System.out.println("Print 4");
        }
        void print5()
        {
            try{
                System.out.println(10/0);
            }
            catch (Exception e)
            {
//            e.printStackTrace();
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }

        }
    }

    public class ExceptionWorking {
        public static void main(String[] args) {
            ExceptionDemo ed=new ExceptionDemo();
            ed.print1();

        }

    }


