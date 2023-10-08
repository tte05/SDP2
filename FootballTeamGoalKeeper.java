public class FootballTeamGoalKeeper extends FootballTeamDecorator{
    public FootballTeamGoalKeeper(FootballTeam team){
        super(team);
    }

    @Override
    public String getTeamName(){
        return super.getTeamName()+ "(Goalkeeper)";
    }

    @Override
    public void addPlayer(FootballPlayer centerMidfield) {

    }
}

