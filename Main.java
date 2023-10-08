public class Main {
    public static void main(String[] args) {
        ConcreteFootballTeam realMadrid=new ConcreteFootballTeam("Real Madrid");
        FootballTeam defender = new FootballTeamDefender(realMadrid);
        System.out.println(defender.getTeamName());

        FootballPlayer centerMidfield =new FootballPlayer("Jude","Bellingham");
        defender.addPlayer(centerMidfield);
        System.out.println(centerMidfield.getName()+" " + centerMidfield.getSurname());


        ConcreteFootballTeam MancherterCity=new ConcreteFootballTeam("MancherterCity");
        FootballTeam forward=new FootballTeamAttacker(MancherterCity);
        System.out.println(forward.getTeamName());

        FootballPlayer CenterForward=new FootballPlayer("Erling","Holland");
        forward.addPlayer(CenterForward);
        System.out.println(CenterForward.getName()+" "+CenterForward.getSurname());


        ConcreteFootballTeam Bayern=new ConcreteFootballTeam("Bayern");
        FootballTeam goalkeeper=new FootballTeamGoalKeeper(Bayern);
        System.out.println(goalkeeper.getTeamName());

        FootballPlayer Goalkeeper=new FootballPlayer("Manuel","Neuer");
        goalkeeper.addPlayer(Goalkeeper);
        System.out.println(Goalkeeper.getName()+" "+Goalkeeper.getSurname());

    }
}
