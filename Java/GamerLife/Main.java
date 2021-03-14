package valorant.game;

public class Main {
    public static void main(String[] args) {
        ReadyPlayer game = new ReadyPlayer("Imam Mahbir Afraz", "Afraz2007");
        game.showInfo();
        game.buyEliteCoins(20);
        game.playerTierTracker(2222);
        game.showInfo();
    }
}
