package main;

import java.text.ParseException;
import java.util.Scanner;

import entities.User;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		User user = new User();
		
		System.out.println("Enter account number: ");
		int accNumber = Integer.parseInt(scanner.nextLine());
		user.setNumber(accNumber);
		
		System.out.println("Enter account holder: ");
		String accName = scanner.nextLine();
		user.setName(accName);
		System.out.println("Is there an initial deposit (y/n)?");
		String initialDeposit = scanner.nextLine();
		if (initialDeposit.equalsIgnoreCase("y")) {
			System.out.println("Enter a deposit value: ");
			double valueDeposit = scanner.nextDouble();
			user.addBalance(valueDeposit);
			System.out.println(user.toString());
		}else {
			System.out.println("Error! ");
			
		}
		
		
		
		
		
		
	}

}
