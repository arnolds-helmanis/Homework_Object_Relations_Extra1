# Homework_Object_Relations_Extra1
Homework in university.
Task 1:
➔ Create classes 'Team' and 'Player'. 'Player' object should have at least 3 parameters(jersey number, name and height(cm))
➔ In the 'Team' class, a list of 'Player' class objects
➔ In the 'Player' class a 'Team' team variable
➔ 'Player' class have two constructors - one with a given 'Team' and one without it
➔ One-to-many relations = several players for one team
➔ Create 2 methods to add a player to a team: Team.addPlayer(Player player) and Player.addToTeam(Team team)
Task 2:
➔ Create first task class objects, add players to teams
➔ In the 'Team' class, achieve method chaining to implement team.addPlayer(p1).addPlayer(p2).addPlayer(p3)
Task 3:
➔ Create a method for the 'Team' isJerseyNumFree(int num) - determines if no team player has taken the given number
➔ Use the Team.addPlayer() method to print an error message when trying to add a player to a team with a jersey number that someone already has
➔ Create a method for the 'Team' class getTallestPlayer()
➔ Use made methods
