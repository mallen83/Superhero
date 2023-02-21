import java.util.Random;

public class Superman extends Superhero{

    public Superman(int health) {
        super("Superman", health);
    }

    public void heatVision(Superhero opponent) {
        Random random = new Random();
        int damage = random.nextInt(10);
        opponent.determineHealth(damage);

        System.out.println("Superman uses his heat vision as an attack on " + opponent.getName() + "." + " " + opponent.getName() + " energy has decrease to " + opponent.getHealth());
    }

}

