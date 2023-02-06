import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class University {
    ArrayList<String> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addingaUniversity() {
        System.out.println("Enter the name of the university");
        String university = scanner.;
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("Universitet.txt",true));
        FileReader fileReader = new FileReader("Universitet.txt")) {
                if(fileReader.read() >= -1 && checkingTheUniversity(university) == false){
                    printWriter.write("\n");
                   printWriter.write(university);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private boolean checkingTheUniversity (String university ){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Universitet.txt"))){
            String valye;
            while ((valye = bufferedReader.readLine()) != null) {
                if(valye.equals(university)){
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } return false;
}
}