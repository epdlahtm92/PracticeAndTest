package ParkTicketReadProgram;

public class Sorting {
	private static String dataLine[][] = null;
	private static int optionCost[] = new int[5]; // 1.none 2.disabled 3.merit 4.kids 5.pregW
	private static int optionCount[] = new int[5]; // 1.none 2.disabled 3.merit 4.kids 5.pregW
	private static int ageCount[] = new int[4]; // 1.normal 2. elder 3. kid 4.baby
	private static int ageCost[] = new int[4]; // 1.normal 2. elder 3. kid 4.baby
	private static int totalCount;
	private static int totalCost;

	public String[][] getDataLine() {
		return dataLine;
	}

	public void setDataLine(String readLine) {
		ReaderProgram rp = new ReaderProgram();
		dataLine = new String[rp.getLineCount()][7];

		for (int index = 0; index < rp.getLineCount(); index++) {
			dataLine[index] = readLine.split(",");		
		}

	}

	public int[] getOptionCount() {
		return optionCount;
	}


	public int[] getOptionCost() {
		return optionCost;
	}

	public void setOptionSort() {
		for (int index = 1; index < dataLine.length; index++) {
			optionCount[Integer.parseInt(dataLine[index][4])- 1] += Integer.parseInt(dataLine[index][5]);
			optionCost[Integer.parseInt(dataLine[index][4])- 1] += Integer.parseInt(dataLine[index][6]);
		}

	}

	public int[] getAgeCount() {
		return ageCount;
	}


	public int[] getAgeCost() {
		return ageCost;
	}

	public void setAgeSort() {
		for (int index = 1; index < dataLine.length; index++) {	
			ageCount[Integer.parseInt(dataLine[index][4])- 1] += Integer.parseInt(dataLine[index][5]);
			ageCost[Integer.parseInt(dataLine[index][4])- 1] += Integer.parseInt(dataLine[index][6]);

		}
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount() {
		int resCount = 0;
		for (int index = 1; index < dataLine.length; index++) {
			resCount += Integer.parseInt(dataLine[index][5]);
		}
		totalCount = resCount;

	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost() {
		int resCost = 0;
		for (int index = 1; index < dataLine.length; index++) {
			resCost += Integer.parseInt(dataLine[index][6]);
		}
		totalCost = resCost;
	}


}
