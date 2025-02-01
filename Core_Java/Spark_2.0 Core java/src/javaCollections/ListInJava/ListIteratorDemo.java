package javaCollections.ListInJava;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

    public class ListIteratorDemo {
        public static void main(String[] args) {

            List<Integer> list = new ArrayList<Integer>();

        /*forward direction
        System.out.println("Forward direction........... ");
        for (int i = 1; i <= 5; i++) {
            list.add(i * 5);
        }
        ListIterator<Integer> itr = list.listIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() +" ");
        }

         */
            //backward direction

            System.out.println();

            System.out.println("Backward Direction............");
            for (int i = 1; i <= 5; i++) {
                list.add(i * 5);
            }
            ListIterator<Integer> iterator = list.listIterator(list.size());
            while (iterator.hasPrevious()) {
                System.out.print(iterator.previous() +" ");
            }
        }

    }


