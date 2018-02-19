# Design Pattern Strategy #

## Utilité ##

Ce design patern consiste à encapsuler des algorithmes et à les rendre dynamique.
On peut ainsi choisir de les changer pendant l'execution du programe.

## Ulistration ##

Dans cette exemple nous crérons des voiture de type differents.
Les fonction permettant de décrire les types de voitures et de motorisations serons écrite en dure dans le code source ex: *System.out.println("Essence")*. Nous devrons donc les rendre dynamique pour pouvoir choisir l'algorithme voulu.

## Fonctionement ##

Pour choisir d'afficher essence ou diesel nous allons ecrire deux classes implementant une interface *TypeMoteur*. Une classe dira *Essence* l'autre *Diesel*
Et les véhicules que nous alons créer seront des classes fille de la classe abstraite .. voiture qui elle même contiendra entre autre un objet de type *TypeMoteur*.

Nous pourons donc a tous moment dire que le typeMoteur est *Essence* ou *Diesel* en utilisant un simple set.

![UML de classe Strategy](https://github.com/EmerickSalmon/Emerick-Salmon/blob/master/DesignPatterns/src/strategy/Image/Diagrammedeclasses.png)



##### Executons le code #####

Premier essai on créer une Smart et on appel la fonction afficher, puis on fait de même avec un fourgon.
Parfait pour la Smart les types par defaut conviennent bien. En revanche pour le fourgon ça ne va pas.

![UML de classe Strategy](https://github.com/EmerickSalmon/Emerick-Salmon/blob/master/DesignPatterns/src/strategy/Image/Capture1.png)

Deuxième essai, comme nous avons acapsulé et rendu dynamique les algorithmes de descriptions il nous suffit de les changer, faisons le.
* fourgon.setTypeVoiture(new TypeCamionette()); (Cette classe contient System.out.println("Camionette"));
* fourgon.setTypeMoteur(new MoteurDiesel()); (Cette classe contient System.out.println("Diesel"));

Voyons le resustat.

![UML de classe Strategy](https://github.com/EmerickSalmon/Emerick-Salmon/blob/master/DesignPatterns/src/strategy/Image/Capture2.png)

Voila l'utilité du Design Pattern Strategy

