import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    ArrayList <String> student = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addingaGroup() {
        System.out.println("Enter the group number");
        String group = scanner.next();
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("Group.txt",true));
             FileReader fileReader = new FileReader("Group.txt")) {
            if(fileReader.read() >= -1 ){
                printWriter.write("\n");
                printWriter.write(group);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private boolean checkingTheUniversity (String group ){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Universitet.txt"))){
            String valye;
            while ((valye = bufferedReader.readLine()) != null) {
                if(valye.equals(group)){
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } return false;
    }
}
