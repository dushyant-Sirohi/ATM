package com.atm;

import java.util.Scanner;

public class AtmMachine {
int balance = 50000;
int PIN = 12345;

public boolean chkPIN(Scanner in){
	System.out.println("Enter Your PIN");
	try{
		int enteredPIN = in.nextInt();
		if(enteredPIN == PIN) {
			return true;
		}
		else {
			return false;
		}	
	}
	catch(Exception e) {
		System.out.println(e);
		return false;
	}
}

void operation(int option,Scanner sc) {
	try {
		switch(option) {
		case 1:
			System.out.println("Balance: "+ balance);
			break;
		case 2:
			withdraw(sc);
			break;
		case 3:
			addDeposit(sc);
			break;
		default:
			System.out.println("wrong option");
		}
	}
	catch(Exception e) {
		
	}
}

void withdraw(Scanner sc) {
	System.out.println("Enter the amount you want to withdraw :");
	try{
		int amount = sc.nextInt();
		balance -= amount;
		System.out.println("Your Current Balance is : " + balance);
	}
	catch(Exception e) {
		System.out.println("Exception: " + e);
	}
}

void addDeposit(Scanner sc) {
	System.out.println("Enter the amount you want to add :");
	try{
		int amount = sc.nextInt();
		balance += amount;
		System.out.println("Your Current Balance is : " + balance);
	}
	catch(Exception e) {
		System.out.println("Exception: " + e);
	}
}





void menu() {
	System.out.println("0. Exit");
	System.out.println("1. Check Balance");
	System.out.println("2. WithDraw");
	System.out.println("3. Add Deposit");
	System.out.println("select one option: ");

}

}
