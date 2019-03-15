package onehundredclasses.accessories;

public class Belt {

    String material;
    byte lenght;
    String color;

    public void definition() {
        System.out.println("Belt is strip of leather or other material worn, "
                + "typically round the waist, to support or hold in clothes or "
                + "to carry weapons.");
    }
    public String clr(){
        System.out.println("The belt is : " + color);
        return color;
    }

}
