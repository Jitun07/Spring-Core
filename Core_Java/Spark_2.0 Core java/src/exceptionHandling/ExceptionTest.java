package exceptionHandling;



    public class ExceptionTest {
        public static void main(String[] args) {
            System.out.println("Before try");
            try{
                System.out.println("before risky  code");
                System.out.println(10/0);//risky code
                System.out.println("after risky code");


            }
            catch (ArithmeticException e)
            {
                System.out.println("In catch block");//java.lang.ArithmeticException: / by zero at exception.ExceptionTest.main(ExceptionTest.java:8) :(output ase hi ayega)

                e.printStackTrace();
                System.out.println(e.toString());//java.lang.ArithmeticException: / by zero :(output ase hi ayega)
                System.out.println(e.getMessage());// /by zero :(output ase hi ayega)
                System.out.println(e);//java.lang.ArithmeticException: / by zero : (output ase hi ayega)
            }
            System.out.println("Jitun");
            System.out.println("Genie");
            System.out.println("Ashwani");
        }
    }


