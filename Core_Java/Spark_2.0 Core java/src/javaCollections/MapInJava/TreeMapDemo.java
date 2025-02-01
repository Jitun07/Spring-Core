package javaCollections.MapInJava;


import java.util.TreeMap;

    public class TreeMapDemo {
        public static void main(String[] args) {
            TreeMap<String ,Integer>treeMap=new TreeMap<>();

            treeMap.put("One" ,1);
            treeMap.put("two" ,3);
            treeMap.put("three" ,2);
            System.out.println(treeMap);
        }
    }


