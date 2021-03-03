package org.organization;

import java.util.Locale;

public class Registration {
    private static int id;
    private String name, email, username, password;

    public Registration(String name, String email, String username, String password) {
        this.id += 1;
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    public void showInfo(){
        System.out.println("\n|------USER-INFO------|\n");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Username: " + username);
        //System.out.println("Password: " + password);
        System.out.println("\n|---------------------|\n");
    }
    public void emailVerifier(String email){

        if (email.contains("@") && this.email.contains("gmail.com") || this.email.contains("yahoo.com")) {
            this.email = email;
            System.out.println("\nEmail successfully verified!");
        }
        else {
            System.out.println("\nInvalid Email ID!");
        }
    }
    public void passwordLengthChecker(String password){

        if (password.length() > 8 && this.password.length() > 8) {
            this.password = password;
            System.out.println("Account Successfully created!");
            showInfo();
        }
        else {
            System.out.println("\nPassword must be more than 8 characters. Account not created. Please check!");
        }
    }

    public static int getId() { return id; }

    public static void setId(int id) { Registration.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

}
