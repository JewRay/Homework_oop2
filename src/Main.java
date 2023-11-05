public class Main {

    public static void main(String[] args) {
        Transport car = new Car("car", 4);
        Transport car2 = new Car("car2", 4);
        Transport truck = new Truck("Transport", 6);
        Transport truck2 = new Truck("Transport2", 8);
        Transport bicecle = new Bicycle("Bicycle", 2);
        Transport bicecle2 = new Bicycle("Bicycle2", 2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicecle);
        station.check(bicecle2);
        station.check(truck);
        station.check(truck2);
    }
}