package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMain {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Abhinav", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));


        //1- Find list of students whose first name starts with alphabet A

        List<String> a = list.stream().map(Student::getFirstName).filter(firstName -> firstName.startsWith("A")).collect(Collectors.toList());
        //System.out.println(a);

        //2- Group The Student By Department Names

        Map<String, List<Student>> collect = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
        //System.out.println(collect);

        //3- Find the total count of student using stream

        long count = list.size();
        //System.out.println(count);

        //Find the max age of student
        //System.out.println(list.stream().mapToInt(Student::getAge).max());

        // Find all departments names
        List<String> dept = list.stream().map(Student::getDepartmantName).toList();
        //System.out.println(dept);

        //Find the count of student in each department
        Map<String, Long> asd = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        //System.out.println(asd);

        //7- Find the list of students whose age is less than 30
        List<String> less30 = list.stream().filter(x -> x.getAge() < 30).map(Student::getFirstName).toList();
        //System.out.println(less30);

        //Find the list of students whose rank is in between 50 and 100
        List<Student> rank = list.stream().filter(x -> x.getRank() > 50 && x.getRank() <= 100).toList();
        //System.out.println(rank);

        //Find the average age of male and female students
        Map<String, Double> age = list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        //System.out.println(age);

        //Find the department who is having maximum number of students
        Map<String, Long> collect1 =list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        //System.out.println(collect1);
        Map.Entry<String, Long> entry = collect1.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(entry);
    }

}
