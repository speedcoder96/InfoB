package de.uos.rt.exercise._3._2;
/**
 * A Class, showing the different abilities of birds in the aviary
 *
 * @author Kevin Trebing
 */
public class Aviary {

   public static void main(String[] args) {
      Dodo dodo = new Dodo();

      System.out.println("1: ((Bird)dodo).ability           : " + ((Bird) dodo).ability);
      /*
       * 1. Hier wird die Instanz vom Typ Dodo zu einem Bird "gecastet". An der "gecasteten" Instanz
       *   	wird der Wert des public Attributes ability aufgerufen und ausgegeben. In diesem Fall bekommt
       *    man den Wert des Attributes der Bird Klasse geliefert.
      */
      System.out.println("2: dodo.ability                   : " + dodo.ability);
      /*
       * 2. Hier wird direkt an der Instanz vom Typ Dodo gearbeitet. An der Instanz wird der Wert
       * 	des public Attribut ability aufgerufen und ausgegeben. In diesem Fall bekommt man den 
       * 	Wert des Attributes der Dodo Klasse geliefert.
       */
      System.out.println("3: dodo.getAbility()              : " + dodo.getAbility());
      /*
       * 3.	Hier wird die getAbility Methode der Dodo Instanz aufgerufen, die den Wert der getAbility
       * 	Methode der Superklasse zurückliefert. Die Superklasse des Dodos ist die Bird Klasse. In diesem Fall
       * 	bekommt man den Wert des Attributes ability der Bird Klasse geliefert.
       */
      Parrot parrot = new Parrot();
      System.out.println("4: parrot.allAbilities            : " + parrot.allAbilities());
      /*
       * 4. Hier wird die überschriebene allAbilities Methode der Instanz vom Typ Parrot aufgerufen. Der Aufruf
       * 	ruft die allAbilities Methode der Superklasse auf und hängt hinter diesem Ergebnis noch das eigene
       * 	ability Attribut der Parrot Klasse dahinter. Die Superklasse des Parrots ist die Bird Klasse. In diesem Fall
       * 	bekommt man den Wert des Attributes ability der Superklasse gefolgt von dem Wert des Attributes ability der 
       * 	Parrot Instanz geliefert.
       */
      System.out.println("5: parrot.ability                 : " + parrot.ability);
      /*
       * 5. Hier wird direkt an der Instanz vom Typ Parrot gearbeitet. An der Instanz wird der Wert
       * 	des public Attribut ability aufgerufen und ausgegeben. In diesem Fall bekommt man den 
       * 	Wert des Attributes der Parrot Klasse geliefert.
       */
      
      Bird carsten = new Dodo();
      System.out.println("6: carsten.ability                : " + carsten.ability);
      /*
       * 6. Hier ist eine Instanz vom Typ Dodo in einer Variable vom Typ Bird. Bei dem Aufruf des Attributes
       * 	ability wird jetzt der Wert der Bird Klasse geliefert, da Attribut stets statisch gebunden werden.
       */
      System.out.println("7: ((Bird)carsten).allAbilities() : " + ((Bird) carsten).allAbilities());
      /*
       * 7. Hier wird eine Instanz vom Typ Dodo die in einer Variable vom Typ Bird steckt zu einem Bird gecastet.
       * 	Der Methodenaufruf allAbilities liefert, da die Methode  stets dynamisch zur Laufzeit gebunden werden,
       * 	das Ergebnis der Methode allAbilities der Klasse Dodo. In diesem Fall bekommt man den Wert des Attributes
       * 	der Dodo Klasse.
       */
      Bird einstein = parrot;
      System.out.println("8: einstein.allAbilities()        : " + einstein.allAbilities());
      /*
       * 8. Hier wird eine Instanz vom Typ Parrot in einer Variable vom Typ Bird gesteckt. Der Methodenaufruf
       * 	von allAbilities liefert, da Methoden dynamisch zur Laufzeit gebunden werden, das Ergebnis der Methode
       * 	allAbilities der Klasse Parrot. Das Ergebnis der allAbilities Methode der Klasse Parrot liefert das Ergebnis
       * 	der allAbilities Methode der Superklasse gefolgt von dem Attribut der Klasse Parrot
       */
      System.out.println("9: einstein.getAbility()          : " + einstein.getAbility());
      /*
       * 9. Hier wird zunächst nach einer getAbility Methode in der Klasse Parrot gesucht. Da Parrot allerdings die 
       * 	getAbilitty Methode nicht überschreibt, wird das Ergebnis der getAbility Methode der Superklasse geliefert.
       * 	In diesem Fall bekommt man den Wert des Attributes der Klasse Bird gepiefert.
       */
      System.out.println("10: ((Parrot)einstein).ability    : " + ((Parrot) einstein).ability);
      /*
       * 10. Hier wird die Instanz vom Typ Parrot die in einer Bird Variable steckt zu einem Parrot "gecastet" und somit
       *	auch als Parrot aufgefasst. In diesem Fall bekommt man den Wert des Attributes der Klasse Parrot geliefert. 	
       */
   }
}
