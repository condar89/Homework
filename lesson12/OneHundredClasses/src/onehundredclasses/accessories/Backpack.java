package onehundredclasses.accessories;

public class Backpack {

    byte volume;
    String color;
    String type;

    public void carry() {
        if (volume > 25) {
            System.out.println("Can carry a lot of staff");
        } else if (volume < 10) {
            System.out.println("you have a small backpack");
        } else {
            System.out.println("you have a normal size one");
        }

    }

    public void color() {
        System.out.println("The backpack is: " + color);
    }
}
