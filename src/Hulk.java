import java.util.Random;

public class Hulk extends Superhero {

    public Hulk(String name, int health, boolean isDead) {
        super(name, health, isDead);
    }

    //define special attack a new method.type of superhero
    public void HulkSmash(String name) {
        System.out.println("Hulk uses his powerful smash to gain advantage over his opponent.");
    }
}
