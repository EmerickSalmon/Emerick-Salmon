# Design Patterns **OBSERVER** #

## Utilité ##

Le pattern Observer permet à un ou plusieurs objets d'en observer un autre sans vraiment "se connaitre"
De plus, grace a ce pattern il est facile d'ajouter ou enlever des observateurs

## Principe de fonctionement ##

##### Deux interfaces #####
	* Observable  *implementé par l'objet observé*
	* Observateur *implémenté par l'objet observateur*

##### Les méthodes de ces interfaces #####
	* Observable
		* ajouterObservateur(Observateur o) *ajoute un objet implémentant l'interface Observateur dans une liste*
		* enleverObservateur(Observateur o) *enlève un objet implémentant l'interface Observateur de la liste*
		* avertirObservateur() *appelera une méthode precise dans chaque objet de la liste des observateur*

	* Observateur
		* rafraichir(Observable o) *appelé par la méthode avertirObservateur de l'interface Observable*

![UML de classe Observer](https://github.com/EmerickSalmon/Design-Patterns/blob/master/src/obsever/DiagrammeDeClasses.png)

##### Procédure #####
1. On crée l'objet osbervé
2. On crée le ou les objets observateurs
3. On les ajoute à la liste des objets observateurs **ajouterObservateur(Observateur o)** 
4. A chaque moment ou l'on veut que les observateur 'observent' on appelle **avertirObervateurs()** qui est une simple boucle appelant la méthode **rafrachir(Observable o)** de chaque Observateur.
5. dans notre cas, pour récupérer la donnée il faudra faire un cast sur l'objet **o**

Pour supprimer un observateur il suffit d'appeler la méthode **enleverObervateur(Observateur o)**
