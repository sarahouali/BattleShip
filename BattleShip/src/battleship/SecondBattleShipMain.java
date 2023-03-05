package battleship;
import java.lang.Math;
import battleship.util.Position;
import java.util.*;
public class SecondBattleShipMain {

    public static void main(String[] args) {
        int length = 10;
        int width = 10;
        int x1 = 5;
        int y1 = 2;
        int x2 = 7;
        int y2 = 4;
        Sea sea = new Sea(length, width);
        Ship ship1 = new Ship(1);
        Ship ship2 = new Ship(1);
        Position p1 = new Position(x1, y1);
        Position p2 = new Position(x2, y2);
        sea.addShip(ship1, p1);
        sea.addShip(ship2, p2);
        sea.display(true);
        Game game = new Game(sea);
        game.play();
    }
    
}