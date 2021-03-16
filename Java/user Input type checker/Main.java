package DataCheck.Checker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Type Here: ");
        Scanner input = new Scanner (System.in);

        if (input.hasNextBoolean())
            System.out.println("This input is of type Boolean.");
        else if (input.hasNextLine()){
            if ((input.nextLine()).length() == 1){
                System.out.println("This input is of char type.");
            }
            else{
                System.out.println("This input is of type string.");
            }
        }
        else if (input.hasNextInt())
            System.out.println("This input is of type Integer.");
        else if (input.hasNextLong())
            System.out.println("This input is of type Long.");
        else if (input.hasNextFloat())
            System.out.println("This input is of type Float.");
        else if (input.hasNextDouble())
            System.out.println("This input is of type Double.");


    }
}
