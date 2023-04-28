package ParkTicketProgramMain;

public class MainTicketProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputDataMain ipm = new InputDataMain();
		OutputDataMain opm = new OutputDataMain();
		ProcessMain pm = new ProcessMain();
		
		opm.programQuestion();

		ipm.setProgramChoose();
		
		pm.bringOtherProgram();
		
		
	}

}
