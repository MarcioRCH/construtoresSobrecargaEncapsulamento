package application;

import java.util.Locale;
import java.util.Scanner;

public class Combat {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
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
		
		System.out.println("Insert first champion data.");
		sc.nextLine();
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Inicial life: ");
		life = sc.nextInt();
		System.out.print("Attack: ");
		attack = sc.nextInt();
		System.out.print("Armor: ");
		armor = sc.nextInt();
		
		System.out.print("How many turns do you want to run? ");
		int turns = sc.nextInt();
		
		sc.close();
	}

}
