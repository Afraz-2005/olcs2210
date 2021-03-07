package bank.com;

public class Main {
    public static void main(String[] args) {
        Bank obj = new Bank("ABC_001", "Yoru", "something", 1000f);

        obj.ShowInfo();
        obj.depositAmount(200f);
        obj.withdrawAmount(100f);
        obj.ShowInfo();
    }
}
