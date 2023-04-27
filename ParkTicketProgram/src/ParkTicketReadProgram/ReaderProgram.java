package ParkTicketReadProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import ParkTicketProgram.ConstValue;

public class ReaderProgram {

	private static int LineCount;
	
	public void fileReader() {
		try {
			String filePath = "C:\\Users\\kopo\\workspace\\TicketProgramReport_" + ConstValue.todayDateToString + ".csv";
			File fl = new File(filePath);
			BufferedReader br = new BufferedReader(new FileReader(fl));
			Sorting st = new Sorting();
			
			String readLine;
						
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				LineCount++;
				st.setDataLine(readLine); 
			}

			br.close();
		} catch (IOException e) {
			System.out.println("Read Error");
		}

	}

	public int getLineCount() {
		return LineCount;
	}
	
	
}
