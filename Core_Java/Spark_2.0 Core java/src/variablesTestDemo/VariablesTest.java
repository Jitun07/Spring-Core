package variablesTestDemo;



    class Parent{
        String name="Dipti";
    }

    class Demo extends Parent{
        String name="Navya";//instance variable
        int a;//if we not initialize the value of variable by default value of data types are the output in the instance variable :

        void print()
        {
            String dog="Tommy";//local variable
//        int b;//inside the local variable value must be initialized  otherwise showing error :
            System.out.println(name);
            System.out.println(dog);
            System.out.println("a== "+a);
//        System.out.println(b);//erroe
        }
        void display()
        {
            System.out.println(name);
//        System.out.println(dog);//error
        }

        void namste(String name , int a)
        {
            System.out.println(name);// pass wala method see;
            System.out.println(a);
            System.out.println(this.name);//current class reference ka name
            System.out.println(this.a);//current class reference ka  'a' ka value:

            System.out.println(super.name);//parent class ka reference ka name :
        }
    }
    public class VariablesTest {
        public static void main(String[] args) {
            Demo d=new Demo();
            d.print();
            d.display();
            d.namste("Jitun",20);

        }
    }


