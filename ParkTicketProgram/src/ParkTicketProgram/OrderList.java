package ParkTicketProgram;

public class OrderList {
	private InputData ipDt = null;
	private String idNumber;
	private int age;
	private int option;
	private int amount;
	private int cost;
	private int gender;
	
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public int getAge() {
		return age;
	}
	public String getAgeToString() {
		String ageStr = Integer.toString(age);
		return ageStr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getOption() {
		return option;
	}
	public String getOptionNumToString() {
		String optionNumStr = Integer.toString(option);
		return optionNumStr;
	}
	public String getOptionToString() {
		ipDt = new InputData();
		String optionToString = ConstValue.PREFER_OPTIONS[option - 1];
		return optionToString;
	}
	public void setOption(int option) {
		this.option = option;
	}
	
	
	public int getAmount() {
		return amount;
	}
	public String getAmountToString() {
		String amountStr = Integer.toString(amount);
		return amountStr;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getCost() {
		return cost;
	}
	public String getCostToString() {
		String costStr = Integer.toString(cost);
		return costStr;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getGender() {
		return gender;
	}
	public String getGenderNumToString() {
		String genderStr = Integer.toString(gender);
		return genderStr;
	}
	public String getGenderToString() {
		String genderToString = null;
		if (gender == 1 || gender == 3) {
			genderToString = "Male";
		} else if (gender == 2 || gender == 4) {
			genderToString = "Female";
		}
		return genderToString;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	public String getCSV() {
		String resStr = idNumber + "," + age + "," + gender + "," + option + "," + amount  + "," + cost;
		return resStr;
	}
	
}
