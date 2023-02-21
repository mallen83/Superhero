import java.util.Random;

public class Batman extends Superhero {
    public Batman(int health) {
        super("Batman", health);
    }

    public Batman(String name, int health) {
        super(name, health);
    }

    public void batarang(Superhero opponent) {
        Random random = new Random();
        int damage = random.nextInt(10);
        opponent.determineHealth(damage);

    System.out.println("Batman throws his batarang at " + opponent.getName() + "." + " " + opponent.getName() + " energy has decrease to " + opponent.getHealth());


    }

}
