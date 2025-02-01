package exceptionHandling;



    class FinalTest{
        int  m1()
        {
            try {
                System.out.println(10/0);
                System.out.println("try block executed ");
//            System.out.println(10/0);
                return 56;
            }
            catch (ArithmeticException e)
            {
                System.out.println("catch block executed");
//            System.exit(0);
                return 66;
            }
            finally {
                System.out.println("finally block executed");
                return 89;
            }
        }
    }

    public class ExceptionFinallyDemo1 {
        public static void main(String[] args) {
            FinalTest ft=new FinalTest();
            int res=ft.m1();
            System.out.println(res);
        }
    }

