package designPattern;

public class Example {
    public static void main(String[] args) {

        //Lazy
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());

        //Eager
        Jalebi jalebi = Jalebi.getJalebi();
        System.out.println(jalebi.hashCode());

        Jalebi jalebi1 = Jalebi.getJalebi();
        System.out.println(jalebi1.hashCode());
    }

}
