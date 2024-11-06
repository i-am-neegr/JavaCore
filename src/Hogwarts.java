import Student.Student;

public class Hogwarts {
    public Student strongestStudent(Student student1, Student student2) {
        int student1Strength = student1.getIntelligenceStrength() + student1.getTransgressionDistance();
        int student2Strength = student2.getIntelligenceStrength() + student2.getTransgressionDistance();

        if (student1Strength > student2Strength) {
            System.out.println(student1.getFullName() + " - сильнее чем - " + student2.getFullName());
            return student1;
        } else {
            System.out.println(student2.getFullName() + " - сильнее чем - " + student1.getFullName());
            return student2;
        }
    }
}
