package game;

public class Main {

    Board board = new Board();

    static Player player1 = new Player();
    static Player player2 = new Player();
    private GUIController gui = new GUIController();

    public static void main(String[] args) {

        Main game = new Main();
        game.PlayerName();
        game.setupPlayer();

        while(true){ //  infinite loop
            // uses methods from Language class in correlation with system.out.println

            Language.Player1Roll(player1);
            Language.sc.next();
            game.Player1();

            if(player1.bank.amount >= 3000){
                Language.PlayerWon(player1);
                System.exit(0);
            }

            Language.Player2Roll(player2);
            Language.sc.next();
            game.Player2();

            if(player2.bank.amount >= 3000){
                Language.PlayerWon(player2);
                System.exit(0);
            }
        }
    }

    //Player name.

    public void PlayerName(){

        Language.Player1InsertName();
        player1.getPlayerName(Language.sc.nextLine());

        Language.Player2InsertName();
        player2.getPlayerName(Language.sc.nextLine());

        Language.Intro(player1, player2);

    }

    //Player1 turn

    public void Player1(){

        Cup cup1 = new Cup();

        Language.Player1Rolled(player1, cup1);

        board.properties[cup1.sum()].Arrived(player1);
    }



    //Player2 turn

    public void Player2(){

        Cup cup2 = new Cup();

        Language.Player2Rolled(player2, cup2);

        board.properties[cup2.sum()].Arrived(player2);
    }

    //Inserts the player-figures in the gui

    public void setupPlayer() {
        gui.addPlayers(new Player[]{player1, player2});
    }



}

