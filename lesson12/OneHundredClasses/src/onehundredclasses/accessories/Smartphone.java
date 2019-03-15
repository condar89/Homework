package onehundredclasses.accessories;

public class Smartphone {

    String color;
    String type;
    byte signalType;
    byte displaySize;
    boolean chargedBattery;

    public void onOrOff() {
        if (chargedBattery) {
            System.out.println("The smartphone will work");
        } else {
            System.out.println("Conect the charger");
        }
    }

    public void internetspeed() {

        if (signalType > 4) {
            System.out.println("YOU WILL HAVE A GREAT INTERNET EXPIRIENCE");
        } else {
            System.out.println("Your internet speed is not so good");
        }
    }
}
