import java.util.Random;

public class Hulk extends Superhero {

    public Hulk(int health) {
        super("Hulk", health);
    }

    //define special attack a new method.type of superhero
    public void hulkSmash(Superhero opponent) {
        attack(opponent);
        System.out.println("Hulk uses his powerful attack on " + opponent.getName() + "." + " " + opponent.getName() + " energy has decrease to " + opponent.getHealth());
    }
}
