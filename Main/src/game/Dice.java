package game;

public class Dice {

    private int numOfSides;
    private int faceValue;

    public Dice(int numberOfSides)
    {
        numOfSides = numberOfSides;

        faceValue = (int)(Math.random()*numOfSides) + 1;

    } // contructor slutter

    public void roll() // Simulation af terninge-slaget
    {
        faceValue = (int)(Math.random()*numOfSides) + 1;

    }

    public int getFaceValue() // Returnere værdien af dice
    {
        return faceValue;
    }
}




