package com.company;

public class Mobile {
    private String mobileOwnwerName, mobileNumber, mobileOsName;
    private Float mobileBalance;
    private Boolean lock;

    public Mobile(String mobileOwnwerName, String mobileNumber, String mobileOsName, Float mobileBalance, Boolean lock) {
        this.mobileOwnwerName = mobileOwnwerName;
        this.mobileNumber = mobileNumber;
        this.mobileOsName = mobileOsName;
        this.mobileBalance = mobileBalance;
        this.lock = lock;
    }
    public void showInfo(){
        if (!lock) {
            System.out.println("|------Mobile-Info------|");
            System.out.println("Owner name: " + mobileOwnwerName);
            System.out.println("Mobile number: " + mobileNumber);
            System.out.println("Mobile Balance: " + mobileBalance);
            System.out.println("Operating system: " + mobileOsName);
            System.out.println("|---------The-END-------|");
        }
        else {
            System.out.println("\n\nPlease unlock your mobile device!");
        }
    }

}
