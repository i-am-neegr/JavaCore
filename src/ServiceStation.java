import Transport.Bicycle;
import Transport.Car;
import Transport.Truck;

public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.name);
            for (int i = 0; i < car.wheels; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.name);
            for (int i = 0; i < truck.wheels; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.name);
            for (int i = 0; i < bicycle.wheels; i++) {
                bicycle.updateTyre();
            }
        }
    }
}