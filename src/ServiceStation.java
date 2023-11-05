public class ServiceStation {

    void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.check();
    }
}

