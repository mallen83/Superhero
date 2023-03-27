import java.util.Random;

public class Superman extends Superhero{

    public boolean dmg;

    public Superman(int health) {
        super("Superman", health);
    }

    public void heatVision(Superhero opponent) {
        attack(opponent);
        System.out.println("Superman uses his heat vision as an attack on " + opponent.getName() + "." + " " + opponent.getName() + " energy has decrease to " + opponent.getHealth());
    }

}

