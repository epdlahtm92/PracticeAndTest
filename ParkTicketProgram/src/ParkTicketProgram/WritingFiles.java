package ParkTicketProgram;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
	private ListSaving ls = null;
	private FileWriter fw = null;
	
	public WritingFiles() throws IOException{
		ls = new ListSaving();
		fw = new FileWriter("C:\\\\Users\\\\kopo\\\\workspace\\\\TicketProgram.csv", true);
	}

	public void writingFile() throws IOException { 
		fw.write("id,age,gender,option,amount,cost\n");
		for (OrderList order : ls.getData()) {
			order.setGenderNum();
		//	String dataLine = order.getCSV() + "\n";
			fw.write(order.getCSV() + "\n");
		}
		fw.close();
	}
}

