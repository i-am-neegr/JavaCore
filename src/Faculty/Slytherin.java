package Faculty;

import Student.SlytherinStudent;

public class Slytherin {
    public String[] SlytherinQualities = {"решительность", "жажда власти", "амбициозность", "находчивость", "хитрость"};

    public void strongestSlytherinStudent(SlytherinStudent student1, SlytherinStudent student2) {
        int student1Counter = 0;
        int student2Counter = 0;

        for (String quality : SlytherinQualities) {
            student1Counter += student1.getQualities().get(quality);
            student2Counter += student2.getQualities().get(quality);
        }

        if (student1Counter > student2Counter) {
            System.out.println(student1.getName() + " лучший селизинирин, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший селизинирин, чем " + student1.getName());
        }
    }
}
