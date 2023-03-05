package battleship;
import battleship.util.Position;
public class FirstBattleShipMain{
    public static void main(String[] args){
        int width=10;
        int length=10;
        int x=5;
        int y=3;
        Sea sea=new Sea(width,length);
        Ship ship=new Ship(1);
        Position p=new Position(x,y);
        sea.addShip(ship, p);
        sea.display(true);
        System.out.println("--------------------------------------------");
        sea.display(false);
        sea.shoot(p);
        System.out.println("                                            ");
        System.out.println("############################################");
        System.out.println("                                            ");
        sea.display(true);
        System.out.println("--------------------------------------------");
        sea.display(false);

    }

}