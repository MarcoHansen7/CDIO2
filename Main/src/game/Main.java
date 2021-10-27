package game;

public class Main {

    Board board = new Board();

    static Player p1 = new Player();
    static Player p2 = new Player();
    private Main gui = new Main();

    public static void main(String[] args) {


        Main game = new Main();
        game.setPlayerName();
        game.setupPlayer();

        while(true){

            Language.Player1Roll(p1);
            Language.sc.nextInt();
            game.Player1();

            if(p1.bank.amount >= 3000){
                Language.PlayerWon(p1);
                System.exit(0);
            }

            Language.Player2Roll(p2);
            Language.sc.nextInt();
            game.Player2();

            if(p2.bank.amount >= 3000){
                Language.PlayerWon(p2);
                System.exit(0);
            }
        }
    }

    //Sets the player name.

    public void setPlayerName(){

        Language.Player1InsertName();
        p1.getPlayerName(Language.sc.nextLine());

        Language.Player2InsertName();
        p2.getPlayerName(Language.sc.nextLine());

        Language.Intro(p1, p2);

    }

    //Starts player turn

    public void Player1(){

        Cup c2 = new Cup();

        Language.Player1Rolled(p1, c2);

        board.properties[c2.sum()].Arrived(p1);
    }



    //Starts player turn

    public void Player2(){

        Cup c3 = new Cup();

        Language.Player2Rolled(p2, c3);

        board.properties[c3.sum()].Arrived(p2);
    }

    public void setupPlayer() {
        gui.addPlayers(new Player[]{p1, p2});
    }

    private void addPlayers(Player[] players) {
        gui.addPlayers(new Player[]{p1, p2});
    }


}

