package string;



import java.util.Arrays;

    public class StringDemo {
        public static void main(String[] args) {
            //Length
            String s="Jitun Nayak";
            System.out.println(s.length());

            String p="laxmi Swain";
            for(int i=0;i<p.length();i++)
            {
                System.out.println(p.charAt(i));
            }


            //concatenation
            String s1="Jitun";
            String s2="Nayak";
            String s3=s1.concat(s2);
            //or
            String s4=s1+s2;
            System.out.println(s3);
            System.out.println(s4);

            //toCharArray()

            String s5="Jitun";
            char arr[]=s5.toCharArray();
            System.out.println("to char array =" + Arrays.toString(arr));

            //charAt()

            String s6="Leela";
            System.out.println("Chat at = "+s6.charAt(3));

            //compareTo()

            String s12="hello";
            String s13="hello";
            int res= s12.compareTo(s13);
            System.out.println(res);

            //reference com equals()
            System.out.println(s12.equals(s13));

            //contains()

            String s15="hello jitun welcome to the development batch spark 2.0";
            System.out.println(s15.contains("jitun"));
            System.out.println(s15.contains("Deep"));

            //indexOf()
            System.out.println(s15.indexOf('a'));
            System.out.println(s15.lastIndexOf("i"));

            //replace()\
            String s8="hello world";
            System.out.println(s8.replace("hello" ,"jitun"));

            //subString()

            String r1="hello jitun welcome to the development batch spark2.0";
            String r2=r1.substring(0,7); // 0 to end-1
            String r3=r1.substring(5);//5 to end -1

            System.out.println(r2);
            System.out.println(r3);
        }
    }


