import java.util.ArrayList;
import java.util.List;

class ConcreteFootballTeam implements FootballTeam {

    private final String teamName;
    private final List<FootballPlayer> players;

    public ConcreteFootballTeam(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayers(FootballPlayer players) {
        players.add(players);
    }

    public List<FootballPlayer> getPlayers() {
        return players;
    }

    @Override
    public String getTeamName() {
        return teamName;

    }

    @Override
    public void addPlayer(FootballPlayer player) {

    }

}
