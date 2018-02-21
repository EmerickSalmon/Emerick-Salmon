# Design Pattern Strategy #

## Utilité ##

Ce design patern consiste à encapsuler des algorithmes et à les rendre dynamiques.
On peut ainsi choisir de les changer pendant l'execution du programme.

## Illustration ##

Dans cet exemple nous créerons des voitures de types differents.
Les fonctions permettant de décrire les types de voitures et de motorisations seront écrites en dur dans le code source ex: *System.out.println("Essence")*. Nous devrons donc les rendre dynamiques pour pouvoir choisir l'algorithme voulu.

## Fonctionnement ##

Pour choisir d'afficher essence ou diesel nous allons ecrire deux classes implémentant une interface *TypeMoteur*. Une classe dira *Essence* l'autre *Diesel*
Et les véhicules que nous allons créer seront des classes filles de la classe abstraite .. voiture qui elle même contiendra entre autre un objet de type *TypeMoteur*.

Nous pourrons donc a tout moment dire que le typeMoteur est *Essence* ou *Diesel* en utilisant un simple set.

![UML de classe Strategy](https://github.com/EmerickSalmon/Emerick-Salmon/blob/master/DesignPatterns/src/strategy/Image/Diagrammedeclasses.png)



##### Executons le code #####

Premier essai on crée une Smart et on appelle la fonction afficher, puis on fait de même avec un fourgon.
Parfait pour la Smart les types par defaut conviennent bien. En revanche pour le fourgon ça ne va pas.

![UML de classe Strategy](https://github.com/EmerickSalmon/Emerick-Salmon/blob/master/DesignPatterns/src/strategy/Image/Capture1.png)

Deuxième essai, comme nous avons encapsulé et rendu dynamiques les algorithmes de descriptions, il nous suffit de les changer, faisons le.
* fourgon.setTypeVoiture(new TypeCamionette()); (Cette classe contient System.out.println("Camionette"));
* fourgon.setTypeMoteur(new MoteurDiesel()); (Cette classe contient System.out.println("Diesel"));

Voyons le resustat.

![UML de classe Strategy](https://github.com/EmerickSalmon/Emerick-Salmon/blob/master/DesignPatterns/src/strategy/Image/Capture2.png)

Voila l'utilité du Design Pattern Strategy

