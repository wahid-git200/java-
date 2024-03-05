import java.util.Arrays;
enum Department{
    // if want to add some vlaue ti this constant we must add argumnt on constractor 
    CS("whaid","hamid"),IT("sattar","Ali"),CIVIL("kartim","mohib"),ECE("ahmad","sammim");//this are must be capital
    
    String head;
    String location;
    // enum can hava method and constractor but constractor must be private or default

    private Department(String head, String loc){
        // System.out.println(this.name());

        //wen creat an bject it will print all the members of this enum cs , IT , CIVIL, ECE

        // constractor will cal utoumaticaly and this.name() method will call constractor for all members

        this.head=head;
        this.location=loc;
    }

    public void display(){
        System.out.println(this.name()+"  "+ this.ordinal());
    }

    public String getHeadName(){
        return head;
    }
    public String getLocation(){
        return location;
    }

}
class Enum{
    public static void main(String [] args){
        Department d = Department.CS;
        // cs , IT , CIVIL, ECE

        // System.out.println(d);//CS
        // d= Department.ECE;
        // System.out.println(d);//ECE

        // System.out.println(d.ordinal());//3
        // System.out.println(d.name());//ECE

        // System.out.println(Department.valueOf("IT"));//IT  if dose not much it will generate IlligaleArgument Exceptipn

        // Department list[] = Department.values();
        // System.out.println(Arrays.toString(list));
        //[CS, IT, CIVIL , ECE]

        // Department d1=Department.IT;

        // switch(d1){
        //     case CS: System.out.println("FIRST BLOCK"); break;
        //     case IT: System.out.println("SSECOND BLOCK"); break;
        //     case CIVIL: System.out.println("FOURTH BLOCK"); break;
        //     case ECE: System.out.println("FIFTH BLOCK"); break;
        // }

        d.display(); // CS  0
        System.out.println(d.getHeadName());//wahid
        System.out.println(d.getLocation());//hamid

        Department d3=Department.ECE;
        d3.display();//ECE 3
        System.out.println(d3.getHeadName());//amad
        System.out.println(d3.getLocation());//sammin
    }
}