package accessModifier;

    class ModifierDefault{
        String name="Jitun";//default modifier

        void display(){//default modifier
            System.out.println("Hello " +name);
        }
    }

    public class ModifierDefaultDemo {
        public static void main(String[] args) {
            ModifierDefault md=new ModifierDefault();
            md.display();
            System.out.println(md.name);

        }

    }


