package oops;


    class TestParent{
        private void m()
        {

        }
        static void m1()
        {
            System.out.println("Hello Test parent");
        }

        protected void m2()
        {
            System.out.println("Hello Parent");
        }
        void m3()
        {
            System.out.println("Parent 3");
        }

    }
    class TestChild extends TestParent{
        static void m1() {

        }

        @Override
        public void m2() {// public and protected both allowed

        }

        @Override
        public void m3() { // default , protected and public used :

        }
    }



    public class OverridingMethodTest {
        public static void main(String[] args) {

        }
    }


