public class Bicycle extends Transport implements Tyres {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        checkTyre(this);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }
}