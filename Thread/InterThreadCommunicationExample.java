
class Bord  {
    String text;
    int numberOfStudent=0;
    int counter=0;
    public void attendance(){
        numberOfStudent++;
    }
   synchronized  public void write(String s){
    System.out.println("Teacher is writhing "+ s);
    if(counter!=0)
       try{ wait();}catch (Exception e){}
       text=s;
       counter=numberOfStudent;
       notifyAll();

      try{Thread.sleep(1000);}catch (Exception e){}

    }
     synchronized  public String read(){
        while(counter==0)
       try{ wait();}catch (Exception e){}
       String t =text;
       counter--;
       if(counter==0)
        notify();
       try{Thread.sleep(1000);}catch (Exception e){}
       return t;

      
    }
}

class Teacher extends Thread{
    Bord b;
    String notes[]={"java language","c++ language", "data structuer using java","Thread exapmles","End"};
    Teacher(Bord b){
       this.b =b;
    }

    public void run(){
        for(int i =0;i<notes.length;i++){
            b.write(notes[i]);
        }
    }
}

class Student extends Thread{
    String name;
    Bord b;
    Student(String n,Bord b){
       this.b =b;
       name=n;
    }

    public void run(){
        String text;
        b.attendance();
        do{
            text=b.read();
            System.out.println(name+" is reading "+text);
            System.out.flush();
        }while(!text.equals("End"));
    }
}
class InterThreadCommunicationExample{
    public static void main(String [] args){
        Bord b = new Bord();
        Teacher t = new Teacher(b);
        Student s1 =new Student("1. wahid",b);
        Student s2 =new Student("2. jhon",b);
        Student s3 =new Student("3. maria",b);
        Student s4 =new Student("4. lopeze",b);

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }
}