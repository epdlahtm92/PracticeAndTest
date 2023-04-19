package ParkTicketProgram;

public class PriceCalculator {
	private static int optionTicketCost;
	private static int ageTicketCost;
	private static int totalTicketCost;
	private static int sumTicketCost = 0;
	private static int sumTicketCount = 0;
	private static int personTypeCount[] = new int[4]; // normal, elder, kid, baby 
	private static int ticketTypeCount[] = new int[5]; // normal, disabled, merit, 3kids, pregW - ipDt.PreferOption
	
	
	InputData ipDt = null;
	CalendarAge ca = null;
	
	public PriceCalculator() {
		ipDt = new InputData();
		ca = new CalendarAge();
	}
	
	public void preferOptionCalculator() {
		int preferOption = ipDt.getPreferOption() - 1;
		int ticketType = ca.getTicketType();
		optionTicketCost = ConstValue.ORIGINAL_TICKET_COSTS[ticketType] - ConstValue.OPTION_DCs[preferOption][ticketType];
		ticketTypeCount[ticketType] += 1;
	}

	public void ageDiscountCalculator() {
		int age = ca.getCustomerAge();
		int resCost = 0;

		if (age >= 65){
			resCost = optionTicketCost - ConstValue.AGE_DCs[ipDt.getPreferOption() - 1];
			personTypeCount[1] += 1;
		} else if(age <= 12 && age >= 3) {
			resCost = optionTicketCost - ConstValue.AGE_DCs[ipDt.getPreferOption() - 1];
			personTypeCount[2] += 1;
		} else if(age < 3){
			resCost = 0;
			personTypeCount[3] += 1;
		} else {
			resCost = optionTicketCost;
			personTypeCount[0] += 1;
		}

		ageTicketCost = resCost;
	}
	
	
	public void setSumTicketCost(int sumTicketCost) {
		PriceCalculator.sumTicketCost += sumTicketCost;
	}

	public void setSumTicketCount(int sumTicketCount) {
		PriceCalculator.sumTicketCount += sumTicketCount;
	}

	public void totalTicketCostCalculator() {
		int ticketCount = ipDt.getTicketCount();
		totalTicketCost = ageTicketCost * ticketCount;
	}

	public int getOptionTicketCost() {
		return optionTicketCost;
	}

	public int getAgeTicketCost() {
		return ageTicketCost;
	}

	public int getTotalTicketCost() {
		return totalTicketCost;
	}

	public int getSumTicketCost() {
		return sumTicketCost;
	}

	public int getSumTicketCount() {
		return sumTicketCount;
	}

	public int[] getPersonTypeCount() {
		return personTypeCount;
	}
	public int getPersonTypeCount_Normal() {
		return personTypeCount[0];
	}
	public int getPersonTypeCount_Elder() {
		return personTypeCount[1];
	}
	public int getPersonTypeCount_Kid() {
		return personTypeCount[2];
	}
	public int getPersonTypeCount_Baby() {
		return personTypeCount[3];
	}

	public int[] getTicketTypeCount() {
		return ticketTypeCount;
	}
	public int getTicketTypeCount_Nothing() {
		return ticketTypeCount[0];
	}
	public int getTicketTypeCount_Disabled() {
		return ticketTypeCount[1];
	}
	public int getTicketTypeCount_merit() {
		return ticketTypeCount[2];
	}
	public int getTicketTypeCount_ThreeKids() {
		return ticketTypeCount[3];
	}
	public int getTicketTypeCount_PregWoman() {
		return ticketTypeCount[4];
	}

	
	


}

