package arrays;
import java.util.Scanner;

class Main{
    protected String name, occupation, address, Dhaka_Area;
    protected int ward_no, postal_code, age;

    public String getPatient_name() { return name; }
    public String getPatient_occupation() { return occupation; }
    public String getPatient_adress() { return address; }
    public String getPatient_ResidenceArea() { return Dhaka_Area; }

    public int getPatient_ward_no() { return ward_no; }
    public int getPatient_postal_code() { return postal_code;}
    public int getPatient_age() { return age; }

    public void setPatient_name (String p_name) { name = p_name;}
    public void setPatient_occupation (String p_occupation) {occupation = p_occupation;}
    public void setPatient_address (String p_address) {address = p_address;}
    public void setPatient_area (String p_area) {Dhaka_Area = p_area;}

    public void setPatient_ward_no (int p_wardNo) { ward_no = p_wardNo;};
    public void setPatient_postal_code (int p_postalCode) { postal_code = p_postalCode;}
    public void setPatient_age (int p_age) { age = p_age;}
}

public class arraysHW {

    public static void clearConsole() { 
        System.out.print("\033[H\033[2J");   
        System.out.flush();   
    }
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        Main  newObj = new Main();

        while (true) {
            clearConsole();

            System.out.print("\n\nEnter your full name: "); String name = s1.nextLine();
            System.out.print("Occupation: "); String occupation = s1.nextLine();
            System.out.print("Address: "); String address = s1.nextLine();
            System.out.print("Dhaka City Corporation: "); String area = s1.nextLine();

            System.out.print("Ward Number: "); int ward_no = s1.nextInt();
            System.out.print("Postal Code: "); int postal_code = s1.nextInt();
            System.out.print("Your age: "); int age = s1.nextInt();

            
            newObj.setPatient_name(name);
            newObj.setPatient_occupation(occupation);
            newObj.setPatient_address(address);
            newObj.setPatient_area(area);

            newObj.setPatient_ward_no(ward_no);
            newObj.setPatient_postal_code(postal_code);
            newObj.setPatient_age(age);

            String[] output = {"name: ", "occupation: ", "address: ", "area: ", "ward number: ", "postal code: ", "age: "};
            String[] Profile = {name, occupation, address, area};
            String[] Output = {"ward number: ", "postal code: ", "age: "};
            int[] profile = {ward_no, postal_code, age};

            if (age >= 40) {
                clearConsole();
                System.out.println("\nRegistration successful!\n");
                System.out.println("your profile: \n");

                for (int i = 0; i < 4; i++ ) {
                    System.out.println(output[i] + Profile[i]);
                }
                for (int i = 0; i < 3; i++ ) {
                    System.out.println(Output[i] + profile[i]);
                }
                s1.close();
                break;
            }
            else if (age < 40) {
                clearConsole();
                System.out.println("You are not at an eligible age for vaccine registration. Only 40 above are allowed.");
                break;
            }
            else {
                System.out.println("invalid input!");
                continue;
            }
        }
    }
}
