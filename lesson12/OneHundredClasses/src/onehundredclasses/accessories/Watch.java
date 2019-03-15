package onehundredclasses.accessories;

public class Watch {

    String color;
    String material;
    String glass;
    String time;
    int price;

    public void goodWatch() {
        System.out.println("Show the time corectly");
    }

    public void expensive(int x) {
        if (price > x) {
            System.out.println("The watches are expensive");
        } else {
            System.out.println("The watches are not wxpensive");
        }

    }

}
