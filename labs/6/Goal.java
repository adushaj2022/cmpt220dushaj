package lab6;

public class Goal {
	private int minute;

	private Player player;

	// Default constructor to initialize instance variables

	Goal()

	{

	minute = 0;

	player = null;

	}// End of default constructor

	// Parameterized constructor to assign parameter values to instance variables

	Goal(int min, Player p)

	{

	minute = min;

	player = p;

	}// End of parameterized constructor

	// Method to set minute

	void setMinute(int minute)

	{

	this.minute = minute;

	}// End of method

	// Method to set Player

	void setPlayer(Player player)

	{

	this.player = player;

	}// End of method

	// Method to return minute

	int getMinute()

	{

	return minute;

	}// End of method

	// Method to return Player

	Player getPlayer()

	{

	return player;

	}// End of method

	// Overrides toString() to return Goal information

	public String toString()

	{

	return "\n Minute at which the goal is scored: " + minute +

	"\n The player scored the goal: " + player.getName();

	}// End of method

	}// End of class Goal

	// Defines driver class SoccerMatch


