import Faculty.Gryffindor;
import Student.GryffindorStudent;
import Student.HufflepuffStudent;
import Student.RavenclawStudent;
import Student.SlytherinStudent;


public class Main {
    public static void main(String[] args) {

        GryffindorStudent student1 = new GryffindorStudent("гарик", "потр", 10, 10, 10, 2, 1);
        student1.printInfo();

        HufflepuffStudent student2 = new HufflepuffStudent("захар", "смит", 10, 10, 10, 2, 1);
        student2.printInfo();

        RavenclawStudent student3 = new RavenclawStudent("чжау", "чонг", 4, 5, 9, 2, 3, 1);
        student3.printInfo();

        SlytherinStudent student4 = new SlytherinStudent("дракула", "малой", 2, 2, 2, 2, 2, 2, 4);
        student4.printInfo();

        GryffindorStudent student11 = new GryffindorStudent("героина", "рэйнджер", 9, 9, 6, 3, 2);
        student11.printInfo();

        Gryffindor gryffindor = new Gryffindor();
        gryffindor.StrongestGryffindorStudent(student11, student1);

    }
}