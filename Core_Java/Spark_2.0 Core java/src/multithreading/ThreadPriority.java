package multithreading;



    class MyThread1 implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<6;i++)
            {
                System.out.println(Thread.currentThread());
//            System.out.println("Child Thread");
            }
        }
    }
    public class ThreadPriority {
        public static void main(String[] args) {
            Thread t1=new Thread(new MyThread1() ,"Thread-1");
            Thread t2=new Thread(new MyThread1() ,"Thread-2");
            System.out.println("Thread 1 ki priority :" +t1.getPriority());
            System.out.println("Thread 2 ki priority :" +t2.getPriority());

            t1.setPriority(Thread.MIN_PRIORITY);
            //or
            //  t1.setPriority(1);
            System.out.println("Thread 1 ki priority :" +t1.getPriority());

        /*
        t1.setPriority(Thread.MAX_PRIORITY);
        //or
        t1.setPriority(10);
        System.out.println("Thread 1 ki priority :" +t1.getPriority());

         */
            t1.start();
            t2.start();
            for (int i=0;i<6;i++)
            {
                System.out.println(Thread.currentThread());
//            System.out.println("Main Thread");
            }
        }
    }


