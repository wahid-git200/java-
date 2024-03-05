
import java.lang.reflect.*;
import java.util.Arrays;
// the defination of a class is in
class My{
    private int a;
    private int b;
    public int c;
    int d;

    public My(){}

    public My(int x, int y){}

    public void display(String s1, String s2){}
    public int show(int x, int u){return 0;}
}

class ReflectClass{
    public static void main(String[] args){
        Class c= My.class;
        System.out.println(c.getName());//my
        Field field [] =c.getDeclaredFields();
        System.out.println(Arrays.toString(field));
        //[private int My.a, private int My.b, public int My.c, int My.d]

        Constructor fieldC[]=c.getConstructors();
        System.out.println(Arrays.toString(fieldC));
        //[public My(), public My(int,int)]

        Method meth[]=c.getMethods();
        System.out.println(Arrays.toString(meth));
//         [public int My.show(int,int), public void My.display(java.lang.String,java.lang.String), public final void java.lang.Object.wait() throws java.lang.InterruptedException, public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException, public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException, public boolean java.lang.Object.equals(java.lang.Object), public java.lang.String java.lang.Object.toString(), public native int 
// java.lang.Object.hashCode(), public final native java.lang.Class java.lang.Object.getClass(), public final native void java.lang.Object.notify(), public final native void java.lang.Object.notifyAll()]

        // ** evry class is the cild of object and will get inheret some methods form object


        System.out.println(Arrays.toString(meth[0].getParameters()));//[int arg0, int arg1]
        



        
    }
}