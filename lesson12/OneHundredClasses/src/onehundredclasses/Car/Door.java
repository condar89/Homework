package onehundredclasses.Car;

public class Door {

    boolean frontDoor;
    boolean rearDoor;
    String doorMaterial;
    

    public void safe(boolean doorsAreLocked) {
        if (doorsAreLocked) {
            System.out.println("The car is safe");
        } else {
            System.out.println("The car is not safe");
        }

    }
    public void material(String doorMaterial){
        System.out.println("Door is made of: " + doorMaterial);
        
    }

}
