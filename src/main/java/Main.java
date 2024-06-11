import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to my Rock/Paper/Scissors game!");
        System.out.println("First off, Whats your name?");
        Scanner inName = new Scanner(System.in);
        String name = inName.nextLine();
        Human player = new Human(name, "to be selected", 0);
        Computer pc = new Computer("to be selected", 0);
        Game playGame = new Game();
        playGame.gameRound(player, pc);


    }

}