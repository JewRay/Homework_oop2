public class Car extends Transport implements Tyres, Engine {

    public void check() {
        checkTyre(this);
        checkEngine(this);
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у машины");
    }


    public void updateEngine() {
        System.out.println("Проверяем двигатель у машины");
    }


}
