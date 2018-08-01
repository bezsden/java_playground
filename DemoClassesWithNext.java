public class DemoClassesWithNext<tmp1> {
    String name;
    static int countermax=0;
    int counted=0;
    int value;
    static DemoClassesWithNext tmp1 = new DemoClassesWithNext("tmp1",0);
    static DemoClassesWithNext tmp2 = new DemoClassesWithNext("tmp2",0);
    static DemoClassesWithNext tmp3 = new DemoClassesWithNext("tmp3",0);
    static   DemoClassesWithNext z1= new DemoClassesWithNext("z1",1);
    static   DemoClassesWithNext z2= new DemoClassesWithNext("z1",2);
    static   DemoClassesWithNext z3= new DemoClassesWithNext("z1",3);
    //constructor
    DemoClassesWithNext(String name,int z) {
        value = z;
        count();
    }
    public void count(){
        countermax++;
        counted=counted+countermax;
    }
    public void next(){
             // we can make for i in using max count
        if (this.counted==4){
              tmp1=this;

            if (tmp2.value==2) {
                z1 =tmp2;
            } else {
                z1=z2;
            }
        } else if (this.counted==5) {
        tmp2=this;
        if (tmp3.value==3) {
            z2 = tmp3;
        } else {z2=z3; }
        } else if (this.counted==6) {
            tmp3=this;
            if (tmp1.value==3) {
                z3 = tmp1;
            } else {z3=z1; }

        }



        System.out.println("this "+this.name+" "+this.value );
        System.out.println("z1 "+z1.value);
        System.out.println("z2 "+z2.value);
        System.out.println("z3 "+z3.value);
        System.out.println("next done for "+this.name);

    }
    public static void main (String[] args){
    //    DemoClassesWithNext z1= new DemoClassesWithNext(1);
     //   DemoClassesWithNext z2= new DemoClassesWithNext(2);
       // DemoClassesWithNext z3= new DemoClassesWithNext(3);
      //  DemoClassesWithNext a= new DemoClassesWithNext(4);
        z1.next();
        z1.next();
        z1.next();

        z2.next();
        z3.next();


    }


}
