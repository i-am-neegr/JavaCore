package Student;

import java.util.HashMap;
import java.util.Map;

public class GryffindorStudent extends Student {
    public Map<String, Integer> qualities;

    public GryffindorStudent(String name, String surname, int intelligenceStrength, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, surname, intelligenceStrength, transgressionDistance);
        this.qualities = new HashMap<>();
        this.qualities.put("благородство", nobility);
        this.qualities.put("честь", honor);
        this.qualities.put("храбрость", courage);
    }

    @Override
    public String toString() {
        return "GryffindorStudent{" +
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
