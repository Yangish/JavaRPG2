package player;

import items.*;

public class PlayerClass {
	
	static int health = 100; // this is the total number of hit points that the player has. once it equals 0, the player dies. 
	static int armor = 0; // starts at 0, but you can increase it by obtaining items
	static int damage = 5; // the hit points the player can deal out, but increases with items
	static String name = ""; // the name of the player
	
	// constructor
	public PlayerClass(String name) {
		this.name = name;
	}
	
	// public method to set the player's health, be it increasing or decreasing
	public static void setHealth(int health) {
		PlayerClass.health = health;
	}

	// public method to set the player's armor, be it increasing or decreasing
	public static void setArmor(int armor) {
		PlayerClass.armor = armor;
	}
	
	// public method to set the player's damage, be it increasing or decreasing
	public static void setDamage(int damage) {
		PlayerClass.damage = damage;
	}

	// public method to call for the player's health;
	public static int getHealth() {
		return health;
	}
	
	// public method to call for the player's armor
	public static int getArmor() {
		return armor;
	}
	
	// public method to call for the player's damage
	public static int getDamage() {
		return damage;
	}
	
	// public method to call for the player's name
	public static String getName() {
		return name;
	}
	
}
