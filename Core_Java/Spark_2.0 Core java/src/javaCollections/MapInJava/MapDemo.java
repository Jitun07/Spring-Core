package javaCollections.MapInJava;


import java.util.HashMap;
import java.util.Map;

    public class MapDemo {
        public static void main(String[] args) {
            Map<String,Integer>map=new HashMap<>();
            map.put("one" , 10);
            map.put("two" , 20);
            map.put("three" , 30);
//        map.put("one" , 70);
            System.out.println(map);

            System.out.println(map.get("two"));

        }
    }



