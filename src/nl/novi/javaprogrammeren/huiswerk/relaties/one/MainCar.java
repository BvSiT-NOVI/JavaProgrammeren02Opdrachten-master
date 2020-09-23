package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class MainCar {
    /*
    Maak de volgende drie klassen:
    CarOwner, Car, CarDealer.

    Verzin zelf wat simpele instance variables bij CarOwner en CarDealer.
    Car heeft: kenteken, merk, subtype, aantalKmGereden

    Een CarOwner kan 0 of meerdere auto's hebben.
    Een CarDealer kan 0 of meerdere auto's hebben.
    Een Car kan 0 of 1 owner hebben (alleen CarOwner-klasse). Wanneer de auto bij de dealer staat is de carowner
    leeg (null).

    Voeg aan de CarDealer een methode toe die een auto vanuit zijn garage kan overschrijven naar de CarOwner. Zowel
    de list van CarOwner moet dan uitgebreid worden als de eigenaar van de Car moet aangepast worden. We hebben het hier
    dus over een bidirectionele relatie!

    Zorg ervoor dat alleen unieke auto's op basis van een kenteken aan de List van CarDealer en CarOwner toegevoegd
    kunnen worden.

    Extra: Voeg een variabele leeftijd toe aan CarOwner. Check daarna altijd of de CarOwner wel 18 of ouder is.

     */
    public static void main(String[] args) {
        Car car = new Car("ABCD","Peugeot 206",10000);
        CarDealer carDealer = new CarDealer("Jansen","Hoofdstraat 10","Amsterdam");
        carDealer.addCar(car);
        //Volgende auto wordt niet toegevoegd vanwege niet uniek kenteken
        Car car2 = new Car("ABCD","Volkswagen",10000);

        System.out.println(carDealer.toString());

        CarOwner carOwner = new CarOwner("Piet","man");

        System.out.println("Poging om auto te leveren aan "+carOwner.getName());
        carDealer.changeOwner(car,carOwner);

        System.out.println(carDealer.toString());
        System.out.println(carOwner.toString());

        carOwner.setLeeftijd(18);
        System.out.println("Piet is nu "+carOwner.getLeeftijd()+ " jaar oud.");

        System.out.println("Poging om auto te leveren aan "+carOwner.getName());
        carDealer.changeOwner(car,carOwner);

        System.out.println(carDealer.toString());
        System.out.println(carOwner.toString());




    }
}
