package com.company;

public class Main {
    public static void main(String[] args) {
        Mobile newObject = new Mobile("Imam Mahbir Afraz", "01523343535367",
                "Android", 40.0f, false);
        Mobile newObject2 = new Mobile("Imam Mahthir Ahnaf", "016437476487783",
                "Android", 0.0f, false);

        newObject.recargeAmount(10.2f);
        newObject.callSomeone(3.5f);
        newObject.showInfo();

        newObject2.recargeAmount(0.0f);
        newObject2.callSomeone(0.0f);
        newObject2.showInfo();
    }
}
