package exceptionHandling;



    public class ExceptionThrowDemo {
        public static void main(String[] args) {
            int [] arr=new int[5];
            for(int i=0;i< arr.length;i++)
            {
                arr[i]=i;
            }
            try{
//            int res=arr[1];
                int res=arr[9];
//            System.out.println(10/0);
                throw new ArithmeticException("Request fail due to technical error");
            }
            catch (ArithmeticException e)
            {
                System.out.println("ArithmeticException");
                System.out.println(e.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBoundsException");
                System.out.println(e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println("I am in catch block");
                System.out.println(e.getMessage());
            }
        }
    }


