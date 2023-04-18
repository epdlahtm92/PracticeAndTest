package ParkTicketProgram;

import java.util.Scanner;

public class InputData {
	Scanner scanner = new Scanner(System.in);
	private static int idNumbers[] = new int[7];
	private static int ticketCount; 
	private static int preferOption;
	private static int endOption;
	private static String idNum;
	
	public void setIdNumbers() {
		String idNumber = scanner.next();
		idNum = idNumber;
		
		for (int index = 0; index < 7; index++) {
			idNumbers[index] = Character.getNumericValue(idNumber.charAt(index));
		}
	}

	public int[] getIdNumbers() {
		return idNumbers;
	}

	public int getTicketCount() {
		return ticketCount;
	}

	public void setTicketCount() {
		ticketCount = scanner.nextInt();
	}

	public int getPreferOption() {
		return preferOption;
	}

	public void setPreferOption() {
		preferOption = scanner.nextInt();
	}

	public int getEndOption() {
		return endOption;
	}

	public void setEndOption() {
		endOption = scanner.nextInt();;
	}

	public String getIdNum() {
		return idNum;
	}
}
