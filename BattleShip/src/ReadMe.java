/* #objecttif du tp: 


#Présentation:

le projet consiste à programmer le jeu bataille navale.

Création de Classe Ship:
Un objet bateau (ship) est défini par sa longueur.
  La longueur d’un bateau détermine son nombre de points de vie  (life points) 
  et est fixée a la création. 
   Lorsqu’il est touché, ce nombre diminue.
   Un bateau est coulé quand son nombre de points de vie arrive `a 0.


création de Classe Answer:
dans l’eau, touché, coulé.On appelle Answer le type permettant de représenter
 les 3 réponses possibles apres une proposition d’un attaquant :MISSED,HIT et SUNK.

création de Classe Sea: 

Le plateau de jeu.La classe représentant le plateau (board) s’appelle Sea. 
 On décide de représenter son etat par un tableau a 2 dimensions de cases.
   La classe Cell permet de représenter les cases.


**/


/*FisrtBattleshipMain : Ce code est la classe principale de votre jeu de Bataille Navale.
 *  Elle utilise différentes classes pour créer et afficher une grille de la mer et
 *   un navire sur cette grille.

Il définit la largeur et la longueur de la grille avec width et length, respectivement.
 Il définit également la position du navire en utilisant x et y.

Ensuite, une instance de la classe Sea est créée en utilisant les valeurs de width et length.
 Une instance de la classe Ship est également créée en utilisant la taille du navire 1.
  Enfin, une instance de la classe Position est créée en utilisant les valeurs de x et y.

La méthode addShip est appelée sur l'objet sea pour ajouter le navire à la grille de la mer
 à la position donnée. La méthode display est appelée pour afficher la grille de la mer,
  avec une option pour afficher ou masquer les navires.

La méthode shoot est appelée sur l'objet sea pour simuler un tir sur la grille à la position donnée.
 Enfin, la méthode display est appelée à nouveau pour afficher l'état de la grille de la mer après le tir.

*/

/* SecondBattleShipMain : Ce code est une autre classe principale pour votre jeu de Bataille Navale.
 *  Il utilise les mêmes classes que la première classe principale, 
 *  mais il ajoute également une instance de la classe Game.

Il définit la largeur et la longueur de la grille de mer avec width et length, respectivement.
 Il définit également les positions de deux navires sur la grille en utilisant x1, y1, x2 et y2.

Ensuite, une instance de la classe Sea est créée en utilisant les valeurs de width et length.
 Deux instances de la classe Ship sont également créées en utilisant la taille du navire 1.
  Deux instances de la classe Position sont également créées en utilisant les valeurs de x1, y1, x2 et y2.

Les méthodes addShip sont appelées sur l'objet sea pour ajouter les deux navires à la grille 
de la mer à leurs positions respectives. La méthode display est appelée pour afficher 
la grille de la mer avec les navires.

Enfin, une instance de la classe Game est créée en utilisant l'objet sea,
 et la méthode play est appelée sur cet objet pour commencer à jouer à la Bataille Navale.
*/



/* ThirdBattleShipMain : Ce code est une autre classe principale pour votre jeu de Bataille Navale.
 *  Il utilise les mêmes classes que les deux précédentes classe principales.

Il définit la grille de mer en utilisant la largeur et la longueur définies à 10 chacune.
 Il crée également deux instances de la classe Ship, l'une avec une taille de 3 et l'autre avec une
  taille de 2.

Ensuite, une instance de la classe Position est créée avec les valeurs de x et y définies à 5. 
La méthode addShipHorizontally est appelée sur l'objet sea pour ajouter le navire de taille 3
 à la grille de la mer à la position définie. La méthode display est appelée pour 
 afficher la grille de la mer avec le navire.

Enfin, une instance de la classe Game est créée en utilisant l'objet sea,
 et la méthode play est appelée sur cet objet pour commencer à jouer à la Bataille Navale.
 */
 

/* La classe Answer : Cette classe représente l'énumération Answer qui a 3 valeurs 
 * différentes : hit, Sunk et missed. Cette énumération peut être utilisée pour représenter
 *  les différents résultats possibles après un tir sur un navire dans le jeu de Bataille Navale.

La valeur hit représente un coup qui touche un navire.
 La valeur Sunk représente un coup qui a coulé le navire. 
 La valeur missed représente un coup qui a raté le navire.
*/

/* La classe Cell : This is a class definition for the "Cell" class in a Battleship game.
 *  The class has properties and methods related to a single cell in the game grid.


La propriété ship représente le navire qui est placé sur la cellule.
La propriété shot permet de savoir si la cellule a été abattue ou non.
La classe fournit des méthodes pour :

Vérifiez si la cellule est vide ou non avec isEmpty().
Suivez les prises de vue avec la méthode shot() , qui renvoie le résultat de la prise de vue sous 
la forme d'un type énuméré Answer.
Obtenez et définissez le vaisseau placé sur la cellule avec getShip() et setShip().
Vérifiez l'état de tir de la cellule avec hasBeenShot().
Représentez la cellule sous la forme d'un caractère avec toCharacter(boolean defender).
Le paramètre defender détermine si la cellule est affichée à partir de
la perspective du défenseur ou de l'attaquant. */

/* La classe Game : Ce code définit une classe "Game" qui implémente la fonctionnalité
 * du jeu de cuirassé. La classe a un constructeur qui prend un objet Sea comme
 * une entrée et la stocke dans la variable membre de la mer. La méthode de jeu implémente 
 * la boucle de jeu principale,
 * qui continue jusqu'à ce que tous les navires soient coulés.
 *  L'utilisateur peut saisir sa position de tir,
 * qui est ensuite passé à la méthode shoot de l'objet Sea.
 * Le résultat du tir est affiché à l'utilisateur avec des messages tels que "manqué",
 *  "coup" ou "coulé".
 * La méthode inputPosition prend l'entrée de l'utilisateur pour la position de prise
 *  de vue et la renvoie sous la forme d'un objet Position.
 * Les méthodes letterPos et intPos sont utilisées pour convertir la lettre 
 * et l'entier saisis par l'utilisateur
 * en indices entiers pour l'objet Position.*/


/* La classe Sea : Il s'agit d'une classe Sea pour le jeu Battleship en Java.
 * La classe a les méthodes suivantes :
Un constructeur qui prend largeur et longueur comme arguments,
 crée un tableau à deux dimensions d'objets "Cell" et initialise chaque cellule avec un nouvel objet Cell.
Méthodes addShipVertically et addShipHorizontally pour placer le navire sur la mer.
 Ils vérifient si le navire peut être placé verticalement ou horizontalement,
 lever une exception si le placement n'est pas possible.
addShip pour ajouter le navire à une position spécifique.
tirer pour tirer sur une cellule sur le plateau par l'ennemi.
getRemainingLifePoints pour obtenir les points de vie restants de tous les navires en mer.
Remarque : Le code comporte des fautes de frappe et des problèmes, par ex. dans la méthode
 getRemainingLifePoints,
 il y a une faute de frappe dans la condition de boucle et la méthode ne renvoie rien.
*/

/* La classe Ship : C'est une classe Java qui représente un "Ship" dans un jeu Battleship.
 * La classe a 3 méthodes :

getLifePoints() renvoie le nombre de points de vie dont dispose le vaisseau.
hasBeenSunk() renvoie un booléen indiquant si le navire a été coulé (c'est-à-dire que ses points de vie
 sont 0).
beenHitting() réduit les points de vie du vaisseau de 1.
La classe a également un champ privé lifePoints qui représente le nombre
de points de vie dont dispose le navire.
Le constructeur Ship(int leng) définit la valeur initiale de lifePoints sur la valeur de l'argument long.*/

/* La classe Position : C'est le code de la classe Position dans le package battleship.util.
 * La classe Position représente une position 2D dans un environnement donné et est déterminée par deux
 * valeurs entières, x et y, représentant les coordonnées x et y. 
 * La classe a les méthodes suivantes :
public Position(int x, int y) : un constructeur qui crée un nouvel objet position avec
 les valeurs x et y données.
public int getX() : une méthode getter qui renvoie la valeur de x.
public int getY() : une méthode getter qui renvoie la valeur de y.
public boolean equals(Object o) : une méthode qui renvoie true si
 l'objet position est égal à l'Objet passé en paramètre (o) et a les mêmes valeurs x et y.
public String toString() : une méthode qui renvoie une représentation sous forme de chaîne de la position
objet au format "x , y". */
















