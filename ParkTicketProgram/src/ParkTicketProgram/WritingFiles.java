package ParkTicketProgram;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
	private ListSaving ls = null;
	private FileWriter fw = null;
	
	public WritingFiles() throws IOException{
		ls = new ListSaving();
		fw = new FileWriter("C:\\\\Users\\\\kopo\\\\workspace\\\\TicketProgramWithDate.csv", true);
	}

	public void writingFile() throws IOException { 
		fw.write("today,id,age,gender,option,amount,cost\n");
		for (OrderList order : ls.getData()) {
			order.setGenderNum();
			fw.write(order.getCSV() + "\n");
		}
		fw.close();
	}
}

