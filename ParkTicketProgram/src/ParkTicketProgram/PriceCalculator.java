package ParkTicketProgram;

public class PriceCalculator {
	private static int optionTicketCost;
	private static int ageTicketCost;
	private static int totalTicketCost;
	private static int sumTicketCost = 0;
	private static int sumTicketCount = 0;
	
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
	}

	public void ageDiscountCalculator() {
		int age = ca.getCustomerAge();
		int resCost = 0;

		if (age >= 65 || age <= 12 && age >= 3){
			resCost = optionTicketCost - ConstValue.AGE_DCs[ipDt.getPreferOption() - 1];	
		} else if(age < 3){
			resCost = 0;
		} else {
			resCost = optionTicketCost;
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


}

