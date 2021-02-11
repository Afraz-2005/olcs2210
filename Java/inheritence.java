import java.util.Scanner;

class CoronaVaccine{

    private String name, occupation, address, Dhaka_Area;
    private int ward_no, postal_code, age;

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

};
public class inheritence {

    public static void clearConsole() {   
        System.out.print("\033[H\033[2J");   
        System.out.flush();   
       }

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);

        Scanner s5 = new Scanner(System.in);
        Scanner s6 = new Scanner(System.in);
        Scanner s7 = new Scanner(System.in);

        CoronaVaccine obj = new CoronaVaccine();
        
        while (true) {

            System.out.print("\n\nEnter your full name: ");
            String name = s1.nextLine();
            System.out.print("Occupation: ");
            String occupation = s2.nextLine();
            System.out.print("Address: ");
            String address = s3.nextLine();
            System.out.print("Dhaka City Corporation: ");
            String area = s4.nextLine();

            System.out.print("Ward Number: ");
            int ward_no = s5.nextInt();
            System.out.print("Postal Code: ");
            int postal_code = s6.nextInt();
            System.out.print("Your age: ");
            int age = s7.nextInt();

            
            obj.setPatient_name(name);
            obj.setPatient_occupation(occupation);
            obj.setPatient_address(address);
            obj.setPatient_area(area);

            obj.setPatient_ward_no(ward_no);
            obj.setPatient_postal_code(postal_code);
            obj.setPatient_age(age);

            if (age >= 40) {
                clearConsole();
                System.out.println("Registration successful!\n");
                System.out.println("your profile: \n");

                System.out.println("Name: " + name);
                System.out.println("Occupation: " + occupation);
                System.out.println("Address: " + address);
                System.out.println("From " + area);
                System.out.println("Ward number: " + ward_no);
                System.out.println("Postal Code: " + postal_code);
                System.out.println("Age: " + age);

                s1.close();
                s2.close();
                s3.close();
                s4.close();
                s5.close();
                s6.close();
                s7.close();
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
