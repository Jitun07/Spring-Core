package oops;


    class SuperDad{
        int a=10;
        public void plot()
        {

            System.out.println("2000 gaj ka plot hai");
        }
    }
    class Dad extends SuperDad{



        public void slot()
        {
            System.out.println("Mere pass 2000 gaj ka plot hai");
        }
    }

    class Jitun extends Dad{
        public void name()
        {
            System.out.println("Mera naam Jitun hai");
        }
    }
    public class InheritanceDemo {
        public static void main(String[] args) {
            Jitun j=new Jitun();
            j.plot();
            j.name();
            j.slot();
            System.out.println(j.a);


        }
    }


