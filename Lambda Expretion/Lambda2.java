
@FunctionalInterface
interface MyLambda{
    public void display();
}

class Demo{
        int y =1000;
    public void method1(){
        int x=0;
            MyLambda m =()->{
                int count=0;
                count=100;
                y=20;
                System.out.println("hellow");
                System.out.println("world");
                System.out.println(count);
               /* System.out.println(x++);// error: local variables 
                 referenced from a lambda expression must be 
                 final or effectively final
                 */
                System.out.println();
                System.out.println(y++);//ok
            };

            m.display();
    }
}
// lambda expretion can be us to pass in to a parametr
class UseLabmde{
    public void callLambda(MyLambda ml){
        ml.display();
    }
}

class Demo2{
    public void method2(){
        UseLabmde ul = new UseLabmde();
        ul.callLambda(()->{System.out.println("it is working!! on Demo2");});
    }
}
public class Lambda2{
    public static void main(String[] args){
        Demo d = new Demo();
        d.method1();

        ////////////////////////////////
        Demo2 d2 = new Demo2();
        d2.method2();
    }
}