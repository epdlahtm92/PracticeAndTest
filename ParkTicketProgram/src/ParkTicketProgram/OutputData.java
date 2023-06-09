package ParkTicketProgram;

public class OutputData {
	private CalendarAge ca = null;
	private InputData ipDt = null;
	private PriceCalculator pc = null;
	private ListSaving ls = null;
	private WritingFiles wf = null;
	private DBControlClass dcc = null;

	public OutputData() {
		ca = new CalendarAge();
		ipDt = new InputData();
		pc = new PriceCalculator();
		ls = new ListSaving();
		wf = new WritingFiles();
		dcc = new DBControlClass();
	}
	

	public void header_ticketTypeIdNumberPrint() {
		ParkTicketProgramMain.LanguageResourceBundle.bundleControl();
		ca.ticketTypeFinder();

		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.todayis + ParkTicketProgramMain.ConstValue.todayDateToString);
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.Todays_ticket_type_is + ca.getTicketTypeToChar());
		
	}

	public void body_preferOptionAmountPrint() {
		
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.Please_input_your_ID_number);
		ipDt.setIdNumbers();
		
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.Please_choose_your_Preferential_Treatment);
		ipDt.setPreferOption();

		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.How_many_tickets_less_than_10);
		ipDt.setTicketCount();
	}


	public void orderInformationPrint() {
		ca.ageCalculator();
		pc.preferOptionCalculator();
		pc.ageDiscountCalculator();
		pc.totalTicketCostCalculator();
		
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.Quantity + ipDt.getTicketCount());
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.your_age_is + ca.getCustomerAge());
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.Option_ + ParkTicketProgramMain.LanguageResourceBundle.getOptionCriterias()[ipDt.getPreferOption() - 1]);
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.Option_applied_cost + pc.getOptionTicketCost());
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.Age_applied_Cost + pc.getAgeTicketCost());
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.Total_Cost + pc.getTotalTicketCost());
	
	}

	public void endPrint() {
		pc.setSumTicketCount(ipDt.getTicketCount());
		pc.setSumTicketCost(pc.getTotalTicketCost());
		
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.More_order_n_1_Yes_n_2_NO);
		
		ipDt.setEndOption();
		ls.setOrderLists(ipDt.getIdNum(), ca.getCustomerAge(), ipDt.getPreferOption(), ipDt.getTicketCount(), pc.getTotalTicketCost());
	}

	public void resultPrint(int orderCount) {
		System.out.println("============================================================");
		System.out.printf("%60s\n", ParkTicketProgramMain.ConstValue.now);
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.Total_order_count + orderCount);
		System.out.println("============================================================");

		for (int index = 0; index < 6; index++) {
			if (index == 3) {
				System.out.printf("%18s", ParkTicketProgramMain.LanguageResourceBundle.getResultCriterias()[index]);
			} else {
				System.out.printf("%8s", ParkTicketProgramMain.LanguageResourceBundle.getResultCriterias()[index]);
			}
		}
		System.out.println();

		for (OrderList order : ls.getData()) {
			System.out.printf("%8s%8d%8s% 2d%17s%8d%8d\n", order.getIdNumber(), order.getAge(), order.getGenderToString(), order.getOption(), order.getOptionToString(), order.getAmount(), order.getCost());
		}

		System.out.println("------------------------------------------------------------");
		System.out.printf("%8s%44d%8s\n", "Sum", pc.getSumTicketCount(), pc.getSumTicketCostToString());
		System.out.println("============================================================");

	}

	public void sortPrint () {
		System.out.println("============================================================");
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.sort_by_age);
		System.out.println("------------------------------------------------------------");

		for(int index = 0; index < 4; index++) {
			System.out.printf("%15s", ParkTicketProgramMain.LanguageResourceBundle.getAgeCriterieas()[index]);
		}
		System.out.println();

		System.out.printf("%15d%15d%15d%15d\n", pc.getPersonTypeCount_Normal(), pc.getPersonTypeCount_Elder(), pc.getPersonTypeCount_Kid(), pc.getPersonTypeCount_Baby());
		System.out.println("============================================================");
		System.out.println(ParkTicketProgramMain.LanguageResourceBundle.sort_by_option);
		System.out.println("------------------------------------------------------------");
		
		for(int index = 0; index < 5; index++) {
			System.out.printf("%12s", ParkTicketProgramMain.LanguageResourceBundle.getOptionCriterias()[index]);
		}
		System.out.println();
		
		System.out.printf("%12d%12d%12d%12d%12d\n", pc.getTicketTypeCount_Nothing(), pc.getTicketTypeCount_Disabled(), pc.getTicketTypeCount_merit(), pc.getTicketTypeCount_ThreeKids(), pc.getTicketTypeCount_PregWoman());
		System.out.println("============================================================");
		wf.writingFile();
		dcc.writeToDB(ls);
	}

}
