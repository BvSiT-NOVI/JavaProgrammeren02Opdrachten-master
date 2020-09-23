package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class MainFootball {

    /*
     * Programmeer de volgende relaties:
     * Een competitie kan minimaal 18 en maximaal 18 clubs hebben.
     * Een club kan bij 1 competitie horen en minimaal 18 spelers en maximaal 25 spelers hebben.
     * Een speler kan bij 1 club horen.
     *
     * Extra: Je moet via het speler object kunnen zeggen in welke competitie de speler speelt.
     */

    public static void main(String[] args) {
        League league1=new League("LeagueOne");
        League league2=new League("LeagueTwo");

        List<Player> players = new ArrayList<>();

        for (int i=0;i<16;i++){
            players.add(new Player("Player"+i,null));
        }

        List<Club> clubs = new ArrayList<>();

        for (int i=0;i<18;i++){
            clubs.add(new Club("club"+i,league1));
        }


        clubs.get(0).setPlayerList(players);
        System.out.println("Omdat het aantal spelers in de lijst < 18 is worden zij niet toegevoegd ");
        System.out.println(clubs.get(0).toString());

        for (int i=16;i<25;i++){
            players.add(new Player("Player"+i,null));
        }

        clubs.get(0).setPlayerList(players);
        System.out.println("Omdat het aantal spelers in de lijst >= 18 en < 25 wordt de lijst toegevoegd aan de club ");
        System.out.println(clubs.get(0).toString());

        System.out.println(players.get(0).toString());



    }
}
