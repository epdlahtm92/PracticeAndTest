package ParkTicketProgram;

import java.util.ArrayList;
import java.util.List;

public class ListSaving {
	private static List<OrderList> data = new ArrayList<OrderList>();

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
	
}
