package ParkTicketProgram;

import java.io.FileWriter;

public class WritingFiles {
	public void WritingFiles() {
		FileWriter fw = null;
		ListSaving ls = null;

		String filePath = "C:\\Users\\kopo\\workspace\\TicketProgram.csv";

		String nl = System.lineSeparator();

		try {
			fw = new FileWriter(filePath, true);
			ls = new ListSaving();
			fw.write("============================================================");
			
			for (OrderList order : ls.getData()) {
				String orderData  = order.getIdNumber() + "," + order.getAge() + "," + order.getGenderToString() + "," + order.getOption() + "," + order.getOptionToString() + "," + order.getAmount() + "," + order.getCost();
				fw.write(orderData);
				fw.write(nl);
			}
			fw.write("============================================================");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
