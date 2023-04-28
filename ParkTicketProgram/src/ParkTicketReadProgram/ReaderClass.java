package ParkTicketReadProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderClass {
	
	private File f1 = null;
	private BufferedReader br = null;
	private ReaderListSaving rls = null;
	private static int LineCount;
	
	public ReaderClass() {
		String filePath = "C:\\Users\\kopo\\workspace\\TicketProgramReport_" + ParkTicketProgramMain.ConstValue.todayDateToString + ".csv";
		f1 = new File(filePath);
		rls = new ReaderListSaving();
	}
	
	public void fileReader() {
		try {
			br = new BufferedReader(new FileReader(f1));
			String readLine;
						
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				LineCount++;
				String dataFactors[] = readLine.split(",");
				rls.setReaderList(dataFactors[0], dataFactors[1], dataFactors[2], dataFactors[3], dataFactors[4], dataFactors[5], dataFactors[6]);
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
