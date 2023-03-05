package battleship;

public class Cell{
    private Ship ship;
    private boolean shot;
    /**
    * On crée un object Cell
    */
    public Cell(){
        this.ship=null;
    }

    /** détermine si la cellule est occupée ou non
     *@return true elle n'est pas occupée, false dans le cas contraire
     */
    public boolean isEmpty(){
        return this.ship==null;
    }

    /** renvoie l'état de la cellule après l'attaque
     * @return réponse de l'attaque
     */
    public Answer shot(){
        if (this.isEmpty()){
            this.shot=true;
            return Answer.missed;  
        }else{
                this.shot=true;
                this.ship.beenHitting();
                if (ship.hasBeenSunk()){
                    return Answer.Sunk;
                }else{
                    return Answer.hit;
                }
            }    
        
    }
    
    
    /** on retourne le navire  sur la cellule du tableau
     * @ retour du navire sur la cellule
     */
    public Ship getShip(){
        return this.ship;
    }
    
    /** on place le navire sur la cellule du tableau
     *@param navire
     */
    public void setShip(Ship ship){
        this.ship=ship;
    }
    
    /** retourne l'etat de la cellule
    *@return  
    * on retourne vrai s'il a été abattu et l'inverse sinon
    */
    public boolean hasBeenShot(){
        return this.shot;
    }

    /** Récupère un caractère représentant la cellule (case)
     * @return le caractère représentant la cellule
     **/
    public char toCharacter(boolean defender){
        char res='a';
        char emptyCell='~';
        char notTouchedShip='B';
        char TouchedShip='*';
        
        if(defender==true){
            if(this.isEmpty()==true){
                res= emptyCell;
            
            }else if (this.getShip()!=null && this.hasBeenShot()==false ){
                res = notTouchedShip;
            }else if (this.getShip()!=null && this.shot() == Answer.hit){
                res = TouchedShip;
            }
        
        }else if(defender==false){
            if(this.hasBeenShot()==false){
                char notShot = '.';
                res = notShot;
            }else if(this.hasBeenShot()==true && this.isEmpty()==true){
                res=emptyCell;
            }else if(this.getShip()!=null && this.shot() == Answer.hit){
                res=TouchedShip;
            }
        }

    return res;
    }
    



}
    