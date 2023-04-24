package ParkTicketProgram;

import java.io.IOException;

public class TicketProgram {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputData ipDt = new InputData();
		OutputData opDt = new OutputData();
		
		int orderCount = 0;

		do {
			//ticket type finder, today, ticket type, id number, id number scan
			opDt.header_ticketTypeIdNumberPrint();

			// prefer option, option scan, ticket amounts, ticket amounts scan
			opDt.body_preferOptionAmountPrint();

			// age & prefer option & age discount & total ticket cost calculation and print
			opDt.orderInformationPrint();

			//end print & end option request, list saving, order count
			opDt.endPrint();
			orderCount++;

		} while (ipDt.getEndOption() == ConstValue.CONTINUE_ORDER);

		// result format print, sum array print
		opDt.resultPrint(orderCount);
		
		//sort print, csv output
		opDt.sortPrint();
		
		
	}

}
