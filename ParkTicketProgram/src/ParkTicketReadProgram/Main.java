package ParkTicketReadProgram;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReaderProgram rp = new ReaderProgram();
		OutputClass oc = new OutputClass();
			
		oc.setCountryRegion();
		
		rp.fileReader();
		
		oc.printTotalSort();
		
		oc.printOptionSort();
		
		oc.printAgeSort();
	
		
	}

}
