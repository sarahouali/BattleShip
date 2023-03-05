package battleship;
/**
* On cr�e un objet de type ship (navire)
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

    /** on r�v�le si le navire a �t� coul�
     * @return true si ce navire a coul� et non l'inverse
     */
    public boolean hasBeenSunk(){
        return this.lifePoints==0;
         
    }

    /** on r�duit les points de vie lorsque le navire est touch� */

    public void beenHitting(){
          this.lifePoints-=1;
    }

}