package ParkTicketProgram;

public class CalendarAge {
	
	private static int customerAge;
	private static int ticketType;

	public void ageCalculator() {
		InputData ipDt = new InputData();
		int idNumbers[] = ipDt.getIdNumbers();
		int birthYear = 0;
		
		if(idNumbers[6] == 1 || idNumbers[6] == 2) {
			birthYear = (idNumbers[0] * 10) + idNumbers[1] + ParkTicketProgramMain.ConstValue.BEFORE_MILL;
		} else if(idNumbers[6] == 3 || idNumbers[6] == 4) {
			birthYear = (idNumbers[0] * 10) + idNumbers[1] + ParkTicketProgramMain.ConstValue.AFTER_MILL;
		}
		
		int birthMon = (idNumbers[2] * 10) + idNumbers[3];
		int birthDate = (idNumbers[4] * 10) + idNumbers[5];
	
		if(birthMon > ParkTicketProgramMain.ConstValue.NOW_MON || (birthMon == ParkTicketProgramMain.ConstValue.NOW_MON && birthDate > ParkTicketProgramMain.ConstValue.NOW_DATE)) {
			customerAge = ParkTicketProgramMain.ConstValue.NOW_YEAR - birthYear - 1;
		} else {
			customerAge = ParkTicketProgramMain.ConstValue.NOW_YEAR - birthYear;
		}
	}
	
	public void ticketTypeFinder() {
		final int TYPE_CALENDAR[][] = {
				{1,2,2,1,1,2,2,2,2,2,1,1,2,2,2,2,2,0,0,1,1,1,1,1,0,0,1,1,1,1,1}, // MARCH
				{3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3}, // APRIL
				{3,0,0,0,3,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,3,0,0}, // MAY
				{0,0,3,3,3,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1}, // JUNE
				{0,0,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1,0,0,0}, // JULY
				{0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1}, // AUGUST
				{0,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0,0,3,3,3}, // SEPTEMBER
				{3,3,3,0,0,0,3,3,3,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0}, // OCTOBER
				{0,0,0,3,3,0,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1}, // NOVEMBER
				{2,1,1,2,2,2,2,2,1,1,2,2,2,2,2,1,1,2,2,2,2,2,0,0,0,2,2,2,2,0,0}}; //DECEMBER
		
		ticketType = TYPE_CALENDAR[ParkTicketProgramMain.ConstValue.NOW_MON - 3][ParkTicketProgramMain.ConstValue.NOW_DATE - 1];	
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public int getTicketType() {
		return ticketType;
	}

	public char getTicketTypeToChar() {
		final char TYPES[] = {'A','B','C','D'};
		return TYPES[ticketType];
	}
	
}
