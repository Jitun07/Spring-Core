package oops;



    class Animal{
        String name;
    }
    class Dog extends Animal{
        String name;
        void print(){
            //super--> parent class
            //this--> current class
            super.name="Animal";
            this.name="Tommy";
            //or
//            System.out.println(super.name);

            System.out.println("Parent Name: " +super.name);
            System.out.println("Parent Name: " +this.name);
        }
    }

    public class ThisAndSuper {
        public static void main(String[] args) {
            Dog d=new Dog();
            d.print();

        }
    }


