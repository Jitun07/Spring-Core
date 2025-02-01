package oops;



    class Shape{
        void draw()
        {
            System.out.println("Drawing a shape....");
        }
    }
    class Circle extends Shape{
        @Override
        void draw() {
//        super.draw();
            System.out.println("Drawing a circle........");
        }
    }
    class Rectangle extends Shape{
        @Override
        void draw() {
            System.out.println("Drawing a rectangle......");
        }
    }

    public class OverridingMethodDemo {
        public static void main(String[] args) {
            Shape shape=new Shape();
            shape.draw();

            Circle circle=new Circle();
            circle.draw();

            Rectangle rectangle=new Rectangle();
            rectangle.draw();

            Shape shape1=new Circle();//// THis is called run time Polymorphism (overriding)
            shape1.draw();

        }
    }


