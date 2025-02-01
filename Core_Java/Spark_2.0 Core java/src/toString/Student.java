package toString;

public class Student {
    int rollno;
    String name;
    float marks;
    public Student(){

    }


public Student(int rollno,String name , float marks){
    this.rollno=rollno;
    this.name=name;
    this.marks=marks;
 }
//
//    @Override
//    public String toString() {
//        return "Student :{" +
//                "rollno=" + rollno +
//                ", name='" + name + '\'' +
//                ", marks=" + marks +
//                "}";
//    }


    /*
    //or this way also we can write to string method ....
    @Override
    public String toString() {
        return  rollno+ name+ +marks;
    }

     */

    public static void main(String[] args) {

//        Student s=new Student(1,"H",89.0f);
        Student s1=new Student(2,"J",99.0f);
        Student s=new Student();

//        System.out.println(s1.rollno);
        System.out.println(s1);
        System.out.println(s1.toString());
//        System.out.println(s1);

    }

}



