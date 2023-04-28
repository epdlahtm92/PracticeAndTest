package ParkTicketProgramMain;

import java.util.Scanner;

public class InputDataMain {
	
	Scanner scanner = null;
	private static int programChoose;
	
	public InputDataMain() {
		scanner = new Scanner(System.in);
	}
	
	public int getProgramChoose() {
		return programChoose;
	}
	
	public void setProgramChoose() {
		do {
		programChoose = scanner.nextInt();
		} while (programChoose < 1 || programChoose >2);
	} 
	
}
	
