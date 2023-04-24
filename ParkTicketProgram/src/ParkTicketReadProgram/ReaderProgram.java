package ParkTicketReadProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderProgram {

	private static int LineCount;
	
	public void fileReader() {
		try {
			File fl = new File("C:\\\\Users\\\\kopo\\\\workspace\\\\TicketProgramWithDate.csv");
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
