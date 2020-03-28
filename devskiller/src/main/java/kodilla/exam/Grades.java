package kodilla.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Grades {
    private List<Integer> maths;
    private List<Integer> physics;
    private List<Integer> english;

    public Grades() {
        this.maths = new ArrayList<>();
        this.physics = new ArrayList<>();
        this.english = new ArrayList<>();
    }

    public Grades(List<Integer> maths, List<Integer> physics, List<Integer> english) {
        this.maths = maths;
        this.physics = physics;
        this.english = english;
    }

    public List<Integer> getMaths() {
        return new ArrayList<>(maths);
    }

    public List<Integer> getPhysics() {
        return new ArrayList<>(physics);
    }

    public List<Integer> getEnglish() {
        return new ArrayList<>(english);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Grades grades = (Grades) o;

        if (!Objects.equals(maths, grades.maths)) {
            return false;
        }
        if (!Objects.equals(physics, grades.physics)) {
            return false;
        }
        return Objects.equals(english, grades.english);
    }

    @Override
    public int hashCode() {
        int result = maths != null ? maths.hashCode() : 0;
        result = 31 * result + (physics != null ? physics.hashCode() : 0);
        result = 31 * result + (english != null ? english.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Grades" + "\n"+ "{" + "\n" +
                "maths=" + maths + "\n" +
                "physics=" + physics + "\n" +
                "english=" + english + "\n" +
                '}' + "\n";
    }

    public double calculateAvarage(List<Double> grades){
        double sum = 0;
        double avarage = 0;
        for (Double grade : grades) {
            sum = sum + grade;
        }
        avarage = sum/grades.size();
        return avarage;
    }
}