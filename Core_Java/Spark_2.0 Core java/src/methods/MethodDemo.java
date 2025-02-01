package methods;



import java.util.Scanner;

    class AdditionNumber{
        int sum(int a , int b)
        {
            return a+b;
        }

        void display()
        {
            int a=10;
            int b=23;
            System.out.println(a+b);
            System.out.println("Hello");
        }
    }

    public class MethodDemo {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first number :");
            int x=sc.nextInt();
            System.out.println("Enter the second number :");
            int y=sc.nextInt();
            AdditionNumber an=new AdditionNumber();
            int result=an.sum(x,y);
            System.out.println("The sum of two number is :  "+result);

            an.display();

        }
    }


