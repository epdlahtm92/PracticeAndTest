package ParkTicketReadProgram;

public class TicketReaderProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReaderClass rc = new ReaderClass();
		OutputClass oc = new OutputClass();
			
		oc.setCountryRegion();
		
		rc.fileReader();
		
		oc.printTotalSort();
		
		oc.printOptionSort();
		
		oc.printAgeSort();
	
		
	}

}
