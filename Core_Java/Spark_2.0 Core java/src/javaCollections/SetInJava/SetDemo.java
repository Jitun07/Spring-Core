package javaCollections.SetInJava;



import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

    public class SetDemo {
        public static void main(String[] args) {
            Set<Integer> set=new HashSet<>(); // it  does not maintain insertion order:
//        Set<Integer> set=new LinkedHashSet<>();// it maintain insertion order:
            set.add(10);
            set.add(20);
            set.add(30);
            set.add(40);
            set.add(50);
            set.add(50);
            System.out.println(set);
        }
    }


