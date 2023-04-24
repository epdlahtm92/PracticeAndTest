package ParkTicketProgram;

public class OutputData {
	private CalendarAge ca = null;
	private InputData ipDt = null;
	private PriceCalculator pc = null;
	private ListSaving ls = null;
	private WritingFiles wf = null;
	private LanguageSelection lgs = null;

	public OutputData() {
		ca = new CalendarAge();
		ipDt = new InputData();
		pc = new PriceCalculator();
		ls = new ListSaving();
		wf = new WritingFiles();
		lgs = new LanguageSelection();
	}

	public void header_ticketTypeIdNumberPrint() {
		System.out.println("Language : \n1. English\n2. Korean");
		ipDt.setLanguageSelection();

		ca.ticketTypeFinder();
		System.out.println(lgs.getHeaderLanguageVarations()[ipDt.getLanguageSelection() - 1][0] + ConstValue.now);
		System.out.println(lgs.getHeaderLanguageVarations()[ipDt.getLanguageSelection() - 1][1] + ca.getTicketTypeToChar());
		System.out.println(lgs.getHeaderLanguageVarations()[ipDt.getLanguageSelection() - 1][2]);

		ipDt.setIdNumbers();
	}

	public void body_preferOptionAmountPrint() {
		System.out.println(lgs.getBodyLanguageVariations()[ipDt.getLanguageSelection() - 1][0]);
		ipDt.setPreferOption();

		System.out.println(lgs.getBodyLanguageVariations()[ipDt.getLanguageSelection() - 1][1]);
		ipDt.setTicketCount();
	}


	public void orderInformationPrint() {
		ca.ageCalculator();
		pc.preferOptionCalculator();
		pc.ageDiscountCalculator();
		pc.totalTicketCostCalculator();

		System.out.println(lgs.getInfoLanguageVariations()[ipDt.getLanguageSelection() - 1][0] + ipDt.getTicketCount());
		System.out.println(lgs.getInfoLanguageVariations()[ipDt.getLanguageSelection() - 1][1] + ca.getCustomerAge());
		System.out.println(lgs.getInfoLanguageVariations()[ipDt.getLanguageSelection() - 1][2] + ConstValue.PREFER_OPTIONS[ipDt.getPreferOption() - 1]);
		System.out.println(lgs.getInfoLanguageVariations()[ipDt.getLanguageSelection() - 1][3] + pc.getOptionTicketCost());
		System.out.println(lgs.getInfoLanguageVariations()[ipDt.getLanguageSelection() - 1][4] + pc.getAgeTicketCost());
		System.out.println(lgs.getInfoLanguageVariations()[ipDt.getLanguageSelection() - 1][5] + pc.getTotalTicketCost());
	}

	public void endPrint() {
		pc.setSumTicketCount(ipDt.getTicketCount());
		pc.setSumTicketCost(pc.getTotalTicketCost());
		System.out.println(lgs.getEndMoreOrderPrints()[ipDt.getLanguageSelection() - 1]);
		ipDt.setEndOption();
		ls.setOrderLists(ipDt.getIdNum(), ca.getCustomerAge(), ipDt.getPreferOption(), ipDt.getTicketCount(), pc.getTotalTicketCost());
	}

	public void resultPrint(int orderCount) {
		System.out.println("============================================================");
		System.out.printf("%60s\n", ConstValue.now);
		System.out.println(lgs.getResult1orderCountPrints()[ipDt.getLanguageSelection() - 1] + orderCount);
		System.out.println("============================================================");

		for (int index = 0; index < 6; index++) {
			if (index == 3) {
				System.out.printf("%20s", lgs.getResult2ListFieldNamePrints()[ipDt.getLanguageSelection() - 1][index]);
			} else {
				System.out.printf("%10s", lgs.getResult2ListFieldNamePrints()[ipDt.getLanguageSelection() - 1][index]);
			}
		}
		System.out.println();

		for (OrderList order : ls.getData()) {
			System.out.printf("%10s%10d%10s%- 10d%19s%10d%10d\n", order.getIdNumber(), order.getAge(), order.getGenderToString(), order.getOption(), order.getOptionToString(), order.getAmount(), order.getCost());
		}

		System.out.println("------------------------------------------------------------");
		System.out.printf("%8s%44d%8s\n", "Sum", pc.getSumTicketCount(), pc.getSumTicketCostToString());
		System.out.println("============================================================");

	}

	public void sortPrint () {
		System.out.println("============================================================");
		System.out.println(lgs.getSort1SortCriteriaPrints()[ipDt.getLanguageSelection() - 1][0]);
		System.out.println("------------------------------------------------------------");

		for(int index = 0; index < 4; index++) {
			System.out.printf("%15s", lgs.getSort2AgeFieldPrints()[ipDt.getLanguageSelection() - 1][index]);
		}
		System.out.println();

		System.out.printf("%15d%15d%15d%15d\n", pc.getPersonTypeCount_Normal(), pc.getPersonTypeCount_Elder(), pc.getPersonTypeCount_Kid(), pc.getPersonTypeCount_Baby());
		System.out.println("============================================================");
		System.out.println(lgs.getSort1SortCriteriaPrints()[ipDt.getLanguageSelection() - 1][1]);
		System.out.println("------------------------------------------------------------");
		
		for(int index = 0; index < 5; index++) {
			System.out.printf("%12s", lgs.getSort4OptionFieldPrints()[ipDt.getLanguageSelection() - 1][index]);
		}
		System.out.println();
		
		System.out.printf("%12d%12d%12d%12d%12d\n", pc.getTicketTypeCount_Nothing(), pc.getTicketTypeCount_Disabled(), pc.getTicketTypeCount_merit(), pc.getTicketTypeCount_ThreeKids(), pc.getTicketTypeCount_PregWoman());
		System.out.println("============================================================");
		wf.writingFile();
	}

}
