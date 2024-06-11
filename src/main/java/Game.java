import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Game {
    private static HashMap<String,String> winningConditions = new HashMap<String, String>(Map.of("rock","scissors","paper", "rock","scissors","paper"));
    private static String[] options = {"rock", "paper", "scissors"};

    public void gameRound(Human player, Computer pc){
        System.out.printf("Hi %s select a number please:", player.getName());
        System.out.println(" ");                                                                    // fixes line issue
        while(pc.getScore()<5 && player.getScore()<5) {
            for (int i = 0; i <= options.length-1 ; i++) {
                System.out.println((i + 1) + " " + options[i]);
            }
            Scanner inSelect = new Scanner(System.in);
            int select;
            try{
                select = inSelect.nextInt();
                player.setSelection(options[select - 1]);                                           //fixes index error
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Please select an integer between 1 & 3");
                continue;
            }
            catch (InputMismatchException ex){
                System.out.println("Please select an INTEGER between 1 & 3");
                continue;
            }
                System.out.printf("you chose %s", options[select - 1]);
                System.out.println(" ");                                                            // fixes line issue
                int pcSelect = (int) (Math.random() * 3 + 1);
                pc.setSelection(options[pcSelect - 1]);
                System.out.printf("Computer chose %s", options[pcSelect - 1]);
                System.out.println(" ");                                                            // fixes line issue
                gamePoint(player, pc);
                System.out.printf("player: %s computer %2d", player.getScore(), pc.getScore());
                System.out.println(" ");                                                            // fixes line issue
        }
        declareWinner(player,pc);
    }
    public void gamePoint(Human player, Computer pc)  {
        for(String i : winningConditions.keySet()){
            if(player.getSelection().equals(i) && pc.getSelection().equals(winningConditions.get(i))){
                player.setScore();
                System.out.printf("point to %s",player.getName());
                System.out.println(" ");
                break;
            }
            else if(player.getSelection().equals(pc.getSelection())){
                System.out.println("Draw! - go again");
                break;
            }
            else if(pc.getSelection().equals(i) && player.getSelection().equals(winningConditions.get(i))){
                pc.setScore();
                System.out.println("point to the computer");
                break;
            }
        }
    }


    public void declareWinner(Human player, Computer pc){
        if(player.getScore()>pc.getScore()){
            System.out.printf("Congratz %s, you win",player.getName());
            System.out.println(" ");
            System.out.println("Thanks for playing!");
        }
        else{
            System.out.printf("Bad luck %s, looks like the computer beat you", player.getName());
            System.out.println(" ");                                                                // fixes line issue
            System.out.println("Better luck next time :/");
        }
    }
}
