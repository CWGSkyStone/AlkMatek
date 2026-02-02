import java.util.Random;

public class Poker {
    static Random random = new Random();
    protected static void play() {
        machineThrow();
        playerThrow();
    }
    private static void machineThrow(){
        System.out.println("A gép dobásai: ");
        for(int i = 1; i <= 5; i++) {
            System.out.print(random.nextInt(6) + 1 + " ");
    }
}
    private static void playerThrow(){

        System.out.println("\nA te dobásaid: ");
        for(int i = 1; i <= 5; i++) {
            System.out.print(random.nextInt(6) + 1 + " ");
    }
}
}
