public class Truck extends Transport implements Tyres, Engine, Trailer {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        checkTyre(this);
        checkEngine(this);
        checkTrailer(this);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }

    @Override
    public void updateEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    @Override
    public void updateTrailer() {
        System.out.println("Проверяем прицеп у грузовика");
    }
}