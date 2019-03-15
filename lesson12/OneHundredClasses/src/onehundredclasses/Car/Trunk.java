package onehundredclasses.Car;

public class Trunk {

    short trunkVolume;
    boolean spareWheel;

    public void volum() {
        if (trunkVolume > 1500) {
            System.out.println("You have a realy big trunk, you can live in it :D");
        } else if (trunkVolume < 600) {
            System.out.println("You have a tiny trunk becouse you bought a sport car");
        } else {
            System.out.println("You have a normal trunk");
        }
    }

    public void spare() {
        if (this.spareWheel) {
            System.out.println("You are luky person");
        } else {
            System.out.println("IT'S JUST NOT YOUR DAY");
        }
    }
}
