package ml.pevgen.algo.hackerrank;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <a href="https://www.hackerrank.com/challenges/grading">https://www.hackerrank.com/challenges/grading</a>
 */
public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = List.of(73, 67, 38, 33);
        System.out.println("Result of [73, 67, 38, 33] \nexpected [75, 67, 40, 33]; \n  result " + gradingStudents(grades));

        List<Integer> grades2 = List.of(80, 96, 18, 60, 15, 45, 15, 10, 5);
        System.out.println("Result of [80, 96, 18, 60, 15, 45, 15, 10, 5] \nexpected [80, 96, 18,  60, 15, 45, 15, 10, 5]; \n  result " + gradingStudents(grades2));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream()
                .map(GradingStudents::calcOneGrade)
                .collect(Collectors.toList());
    }

    private static Integer calcOneGrade(Integer grade) {
        int addition = 5 - grade % 5;
        if ((grade >= 38) && (addition < 3)) {
            return grade + addition;
        } else {
            return grade;
        }
    }


}
