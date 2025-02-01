package designPattern;

public  class  Samosa {

    private static Samosa samosa;
    private Samosa()
    {

    }

    //Lazy way of creating singleton object //
    public static Samosa getSamosa(){
        //object of this class
//        Samosa samosa = new Samosa();
        if (samosa==null)
        {
            synchronized (Samosa.class){ // when multiple threads are execute at a time so we can use sybchrinized block or synchronized method .
                if (samosa==null)
                {
                    samosa = new Samosa();
                }
            }

        }
        return samosa;
    }

}

/*
 *
 * 1.constructor private .
 * 2.object create with the help of method .
 * 3.create field  to store object is private .
 */
