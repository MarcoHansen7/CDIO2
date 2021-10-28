package game;

public class Player {


    String PlayerName;
    Bank bank;

    public Player() {// Create constructor, returns nothing
        bank  = new Bank(1000);
    }

    public String getPlayerName(String PlayerName) {// This will be used to get the PlayerName
        this.PlayerName = PlayerName;
        return PlayerName;
    }
    //Used to get Playername
    public String toString (){

        return PlayerName;
    }
    // Used to get bank value
    public Bank getBank(){

        return bank;
    }

}