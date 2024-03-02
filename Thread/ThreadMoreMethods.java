// class MyRuunable implements Runnable{
//     public void run(){
//       System.out.println("my thread");
//     }
    
// }
// class Test{
//   public static void main(String [] args){

//     Thread t1 = new Thread();
//     Thread t2 = new Thread("Thread 2");
//     Thread t3 = new Thread(new MyRuunable(), "thread 3");
//     Thread t4 = new  Thread(new MyRuunable()," thread 4");
//   }
// }
/*
class MyThread extends Thread{
  MyThread(String name){
    super(name);
    // to pleace we can set the priority on t.setPriority inside driver class and sencond in heredown
    // setPriority(Thread.MAX_PRIORITY);
    // setPriority(Thread.MIN_PRIORITY);
    setPriority(Thread.MIN_PRIORITY+2);
    // setPriority(Thread.MEDIUM_PRIORITY+2);

  }
}

class Test{
  public static void main(String[] args){
    MyThread t = new MyThread("thread 1");
    System.out.println("Id: = " + t.getId());
    System.out.println("name: = " + t.getName());
    System.out.println("priority: = " + t.getPriority());
    System.out.println("state: = " + t.getState());
    t.start();
     System.out.println("state: = " + t.getState());
    System.out.println("Alive: = " + t.isAlive());
  }
}
*/
////////sleep();
/*
class MyThread extends Thread{
  public void run(){
    int i=1;
    while(true){
      System.out.println("my thread " + i++);
      try{
        Thread.sleep(1000);//InterruptedException
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
  }
}
class Test{
  public static void main(String[] args){
     MyThread t =new MyThread();
     t.start();
     t.interrupt();
  }
}
*/
/// set daemon();
/*
class MyThread extends Thread{
  public void run(){
    int i=1;
    while(true){
      System.out.println("my thread " + i++);
    }
  }
}
class Test{
  public static void main(String[] args){
     MyThread t =new MyThread();
     t.setDaemon(true);
     t.start();
     try{
      Thread.sleep(100);
     }catch(Exception e){}
  }
}
*/
//join();
/*
class MyThread extends Thread{
  public void run(){
    int i=1;
    while(i<100){
      System.out.println("my thread " + i++);
    }
  }
}
class Test{
  public static void main(String[] args){
     MyThread t =new MyThread();
     t.setDaemon(true);
     t.start();
     Thread mainThread = Thread.currentThread();//get the reference of main thread;
     System.out.println(mainThread.getName());
     try{
     mainThread.join();
     }
     catch(Exception e){
      System.out.println(e);
     }
  }
}
*/
//yield();
class MyThread extends Thread{
  public void run(){
    int i=1;
    while(true){
      System.out.println("my thread " + i++);
          //  Thread.yield();
    }
  }
}
class Test{
  public static void main(String[] args){
     MyThread t =new MyThread();
     t.start();
     int i=1;
    while(true){
      System.out.println("main  " + i++);
           Thread.yield();
    }
     
  }
}