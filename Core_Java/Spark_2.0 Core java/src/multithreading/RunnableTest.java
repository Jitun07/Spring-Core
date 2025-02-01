package multithreading;


    class MyRunnable implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<7;i++)
            {
                System.out.println("Runnable");
            }

        }
    }

    public class RunnableTest {
        public static void main(String[] args) {
            MyRunnable r=new MyRunnable();
            Thread t=new Thread(r);
            t.start();
            for (int i=0;i<8;i++)
            {
                System.out.println("Main");
            }




        }
    }


