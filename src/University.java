import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class University {
    ArrayList<String> group = new ArrayList<>();

    public void addingaUniversity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите навание университета");
        String university = scanner.next();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(university))) {



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}