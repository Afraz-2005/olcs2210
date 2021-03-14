package valorant.game;

public class ReadyPlayer {

    private static int id;
    private String fullName, username;
    private String subscriptionType = "Ready Subscription";
    private int gamePoints = 0;
    private String playerTier = "Bronze";
    private int readyCoins = 0;
    private int eliteCoins = 0;

    public ReadyPlayer(String fullName, String username) {

        this.fullName = fullName;
        this.username = username;
    }

    public String getFullName() { return fullName; }

    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getUsername() { return username; }

    public String getPlayerTier() { return playerTier; }

    public void setPlayerTier(String playerTier) { this.playerTier = playerTier; }

    public int getReadyCoins() { return readyCoins; }

    public void setReadyCoins(int readyCoins) { this.readyCoins = readyCoins; }

    public int getEliteCoins() { return eliteCoins; }

    public void setEliteCoins(int eliteCoins) { this.eliteCoins = eliteCoins; }

    public String getSubscriptionType() { return subscriptionType; }

    public void setSubscriptionType(String subscriptionType) { this.subscriptionType = subscriptionType; }

    public void showInfo() {

        System.out.println("\n=======PLAYER=INFO========");
        System.out.println("Full Name: " + fullName);
        System.out.println("Username: " + usernameCreator());
        System.out.println("Subscription Type: " + subscriptionType);
        System.out.println("Game Points: " + gamePoints);
        System.out.println("Player Tier: " + playerTier);
        System.out.println("Ready Coins: " + readyCoins);
        System.out.println("Elite Coins: " + eliteCoins);
        System.out.println("==========================");
    }

    public String usernameCreator() { return "@" + username; }

    public int getGamePoints() {
        return gamePoints;
    }
    public void setGamePoints(int gamePoints) {
        this.gamePoints = gamePoints;
    }

    public int playerTierTracker(int GamePoints) {
        this.gamePoints =+ GamePoints;
        if (this.gamePoints > 1000 && this.gamePoints < 0) {setPlayerTier("Bronze");}
        else if (this.gamePoints >= 1000 && this.gamePoints <= 1999) {setPlayerTier("Silver");}
        else if (this.gamePoints >= 2000 && this.gamePoints <= 2999) {setPlayerTier("Gold");}
        else if (this.gamePoints >= 3000 && this.gamePoints <= 3999) {setPlayerTier("Diamond");}
        else if (this.gamePoints >= 4000) {setPlayerTier("Platinum");}
        if (this.gamePoints < 0 ) {this.gamePoints = 0;}
        return 0;
    }

    public int buyEliteCoins(int EliteCoins) {
        if (this.subscriptionType == "Elite Subscription") { setEliteCoins(this.eliteCoins + eliteCoins); }
        else { System.out.println("Please set Subscription type to elite subscription in order to buy Elite coins"); }
        return 0;
    }
}
