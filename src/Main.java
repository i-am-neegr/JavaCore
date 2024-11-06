import Transport.Bicycle;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle(2);
        Bicycle bicycle2 = new Bicycle("bicycle2");
        bicycle1.setName("bicycle1");
        bicycle2.setWheels(2);

        Car car1 = new Car();
        Car car2 = new Car("car2", 4);
        car1.setName("car1");
        car1.setWheels(4);

        Truck truck1 = new Truck();
        Truck truck2 = new Truck("truck2", 8);
        truck1.setName("truck1");
        truck1.setWheels(6);

        ServiceStation station = new ServiceStation();
        station.check(null, bicycle1, null);
        station.check(null, bicycle2, null);
        station.check(car1, null, null);
        station.check(car2, null, null);
        station.check(null, null, truck1);
        station.check(null, null, truck2);
    }
}