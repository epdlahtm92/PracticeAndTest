package ParkTicketProgram;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListSaving {
	private List<OrderList> data = new ArrayList<OrderList>();
	OrderList ot = null;


	public void setOrderLists(String idNumber, int age, int preferOption, int amount, int cost) {
		OrderList order = new OrderList();
		String idNum = idNumber.substring(0,6);
		int gender = Integer.parseInt(idNumber.substring(6, 7));
		order.setIdNumber(idNum);
		order.setAge(age);
		order.setOption(preferOption);
		order.setAmount(amount);
		order.setCost(cost);
		order.setGender(gender);
		
		data.add(order);

	}


	public List<OrderList> getData() {
		return data;
	}
	
	public void writingFile() throws IOException {
		
		FileWriter fw = new FileWriter("C:\\\\Users\\\\kopo\\\\workspace\\\\TicketProgram.txt", true);
		fw.write("id,age,gender,option,amount,cost\n");
		for (OrderList order : data) {
			String dataLine = order.getCSV() + "\n";
			fw.write(dataLine);
		}
		fw.close();
	}
	
}
