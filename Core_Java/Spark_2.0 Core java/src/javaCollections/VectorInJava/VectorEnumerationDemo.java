package javaCollections.VectorInJava;



import java.util.Enumeration;
import java.util.Vector;

    public class VectorEnumerationDemo {
        public static void main(String[] args) {
            Vector<Integer> vector=new Vector();

            vector.addElement(80);
            vector.addElement(50);
            vector.addElement(70);
            vector.addElement(40);
            vector.addElement(70);//duplicate allow
            System.out.println(vector);

            Enumeration<Integer> elements=vector.elements();
            while(elements.hasMoreElements())
            {
                Integer data=(Integer) elements.nextElement();
                System.out.println(data);
            }
        }


    }


