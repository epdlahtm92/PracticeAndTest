package ParkTicketProgramMain;

import ParkTicketProgram.TicketProgram;
import ParkTicketReadProgram.TicketReaderProgram;

public class ProcessMain {
	
	private InputDataMain ipm = null;
	
	public ProcessMain() {
		ipm = new InputDataMain();
	}

	public void bringOtherProgram() {
		
		if(ipm.getProgramChoose() == 1) {
			TicketProgram.main(null);
		} else if(ipm.getProgramChoose() == 2) {
			TicketReaderProgram.main(null);
		}
	}
}
