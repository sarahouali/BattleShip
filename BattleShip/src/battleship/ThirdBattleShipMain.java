package battleship;
import java.lang.Math;
import battleship.util.Position;
import java.util.*;
public class ThirdBattleShipMain {
    
    public static void main(String[] args) {
        Sea sea = new Sea(10, 10);
        Ship ship1 = new Ship(3);
        Ship ship2 = new Ship(2);
        Position p1 = new Position(5, 5);
        sea.addShipHorizontally(ship1, p1);
        sea.display(true);
        Game game = new Game(sea);
        game.play();
    }

}