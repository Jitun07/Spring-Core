package javaCollections.SetInJava;




import java.util.Comparator;
import java.util.TreeSet;

    class UserComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Integer data1=(Integer) o1;
            Integer data2=(Integer) o2;
            if(data1>data2)
            {
                return 1;
            }
            else if (data1<data2)
            {
                return -1;
            }
            else {
                return 0;
            }
        }
    }

    public class ComparatorDemo {
        public static void main(String[] args) {
            TreeSet<Integer> treeset=new TreeSet<>(new UserComparator());
            treeset.add(10);
            treeset.add(20);
            treeset.add(30);
            treeset.add(50);
            treeset.add(5);
            treeset.add(1);
            System.out.println(treeset);

        }
    }


