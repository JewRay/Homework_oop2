public interface Engine {

    default void updateEngine() {
        System.out.println("Обслуживаем двигатель");
    }

    default void checkEngine(Transport transport) {
        transport.updateEngine();
    }
}
