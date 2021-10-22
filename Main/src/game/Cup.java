package game;

public class Cup {

    Dice dice1 = new Dice(6);
    Dice dice2 = new Dice(6);

    public Cup() { // Der gøres her brug af roll() metoden fra Dice.java
        dice1.roll();
        dice2.roll();
    }

    public int sum() { // Sum metode, returnere die1 + die2 summen

        int die1result = dice1.getFaceValue();
        int die2result = dice2.getFaceValue();

        return die1result + die2result;
    }
}

