package Student;

import java.util.HashMap;
import java.util.Map;

public class RavenclawStudent extends Student{
    public Map<String, Integer> qualities;

    public RavenclawStudent(String name, String surname, int intelligenceStrength, int transgressionDistance, int smartness, int wiseness, int wittyness, int creativity) {
        super(name, surname, intelligenceStrength, transgressionDistance);
        this.qualities = new HashMap<>();
        this.qualities.put("умны", smartness);
        this.qualities.put("мудры", wiseness);
        this.qualities.put("остроумны", wittyness);
        this.qualities.put("полны", creativity);
    }

    @Override
    public String toString() {
        return "RavenclawStudent{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", intelligenceStrength=" + intelligenceStrength +
                ", transgressionDistance=" + transgressionDistance +
                ", qualities=" + qualities +
                '}';
    }
}
