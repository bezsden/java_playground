import java.lang.reflect.Array;

public class DemoTwoCustomClasses {
    public static void main(String[] args){
        Astronaut zebra = new Astronaut("zebra");

        zebra.AstronautAge(11);
        zebra.AstronautWeight(60);
         SpaceShip spShip1 = new SpaceShip("Alaverdi");
        Astronaut cat = new Astronaut("Cat");
        spShip1.AstronaoutPut(zebra,0);
        spShip1.AstronaoutPut(cat,1);

        cat.AstronautAge(11);
        cat.AstronautWeight(60);
        spShip1.setWeight(cat.weight+zebra.weight);
        System.out.println(spShip1.printShipInfo());
        for (int i=0 ; i< spShip1.astronaut.length -(10-spShip1.passengersCount)
                ; i++) {
          //  if (spShip1.astronaut[i].printAstronautInfo()==null) {
             //   spShip1.astronaut[i].name=" ";
                System.out.println(spShip1.astronaut[i].printAstronautInfo());
           // }
        }
    }
}
