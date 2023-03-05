package battleship;
import java.lang.Math;
import battleship.util.Position;
/**
* Une classe de plateau pour représenter la batailleNavale
*/
public class Sea{
    private int width;
    private int length;
    private Cell[][] theCells;
    
    public Sea(int width ,int length ){
        this.length = length;
        this.width = width;
        this.theCells=new Cell[this.width][this.length];
        for(int i=0;i<this.theCells.length;i++){
            for(int j=0;j<this.theCells[0].length ;j++){
                this.theCells[i][j]=new Cell();
            }
        }
    }

    public int getWidth(){
        return this.width;
    }

    public int getLength(){
        return this.length;
    }

    /** ajoute le navire b à la mer de ce jeu. Le navire est ajouté verticalement vers le bas à partir de la position p.
     * Le nombre de cellules est déterminé par les points de vie du vaisseau.
     * @param shipToPlace le navire à ajouter
     * @param position la position de la première cellule (en haut) occupée par le vaisseau
     * @throws IllegalStateException si le navire b ne peut pas être placé sur la mer
     * (le navire sort de la mer ou une cellule n'est pas vide)
    */

    public void addShipVertically(Ship shipToPlace, Position position) throws IllegalStateException {
        this.testIfShipCanBePlacedVertically(shipToPlace, position);
    }

    public void addShipHorizontally(Ship shipToPlace, Position position) throws IllegalStateException {
        this.testIfShipCanBePlacedHorizontally(shipToPlace, position);
    }

    private void testIfShipCanBePlacedVertically(Ship shipToPlace, Position p) throws IllegalStateException {
        int shipPoints = shipToPlace.getLifePoints();
        int maxLengthPossibleForShip = Math.abs(this.length - p.getY());
        if (shipPoints <= maxLengthPossibleForShip && this.theCells[p.getX()][p.getY()].isEmpty() == true) {
            for (int i = 0; i < shipPoints; i++) {
                Position pos = new Position(p.getX(), p.getY() + i);
                addShip(shipToPlace, pos);
            }
        } else {throw new IllegalStateException();}

    }

    private void testIfShipCanBePlacedHorizontally(Ship shipToPlace, Position p) throws IllegalStateException {
        int shipPoints = shipToPlace.getLifePoints();
        int maxLengthPossibleForShip = Math.abs(this.width - p.getX());
        if (shipPoints <= maxLengthPossibleForShip && this.theCells[p.getX()][p.getY()].isEmpty() == true) {
            for (int i = 0; i < shipPoints; i++) {
                Position pos = new Position(p.getX() + i, p.getY());
                addShip(shipToPlace, pos);
            }
        } else {throw new IllegalStateException();}

    }
    public void addShip(Ship s, Position p){
        Cell cell = this.theCells[p.getX()][p.getY()];
        cell.setShip(s);
    }
    
    /**tire sur une cellule du plateau par l'ennemi
     * @return Une réponse lorsque l'ennemi réussit le tir
     * sinon ArrayIndexOutOfBoundException est levée
    */
    public Answer shoot(Position p) throws ArrayIndexOutOfBoundsException{
        Cell cell = this.theCells[p.getX()][p.getY()];
        return cell.shot();
    }
    
    /**retourne tous les points de vie des navires en mer
     * @return lifePoints renvoie tous les lifePoints des navires en mer
    */
    /**public int getRemainingLifePoints(){
        int totalLifepoints=0 ;
        for(int je =0;i<largeur;i++){
            pour (int j=0;j<longueur;j++){
                if(this.theCells[i][j].isEmpty() == false){
                    Navire s = this.theCells[i][j].getShip();
                    totalLifepoints+= s.getLifePoints();
                }
            }
        }
        renvoie le total des points de vie ;
    }*/
    public int getRemainingLifePoints(){
        int res=0;
        for (int lig=0;lig<this.length;lig++){
          for (int col =0; col<this.width;col++){
            if (!(this.theCells[lig][col].isEmpty()||this.theCells[lig][col].hasBeenShot()))
              res+=1;
            }
          }

        return res;
    }
    

    /** affiche le plateau de jeu ligne par ligne et case par case, sur la sortie standard,
     * l'identifiant d'affichage différent pour le défenseur ou l'attaquant, selon paramètre
     * @param defender true si l'affichage est pour le défenseur, false si pour l'adversaire
  */
    /*public void display(boolean defender){
         for(int i =0;i<width;i++){
            for (int j=0;j<length;j++){
                char mot=this.theCells[i][j].toCharacter(defender);
                System.out.print(mot+"\t");
        }
        System.out.println();
    }
    }*/

    public void display(boolean defender) {
        String[] alphabet = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String ln1 = "";
        for (int i=0; i < this.width ; i++) {
            ln1 += alphabet[i] + "  ";
        }
        System.out.println("    " + ln1);



        for (int i = 0 ; i < this.length  ; i++) {
            String ln = "";
        
            for (int j = 0 ; j < this.theCells[0].length ; j++) {
                Cell cell = this.theCells[i][j];
                char character = cell.toCharacter(defender);
                ln += character + "  ";
                
            }

            System.out.println( i + "   " + ln);

            
            
        }
    }




}
