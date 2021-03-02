package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mobile {
    private static int id;
    private String mobileOwnwerName, mobileNumber, mobileOsName;
    private Float mobileBalance;
    private Boolean lock;

    public Mobile(String mobileOwnwerName, String mobileNumber, String mobileOsName, Float mobileBalance, Boolean lock) {
        this.id += 1;
        this.mobileOwnwerName = mobileOwnwerName;
        this.mobileNumber = mobileNumber;
        this.mobileOsName = mobileOsName;
        this.mobileBalance = mobileBalance;
        this.lock = lock;
    }
    public void showInfo(){
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter newTime = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = time.format(newTime);
        if (!lock && this.mobileBalance > 0 ) {
            System.out.println("|------Mobile-Info------|");
            System.out.println("Owner name: " + mobileOwnwerName);
            System.out.println("Mobile number: " + mobileNumber);
            System.out.println("Mobile Balance: " + mobileBalance);
            System.out.println("Operating system: " + mobileOsName);
            System.out.println("Date: " + formattedDate);
            System.out.println("|---------The-END-------|");
        }
        else if (!lock && this.mobileBalance < 0) {
            System.out.println("\nNot sufficient balance. Please recharge amount!");
        }
        else {
            System.out.println("\n\nPlease unlock your mobile device!");
        }
    }
    public void recargeAmount(float amount){
        this.mobileBalance += amount;
    }
    public void callSomeone(float time) {
        this.mobileBalance -= time;
    }

}
