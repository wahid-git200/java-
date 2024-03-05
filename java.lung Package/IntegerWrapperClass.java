
public class IntegerWrapperClass{
    public static void main(String[] args){
        int m1 =15;
        Integer m2 = m1;
        Integer m3 =15;
        System.out.println(m2.equals(m1));//true;  chack just value
        System.out.println(m3.equals(m1));//true;   chack just value

        int i1 = 15;
        Integer i2 = Integer.valueOf("123");
        Integer i3 = Integer.valueOf("1010",2);// 10 binary;
        Integer i4 = Integer.valueOf("A7",16);// 167 hexadisimal; 
         System.out.println(i3);//10
         System.out.println(i4);//167

         Integer a=10;
         Integer b =10;
         int a1=10;
         int b1=10;
         System.out.println(Integer.compare(a,b)); // if be same return 0 else -1  change object to int
         System.out.println(Integer.compare(a1,b1)); // if be same return 0 else -1 

         Integer s=Integer.decode("0xA7");
         System.out.println(s);

         String num ="10";
         int s2=Integer.valueOf(num);
         int s3 = Integer.parseInt(num);
         System.out.println(s2);
         System.out.println(s3);

         int e=123;
         System.out.println(Integer.reverseBytes(e));
         System.out.println(Integer.reverse(e));
         
         System.out.println(Integer.toBinaryString(40));// to binary string

         //...................
         
        
    }
}