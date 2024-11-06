package Student;

import java.util.HashMap;
import java.util.Map;

public class HufflepuffStudent extends Student {
    public Map<String, Integer> qualities;

    public HufflepuffStudent(String name, String surname, int intelligenceStrength, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, surname, intelligenceStrength, transgressionDistance);
        this.qualities = new HashMap<>();
        this.qualities.put("трудолюбивы", hardworking);
        this.qualities.put("верны", loyal);
        this.qualities.put("честны", honest);
    }

    @Override
    public String toString() {
        return "HufflepuffStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", intelligenceStrength=" + intelligenceStrength +
                ", transgressionDistance=" + transgressionDistance +
                ", qualities=" + qualities +
                '}';
    }

    public Map<String, Integer> getQualities() {
        return qualities;
    }

}
