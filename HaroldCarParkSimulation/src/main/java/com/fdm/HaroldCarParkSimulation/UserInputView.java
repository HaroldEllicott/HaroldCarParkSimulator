package com.fdm.HaroldCarParkSimulation;

import java.util.Scanner;

public class UserInputView implements IView {
	
	Scanner scanner = new Scanner(System.in);
	@Override
	public Scanner scannerInput() {
		Scanner scanner = new Scanner(System.in);
		
		return scanner;
	}
	
	public void println(String message) {
		System.out.println(message);
	}
	
	public int nextInt() {
		int spacesAvailable = scanner.nextInt();
		
		return spacesAvailable;
	}
	
	public String nextLine() {
		String inputEvent = scanner.nextLine();
		
		return inputEvent;
	}
	
	public boolean hasNextLine() {
		boolean inputCheck = scanner.hasNextLine();
		
		return inputCheck;
	}
	
}