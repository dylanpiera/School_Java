package OOP.practica.utilities;

public class Subject {

    private String name;
    private int points;
    private double grade;

    public Subject(String newName,int newPoints) {
        this.name = newName;
        this.points = newPoints;
    }


    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {

        this.grade = grade;
    }

    public int receivedPoints() {
        if (this.grade >= 5.5) {
            return this.points;
        }
         else return 0;
    }
}
