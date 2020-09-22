package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.Random;

public class MainBird {

    /*
    Geef de klasse Bird de volgende instance variables: nickname, species, ringNumber
    De species en ringNumber variables mogen na instantiatie niet meer aangepast worden.

    Geef de klasse BirdOwner de volgende instance variables: name, sex.
    Er zijn geen restricties op getters en setters.

    Programmeer de volgende relatie.
    Een BirdOwner kan een oneindig aantal vogels hebben. Elke vogel mag echter maar 1 keer in de lijst voorkomen.
    Er mag geen List via de constructor gevuld worden. Dit moet via een methode.

    Maak een toString()-methode die het volgende afdrukt: Naam van eigenaar en van elke vogel de nickname en
    serienummer.

    Uitdagend:
    1. Zorg ervoor dat de BirdOwner minimaal 20 Bird-objecten heeft.
    2. De BirdOwner mag van de gemeente nog maar 10 Vogels houden. Hij wil random 5 vrouwtjes en vijf mannetjes kiezen.
    Schrijf een methode die dit doet en de vijf random gekozen mannetjes en de vijf random gekozen vrouwtjes uitprint.

     */

    public static void main(String[] args) {
        BirdOwner birdOwner1=new BirdOwner("Jan Hoekstra","man");
        Random random=new Random();
        for (int i=1;i<=20;i++){
            String species = (random.nextBoolean())?"mannetje":"vrouwtje";
            birdOwner1.addBird(new Bird("Duif"+i,species,"00000"+i));
        }
        System.out.println(birdOwner1.toString());
        System.out.println((birdOwner1.chooseRandomBirds(10)));
    }
}
