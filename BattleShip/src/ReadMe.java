/* #objecttif du tp: 


#Pr�sentation:

le projet consiste � programmer le jeu bataille navale.

Cr�ation de Classe Ship:
Un objet bateau (ship) est d�fini par sa longueur.
  La longueur d�un bateau d�termine son nombre de points de vie  (life points) 
  et est fix�e a la cr�ation. 
   Lorsqu�il est touch�, ce nombre diminue.
   Un bateau est coul� quand son nombre de points de vie arrive `a 0.


cr�ation de Classe Answer:
dans l�eau, touch�, coul�.On appelle Answer le type permettant de repr�senter
 les 3 r�ponses possibles apres une proposition d�un attaquant :MISSED,HIT et SUNK.

cr�ation de Classe Sea: 

Le plateau de jeu.La classe repr�sentant le plateau (board) s�appelle Sea. 
 On d�cide de repr�senter son etat par un tableau a 2 dimensions de cases.
   La classe Cell permet de repr�senter les cases.


**/


/*FisrtBattleshipMain : Ce code est la classe principale de votre jeu de Bataille Navale.
 *  Elle utilise diff�rentes classes pour cr�er et afficher une grille de la mer et
 *   un navire sur cette grille.

Il d�finit la largeur et la longueur de la grille avec width et length, respectivement.
 Il d�finit �galement la position du navire en utilisant x et y.

Ensuite, une instance de la classe Sea est cr��e en utilisant les valeurs de width et length.
 Une instance de la classe Ship est �galement cr��e en utilisant la taille du navire 1.
  Enfin, une instance de la classe Position est cr��e en utilisant les valeurs de x et y.

La m�thode addShip est appel�e sur l'objet sea pour ajouter le navire � la grille de la mer
 � la position donn�e. La m�thode display est appel�e pour afficher la grille de la mer,
  avec une option pour afficher ou masquer les navires.

La m�thode shoot est appel�e sur l'objet sea pour simuler un tir sur la grille � la position donn�e.
 Enfin, la m�thode display est appel�e � nouveau pour afficher l'�tat de la grille de la mer apr�s le tir.

*/

/* SecondBattleShipMain : Ce code est une autre classe principale pour votre jeu de Bataille Navale.
 *  Il utilise les m�mes classes que la premi�re classe principale, 
 *  mais il ajoute �galement une instance de la classe Game.

Il d�finit la largeur et la longueur de la grille de mer avec width et length, respectivement.
 Il d�finit �galement les positions de deux navires sur la grille en utilisant x1, y1, x2 et y2.

Ensuite, une instance de la classe Sea est cr��e en utilisant les valeurs de width et length.
 Deux instances de la classe Ship sont �galement cr��es en utilisant la taille du navire 1.
  Deux instances de la classe Position sont �galement cr��es en utilisant les valeurs de x1, y1, x2 et y2.

Les m�thodes addShip sont appel�es sur l'objet sea pour ajouter les deux navires � la grille 
de la mer � leurs positions respectives. La m�thode display est appel�e pour afficher 
la grille de la mer avec les navires.

Enfin, une instance de la classe Game est cr��e en utilisant l'objet sea,
 et la m�thode play est appel�e sur cet objet pour commencer � jouer � la Bataille Navale.
*/



/* ThirdBattleShipMain : Ce code est une autre classe principale pour votre jeu de Bataille Navale.
 *  Il utilise les m�mes classes que les deux pr�c�dentes classe principales.

Il d�finit la grille de mer en utilisant la largeur et la longueur d�finies � 10 chacune.
 Il cr�e �galement deux instances de la classe Ship, l'une avec une taille de 3 et l'autre avec une
  taille de 2.

Ensuite, une instance de la classe Position est cr��e avec les valeurs de x et y d�finies � 5. 
La m�thode addShipHorizontally est appel�e sur l'objet sea pour ajouter le navire de taille 3
 � la grille de la mer � la position d�finie. La m�thode display est appel�e pour 
 afficher la grille de la mer avec le navire.

Enfin, une instance de la classe Game est cr��e en utilisant l'objet sea,
 et la m�thode play est appel�e sur cet objet pour commencer � jouer � la Bataille Navale.
 */
 

/* La classe Answer : Cette classe repr�sente l'�num�ration Answer qui a 3 valeurs 
 * diff�rentes : hit, Sunk et missed. Cette �num�ration peut �tre utilis�e pour repr�senter
 *  les diff�rents r�sultats possibles apr�s un tir sur un navire dans le jeu de Bataille Navale.

La valeur hit repr�sente un coup qui touche un navire.
 La valeur Sunk repr�sente un coup qui a coul� le navire. 
 La valeur missed repr�sente un coup qui a rat� le navire.
*/

/* La classe Cell : This is a class definition for the "Cell" class in a Battleship game.
 *  The class has properties and methods related to a single cell in the game grid.


La propri�t� ship repr�sente le navire qui est plac� sur la cellule.
La propri�t� shot permet de savoir si la cellule a �t� abattue ou non.
La classe fournit des m�thodes pour :

V�rifiez si la cellule est vide ou non avec isEmpty().
Suivez les prises de vue avec la m�thode shot() , qui renvoie le r�sultat de la prise de vue sous 
la forme d'un type �num�r� Answer.
Obtenez et d�finissez le vaisseau plac� sur la cellule avec getShip() et setShip().
V�rifiez l'�tat de tir de la cellule avec hasBeenShot().
Repr�sentez la cellule sous la forme d'un caract�re avec toCharacter(boolean defender).
Le param�tre defender d�termine si la cellule est affich�e � partir de
la perspective du d�fenseur ou de l'attaquant. */

/* La classe Game : Ce code d�finit une classe "Game" qui impl�mente la fonctionnalit�
 * du jeu de cuirass�. La classe a un constructeur qui prend un objet Sea comme
 * une entr�e et la stocke dans la variable membre de la mer. La m�thode de jeu impl�mente 
 * la boucle de jeu principale,
 * qui continue jusqu'� ce que tous les navires soient coul�s.
 *  L'utilisateur peut saisir sa position de tir,
 * qui est ensuite pass� � la m�thode shoot de l'objet Sea.
 * Le r�sultat du tir est affich� � l'utilisateur avec des messages tels que "manqu�",
 *  "coup" ou "coul�".
 * La m�thode inputPosition prend l'entr�e de l'utilisateur pour la position de prise
 *  de vue et la renvoie sous la forme d'un objet Position.
 * Les m�thodes letterPos et intPos sont utilis�es pour convertir la lettre 
 * et l'entier saisis par l'utilisateur
 * en indices entiers pour l'objet Position.*/


/* La classe Sea : Il s'agit d'une classe Sea pour le jeu Battleship en Java.
 * La classe a les m�thodes suivantes :
Un constructeur qui prend largeur et longueur comme arguments,
 cr�e un tableau � deux dimensions d'objets "Cell" et initialise chaque cellule avec un nouvel objet Cell.
M�thodes addShipVertically et addShipHorizontally pour placer le navire sur la mer.
 Ils v�rifient si le navire peut �tre plac� verticalement ou horizontalement,
 lever une exception si le placement n'est pas possible.
addShip pour ajouter le navire � une position sp�cifique.
tirer pour tirer sur une cellule sur le plateau par l'ennemi.
getRemainingLifePoints pour obtenir les points de vie restants de tous les navires en mer.
Remarque : Le code comporte des fautes de frappe et des probl�mes, par ex. dans la m�thode
 getRemainingLifePoints,
 il y a une faute de frappe dans la condition de boucle et la m�thode ne renvoie rien.
*/

/* La classe Ship : C'est une classe Java qui repr�sente un "Ship" dans un jeu Battleship.
 * La classe a 3 m�thodes :

getLifePoints() renvoie le nombre de points de vie dont dispose le vaisseau.
hasBeenSunk() renvoie un bool�en indiquant si le navire a �t� coul� (c'est-�-dire que ses points de vie
 sont 0).
beenHitting() r�duit les points de vie du vaisseau de 1.
La classe a �galement un champ priv� lifePoints qui repr�sente le nombre
de points de vie dont dispose le navire.
Le constructeur Ship(int leng) d�finit la valeur initiale de lifePoints sur la valeur de l'argument long.*/

/* La classe Position : C'est le code de la classe Position dans le package battleship.util.
 * La classe Position repr�sente une position 2D dans un environnement donn� et est d�termin�e par deux
 * valeurs enti�res, x et y, repr�sentant les coordonn�es x et y. 
 * La classe a les m�thodes suivantes :
public Position(int x, int y) : un constructeur qui cr�e un nouvel objet position avec
 les valeurs x et y donn�es.
public int getX() : une m�thode getter qui renvoie la valeur de x.
public int getY() : une m�thode getter qui renvoie la valeur de y.
public boolean equals(Object o) : une m�thode qui renvoie true si
 l'objet position est �gal � l'Objet pass� en param�tre (o) et a les m�mes valeurs x et y.
public String toString() : une m�thode qui renvoie une repr�sentation sous forme de cha�ne de la position
objet au format "x , y". */
















