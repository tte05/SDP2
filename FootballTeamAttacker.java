public class FootballTeamAttacker extends FootballTeamDecorator{
    public FootballTeamAttacker(FootballTeam team){
        super(team);
    }

    @Override
    public String getTeamName(){
        return super.getTeamName() + "(Attacker)";
    }

    @Override
    public void addPlayer(FootballPlayer centerMidfield) {

    }
}