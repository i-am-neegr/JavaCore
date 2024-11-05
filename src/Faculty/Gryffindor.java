package Faculty;

import Student.GryffindorStudent;

import java.util.HashMap;
import java.util.Map;

public class Gryffindor {
    public String[] GryffindorQualities = {"благородство", "честь", "храбрость"};

    public void strongestGryffindorStudent(GryffindorStudent student1, GryffindorStudent student2) {
        int student1Counter = 0;
        int student2Counter = 0;

        for (String quality : GryffindorQualities) {
            student1Counter += student1.getQualities().get(quality);
            student2Counter += student2.getQualities().get(quality);
        }

        if (student1Counter > student2Counter) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
    }
    public void strongestGryffindorStudentByArray(GryffindorStudent[] students) {
        Map<String, int[]> results = new HashMap<>();
        String[] names = new String[students.length];

        for (GryffindorStudent student : students) {
            String name = student.getName();
            int facultativeStrength = 0;
            int brutalStrength = student.getIntelligenceStrength() + student.getTransgressionDistance();

            for (String quality : GryffindorQualities) {
                facultativeStrength += student.getQualities().get(quality);
            }
            results.put(name, new int[]{brutalStrength, facultativeStrength});
        }


    }
}
