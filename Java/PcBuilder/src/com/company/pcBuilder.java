package com.company;

public class pcBuilder {
    private String cpu, motherboard, graphicsCard, storage, cooler, monitor, ram;
    private int motherboardGen, cpuGen, ramQ;

    public int getRamQ() { return ramQ; }
    public void setRamQ(int ramQ) { this.ramQ = ramQ; }
    public String getCpu() { return cpu;  }
    public void setCpu(String cpu) { this.cpu = cpu; }
    public String getMotherboard() { return motherboard; }
    public void setMotherboard(String motherboard) { this.motherboard = motherboard; }
    public String getGraphicsCard() { return graphicsCard; }
    public void setGraphicsCard(String graphicsCard) { this.graphicsCard = graphicsCard; }
    public String getStorage() { return storage; }
    public void setStorage(String storage) { this.storage = storage; }
    public String getCooler() { return cooler; }
    public void setCooler(String cooler) { this.cooler = cooler; }
    public String getMonitor() { return monitor; }
    public void setMonitor(String monitor) { this.monitor = monitor; }
    public String getRam() { return ram; }
    public void setRam(String ram) { this.ram = ram; }
    public int getMotherboardGen() { return motherboardGen; }
    public void setMotherboardGen(int motherboardGen) { this.motherboardGen = motherboardGen; }
    public int getCpuGen() { return cpuGen; }
    public void setCpuGen(int cpuGen) { this.cpuGen = cpuGen; }

    public void Showinfo(){
        if (compatibilityCheck()){
            System.out.println("\n\n\tCPU: " + getCpu() + " " + getCpuGen() + "th gen");
            System.out.println("\tMotherboard: " + getMotherboard() + " " + getMotherboardGen() + "th gen");
            System.out.println("\tGraphics card: " + getGraphicsCard());
            System.out.println("\tRam: " + getRam() + " " + getRamQ() + " GB");
            System.out.println("\tStorage: " + getStorage());
            System.out.println("\tCooler: " + getCooler());
            System.out.println("\tMonitor: " + getMonitor());
        }
        else{
            System.out.println("please check your compatibility for cpu and motherboard");
        }
    }
    public boolean compatibilityCheck(){
        return this.cpuGen == this.motherboardGen;
    }
}
