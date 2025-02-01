package multithreading;


    class JoinTest implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<5;i++)
            {
                System.out.println(Thread.currentThread().getName() +":" +i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }


        }
    }

    public class JoinMethodDemo {
        public static void main(String[] args) throws InterruptedException {
            Thread t=new Thread(new JoinTest(),"Shadi Venue...");
            t.start();
            t.join();//main thread till wait last:
            System.out.println("Shadi Card Print......");

        }
    }


