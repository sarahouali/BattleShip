package battleship;
/**
* On crée un objet de type ship (navire)
*/
public class Ship{
    private int lifePoints;

    public Ship(int leng){
        this.lifePoints=leng;
    }

    /** on retourne les  points de vie du navire
     * @return lifePoints
     */


    public int getLifePoints(){
        return this.lifePoints;
    }

    /** on révèle si le navire a été coulé
     * @return true si ce navire a coulé et non l'inverse
     */
    public boolean hasBeenSunk(){
        return this.lifePoints==0;
         
    }

    /** on réduit les points de vie lorsque le navire est touché */

    public void beenHitting(){
          this.lifePoints-=1;
    }

}