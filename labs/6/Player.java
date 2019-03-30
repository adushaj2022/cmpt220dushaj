package lab6;

public class Player {
	

	

	// Instance variables to store player information

	private String name;

	private int goals;

	private String team;

	// Default constructor to initialize instance variables

	Player()

	{

	name = team = "";

	goals = 0;

	}// End of default constructor

	// Parameterized constructor to assign parameter values to instance variables

	Player(String name, int goal, String team)

	{

	this.name = name;

	this.goals = goal;

	this.team = team;

	}// End of parameterized constructor

	// Method to set name

	void setName(String name)

	{

	this.name = name;

	}// End of method

	// Method to set team name

	void setTeam(String team)

	{

	this.team = team;

	}// End of method

	// Method to set number of goals

	void setGoals(int goals)

	{

	this.goals = goals;

	}// End of method

	// Method to return name

	String getName()

	{

	return name;

	}// End of method

	// Method to return team name

	String getTeam()

	{

	return team;

	}// End of method

	// Method to return goals

	int getGoals()

	{

	return goals;

	}// End of method

	// Overrides toString() to return Player information

	public String toString()

	{

	return "\n Player Name: " + name + "\t Team: " + team + "\t Goals: " + goals;

	}// End of method

	}// End of class Player


