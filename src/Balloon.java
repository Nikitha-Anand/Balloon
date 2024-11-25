import java.util.Scanner;

public class Balloon {
    private Integer Health;
    private String Colour;
    private String DefenceItem;
    public Balloon(String DefenceItem, String Colour){
        this.DefenceItem = DefenceItem;
        this.Colour = Colour;
        Health = 100;
    }

    public String GetDefenceItem(){
        return DefenceItem;
    }

    public void ChangeHealth(Integer health){
        Health += health;
    }

    public Boolean CheckHealth(){
        return Health <= 0;
    }

    public Balloon Defend(Balloon ballon){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Strength of the Opponent: ");
        int opponentStrength = keyboard.nextInt();
        ballon.ChangeHealth(-opponentStrength);
        System.out.println("Defence Item: "+ GetDefenceItem());
        if(ballon.CheckHealth()){
            System.out.println("No health remaining");
        }else{
            System.out.println("Health is "+ Health);
        }
        return ballon;
    }

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a defence Item: ");
        String userDefenceItem = keyboard.next();
        System.out.println("Enter a Colour: ");
        String userColour = keyboard.next();
        Balloon Balloon1 = new Balloon(userDefenceItem, userColour);

        Balloon1.Defend(Balloon1);
    }
}
