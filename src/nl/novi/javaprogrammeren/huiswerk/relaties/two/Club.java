package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import nl.novi.javaprogrammeren.huiswerk.relaties.one.Car;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private String name;
    private League league;
    private List<Player> playerList;

    public Club(String name, League league) {
        this.name = name;
        this.league = league;
        playerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public void setPlayerList(List<Player> playerList) {
        if (playerList.size()>=18 && playerList.size()<=25){
            this.playerList = playerList;
            for (Player player:playerList){
                player.setClub(this);
            }
        }
    }

    public void addPlayers(Player... players){
        if (playerList.size()+players.length>=18){
            for (Player player:players){
                if (playerList.size()<25) {
                    playerList.add(player);//TODO check unique?
                    player.setClub(this);
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Naam : ").append(name);
        sb.append("\r\n").append("Aantal spelers: ").append(playerList.size());
        for (Player player: playerList){
            sb.append("\r\n").append(player.getName());
        }
        return sb.toString();
    }
}
