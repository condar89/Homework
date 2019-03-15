package onehundredclasses.Car;

public class Engine {

    short enginePower;
    short engineCapacity;

    public short power() {
        System.out.println("enginePower is: " + this.enginePower);
        return this.enginePower;
    }

    public short capacity() {
        System.out.println("Engine capacity is: " + this.engineCapacity);
        return this.engineCapacity;

    }

}
