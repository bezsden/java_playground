public class SpaceShip {
    String shipname;
    Astronaut [] astronaut = new Astronaut[10];
    Integer passengersCount=0;
    Integer weight;
    public SpaceShip (String shipname){
        this.shipname=shipname;
    }
    public void AstronaoutPut(Astronaut z, int idx   ) {
         this.astronaut[idx]=z;
         passengersCount++;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public String printShipInfo(){
        return ("Ship name: "+shipname+" Ship weight: "+weight+" Passangers count: "+passengersCount);
    }

}
