package oops;


    class ATM{
        private String name;
        private String pass;
        private String bal;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public String getBal() {
            return bal;
        }

        public void setBal(String bal) {
            this.bal = bal;
        }
    }

    public class DataHidingDemo {
        public static void main(String[] args) {
            ATM atm=new ATM();
            atm.setName("Jitun Nayak");
            atm.setPass("1012");
            atm.setBal("10000");
            System.out.println( atm.getBal());
            System.out.println( atm.getPass());
            System.out.println( atm.getName());




        }
    }


