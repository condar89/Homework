package onehundredclasses.accessories;

public class Sneakers {
    boolean confortable;
    boolean nice;
    String color;
    String material;
    public void goodTraining(){
        if (confortable){
            System.out.println("Have a good training");
        } else{
            System.out.println("Buy another pair of sneakers");
        }
    }
    public void getmaterial(){
        System.out.println("The material of the sneakers is: " + material);
    }

}
