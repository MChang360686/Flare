import java.util.Random;

public class Flare {
    public static void main(String[] args){
        //new random number generator
        Random random = new Random();
        //define variables
        boolean roll = false;
        String playerColor = "white";
        String computerColor = "white";

        //Generate an int from 1-3
        int player = random.nextInt(3) + 1;
        int computer = random.nextInt(3) + 1;

        //using switch statements to change the color
        //depending on the number from random.nextInt() above
        //Game Mechanic is Red trumps Yellow
        //Yellow trumps Green, Green trumps Red
        switch(player){
            case 1:
                player = 1;
                System.out.println("Red");
                break;
            case 2:
                player = 2;
                System.out.println("Yellow");
                break;
            case 3:
                player = 3;
                System.out.println("Green");
                break;
        }

        switch(computer){
            case 1:
                computer = 1;
                System.out.println("Red");
                break;
            case 2:
                computer = 2;
                System.out.println("Yellow");
                break;
            case 3:
                computer = 3;
                System.out.println("Green");
                break;
        }

        if(player == computer){
            System.out.println("Roll Again");
            roll = true;
        }else if(player == 1 && computer == 2){
            System.out.println("Player goes first");
        }else if(player == 2 && computer == 3){
            System.out.println("Player goes first");
        }else if(player == 3 && computer == 1){
            System.out.println("Player goes first");
        }else{
            System.out.println("Computer goes first");
        }
    }
}
