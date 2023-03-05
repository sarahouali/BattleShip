package battleship;
import java.lang.Math;
import battleship.util.Position;
import java.util.*;

public class Game{
    private Sea sea;
    public Game(Sea s){
        this.sea=s;
    }

    public Sea getSea(){
        return this.sea;
    }
    
     public void play(){
        while (this.sea.getRemainingLifePoints() >= 0) {
        
            this.sea.display(false);
            Position shootOnThisPosition = this.inputPosition();
            System.out.println("                                      ");

            System.out.println("--------------------------------------");

            System.out.println("                                      ");
            Answer resultOfShootOfUserInput = this.sea.shoot(shootOnThisPosition);
            if (resultOfShootOfUserInput == Answer.missed) {
                System.out.println("missed, try again.");
            } else if (resultOfShootOfUserInput == Answer.hit) {
                System.out.println("hit, well done.");
            } else if (resultOfShootOfUserInput == Answer.Sunk) {
                System.out.println("Sunk, Excellent!");
            }
        }
    }

    private Position inputPosition() {
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter Cell Coordinates (Example: F8 or c3): ");  
            String userInput = sc.nextLine();
            String[] inputArr = userInput.split("");
            int Xcoord = -1;
            int Ycoord = -1;
            if (inputArr.length == 2) {
                Xcoord = this.letterPos(inputArr[0]);
                Ycoord = this.intPos(inputArr[1]);
            } else {throw new java.lang.Error("Please enter valid cell coordinates.");}

            Position p = new Position(Ycoord, Xcoord);
            return p;
    }

    public int letterPos(String letter) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        

        int i = 0;
        boolean isInAlphabet = false;
        while (isInAlphabet == false ) {
            if (i > this.sea.getWidth() - 1) {throw new java.lang.Error("Please enter a valid cell letter.");}
            if (letter.toLowerCase().equals(alphabet[i].toLowerCase()) == true) {
                isInAlphabet = true;
            }

            i++;
        }
        i--;
        if (isInAlphabet == false) {throw new java.lang.Error("Please enter a valid cell letter.");}

        return i;
    }

    public int intPos(String integer) {
        int res = -1;
        int inputNb = Integer.parseInt(integer);
        if (inputNb >= 0 && inputNb < this.sea.getWidth()) {
            res = inputNb;
        }
        if (res == -1) {throw new java.lang.Error("Please enter a valid cell number.");}
        return res;
    }


}