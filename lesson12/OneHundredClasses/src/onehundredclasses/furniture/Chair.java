package onehundredclasses.furniture;

public class Chair {

    String wood;
    String color;
    boolean back;

    public void rest() {
        if (back) {
            System.out.println("The chair is confortable and you can rest well");
        } else {
            System.out.println("Take a chair with back");
        }
    }

    public void armchair(boolean armholder) {
        if (armholder) {
            System.out.println("This is a armchair");
        } else {
            System.out.println("this is a simply chair");
        }

    }
}
