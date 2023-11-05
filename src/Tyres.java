public interface Tyres {


    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    default void checkTyre(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }

    }


}
