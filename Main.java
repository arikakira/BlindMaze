import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        BlindMaze game = new BlindMaze(1, 6);
        game.getMaze();

        System.out.println(game.rightAvail());
        System.out.println(game.leftAvail());
        System.out.println(game.upAvail());
        System.out.println(game.downAvail());
        
        System.out.print("The directions you can move in are:  ");
        if(game.rightAvail()) System.out.print("right  ");
        if(game.leftAvail()) System.out.print("left  ");
        if(game.upAvail()) System.out.print("up  ");
        if(game.downAvail()) System.out.print("down  ");
        
        System.out.print("\n" + "Enter a direction: ");
        String userInput = scn.nextLine();
        System.out.println(userInput);
        game.move(userInput);
        game.getMaze();
    }
}