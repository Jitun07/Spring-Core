package exceptionHandling;


    public class ExceptionFinallyDemo {
        public static void main(String[] args) {

            try {
//            System.out.println(10/0);
            }
            catch (Exception e)
            {
                System.out.println("I am in catch block:");
                System.out.println(e.toString());
            }
            finally {
                System.out.println("Best class of India ");
                System.out.println("Genie Ashwani Spark2.0 batch");
            }
        }
    }


