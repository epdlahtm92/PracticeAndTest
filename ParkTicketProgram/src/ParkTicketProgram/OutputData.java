package ParkTicketProgram;

import java.time.LocalDate;

public class OutputData {
	private CalendarAge ca = null;
	private InputData ipDt = null;
	private PriceCalculator pc = null;
	private LocalDate now = null;
	private ListSaving ls = null;
	
	public OutputData() {
		ca = new CalendarAge();
		ipDt = new InputData();
		pc = new PriceCalculator();
		now = LocalDate.now();
		ls = new ListSaving();
	}
	
	public void header_ticketTypeIdNumberPrint() {
		ca.ticketTypeFinder();
		System.out.println("Today is : " + now);
		System.out.println("Today's Ticket Type is : " + ca.getTicketTypeToChar());
		System.out.println("Plese input your ID Number");
			
		ipDt.setIdNumbers();
	}
	
	public void body_preferOptionAmountPrint() {
		System.out.println("Please choose your Preferential Treatment\n"
							+ "1. Nothing\n" 
							+ "2. The Disabled\n"
							+ "3. A men of national merit\n"
							+ "4. More than three kids\n"
							+ "5. Pregnant Woman");
		ipDt.setPreferOption();
	
		System.out.println("How many tickets (less than 10)");
		ipDt.setTicketCount();
	}
	
	
	public void orderInformationPrint() {
		ca.ageCalculator();
		pc.preferOptionCalculator();
		pc.ageDiscountCalculator();
		pc.totalTicketCostCalculator();
		
		System.out.println("Quantity : " + ipDt.getTicketCount());
		System.out.println("your age is : " + ca.getCustomerAge());
		System.out.println("Option : " + ConstValue.PREFER_OPTIONS[ipDt.getPreferOption() - 1]);
		System.out.println("Option applied cost : " + pc.getOptionTicketCost());
		System.out.println("Age applied cost : " + pc.getAgeTicketCost());
		System.out.println("Total cost : " + pc.getTotalTicketCost());
	}
	
	public void endPrint() {
		pc.setSumTicketCount(ipDt.getTicketCount());
		pc.setSumTicketCost(pc.getTotalTicketCost());
		System.out.println("More Order?\n1. Y\n2. N");
			ipDt.setEndOption();
		ls.setOrderLists(ipDt.getIdNum(), ca.getCustomerAge(), ipDt.getPreferOption(), ipDt.getTicketCount(), pc.getTotalTicketCost());

	}
	
	public void resultPrint(int orderCount) {
		System.out.println("============================================================");
		System.out.printf("%60s\n", now);
		System.out.println("total order count : " + orderCount);
		System.out.println("============================================================");

		System.out.printf("%8s%8s%8s%20s%8s%8s\n", "ID", "Age","Gender", "Option", "Amount", "Cost");
		for (OrderList order : ls.getData()) {
			System.out.printf("%8s%8d%8s%- 3d%17s%8d%8d\n", order.getIdNumber(), order.getAge(), order.getGenderToString(), order.getOption(), order.getOptionToString(), order.getAmount(), order.getCost());
		}
		
		System.out.println("============================================================");
		System.out.printf("%8s%44d%8d\n", "Sum", pc.getSumTicketCount(), pc.getSumTicketCost());
		System.out.println("============================================================");

	}
	
}
