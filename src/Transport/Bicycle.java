package Transport;

public class Bicycle extends Transport{


    public Bicycle() {
    }

    public Bicycle(String name) {
        super(name);
    }

    public Bicycle(int wheels) {
        super(wheels);
    }

    public Bicycle(String name, int wheels) {
        super(name, wheels);
    }
}
