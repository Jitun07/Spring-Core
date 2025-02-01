package designPattern;

public class Jalebi {

    // Eager of Creating singleton object
    private static Jalebi jalebi=new Jalebi();

    public static Jalebi getJalebi(){
        return  jalebi;
    }

}
