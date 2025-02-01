package string;



    public class StringBufferFunctions {
        public static void main(String[] args) {
            StringBuffer sb=new StringBuffer("Jitun");
            sb.append("Nayak");
            System.out.println(sb);

            //insert
            sb.insert(2,123);
            System.out.println(sb);
            sb.insert(2,"Hello");
            System.out.println(sb);

            //reverse
            sb.reverse();
            System.out.println(sb);

            //replace
            sb.replace(6,11,"Laxmi");
            System.out.println(sb);

            StringBuffer sb1=new StringBuffer("Jitun nayak");
            System.out.println(sb1.capacity());
        }
    }


