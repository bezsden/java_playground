public class DemoClassesWithNext<tmp1> {
    String name;
    static int countermax=0;
    int counted=-1;
    int value;
    static DemoClassesWithNext tmp1 = new DemoClassesWithNext("tmp1",0);
    static DemoClassesWithNext z1= new DemoClassesWithNext("z1",1);
    static DemoClassesWithNext z2= new DemoClassesWithNext("z2",2);
    static DemoClassesWithNext z3= new DemoClassesWithNext("z3",3);
    //constructor
    DemoClassesWithNext(String name,int z) {
        this.name=name;
        value = z;
        count();
    }
    public void count(){
        countermax++;
        counted=counted+countermax;
    }
    public void next(){
             // we can make for i in using max count
        tmp1=z1;
        z1=z2;
        z2=z3;
        z3=tmp1;
        System.out.println(z1.name+" "+z1.counted);
        System.out.println(z2.name+" "+z2.counted);
        System.out.println(z3.name+" "+z3.counted);
        System.out.println("end of next");



    }
    public static void main (String[] args){
        z1.next();
        z1.next();
        z1.next();
        z1.next();
        z2.next();
        z2.next();
        z2.next();



    }


}
