package Object_relations;

public class Player {
	String name;
	int height;
	int jersey;
	Team team;
	
	Player(String name, int height, int jersey) {
		this.name = name;
		this.height = height;
		this.jersey = jersey;
	}
	
	Player(String name, int height, int jersey, Team team) {
		this.name = name;
		this.height = height;
		this.jersey = jersey;
		this.team = team;
		team.team.add(this);
	}
	
	void addToTeam(Team team) {
		if(team.team.contains(this) || this.team != null) {
			System.out.println(this.name + " already have a team - " + this.team.name);
			return;
		}
		team.team.add(this);
		this.team = team;
	}

}
