package ErrorCheck;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean breakPoint = false;

        do {
            try {
                System.out.print("Enter gpa: ");
                float gpa = input.nextInt();

                if (gpa >= 50 && gpa <= 100) {
                    System.out.println("Promoted");
                }
                else if (gpa < 50 && gpa > 0 ) {
                    System.out.println("fail");
                }
                else {
                    throw new Exception();
                }
                breakPoint = true;
            }catch (Exception err) {
                System.out.println("numbers more than 100 and less than 0 not allowed");
            }
        }while (breakPoint == false);
    }
}
