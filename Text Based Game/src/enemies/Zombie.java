package enemies;

// this is the class for the zombie enemy that the player will encounter
public class Zombie {
	
	static int health; // how much health the zombie has
	static int damage; // how much damage that the zombie deals
	static int armor; // how much armor the zombie has
	static String name; // the name of the zombie, which will be, "Zombie"
	
	public Zombie() {
		setHealth(25);
		setDamage(5);
		setArmor(2);
		setName("Zombie");
	}

	public static int getHealth() {
		return health;
	}

	public static void setHealth(int health) {
		Zombie.health = health;
	}

	public static int getDamage() {
		return damage;
	}

	public static void setDamage(int damage) {
		Zombie.damage = damage;
	}

	public static int getArmor() {
		return armor;
	}

	public static void setArmor(int armor) {
		Zombie.armor = armor;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Zombie.name = name;
	}
	
	
	
}
