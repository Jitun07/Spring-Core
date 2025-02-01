package TypeCasting;



    public class TypeCastingDemo {
        public static void main(String[] args) {
            int a =10;
            System.out.println(a);
            //converting int type to double type

            double data=a;//widening or narrowing(lower data type to higher data type)
            System.out.println(data);

            double num=10.99;
            System.out.println(num);

            //converting double type to  int type
            int b=(int)num;// narrowing or explicit(higher data type to lower data type)
            System.out.println(b);

            int p=65;
            System.out.println(p);
            char c=(char)p;
            System.out.println(c);

            char e='B';
            System.out.println(e);
            int w=e;
            System.out.println(w);
        }
    }


