package protectedTest;




import accessModifier.ModifierProtected;//protected
import accessModifier.ModifierPublic;// public

    public class ProtectedTest  extends ModifierProtected {
        public static void main(String[] args) {
            protectedTest.ProtectedTest pt=new protectedTest.ProtectedTest();
            pt.display();
            System.out.println(pt.name);

/*
        // use case test of public modifier:
             ModifierPublic mp=new ModifierPublic();
           mp.display();

 */

        }
    }


