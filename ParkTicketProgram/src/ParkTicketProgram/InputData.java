package ParkTicketProgram;

import java.util.Scanner;

public class InputData {
	
	Scanner scanner = new Scanner(System.in);
	private static String languageSelection;
	private static int idNumbers[] = new int[7];
	private static int ticketCount; 
	private static int preferOption;
	private static int endOption;
	private static String idNum;
	
	public int getLanguageSelection() {
		int languageNum = 0;
		if (languageSelection.contains("US")) {
			languageNum = 0;
		} else if (languageSelection.contains("KR")) {
			languageNum = 1;
		} else if (languageSelection.contains("JP")) {
			languageNum = 2;
		}
		return languageNum;
	}

	public void setLanguageSelection() {
		languageSelection = ConstValue.LocaleToString;
	}



	public void setIdNumbers() {
		String idNumber;
		do {
		idNumber = scanner.next();
		} while (idNumber.length() != 13);
		
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
		do {
		ticketCount = scanner.nextInt();
		} while(ticketCount > 10 || ticketCount < 1);
	}

	public int getPreferOption() {
		return preferOption;
	}

	public void setPreferOption() {
		do {
		preferOption = scanner.nextInt();
		} while (preferOption > 5 || preferOption < 1);
	}

	public int getEndOption() {
		return endOption;
	}

	public void setEndOption() {
		do {
		endOption = scanner.nextInt();
		} while (endOption < 1 || endOption > 2);
	}

	public String getIdNum() {
		return idNum;
	}
}
