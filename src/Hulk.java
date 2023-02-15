import java.util.Random;

public class Hulk extends Superhero {

    public Hulk(String name, int health, boolean isDead) {
        super(name, health, isDead);
    }

    //define special attack a new method.type of superhero
    public void HulkSmash() {

    }

    public void attack(Superhero opponent) {
        Random random = new Random();
        int damage = random.nextInt(10);

        opponent.determineHealth(damage);
        System.out.println(opponent.getName() + " has taken a hit.");
    }
}
