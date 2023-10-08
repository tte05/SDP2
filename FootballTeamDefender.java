public class FootballTeamDefender extends FootballTeamDecorator {
    public FootballTeamDefender(FootballTeam team){
    super(team);
    }


    @Override
    public String getTeamName(){
        return super.getTeamName()+ "(Defender)";
    }

    @Override
    public void addPlayer(FootballPlayer centerMidfield) {

    }
}