package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Combat {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion champA, champB;
		System.out.println("Combat");
		System.out.println("Insert first champion data.");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Inicial life: ");
		int life = sc.nextInt();
		System.out.print("Attack: ");
		int attack = sc.nextInt();
		System.out.print("Armor: ");
		int armor = sc.nextInt();
		System.out.println(" ");
		champA = new Champion(name, life, attack, armor);
		
		System.out.println("Insert second champion data.");
		sc.nextLine();
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Inicial life: ");
		life = sc.nextInt();
		System.out.print("Attack: ");
		attack = sc.nextInt();
		System.out.print("Armor: ");
		armor = sc.nextInt();
		System.out.println(" ");
		champB = new Champion(name, life, attack, armor);
		
		System.out.print("How many turns do you want to run? ");
		int turns = sc.nextInt();
		System.out.println(" ");
		
		for(int i = 0; i < turns; i++) {
			champA.takeDamange(champB);
			champB.takeDamange(champA);
			
			System.out.printf("\nTurn result \n", (i + 1));
			System.out.println(champA.status());
			System.out.println(champB.status());
			
			if(champA.getLife() <= 0 || champB.getLife() <= 0) {
				break;
			}
		}
		
		System.out.printf("\nEND OF COMBAT!");
		sc.close();
	}

}
