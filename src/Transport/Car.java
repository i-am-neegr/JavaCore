package Transport;

public class Car extends Transport{
    public Car() {
    }

    public Car(String name) {
        super(name);
    }

    public Car(int wheels) {
        super(wheels);
    }

    public Car(String name, int wheels) {
        super(name, wheels);
    }

    public void checkEngine(){
        System.out.println("проверка двигателя");
    }

    @Override
    public void check(){
        super.check();
        this.checkEngine();
    }
}