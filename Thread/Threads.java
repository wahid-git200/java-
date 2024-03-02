// class MyThread extends Thread{
//     public void run(){
//         int i=1;
//         while(true){
//             System.out.println(i+"helloo");
//             i++;
//         }
//     }
// }
class Threads extends Thread{
     public void run(){
        int i=1;
        while(true){
            System.out.println(i+"helloo");
            i++;
        }
    }
    public static void main(String[] args){
            
            //MyThread mt = new MyThread();
            Threads t = new Threads();
            //t.start();
            mt.start();
            int i =1;
            while(true){

                System.out.println(i+" world");
                i++;
            }
    }
}

//ananimose inner class
// class RunnableInterface {
    
//     public static void main(String[] args){
//            Thread tt= new Thread(){public void run(){
//               int i =1;
//               while(true){
//                 System.out.println(i+"hello");
//                 i++;
//               }
//            }};
           
//             tt.start();
//             int i =1;
//             while(true){

//                 System.out.println(i+" world");
//                 i++;
//             }
//     }
// }