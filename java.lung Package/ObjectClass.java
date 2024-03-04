
// object class is the parent of all classes in java 
import java.lang.*;

class MyObject{
     // override toString method of objec 
     //beacuse all the calsses is the child of object it is correct to override the methods of objec
     public String toString(){
        return "my object";
     }
     public int hashCode(){
        return 100;
     }

     public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
     }

    //  public void wait(){ //we can not override becuease it is final
    //  }

    //also notify method and notifyAll method
}

class ObjectClass
{
    public static void main(String[] args){
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        
        System.out.println(o1.toString());
        System.out.println(o1);

        System.out.println(o1.equals(o2));//fals
        System.out.println(o1.equals(o3));//true

        Object o4 = new MyObject();//ok
        System.out.println(o4.toString());//"my object"

        MyObject o5 = new MyObject();
        MyObject o6 = new MyObject();
        System.out.println(o5.hashCode());
        System.out.println(o6.hashCode());

        System.out.println(o5.equals(o6));//before  the overrideing equals method it will return false beacuse this are defirent objects and ofter the ovrridding that methid it will print true becueas the hash code of o5 and o6 will be same


    }
}