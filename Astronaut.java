public class Astronaut {
    String name;
    Integer age;
    Integer weight;

    public Astronaut (String name
    //        , int age,int weight
    ){
         this.name=name;
//         this.age=age;
//         this.weight=weight;
    }
    public void AstronautAge (Integer age){
        this.age=age;
    }
    public void AstronautWeight (Integer weight){
        this.weight=weight;
    }
    public String printAstronautInfo(){
        return ("Astonaut name: "+name+" age: "+age+" weight :"+weight);
    }

}
