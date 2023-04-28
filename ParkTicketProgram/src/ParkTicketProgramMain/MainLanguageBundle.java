package ParkTicketProgramMain;

import java.util.Locale;
import java.util.ResourceBundle;

public class MainLanguageBundle {
	public static String Choose_Program;
	public static String Ticket_Program;
	public static String Sort_Program;
	
	public static void bundleControlMain() {
		Locale currentLocale = Locale.getDefault();
		ResourceBundle rb = ResourceBundle.getBundle("LanguageBundle", currentLocale);
		
		Choose_Program = rb.getString("Choose_Program");
		Ticket_Program = rb.getString("Ticket_Program");
		Sort_Program = rb.getString("Sort_Program");
	}
}
