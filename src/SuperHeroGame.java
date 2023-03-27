import java.util.List;
import java.util.Random;


public class SuperHeroGame {

    public static void main(String[] args) {

        Random random = new Random();
        int health1 = random.nextInt(100);
        int health2 = random.nextInt(100);
        int health3 = random.nextInt(100);

        Superman superman = new Superman(health1);
        Batman batman = new Batman(health2);
        Hulk hulk = new Hulk(health3);


        while (!superman.isDead && !batman.isDead && !hulk.isDead) {

            superman.heatVision(hulk);
            batman.batarang(superman);
            hulk.hulkSmash(batman);

            if (superman.isDead) {
                System.out.println("Superman is dead");
            }
            if (batman.isDead) {
                System.out.println("Batman is dead");
            }
            if (hulk.isDead()) {
                System.out.println("Hulk is dead");
            }
        }
        Superhero superhero1;
        Superhero superhero2;

        if (!superman.isDead) {
            superhero1 = superman;
            if (!batman.isDead) {
                superhero2 = batman;
            } else {
                superhero2 = hulk;
            }

            while (!superhero1.isDead && !superhero2.isDead) {

                int health = random.nextInt(2);
                if (health == 0) {
                    superhero1.attack(superhero2);
                    System.out.println(superhero1.getName() + " attacks " + superhero2.getName() + " energy has decrease to " + superhero2.getHealth());
                } else {
                    superhero2.attack(superhero1);
                    System.out.println(superhero2.getName() + " attacks " + superhero1.getName()  + " energy has decrease to " + superhero1.getHealth());
                }
            }
            if (!superhero1.isDead) {
                System.out.println(superhero1.getName() + " has won the battle.");
            } else {
                System.out.println(superhero2.getName() + " has won the battle.");
            }
        }
    }
};


//using null assigning a variable using null

//check to see if is dead