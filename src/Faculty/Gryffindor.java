package Faculty;

import Student.GryffindorStudent;

public class Gryffindor {
    public String[] GryffindorQualities = {"благородство", "честь", "храбрость"};

    public void StrongestGryffindorStudent(GryffindorStudent student1, GryffindorStudent student2) {
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
}
