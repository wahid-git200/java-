
// int java we hava premetive data type like: char, int, boolean, folat, byte..... premetive data type are buildin data type and java is object oreianted launguage,
// we can create objec of a type using wrapper classes and for evry data type wrapper class are avalible

/*   wrapper classer that all this are present in java.lung package
  Character
  Byte
  Short
  Integer
  Long
  Float
  Double
  Boolean

                              Object
                                |
     ___________________________________________________________ 
     |                           |                             |
     java.lung.Nubmer          java.lung.Charecter          java.lung.Boolenan
     _________________________________________
    |      |        |       |       |        |
    Byte   Short   Integer  Long   Float     Double

    the methods inside java.lung.Number;
    1 byte ----------------- byteValue()
    2 abstract double ------ doubleValue()
    3 abstract float ------- floatValue()
    4 abstract int   ------- intValue()
    5 abstract long -------- longValue()
    6 short ---------------- shorteValue()
*/


class WrapperClass{
    public static void main(String [] args){
        Integer i = new Integer(10); // object of Integer
        Integer i2 = Integer.valueOf(10);
        Integer i3 = 30;

        Byte c=15;
        Byte d= Byte.valueOf("10");
        // Byet e=Byte.valueOf(10)// error becuse 10 is integer
        byte  bb =10;
        Byte e=Byte.valueOf(bb);

        Short f = Short.valueOf("123");

        // Float g =12.3;//error
        Float g =12.3f;//ok
        Float g1 = Float.valueOf("12.3");//ok

        Double j = Double.valueOf(123.45);
        Double j2 = Double.valueOf("123.45");

        Character k = Character.valueOf('A');

        Boolean l= Boolean.valueOf("true");


        //boxing and unboxing
        Float h = Float.valueOf("123.4");// boxing or wrapping 
        Float h4= 100.1f; // atou boxing
        float h2 =h.floatValue();  // un boxing
        float h3=h; // atou un boxing it will call the flaotValue method automaticaly


        int m=10;
        Integer n =m;//atou boxing
        int p = n; // aout un boxing




        System.out.println("correct!!!");

    }
}