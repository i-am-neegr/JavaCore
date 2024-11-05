package Student;

import java.util.HashMap;
import java.util.Map;

public class SlytherinStudent extends Student{
    public Map<String, Integer> qualities;

    public SlytherinStudent(String name, String surname, int intelligenceStrength, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, intelligenceStrength, transgressionDistance);
        this.qualities = new HashMap<>();
        this.qualities.put("хитрость", cunning);
        this.qualities.put("решительность", determination);
        this.qualities.put("амбициозность", ambition);
        this.qualities.put("находчивость ", resourcefulness);
        this.qualities.put("жажда власти", thirstForPower);
    }

    @Override
    public String toString() {
        return "SlytherinStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", intelligenceStrength=" + intelligenceStrength +
                ", transgressionDistance=" + transgressionDistance +
                ", qualities=" + qualities +
                '}';
    }
}
