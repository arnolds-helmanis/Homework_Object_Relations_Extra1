package Object_relations;

import java.util.HashSet;

public class Team {
	String name;
	HashSet<Player> team = new HashSet<Player>();
	
	Team(String name) {
		this.name = name;
	}
	
	void addPlayer(Player player) {
		if (player.team != null) {
			System.out.println(player.name + " is already playing for the team '" + player.team.name + "'.");
			return;
		}
		boolean test = isJerseyNumFree(player.jersey);
		if (test) {
			this.team.add(player);
			player.team = this;
			System.out.println(player.name + " was succesfully added to the team '" + this.name + "'.");
		} else {
			System.out.println("In the team '" + this.name + "' already is a player with a jersey number '" + player.jersey + "'. " + player.name + " have to choose a different jersey number.");
		}
	}
	
	boolean isJerseyNumFree(int num) {
		for (Player player : team) {
			if (player.jersey == num) {
				System.out.println("Jersey number " + num + " is taken, please choose a different one.");
				return false;
			}
		}
		System.out.println("Yes, jersey number " + num + " is available.");
		return true;
	}
	
	void getTallestPlayer() {
		int max = 0;
		if (this.team.size() == 0) {
			System.out.println("There are no players in this team.");
			return;
		}
		Player[] temp = this.team.toArray(new Player[this.team.size()]);
		Player tallest = temp[0];
		for (Player player : temp) {
			if (player.height > max) {
				max = player.height;
				tallest = player;
			}
		}
		System.out.println("Tallest player in '" + this.name + "' is " + tallest.name + " with a height of " + max + " centimeters.");
	}

}
