package Faculty;

import Student.HufflepuffStudent;

public class Hufflepuff {
    public String[] HufflepuffQualities = {"трудолюбивы", "верны", "честны"};

    public void strongestHufflepuffStudent(HufflepuffStudent student1, HufflepuffStudent student2) {
        int student1Counter = 0;
        int student2Counter = 0;

        for (String quality : HufflepuffQualities) {
            student1Counter += student1.getQualities().get(quality);
            student2Counter += student2.getQualities().get(quality);
        }

        if (student1Counter > student2Counter) {
            System.out.println(student1.getName() + " лучший пуфендуец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший пуфендуец, чем " + student1.getName());
        }
    }
}
