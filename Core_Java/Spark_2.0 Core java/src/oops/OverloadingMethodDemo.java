package oops;




    class Overload{

        public int add(int a ,int b){
            return a+b;
        }
        public int add(int a , int b, int c){
            return a+b+c;
        }
        public int add(int a , int b, int c, int d){
            return a+b+c+d;
        }
    }
    public class OverloadingMethodDemo {
        public static void main(String[] args) {
            Overload ol=new Overload();
            int res=ol.add(2,5,9,8);
            System.out.println(res);

        }
    }


