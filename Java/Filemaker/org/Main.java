package Filemaker.org;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of files you want to create: ");
        int numOfFiles = s1.nextInt();

        FileMaker[] file = new FileMaker[numOfFiles];

        for (int i = 1; i < file.length; i++) {
            System.out.println("Enter the path to create a directory: ");
            Scanner sc = new Scanner(System.in);
            String path = sc.next();
            System.out.println("Enter the name of the desired a directory: ");
            path = path+sc.next();
            Scanner s2 = new Scanner(System.in);
            System.out.println("Enter the path name where you want to save the file: ");
            String pathName = s2.nextLine();
            System.out.println("Enter the File name: ");
            String fileName = s2.nextLine();
            System.out.println("Enter fileType: ");
            String filetype = s2.nextLine();

            file[i] = new FileMaker(fileName, filetype);

            String pathname = pathName + fileName + "." + filetype;

            try {
                File files = new File(pathname);
                if (files.createNewFile()) {
                    File dirc = new File(path);
                    boolean dir = files.mkdir();
                    System.out.println("file Created");
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException err) {
                System.out.println("An error occurred.");
            }

        }
        for(int i = 1; i < file.length; i++) {
            System.out.println("\nfile " + i);
            file[i].ShowInfo();
        }
    }
}
