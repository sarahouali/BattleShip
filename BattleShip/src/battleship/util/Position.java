package battleship.util;

/**
 * une position dans un environnement a 2D est déterminée par un nombre entier
 * on utilise les coordonnées x et y
 *
 * @auteur JC
 *
 */
public class Position {
   private int x;
   private int y;

   /**
    * On crée une position correspondant à des coordonnées données
    *
    * @param x la coordonnée x
    * @param y la coordonnée y
    */
   public Position(int x, int y) {
      this.x = x;
      this.y = y;
   }

   /**
    * @return On retourne la coordonnée x par un getter
    */
   public int getX() {
      return this.x;
   }

   /**
    * @return On retourne la coordonnée y par un getter
    */
   public int getY() {
      return this.y;
   }

   /** * deux positions sont égales si elles ont les mêmes coordonnées
     
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