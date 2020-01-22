package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banc;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Banc banc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Opening a bank account");
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		
		if(option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			banc = new Banc(number, name, initialDeposit);
		}else {
			banc = new Banc(number, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(banc);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		banc.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(banc);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		banc.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(banc);
		
		sc.close();

	}

}
