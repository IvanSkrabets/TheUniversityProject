import java.util.Scanner;

public class Menu {
    private int i;
    public void menu () {
        System.out.println("1.Add a university");
        System.out.println("2.Add a group to the university");
        System.out.println("3.Add a student to a group");
        System.out.println("4.Add student grades");
        Scanner scanner =new Scanner(System.in);
        University university = new University();
        Group group = new Group();
switch (scanner.next()){
    case ("1"):
        university.addingaUniversity();
        menu();
        break;
    case ("2"):
        group.addingaGroup();
        menu();
        break;

}
    }
}
