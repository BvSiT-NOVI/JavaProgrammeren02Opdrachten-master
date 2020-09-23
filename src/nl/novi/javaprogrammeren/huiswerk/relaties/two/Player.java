package nl.novi.javaprogrammeren.huiswerk.relaties.two;

public class Player {
    private String name;
    private Club club;

    public Player(String name, Club club) {
        this.name = name;
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Club getClub() {
        return club;
    }

    //? Je zou eigenlijk willen dat setClub alleen is aan te roepen vanuit Club om te voorkomen dat je wel hier een club instelt
    // maar dat de lijst van Players in de club niet is geupdate? Hoe zou dat kunnen?

    public void setClub(Club club) {
        this.club = club;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Naam speler: ").append(name).
                append("\r\nClub: ").append(club.getName()).
                append("\r\nCompetitie: ").append(club.getLeague().getName());
        return sb.toString();
    }
}
