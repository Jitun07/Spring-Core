package javaCollections.SetInJava;



import java.util.TreeSet;

    public class TreeSetDemo {
        public static void main(String[] args) {
            TreeSet<Integer>treeset=new TreeSet<>();
            treeset.add(10);
            treeset.add(20);
            treeset.add(30);
            treeset.add(50);
            treeset.add(5);
            treeset.add(1);
//        treeset.add(null);//once time only
            System.out.println(treeset);

        }
    }


