package interface_and_abstraction.dota2;

public class Map {
    DarkTeam darkTeam;
    LightTeam lightTeam;

    public Map(DarkTeam darkTeam, LightTeam lightTeam) {
        this.darkTeam = darkTeam;
        this.lightTeam = lightTeam;
    }
}
