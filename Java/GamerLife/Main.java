package valorant.game;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Full Name: ");
        String fullname = s1.nextLine();

        System.out.print("Username: ");
        String username = s1.nextLine();

        ReadyPlayer game = new ReadyPlayer(fullname, username);

        game.setSubscriptionType("Elite Subscription");
        game.buyEliteCoins(20);
        game.playerTierTracker(2222);
        game.showInfo();
    }
}
