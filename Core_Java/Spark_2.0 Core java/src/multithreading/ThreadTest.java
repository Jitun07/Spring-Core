package multithreading;



    class MyThread extends Thread{
        @Override
        public void run() {
            for (int i=0;i<5;i++)
            {
                System.out.println(Thread.currentThread());
                System.out.println("Child Thread is executing");
            }
        }
    }
    public class ThreadTest {
        public static void main(String[] args) {
            MyThread t1=new MyThread();
            t1.start();
            for (int i=0;i<5;i++)
            {
                System.out.println(Thread.currentThread());
                System.out.println("Main Thread is executed");
            }

        }
    }


