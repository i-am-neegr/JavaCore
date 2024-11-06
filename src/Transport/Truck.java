package Transport;

public class Truck extends Car {
    public Truck() {
    }

    public Truck(String name) {
        super(name);
    }

    public Truck(int wheels) {
        super(wheels);
    }

    public Truck(String name, int wheels) {
        super(name, wheels);
    }

    public void checkTrailer() {
        System.out.println("проверка прицепа");
    }

    @Override
    public void check() {
        super.check();
        this.checkTrailer();
    }
}