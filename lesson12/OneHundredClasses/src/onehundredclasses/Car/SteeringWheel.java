package onehundredclasses.Car;

public class SteeringWheel {

    String wheelForm;
    boolean wheelTurnRight;
    boolean wheelTurnLeft;
    String whealMaterial;

    public void drive() {
        if (wheelTurnRight) {
            System.out.println("The car will drive to the right");
        } else if (wheelTurnLeft) {
            System.out.println("The car will turn to the left");
        } else {
            System.out.println("The car will drive straight forward");
        }
    }

    public String wheelform(String wheelForm) {
        this.wheelForm = wheelForm;
        System.out.println("Steering wheel form is: " + this.wheelForm);
        return this.wheelForm;
    }
}
