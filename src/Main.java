import Faculty.Gryffindor;
import Faculty.Hufflepuff;
import Faculty.Ravenclaw;
import Faculty.Slytherin;
import Student.GryffindorStudent;
import Student.HufflepuffStudent;
import Student.RavenclawStudent;
import Student.SlytherinStudent;


public class Main {
    public static void main(String[] args) {

        GryffindorStudent student1 = new GryffindorStudent("гарик", "потр", 10, 10, 10, 2, 1);
        HufflepuffStudent student2 = new HufflepuffStudent("захар", "смит", 10, 10, 10, 2, 1);
        RavenclawStudent student3 = new RavenclawStudent("чжау", "чонг", 4, 5, 9, 2, 3, 1);
        SlytherinStudent student4 = new SlytherinStudent("дракула", "малой", 2, 2, 2, 2, 2, 2, 4);

        GryffindorStudent student11 = new GryffindorStudent("героина", "рэйнджер", 9, 9, 6, 3, 2);
        HufflepuffStudent student21 = new HufflepuffStudent("серик", "дегори", 8, 4, 1, 21, 55);
        RavenclawStudent student31 = new RavenclawStudent("памада", "патил", 6,6, 3, 2, 7, 1);
        SlytherinStudent student41 = new SlytherinStudent("грохнул", "монтегрю", 1, 2, 3, 4 , 4, 5, 6);

        Gryffindor gryffindor = new Gryffindor();
        gryffindor.strongestGryffindorStudent(student11, student1);

        Hufflepuff hufflepuff = new Hufflepuff();
        hufflepuff.strongestHufflepuffStudent(student21, student2);

        Ravenclaw ravenclaw = new Ravenclaw();
        ravenclaw.strongestRavenclawStudent(student31, student3);

        Slytherin slytherin = new Slytherin();
        slytherin.strongestSlytherinStudent(student41, student4);

        Hogwarts hogwarts = new Hogwarts();
        hogwarts.strongestStudent(student11, student2);
    }
}