package onehundredclasses.furniture;

public class Wardrobe {

    boolean spacious;
    int size;

    public void stockClothes() {
        System.out.println("Arrange the clothes in the wardrobe");
    }

    public int getSize(int length, int width) {
        size = length * width;
        return size;
    }
}
