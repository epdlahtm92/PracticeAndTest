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
	public void setAge(int age) {
		this.age = age;
	}
	public int getOption() {
		return option;
	}
	public void setOption(int option) {
		this.option = option;
	}
	public String getOptionToString() {
		ipDt = new InputData();
		String optionToString = ConstValue.PREFER_OPTIONS[option - 1];
		return optionToString;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getGender() {
		return gender;
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
	
}
