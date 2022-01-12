package stream.api;

import java.util.List;
import java.util.stream.Collectors;

import static stream.api.StreamFilter1.getStudent;

public class Collect1 {
    public static void main(String[] args) {
        System.out.println("All Student: " + getStudent());

        List<String> ListOf10AndOver = getStudent().stream()
                .filter(student -> student.getAge() >= 10)
                .map(Student::getName)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("10 and 10 above Student: " + ListOf10AndOver);
    }
}
