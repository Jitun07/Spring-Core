package multithreading;



    class SumTest implements Runnable{
        static int sum=0;
        @Override
        public void run() {
            for (int i=0;i<5;i++)
            {
//            System.out.println(Thread.currentThread().getName() +":" +i);
                sum=sum+i;

            }


        }
    }

    public class SumDemo {
        public static void main(String[] args) throws InterruptedException {
            Thread t=new Thread(new SumTest(),"Sum");
            t.start();
            t.join();//main thread till wait last:


        /*
        SumTest st=new SumTest();
        st.run();
              */
            System.out.println("Sum is =" +SumTest.sum);

        }
    }


