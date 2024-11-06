package Transport;

public class Transport implements Serviceable {
    public String name;
    public int wheels;

    public Transport() {
    }

    public Transport(String name) {
    }

    public Transport(int wheels) {
    }

    public Transport(String name, int wheels) {
    }

    @Override
    public void check() {
        System.out.println("обслуживание " + this.getName());
        for (int i = 0; i < wheels; i++) {
            this.updateTyre();
        }
    }

    public void updateTyre() {
        System.out.println("замена покрышки");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheelsAmount) {
        this.wheels = wheelsAmount;
    }
}
