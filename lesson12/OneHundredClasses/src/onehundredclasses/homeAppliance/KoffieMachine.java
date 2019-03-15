package onehundredclasses.homeAppliance;

public class KoffieMachine {

    String type;
    String color;

    public void preparation() {
        System.out.println("Put the coffee beans in the reciver");
    }

    public void wather() {
        System.out.println("Put the wather in the right chambre");
    }

    public void makecoffe() {
        preparation();
        wather();
        System.out.println("Choose the program and press the buton");
    }

}
