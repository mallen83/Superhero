import java.util.Random;

public class Superman extends Superhero{
    public Superman(String name, int health, boolean isDead) {
        super(name, health, isDead);
    }

    public void HeatVision(String Batman) {

    }

    public void attack(Superhero opponent) {
        Random random = new Random();
        int damage = random.nextInt(10);

        opponent.determineHealth(damage);
        System.out.println(opponent.getName() + " has taken a hit.");
    }
}

