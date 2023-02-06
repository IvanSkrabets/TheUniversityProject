import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    ArrayList <Integer> evaluations = new ArrayList<>();
    public void addingaStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя студента");
        String students = scanner.next();
        evaluations.add(1);
        evaluations.add(2);
        evaluations.add(3);
        evaluations.add(4);
        evaluations.add(5);
        evaluations.add(6);
        System.out.println(evaluations);
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(students))) {
//
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
