package com.company;

public class Main {
    public static void main(String[] args) {
        Mobile newObject = new Mobile("Imam Mahbir Afraz", "01523343535367",
                "Android", 40.0f, false);
        Mobile newObject2 = new Mobile("Imam Mahthir Ahnaf", "016437476487783",
                "Android", 32.2f, true);

        newObject.showInfo();
        newObject2.showInfo();
    }
}
