package accessModifier;



    public class ModifierProtected{
        protected String name="Jitun";
        protected void display()
        {
            System.out.println("Welcome "+name);
        }
    }

    class ModifierProtectedTest extends ModifierProtected{


    }

    class ModifierProtectedDemo {
        public static void main(String[] args) {
            ModifierProtectedTest mpt=new ModifierProtectedTest();
            mpt.display();
            System.out.println(mpt.name);


        }
    }


