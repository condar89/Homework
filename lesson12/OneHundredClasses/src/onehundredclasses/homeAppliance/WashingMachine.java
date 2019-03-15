package onehundredclasses.homeAppliance;

public class WashingMachine {

    float capacity;
    String model;

    public void cleane() {
        System.out.println("Put your dirty clothes in the wachinmachine and turn it on");
    }

    public void program(int program) {
        switch (program) {
            case 1:
                System.out.println("soft");
                break;
            case 2:
                System.out.println("cotton");
                break;
            case 3:
                System.out.println(" quick");
                break;
            case 4:
                System.out.println("synthetic");
                break;
        }
    }

}
