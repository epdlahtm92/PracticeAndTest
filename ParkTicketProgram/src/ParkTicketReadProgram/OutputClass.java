package ParkTicketReadProgram;

public class OutputClass {
	Sorting st = null;
	ReaderListSaving ls = null;
	int region = 0;
	
	public OutputClass() {
		st = new Sorting();
		ls = new ReaderListSaving();
	}
	
	public void setCountryRegion() {
		if (ConstValue.LOCALE_TO_STRING.contains("eu")) {
			region = 0;
		} else if (ConstValue.LOCALE_TO_STRING.contains("ko")) {
			region = 1;
		} else if (ConstValue.LOCALE_TO_STRING.contains("jp")) {
			region = 2;
		}
	}
	
	public void printTotalSort() {
		
		st.setTotalCost();
		st.setTotalCount();

		System.out.println("======================================");
		System.out.println(ConstValue.LANGUAGE_OPTION[region][0] + " : " + st.getTotalCount());
		System.out.println(ConstValue.LANGUAGE_OPTION[region][1] + " : " + st.getTotalCost());
		System.out.println("======================================");
	}
	public void printOptionSort() {
		st.setOptionCountSum();
		st.setOptionCostSum();
		
		System.out.println("======================================");
		System.out.println(ConstValue.LANGUAGE_OPTION[region][2]);
		System.out.println("--------------------------------------");
		for (int index = 0; index < st.getOptionCountSum().length; index++) {
			System.out.println(ConstValue.OPTION_VARIATIONS[region][index] + " : " + st.getOptionCountSum()[index]);
		}
		System.out.println("======================================");

		System.out.println("======================================");
		System.out.println(ConstValue.LANGUAGE_OPTION[region][3]);
		System.out.println("--------------------------------------");
		for (int index = 0; index < st.getOptionCostSum().length; index++) {
			System.out.println(ConstValue.OPTION_VARIATIONS[region][index] + " : " + st.getOptionCostSum()[index]);
		}
		System.out.println("======================================");
	}

	public void printAgeSort() {
		st.setAgeCountSum();
		st.setAgeCostSum();
		
		System.out.println("======================================");
		System.out.println(ConstValue.LANGUAGE_OPTION[region][4]);
		System.out.println("--------------------------------------");
		for (int index = 0; index < st.getAgeCountSum().length; index++) {
			System.out.println(ConstValue.AGE_VARIATIONS[region][index] + " : " + st.getAgeCountSum()[index]);
		}
		System.out.println("======================================");

		System.out.println("======================================");
		System.out.println(ConstValue.LANGUAGE_OPTION[region][5]);
		System.out.println("--------------------------------------");
		for (int index = 0; index < st.getAgeCostSum().length; index++) {
			System.out.println(ConstValue.AGE_VARIATIONS[region][index] + " : " + st.getAgeCostSum()[index]);
		}
		System.out.println("======================================");

	}
}
