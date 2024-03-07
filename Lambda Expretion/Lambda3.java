



interface MyLambda{
    public void display(String str);
}
////////////////////////////////   2
class Demo{
    public static void reve(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }
}

public class Lambda3{
////////////////////////////////    3
    public Lambda3(String s){
        System.out.println(s.toUpperCase());
    }
////////////////////
    public static void main(String[] args){
        
        MyLambda ml =System.out::println; //:: is scope reslotion
        // any thin i put print that
        ml.display("whaid");
    ///////////////////////////////////////////// 2
        MyLambda d =Demo::reve;
        d.display("whiad");
    ///////////////////////////////////////////  3
        MyLambda m12=Lambda3::new;
        m12.display("najafi");
    }
}