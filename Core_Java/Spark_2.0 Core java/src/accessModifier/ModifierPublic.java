package accessModifier;


    public class ModifierPublic{
        public String name="Nikita";
        public void display()
        {
            System.out.println("Hello "+name);
        }

    }


    class ModifierPublicDemo {
        public static void main(String[] args) {
            ModifierPublic mp=new ModifierPublic();
            mp.display();
            System.out.println(mp.name);

        }
    }


