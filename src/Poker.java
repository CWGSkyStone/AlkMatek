import java.util.Random;

public class Poker {
    protected static void play() {
        throwDice("Gép");
        throwDice("\nJátekos");
    }
    private static void throwDice(String role){
        Random random = new Random();
        System.out.println(role +" dobásai: ");
        for(int i = 1; i <= 5; i++) {
            System.out.print(random.nextInt(6) + 1 + " ");
        }
    }
}
