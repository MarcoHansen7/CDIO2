package game;


public class Properties {

    private int Outcome;
    private String Field;
    private String Description;

    public Properties(int Outcome, String Field, String Description)
    {
        this.Outcome = Outcome;
        this.Field = Field;
        this.Description = Description;
    }

    public void Arrived(Player p){
        p.getBank().add(Outcome);
        Language.Arrived(Field, Description, Outcome, p.getBank());

    }

}
