package ParkTicketReadProgram;

import java.util.ArrayList;
import java.util.List;

public class ReaderListSaving {
	
	private static List<ReaderOrderList> readData = new ArrayList<ReaderOrderList>();
	
	public void setReaderList(String today,String id,String age,String gender,String option,String amount,String cost) {
		ReaderOrderList order = new ReaderOrderList();
		order.setToday(today);
		order.setId(id);
		order.setAge(age);
		order.setGender(gender);
		order.setOption(option);
		order.setAmount(amount);
		order.setCost(cost);
		
		readData.add(order);
	}

	public List<ReaderOrderList> getReadData() {
		return readData;
	}
	
	
}
