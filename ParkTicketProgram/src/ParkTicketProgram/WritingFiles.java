package ParkTicketProgram;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
	private ListSaving ls = null;
	private FileWriter fw = null;
	private String filePath = "C:\\Users\\kopo\\workspace\\TicketProgramReport_" + ConstValue.todayDateToString + ".csv";
	
	public WritingFiles() {
	
		ls = new ListSaving();
	}
	
	public void writingFieldName() {
		try {
			fw = new FileWriter(filePath);
			fw.write("today,id,age,gender,option,amount,cost\n");
		} catch (IOException e) {
			
		}
	}

	public void writingFile() { 
		try {
//			String filePath = "C:\\Users\\kopo\\workspace\\TicketProgramReport_" + ConstValue.todayDateToString + ".csv";
			fw = new FileWriter(filePath, true);
			fw.write("today,id,age,gender,option,amount,cost\n");
			for (OrderList order : ls.getData()) {
				order.setGenderNum();
				fw.write(order.getCSV() + "\n");
			}
			fw.close();
		} catch (IOException e) {
			System.out.println("Write Error");
		}
	}
}

