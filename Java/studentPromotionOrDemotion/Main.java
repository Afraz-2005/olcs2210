package imam.Afraz;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Student's name: ");
        String name = s1.nextLine();

        System.out.print("Student's gpa: ");
        Float gpa = s1.nextFloat();

        Student newobj = new Student(name, gpa);

        newobj.showInfo();
    }
}
