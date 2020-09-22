package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

public class Bird {
    private String nickname;
    private String species;
    private String ringNumber;

    public Bird(String nickname, String species, String ringNumber) {
        this.nickname = nickname;
        this.species = species;
        this.ringNumber = ringNumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSpecies() {
        return species;
    }

    public String getRingNumber() {
        return ringNumber;
    }

}
