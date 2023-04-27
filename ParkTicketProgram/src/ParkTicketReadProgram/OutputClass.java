package ParkTicketReadProgram;

public class OutputClass {
	Sorting st = null;
	int region = 0;
	
	public OutputClass() {
		st = new Sorting();
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
		st.setOptionSort();
		System.out.println("======================================");
		System.out.println(ConstValue.LANGUAGE_OPTION[region][2]);
		System.out.println("--------------------------------------");
		for (int index = 0; index < st.getOptionCount().length; index++) {
			System.out.println(ConstValue.OPTION_VARIATIONS[region][index] + " : " + st.getOptionCount()[index]);
		}
		System.out.println("======================================");

		System.out.println("======================================");
		System.out.println(ConstValue.LANGUAGE_OPTION[region][3]);
		System.out.println("--------------------------------------");
		for (int index = 0; index < st.getOptionCost().length; index++) {
			System.out.println(ConstValue.OPTION_VARIATIONS[region][index] + " : " + st.getOptionCost()[index]);
		}
		System.out.println("======================================");
	}

	public void printAgeSort() {
		st.setAgeSort();
		System.out.println("======================================");
		System.out.println(ConstValue.LANGUAGE_OPTION[region][4]);
		System.out.println("--------------------------------------");
		for (int index = 0; index < st.getAgeCount().length; index++) {
			System.out.println(ConstValue.AGE_VARIATIONS[region][index] + " : " + st.getAgeCount()[index]);
		}
		System.out.println("======================================");

		System.out.println("======================================");
		System.out.println(ConstValue.LANGUAGE_OPTION[region][5]);
		System.out.println("--------------------------------------");
		for (int index = 0; index < st.getAgeCost().length; index++) {
			System.out.println(ConstValue.AGE_VARIATIONS[region][index] + " : " + st.getAgeCost()[index]);
		}
		System.out.println("======================================");

	}
}
