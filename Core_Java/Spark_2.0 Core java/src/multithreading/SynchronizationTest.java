package multithreading;



    class SavingsAccount{

        public synchronized void withdraw(String name)  {
            for(int i=0;i<5;i++)
            {
                System.out.print("Paise Nikal rahe hai =");
                try{
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
                System.out.println(name);
            }
            System.out.println("***********************Transaction Completed********************");
        }
    }
    class MyThreadAccount extends Thread{
        SavingsAccount s;

        String name;

        MyThreadAccount(SavingsAccount s,String name){
            this.s=s;
            this.name=name;
        }

        @Override
        public void run() {
            s.withdraw(name);
        }
    }



    public class SynchronizationTest {
        public static void main(String[] args) {
            SavingsAccount savingsAccount=new SavingsAccount();

            MyThreadAccount t1=new MyThreadAccount(savingsAccount,"Husband");
            MyThreadAccount t2=new MyThreadAccount(savingsAccount,"Wife");
            t1.start();
            t2.start();



        }
    }


