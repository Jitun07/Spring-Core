package javaCollections.ListInJava;



import java.util.ArrayList;
import java.util.List;

    public class ListDemo {
        public static void main(String[] args) {
            List<Integer>list=new ArrayList<Integer>();
            list.add(10);
            if(list.isEmpty())
            {
                System.out.println("List is empty...");
            }
            else
            {
                System.out.println("List is not empty...");
            }

            list.add(30);
            list.add(20);
            list.add(10);//duplicate
//        list.add(null);
            list.add(0);
            System.out.println(list);
            System.out.println(list.get(2));//index value

            System.out.println("Array Traversal :");
            for (int data:list)//Array Traversal
            {
                System.out.print(data +" ");
            }

        }
    }


