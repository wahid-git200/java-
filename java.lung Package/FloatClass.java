


class FloatClass{
    public static void main(String[] args){
       float a=12.5f;
       Float a1=12.5f;
       System.out.println(a1.equals(a)); //true

       Float a2 =12.5f/0;
       Float a3 =-12.5f/0;
       System.out.println(a2.isInfinite());//true
       System.out.println(a1.isInfinite());//false
       System.out.println(Float.POSITIVE_INFINITY==a2);//true
       System.out.println(Float.NEGATIVE_INFINITY==a3);//true
    //    System.out.println(a.isInfinite());//error: float cannot be dereferenced

    Float a4 =(float)Math.sqrt(-1);
    System.out.println(a4.isNaN());//true
    System.out.println(a4!=Float.NaN);//true
    }
}