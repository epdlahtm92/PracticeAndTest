package ParkTicketReadProgram;

public class Sorting {
	
	private ReaderListSaving rs = null;
	
	private static int optionCostSum[] = {0,0,0,0,0}; // 1.none 2.disabled 3.merit 4.kids 5.pregW
	private static int optionCountSum[] = {0,0,0,0,0}; // 1.none 2.disabled 3.merit 4.kids 5.pregW
	private static int ageCountSum[] = {0,0,0,0}; // 1.normal 2. elder 3. kid 4.baby
	private static int ageCostSum[] = {0,0,0,0}; // 1.normal 2. elder 3. kid 4.baby
	private static int totalCount;
	private static int totalCost;

	public Sorting() {
		rs = new ReaderListSaving();
	}

	public int[] getOptionCostSum() {
		return optionCostSum;
	}

	public void setOptionCostSum() {
		for (int index = 1; index < rs.getReadData().size(); index++) {
			optionCostSum[Integer.parseInt(rs.getReadData().get(index).getOption()) - 1] += Integer.parseInt(rs.getReadData().get(index).getCost());
		}
	}

	public int[] getOptionCountSum() {
		return optionCountSum;
	}

	public void setOptionCountSum() {
		for (int index = 1; index < rs.getReadData().size(); index++) {
			optionCountSum[Integer.parseInt(rs.getReadData().get(index).getOption()) - 1] += Integer.parseInt(rs.getReadData().get(index).getAmount());
		}

	}

	public int[] getAgeCountSum() {
		return ageCountSum;
	}

	public void setAgeCountSum() {
		for (int index = 1; index < rs.getReadData().size(); index++) {
			if (Integer.parseInt(rs.getReadData().get(index).getAge()) < 65 && Integer.parseInt(rs.getReadData().get(index).getAge()) > 12) {
				ageCountSum[0] += Integer.parseInt(rs.getReadData().get(index).getAmount());
			} else if (Integer.parseInt(rs.getReadData().get(index).getAge()) >= 65) {
				ageCountSum[1] += Integer.parseInt(rs.getReadData().get(index).getAmount());
			} else if(Integer.parseInt(rs.getReadData().get(index).getAge()) <= 12 && Integer.parseInt(rs.getReadData().get(index).getAge()) >= 3) {
				ageCountSum[2] += Integer.parseInt(rs.getReadData().get(index).getAmount());
			} else if(Integer.parseInt(rs.getReadData().get(index).getAge()) < 3) {
				ageCountSum[3] += Integer.parseInt(rs.getReadData().get(index).getAmount());
			}
		}
	}

	public int[] getAgeCostSum() {
		return ageCostSum;
	}

	public void setAgeCostSum() {
		for (int index = 1; index < rs.getReadData().size(); index++) {
			if (Integer.parseInt(rs.getReadData().get(index).getAge()) < 65 && Integer.parseInt(rs.getReadData().get(index).getAge()) > 12) {
				ageCostSum[0] += Integer.parseInt(rs.getReadData().get(index).getCost());
			} else if (Integer.parseInt(rs.getReadData().get(index).getAge()) >= 65) {
				ageCostSum[1] += Integer.parseInt(rs.getReadData().get(index).getCost());
			} else if(Integer.parseInt(rs.getReadData().get(index).getAge()) <= 12 && Integer.parseInt(rs.getReadData().get(index).getAge()) >= 3) {
				ageCostSum[2] += Integer.parseInt(rs.getReadData().get(index).getCost());
			} else if(Integer.parseInt(rs.getReadData().get(index).getAge()) < 3) {
				ageCostSum[3] += Integer.parseInt(rs.getReadData().get(index).getCost());
			}
		}
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount() {
		for (int index = 1; index < rs.getReadData().size(); index++) {
			totalCount += Integer.parseInt(rs.getReadData().get(index).getAmount());
		}

	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost() {
		for (int index = 1; index < rs.getReadData().size(); index++) {
			totalCost += Integer.parseInt(rs.getReadData().get(index).getCost());
		}
	}


}
