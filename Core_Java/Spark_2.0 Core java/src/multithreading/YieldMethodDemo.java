package multithreading;



    class YieldTest1 implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<6;i++)
            {
                System.out.println(Thread.currentThread().getName() +":" +i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Thread.yield();

            }
        }

    }

    class YieldTest implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<6;i++)
            {
                System.out.println(Thread.currentThread().getName() +":" +i);
//            Thread.yield();
            }
        }
    }

    public class YieldMethodDemo {
        public static void main(String[] args) {
            Thread t=new Thread(new YieldTest(),"YieldTest");
            Thread t1=new Thread(new YieldTest1(),"YieldTest1");

            t.start();
            t1.start();

        }
    }


