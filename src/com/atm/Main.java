package com.atm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    AtmMachine mc = new AtmMachine();
	    try {
	    Scanner sc = new Scanner(System.in);
	    if(mc.chkPIN(sc)) {
	    	mc.menu();	
	    	int option = sc.nextInt();
	   	    while(option !=0) {
	   	    mc.operation(option,sc);
	   	    mc.menu();
	   	    option = sc.nextInt();
	   	    }
	   	    System.out.println("Thanks for using the Application");
	   	    sc.close();
	    }
	    }catch(Exception e) {
	    System.out.println("Exception : " + e);	
	    }
	    }
	  

}
