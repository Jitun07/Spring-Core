package accessModifier;

class ModifierPrivate{
    private String name="Jitun";//private modifier

    private void display(){//private modifier
        System.out.println("Hello" +name);
    }
    public String getName()
    {
        return name;
    }
//    public void setName(String name)
//    {
//        this.name=name;
//    }
}

public class ModifierPrivateDemo {
    public static void main(String[] args) {
        ModifierPrivate mp=new ModifierPrivate();
//        mp.setName("Akash");
        System.out.println(mp.getName());



    }
}

