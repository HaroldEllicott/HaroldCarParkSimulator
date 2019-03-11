package com.fdm.HaroldCarParkSimulation;

import java.util.Scanner;

public interface IView {
	public Scanner scannerInput();
	public void println(String message);
	public int nextInt();
	public String nextLine();
	public boolean hasNextLine();
}
