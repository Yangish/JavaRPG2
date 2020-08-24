package main;

import player.PlayerClass;
import enemies.Zombie;

import java.util.Scanner;

// This is going to be where the entire game is run. It might be a thread, it might not be. 
public class MainProgram {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What is your name?"); 
		String name = userInput.next();
		
		PlayerClass player = new PlayerClass(name);
		
		System.out.println(name + "'s Health: " + player.getHealth());
		System.out.println(name +"'s Armor: " + player.getArmor());
		System.out.println(name + "'s Damage: " + player.getDamage());
		System.out.println(name + "'s Name: " + player.getName());
		
		System.out.println();
		
		Zombie zombie = new Zombie();
		
		System.out.println("Zombie's Health: " + zombie.getHealth());
		System.out.println("Zombie's Armor: " + zombie.getArmor());
		System.out.println("Zombie's Damage: " + zombie.getDamage());
		System.out.println("Zombie's Name: " + zombie.getName());
	}

}
