package org.organization;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = s1.nextLine();

        System.out.println("Enter email: ");
        String email = s1.nextLine();

        System.out.println("Enter username: ");
        String username = s1.nextLine();

        System.out.println("Enter password: ");
        String password = s1.nextLine();

        Registration newobj = new Registration(name, email, username, password);

        newobj.emailVerifier(email);
        newobj.passwordLengthChecker(password);

        System.out.println("Enter Name: ");
        String name2 = s1.nextLine();

        System.out.println("Enter email: ");
        String email2 = s1.nextLine();

        System.out.println("Enter username: ");
        String username2 = s1.nextLine();

        System.out.println("Enter password: ");
        String password2 = s1.nextLine();

        newobj.setName(name2);
        newobj.setEmail(email2);
        newobj.setUsername(username2);
        newobj.setPassword(password2);

        newobj.emailVerifier(email);
        newobj.passwordLengthChecker(password);
    }

}
