package interface_and_abstraction.dota2;

import interface_and_abstraction.dota2.DarkTeam;
import interface_and_abstraction.dota2.LightTeam;
import interface_and_abstraction.dota2.heroes.*;
import some_memes.A;

public class Game {
    public static void main(String[] args) {
        System.out.println("loading...");

        DarkTeam darkTeam = new DarkTeam(new Aphro(), new IO(), new Thor(), new Furion(), new Odin());

    }
}
