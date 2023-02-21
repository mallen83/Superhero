import java.util.Random;

public class SuperHeroGame {

    public static void main(String[] args) {

        Random random = new Random();
        int health1 = random.nextInt(100);
        int health2 = random.nextInt(100);

        Superman superman = new Superman(health1);
        Batman batman = new Batman(health2);

        while (!superman.isDead() && !batman.isDead()) {

            superman.heatVision(batman);
            batman.batarang(superman);

            if (superman.isDead()) {
                System.out.println("Superman is dead");
            }
            if (batman.isDead()){
                System.out.println("Batman is dead");
            }

        }

    }
}
