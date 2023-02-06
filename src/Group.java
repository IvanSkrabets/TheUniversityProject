import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    ArrayList <String> student = new ArrayList<>();
public void addingaGroup (){
    Scanner scanner = new Scanner(System.in);
    System.out.println("¬ведите навание группы");
    String group = scanner.next();
    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(group))) {



    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
