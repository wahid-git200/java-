class MyData {
    int value;
    boolean flag=true;
    synchronized public void set(int n) {
        
        while(flag!=true)
         try{wait();}catch(Exception e){}
         value = n;
         flag=false;
         notify();
    }

   synchronized public int get() {
        int x = 0;
        while(flag!=false)
         try{wait();}catch(Exception e){}
        x = value;
        flag=true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    MyData data;

    public Producer(MyData d) {
        this.data = d;
    }

    public void run() {
        int counter = 1;
        while (true) {
            data.set(counter);
            System.out.println("Producer " + counter);
            counter++;
        }
    }
}

class Consumer extends Thread {
    MyData data;

    public Consumer(MyData d) {
        this.data = d;
    }

    public void run() {
        int value;
        while (true) {
            value = data.get();
            System.out.println("Consumer " + value);
        }
    }
}

class Test {
    public static void main(String[] args) {
        MyData data = new MyData();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();
    }
}
