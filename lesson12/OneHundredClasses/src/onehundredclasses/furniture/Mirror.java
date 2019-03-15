package onehundredclasses.furniture;

public class Mirror {

    boolean cleane;
    String size;

    public void look() {
        if (cleane) {
            System.out.println("Look at yourself");
        } else {
            System.out.println("Clean the mirror");
        }

    }

    public void lo(boolean broken) {
        if (broken) {
            System.out.println("You will have 15 years of bad luck");
        } else {
            System.out.println("be careful! Dont't broke the mirror");
        }

    }
}
