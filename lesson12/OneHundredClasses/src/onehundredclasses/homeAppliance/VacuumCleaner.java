package onehundredclasses.homeAppliance;

public class VacuumCleaner {

    int power;
    String type;
    String color;
    String model;

    public void connect() {
        System.out.println("In order to use the Cleanner connects into the socket");
    }

    public void cleane() {
        connect();
        System.out.println("now turn the cleanner on and start to cleane your home");
    }

}
