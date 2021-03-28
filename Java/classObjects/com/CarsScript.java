package classObjects.com;

public class CarsScript {
    private static int id;
    private String name, company, model;
    private int speed;

    public CarsScript(String name, String company, String model, int speed) {
        this.setName(name);
        this.setCompany(company);
        this.setModel(model);
        this.setSpeed(speed);
    }
    public void ShowInfo() {
        System.out.println("|----------------------------------------|");
        System.out.println("Name: " + this.getName());
        System.out.println("Company: " + this.getCompany());
        System.out.println("Model: " + this.getModel());
        System.out.println("Speed : " + this.getSpeed() + " m/s.sqr");
        System.out.println("|----------------------------------------|");
    }

    public static int getId() { return id; }
    public static void setId(int id) { CarsScript.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
}
