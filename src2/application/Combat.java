package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Combat {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion champ = new Champion();
		System.out.println("Combat");
		System.out.println("Insert first champion data.");
		System.out.print("Name: ");
		champ.setFirstName(sc.nextLine());
		System.out.print("Inicial life: ");
		champ.setFirstLife(sc.nextInt());
		System.out.print("Attack: ");
		champ.setFirstAttack(sc.nextInt());
		System.out.print("Armor: ");
		champ.setFirstArmor(sc.nextInt());
		System.out.println(" ");
		
		System.out.println("Insert second champion data.");
		sc.nextLine();
		System.out.print("Name: ");
		champ.setSecondName(sc.nextLine());
		System.out.print("Inicial life: ");
		champ.setSecondLife(sc.nextInt());
		System.out.print("Attack: ");
		champ.setSecondAttack(sc.nextInt());
		System.out.print("Armor: ");
		champ.setSecondArmor(sc.nextInt());
		System.out.println(" ");
		
		System.out.print("How many turns do you want to run? ");
		int turns = sc.nextInt();
		System.out.println(" ");
		
		for(int i = 0; i < turns; i++) {
			System.out.println("Turn result " + (i + 1));
			System.out.println(champ.getFirstName() + ": " + champ.getDamange());
			System.out.println(champ.getSecondName() + ": " + champ.getDamange());
			System.out.println(" ");
		}
		
		sc.close();
	}

}
