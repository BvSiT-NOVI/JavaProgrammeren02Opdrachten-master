package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class League {
    private String name;
    private List<Club> clubList;

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addClubs(List<Club> clubList){
        if (clubList.size()==18){
           this.clubList = new ArrayList<>(clubList);//TODO check unique club names?
            for (Club club: clubList){
                club.setLeague(this);
            }
        }
    }

    //? Hoe toString() method veralgemeniseren voor soortgelijke klassen met een lijst?
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Naam : ").append(name);
        sb.append("\r\n").append("Aantal clubs: ").append(clubList.size());
        for (Club club: clubList){
            sb.append("\r\n").append(club.getName());
        }
        return sb.toString();
    }

}
