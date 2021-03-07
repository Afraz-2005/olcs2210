package bank.com;

public class Bank {
    private String id;
    private static int IdNum;
    private String name, type;
    private float balance;

    public Bank(String id, String name, String type, float balance) {
        this.IdNum = IdNum;
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }
    public void ShowInfo(){

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Balance BDT: " + balance);
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public float getBalance() { return balance; }
    public void setBalance(float balance) { this.balance = balance; }

    public void idCreator() {
        this.id = "ABC_00" + this.IdNum ;
    }

    public float withdrawAmount (float amount) {
        if (this.balance >= 500 && this.balance <= 500) {
            this.balance =- amount;
        }
        else {
            System.out.println("Not enough balance! please recharge");
        }
        return balance;
    }

    public float depositAmount (float amount) {
        if (this.balance >= 100 && this.balance <= 100_000) {
            this.balance =+ amount;
        }
        else {
            System.out.println("Amount from BDT 100 to BDT 100 000 can be deposited in the account");
        }
        return balance;
    }
}
