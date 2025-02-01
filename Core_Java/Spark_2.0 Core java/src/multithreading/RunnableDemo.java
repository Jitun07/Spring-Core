package multithreading;


    class MyRunnable1 implements Runnable{
        @Override
        public void run() {
            for (int i=0;i<6;i++)
            {
                System.out.println(Thread.currentThread());
                System.out.println("Child Thread");
            }
        }
    }

    public class RunnableDemo {
        public static void main(String[] args) {
            Thread t=new Thread(new MyRunnable1());// either object pass or instance of object will be pass:
            t.setName("Jitun");
            t.start();
            for (int i=0;i<6;i++)
            {
                System.out.println(Thread.currentThread());
                System.out.println("Parent Thread");
                System.out.println(t.getName());
            }


        }
    }

