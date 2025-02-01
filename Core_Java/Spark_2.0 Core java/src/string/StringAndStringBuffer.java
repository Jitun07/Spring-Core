package string;


    public class StringAndStringBuffer {
        public static void main(String[] args) {
            String s1="Hello";
            String s2=s1.concat("World");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);
            System.out.println(s1.equals(s2));
            System.out.println(s1.compareTo(s2));

            StringBuffer sb=new StringBuffer("Satyajit");

            sb.append("Baral");
            System.out.println(sb);

            StringBuffer sb1=sb.append("Baral");
            System.out.println(sb==sb1);


        }
    }


