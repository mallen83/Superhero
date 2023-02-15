import java.util.Random;

public class Superhero {

    private String name;
    private int health;
    private boolean isDead;

    public Superhero(String name, int health, boolean isDead) {
        this.name = name;
        this.health = health;
        this.isDead = isDead;
    }

    public void attack(Superhero opponent) {
        Random random = new Random();
        int damage = random.nextInt(10);

        opponent.determineHealth(damage);
        System.out.println(opponent.getName() + " has loss power.");
    }

    public void determineHealth(int damageTaken) {
        if (this.getHealth() - damageTaken <= 0) {
            this.setHealth(0);
            this.setDead(true);
        }
        else {
            this.setHealth(this.health - damageTaken);
        }
    }

    public Superhero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
