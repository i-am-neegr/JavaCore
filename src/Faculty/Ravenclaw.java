package Faculty;

import Student.RavenclawStudent;

public class Ravenclaw {
    public String[] RavenclawQualities = {"мудры", "остроумны", "умны", "полны"};

    public void strongestRavenclawStudent(RavenclawStudent student1, RavenclawStudent student2) {
        int student1Counter = 0;
        int student2Counter = 0;

        for (String quality : RavenclawQualities) {
            student1Counter += student1.getQualities().get(quality);
            student2Counter += student2.getQualities().get(quality);
        }

        if (student1Counter > student2Counter) {
            System.out.println(student1.getName() + " лучший когтеврун, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший когтеврун, чем " + student1.getName());
        }
    }
}
