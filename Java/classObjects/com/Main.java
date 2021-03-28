package classObjects.com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarsScript[] cars = new CarsScript[4];

        for (int i = 1; i < cars.length; i++) {
            Scanner s1 = new Scanner(System.in);

            System.out.println("\ncar: " + i);

            System.out.println("Car name: ");
            String name = s1.nextLine();

            System.out.println("Car company: ");
            String company = s1.nextLine();

            System.out.println("Car model: ");
            String model = s1.nextLine();

            System.out.println("Car speed");
            int speed = s1.nextInt();

            cars[i] = new CarsScript(name, company, model, speed);
        }
        for(int i = 1; i < cars.length; i++) {
            System.out.println("\nCar " + i);
            cars[i].ShowInfo();
        }
    }
}
