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
		System.out.println(ConstValue.LocaleToString);
		ipDt.setLanguageSelection();

		ca.ticketTypeFinder();
		System.out.println(lgs.getHeaderLanguageVariations()[ipDt.getLanguageSelection()][0] + ConstValue.now);
		System.out.println(lgs.getHeaderLanguageVariations()[ipDt.getLanguageSelection()][1] + ca.getTicketTypeToChar());
		System.out.println(lgs.getHeaderLanguageVariations()[ipDt.getLanguageSelection()][2]);

		ipDt.setIdNumbers();
	}

	public void body_preferOptionAmountPrint() {
		System.out.println(lgs.getBodyLanguageVariations()[ipDt.getLanguageSelection()][0]);
		ipDt.setPreferOption();

		System.out.println(lgs.getBodyLanguageVariations()[ipDt.getLanguageSelection()][1]);
		ipDt.setTicketCount();
	}


	public void orderInformationPrint() {
		ca.ageCalculator();
		pc.preferOptionCalculator();
		pc.ageDiscountCalculator();
		pc.totalTicketCostCalculator();

		System.out.println(lgs.getInfoLanguageVarations()[ipDt.getLanguageSelection()][0] + ipDt.getTicketCount());
		System.out.println(lgs.getInfoLanguageVarations()[ipDt.getLanguageSelection()][1] + ca.getCustomerAge());
		System.out.println(lgs.getInfoLanguageVarations()[ipDt.getLanguageSelection()][2] + lgs.getSort3OptionFieldPrints()[ipDt.getLanguageSelection()][ipDt.getPreferOption() - 1]);
		System.out.println(lgs.getInfoLanguageVarations()[ipDt.getLanguageSelection()][3] + pc.getOptionTicketCost());
		System.out.println(lgs.getInfoLanguageVarations()[ipDt.getLanguageSelection()][4] + pc.getAgeTicketCost());
		System.out.println(lgs.getInfoLanguageVarations()[ipDt.getLanguageSelection()][5] + pc.getTotalTicketCost());
	}

	public void endPrint() {
		pc.setSumTicketCount(ipDt.getTicketCount());
		pc.setSumTicketCost(pc.getTotalTicketCost());
		System.out.println(lgs.getEndMoreOrderLanguageVariations()[ipDt.getLanguageSelection()]);
		ipDt.setEndOption();
		ls.setOrderLists(ipDt.getIdNum(), ca.getCustomerAge(), ipDt.getPreferOption(), ipDt.getTicketCount(), pc.getTotalTicketCost());
	}

	public void resultPrint(int orderCount) {
		System.out.println("============================================================");
		System.out.printf("%60s\n", ConstValue.now);
		System.out.println(lgs.getResult1OrderCountVariations()[ipDt.getLanguageSelection()] + orderCount);
		System.out.println("============================================================");

		for (int index = 0; index < 6; index++) {
			if (index == 3) {
				System.out.printf("%20s", lgs.getResult2ListFieldNameVariations()[ipDt.getLanguageSelection()][index]);
			} else {
				System.out.printf("%8s", lgs.getResult2ListFieldNameVariations()[ipDt.getLanguageSelection()][index]);
			}
		}
		System.out.println();

		for (OrderList order : ls.getData()) {
			System.out.printf("%8s%8d%8s% 2d%18s%8d%8d\n", order.getIdNumber(), order.getAge(), order.getGenderToString(), order.getOption(), order.getOptionToString(), order.getAmount(), order.getCost());
		}

		System.out.println("------------------------------------------------------------");
		System.out.printf("%8s%44d%8s\n", "Sum", pc.getSumTicketCount(), pc.getSumTicketCostToString());
		System.out.println("============================================================");

	}

	public void sortPrint () {
		System.out.println("============================================================");
		System.out.println(lgs.getSort1SortCriteriaVariations()[ipDt.getLanguageSelection()][0]);
		System.out.println("------------------------------------------------------------");

		for(int index = 0; index < 4; index++) {
			System.out.printf("%8s", lgs.getSort2AgeFieldPrints()[ipDt.getLanguageSelection()][index]);
		}
		System.out.println();

		System.out.printf("%15d%15d%15d%15d\n", pc.getPersonTypeCount_Normal(), pc.getPersonTypeCount_Elder(), pc.getPersonTypeCount_Kid(), pc.getPersonTypeCount_Baby());
		System.out.println("============================================================");
		System.out.println(lgs.getSort1SortCriteriaVariations()[ipDt.getLanguageSelection()][1]);
		System.out.println("------------------------------------------------------------");
		
		for(int index = 0; index < 5; index++) {
			System.out.printf("%12s", lgs.getSort3OptionFieldPrints()[ipDt.getLanguageSelection()][index]);
		}
		System.out.println();
		
		System.out.printf("%12d%12d%12d%12d%12d\n", pc.getTicketTypeCount_Nothing(), pc.getTicketTypeCount_Disabled(), pc.getTicketTypeCount_merit(), pc.getTicketTypeCount_ThreeKids(), pc.getTicketTypeCount_PregWoman());
		System.out.println("============================================================");
		wf.writingFile();
	}

}
