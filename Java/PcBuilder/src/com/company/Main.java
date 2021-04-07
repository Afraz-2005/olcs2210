package com.company;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        while (true){

            System.out.print("CPU: "); String cpuName = sc.nextLine();
            System.out.print("CPU generation (th gen): "); int cpuGen = s1.nextInt();
            System.out.print("Motherboard: "); String motherboard = sc.nextLine();
            System.out.print("Motherboard generation (ready for (th gen)): "); int motherboardGen = s1.nextInt();
            System.out.print("Graphics Card: "); String gpuName = sc.nextLine();
            System.out.print("RAM: " ); String ramName = sc.nextLine();
            System.out.print("Ram quantity (GB): "); int ramQ = s1.nextInt();
            System.out.print("Cooler: "); String cooler = sc.nextLine();
            System.out.print("Monitor: "); String monitor = sc.nextLine();
            System.out.print("Storage: "); String storage = sc.nextLine();

            pcBuilder pc = new pcBuilder();

            pc.setCpu(cpuName);
            pc.setCpuGen(cpuGen);
            pc.setMotherboard(motherboard);
            pc.setMotherboardGen(motherboardGen);
            pc.setRam(ramName);
            pc.setRamQ(ramQ);
            pc.setStorage(storage);
            pc.setGraphicsCard(gpuName);
            pc.setCooler(cooler);
            pc.setMonitor(monitor);

            try{
                if(cpuGen == motherboardGen){
                    pc.Showinfo();
                    break;
                } else if (cpuGen != motherboardGen) {
                    System.out.println("System requirement does not match.");

                } else {
                    throw new Exception();
                }
            }catch(Exception err){
                System.out.println("Build Error!");
            }
        }
    }
}
