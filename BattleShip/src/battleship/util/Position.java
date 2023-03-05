package battleship.util;

/**
 * une position dans un environnement a 2D est d�termin�e par un nombre entier
 * on utilise les coordonn�es x et y
 *
 * @auteur JC
 *
 */
public class Position {
   private int x;
   private int y;

   /**
    * On cr�e une position correspondant � des coordonn�es donn�es
    *
    * @param x la coordonn�e x
    * @param y la coordonn�e y
    */
   public Position(int x, int y) {
      this.x = x;
      this.y = y;
   }

   /**
    * @return On retourne la coordonn�e x par un getter
    */
   public int getX() {
      return this.x;
   }

   /**
    * @return On retourne la coordonn�e y par un getter
    */
   public int getY() {
      return this.y;
   }

   /** * deux positions sont �gales si elles ont les m�mes coordonn�es
     
    * * @see java.lang.Object#equals(java.lang.Object) */
   public boolean equals(Object o) {
      if (o instanceof Position) {
         Position other = (Position) o;
         return this.x == other.x && this.y == other.y;
      } else {
         return false;
      }
   }

   /**
    * @see java.lang.Object#toString()
    */
   public String toString() {
      return this.x + " , " + this.y;
   }
}