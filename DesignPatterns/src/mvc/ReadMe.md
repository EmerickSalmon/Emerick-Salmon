# Design Patterns MVC #

## Utilité ##

Organiser son code
Le pattern MVC veut dire Model Vue Controleur
Il consiste donc a decouper le code en 3 parties majeures et a limiter les dépendances entre elles.
Seul le controleur connait le model et la vue, il sert d'intermediaire entre elles.
Il contrôle le declenchement des actions dans le projet

## Trois classes ##

1. Model
	* C'est lui qui va faire la partie calcul on dit aussi que c'est le coeur du programme

2. Vue
	* Comme son nom l'indique c'est la partie graphique du projet
	* Elle ne comporte que des objets graphiques, des getteur et setteur

3. Controleur
	* Il servira d'intermediaire entre le *model* et la *vue*, c'est lui qui decidera qui doit faire quoi
	* Il contiendra aussi une classe implementant l'interface ActionListener qui ecoutera le bouton de la vue

![UML de classe MVC](https://github.com/EmerickSalmon/Emerick-Salmon/blob/master/DesignPatterns/src/mvc/Diagrammedeclasses.png)


##### Procédure #####

1. On crée le Model et la Vue
2. On crée le Controleur en lui passant en parametre le Model et la Vue
3. Le controleur ajoute son ecouteur au bouton de la vue