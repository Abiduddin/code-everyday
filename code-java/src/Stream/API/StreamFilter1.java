package Stream.API;

import java.util.List;

class Student {
    String name;
    Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StreamFilter1 {
    public static void main(String[] args) {
        System.out.println("All Student: "+getStudent());

        getStudent().stream()
                .filter(s -> s.age >=10)
                .forEach(System.out::print);
    }

    public static List<Student> getStudent() {
        return List.of(
                new Student("Aqib", 10),
                new Student("habib", 11),
                new Student("nazim", 9),
                new Student("bappy", 8),
                new Student("emon", 7)

        );
    }
}
