package ParkTicketProgram;

public class OrderList {
	
	private String idNumber;
	private int age;
	private int option;
	private int amount;
	private int cost;
	private int gender;
	private int genderNum;
	
	
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
	public String getOptionToString() {
		return LanguageResourceBundle.getOptionCriterias()[option - 1];
	}
	public void setOption(int option) {
		this.option = option;
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
	public int getGenderNum() {
		return genderNum;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public void setGenderNum() {
		if (gender == 1 || gender == 3) {
			genderNum = 1;
		} else if (gender == 2 || gender == 4 ) {
			genderNum = 2;
		}
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
	
	public String getCSV() {
		String resStr = ConstValue.todayDateToString + "," + idNumber + "," + age + "," + genderNum + "," + option + "," + amount  + "," + cost;
		return resStr;
	}
	
}
