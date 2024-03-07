@FunctionalInterface
interface MyLambda1{
    public void display();
}

/*
                1
class My implements MyLambda{
    public void display(){
        System.out.println("hi");
    }
}
*/

/////////// lambdae with parametr////////////
@FunctionalInterface
interface MyLambda2{
    public void display(String name);
}
/////////// lambdae with multiple parametrs////////////
@FunctionalInterface
interface MyLambda3{
    public int add(int x , int x1);
}

class Lambda{
    public static void main(String[] args){
        /*    1
        MyLambda1 m = new My();
        m.display();
        */

       /*   2     anaymouse inner calss
       MyLambda1 m = new MyLambda1(){public void display(){

       }};
        m.display();
        */
        //  *************************lambda expretion
                    //    3
        MyLambda1 m =()->{
            System.out.println("hi");
        };
        m.display();

        /////////// lambdae with parametr////////////
        MyLambda2 m2 =(s)->{/// tack parmitres aouto matic will know s is string
            System.out.println(s);
        };
        m2.display("wahid'");
        /////////// lambdae with multiple parametr ////////////
        MyLambda3 m3 =(x,y)->{ return x+y;};//ok
        System.out.println(m3.add(10,20));

        MyLambda3 m13 =(x,y)-> x+y;//ok
        System.out.println(m13.add(10,20));

    }
}