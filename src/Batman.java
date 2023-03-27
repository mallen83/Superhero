import java.util.Random;

public class Batman extends Superhero {
    public Batman(int health) {
        super("Batman", health);
    }

    public void batarang(Superhero opponent) {
        attack(opponent);
        System.out.println("Batman throws his batarang at " + opponent.getName() + "." + " " + opponent.getName() + " energy has decrease to " + opponent.getHealth());
    }

}
