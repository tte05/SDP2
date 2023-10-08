public abstract class FootballTeamDecorator implements FootballTeam{
    FootballTeam team;

    public FootballTeamDecorator(FootballTeam team){
        this.team=team;
    }

    public FootballTeamDecorator() {

    }

    @Override
    public String getTeamName(){
        return team.getTeamName();
    }
}