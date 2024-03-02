class MyData{
    synchronized public void display(String s){
        // synchronized(this)
        // {
            for(int i =0;i<s.length();i++)//critical section
            System.out.print(s.charAt(i));
            System.out.println();
        // }
    }
    
}

class MyThread1 extends Thread{
    MyData d;
    public MyThread1(MyData d){
        this.d=d;
    }

    public void run(){
        d.display("hello world");
    }
}

class MyThread2 extends Thread{
    MyData d;
    public MyThread2(MyData d){
        this.d=d;
    }

    public void run(){
        d.display("Wellcome All");
    }
}
class Syncronyzation{
    public static void main(String[] args){
        MyData data = new MyData();
        MyThread1 t1 =new MyThread1(data);
        MyThread2 t2 =new MyThread2(data);
        t1.start();
        t2.start();
    }
}