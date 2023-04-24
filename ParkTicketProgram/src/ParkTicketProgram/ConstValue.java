package ParkTicketProgram;

import java.time.LocalDate;

public class ConstValue {
	
	public static LocalDate now = LocalDate.now();
	public static final int NOW_YEAR = now.getYear();
	public static final int NOW_MON = now.getMonthValue();
	public static final int NOW_DATE = now.getDayOfMonth();
	
	public static final int BEFORE_MILL = 1900;
	public static final int AFTER_MILL = 2000;
	
	public static final int ORIGINAL_TICKET_COSTS[] = {62000, 52000, 46000, 68000};
	
	public static final int ENGLISH_SELECT = 0;
	public static final int KOREAN_SELECT = 1;
	
	public static final String PREFER_OPTIONS[] = {"Nothing", 
												   "the Disabled", 
												   "National merit", 
												   "More than 3 kids", 
												   "Pregnant woman"};
	
	public static final int OPTION_DCs[][] = {{0, 0, 0, 0},
											  {25000,21000,19000,28000},
											  {31000,26000,23000,34000},
											  {13000,11000,10000,14000},
											  {10000,8000,7000,11000}};
	
	public static final int AGE_DCs[] = {10000, 6000, 5000, 8000, 0};
	
	public static final int CONTINUE_ORDER = 1;
	public static final int END_ORDER = 2;
}
