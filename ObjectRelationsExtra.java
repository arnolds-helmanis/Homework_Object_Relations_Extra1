package Object_relations;

public class ObjectRelationsExtra {

	public static void main(String[] args) {
		Team team1 = new Team("Dogs");
		Team team2 = new Team("Cats");
		
		Player p1 = new Player("Jim", 196, 44);
		Player p2 = new Player("John", 210, 22);
		Player p3 = new Player("Bill", 160, 15, team1);
		Player p4 = new Player("Kate", 152, 1);
		Player p5 = new Player("Ann", 166, 3);
		Player p6 = new Player("Becky", 170, 32, team2);
		
		team1.addPlayer(p1);
		team2.addPlayer(p1);
		team1.addPlayer(p2);
		p3.addToTeam(team1);
		p6.addToTeam(team2);
		team1.isJerseyNumFree(22);
		team2.addPlayer(p4);
		team2.addPlayer(p5);
		team1.getTallestPlayer();
		team2.getTallestPlayer();

	}

}
