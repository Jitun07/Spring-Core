package javaCollections.ListInJava;



import java.util.ArrayList;
import java.util.Scanner;

    public class ListRemoveElementDemo {
        public static void main(String[] args) {

            // Remove index
            /*
             *create list with elements
             *read index
             *if index is valid :remove the from the list
             *if index is not valid : display error message
             */

            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<5;i++)
            {
                list.add(i);
            }
            System.out.println("List  :" +list);

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the index u want to remove :");
            int index=sc.nextInt();
            if(index<=list.size()-1)
            {
                list.remove(index);
                System.out.println("List is :"+list);
            }
            else
            {
                System.out.println("Error no such type of index is not found : ");
            }

            //Element check
            System.out.println("Enter the element to check :");
            int ele=sc.nextInt();
            if(list.contains(ele))
            {
                System.out.println("yes we have!..........");
            }
            else
            {
                System.out.println("Error no such element  is not found .....");
            }
            System.out.println(list.indexOf(ele));

        }
    }


