package Student;

public class Student {
    protected String name;
    protected String surname;
    protected int intelligenceStrength;
    protected int transgressionDistance;

    public Student(String name, String surname, int intelligenceStrength, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.intelligenceStrength = intelligenceStrength;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIntelligenceStrength() {
        return intelligenceStrength;
    }

    public void setIntelligenceStrength(int intelligenceStrength) {
        this.intelligenceStrength = intelligenceStrength;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", intelligenceStrength=" + intelligenceStrength +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public void printInfo() {
        System.out.println(this);
    }
    public String getFullName() {
        return name + " " + surname;}
}
