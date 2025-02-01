package javaCollections.ListInJava;



import java.util.ArrayList;
import java.util.Iterator;

    public class IteratorDemo {
        public static void main(String[] args) {
            ArrayList<Integer>list=new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(40);
            list.add(30);
            list.add(10);
            System.out.println(list);

            Iterator<Integer> iterator=list.iterator();
            while(iterator.hasNext())
            {
                Integer data=iterator.next();

                if(data==40)
                {
                    iterator.remove();
                }
                System.out.println(data);

            }
            System.out.println(list);

        }
    }

