package player;

public abstract class Entity {
	
	private String name;
	private int health;
	private int damage;
	private int armor;

	public Entity(String name, int health, int armor, int damage) {
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.armor = armor;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getName() {
		return this.name;
	}

	public int getHealth() {
		return this.health;
	}

	public int getArmor() {
		return this.armor;
	}

	public int getDamage() {
		return this.damage;
	}

}
