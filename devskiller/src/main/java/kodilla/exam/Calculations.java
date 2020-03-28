package kodilla.exam;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calculations {


    public double calculateBestAverage(Map<Student, Grades> scores) {

        List<Double> averages = new ArrayList<>();
        for (Grades grade : scores.values()) {
            List<Integer> allGrades = new ArrayList<>();
            allGrades.addAll(grade.getEnglish());
            allGrades.addAll(grade.getMaths());
            allGrades.addAll(grade.getPhysics());

            allGrades.stream().mapToInt(Integer::intValue).average().ifPresent(averages::add);

        }

        return averages.stream().max(Double::compareTo).orElse(0.0);
    }
    public double calculateBestAverageAntotherVersion(Map<Student, Grades> scores) {
        List<Double> averages = new ArrayList<>();
        for (Grades grade : scores.values()) {
            Stream.of(grade.getEnglish(), grade.getMaths(), grade.getPhysics()).flatMap(Collection::stream)
                    .mapToInt(Integer::valueOf).average().ifPresent(averages::add);
        }
        return averages.stream().max(Double::compareTo).orElse(0.0);
    }

    public List<String> findStudentsNamesWithBestAverage(Map<Student, Grades> scores) {

        Map<Student, Double> averagesMap = new HashMap<>();

        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            Grades grade = entry.getValue();
            List<Integer> allGrades = new ArrayList<>();
            allGrades.addAll(grade.getEnglish());
            allGrades.addAll(grade.getMaths());
            allGrades.addAll(grade.getPhysics());

            allGrades.stream().mapToInt(Integer::intValue).average().ifPresent(average -> averagesMap.put(entry.getKey(), average));

        }

        Double highestAverage = averagesMap.values().stream().max(Double::compareTo).orElse(0.0);

        return averagesMap.entrySet().stream()
                .filter(f -> f.getValue().equals(highestAverage))
                .map(Map.Entry::getKey)
                .map(Student::getFirstAndLastName)
                .collect(Collectors.toList());
    }

    public List<Student> findStudentsWhichSpeakPolishWithAverageFromMathAbove4(Map<Student, Grades> scores) {

        Map<Student, Double> studentMathAverages = new HashMap<>();

        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            Grades grades = entry.getValue();
            List<Integer> mathGrades = new ArrayList<>();
            mathGrades.addAll(grades.getMaths());

            mathGrades.stream().mapToInt(Integer::intValue).average().ifPresent(averaged -> studentMathAverages.put(entry.getKey(), averaged));
        }

        return studentMathAverages.entrySet().stream()
                .filter(f -> f.getValue() > 4)
                .filter(f -> f.getKey().getLanguage().equals("PL"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}