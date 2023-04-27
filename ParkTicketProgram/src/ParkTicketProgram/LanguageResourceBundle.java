package ParkTicketProgram;

import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageResourceBundle {

	public static String languageQuestion = "";
	public static String todayis = "";
	public static String Todays_ticket_type_is = "";
	public static String Please_input_your_ID_number = "";
	public static String Please_choose_your_Preferential_Treatment = "";
	public static String How_many_tickets_less_than_10 = "";
	public static String Quantity = "";
	public static String your_age_is = "";
	public static String Option_ = "";
	public static String Option_applied_cost = "";
	public static String Age_applied_Cost = "";
	public static String Total_Cost = "";
	public static String More_order_n_1_Yes_n_2_NO = "";
	public static String Total_order_count = "";
	public static String ID = "";
	public static String Age = "";
	public static String Gender = "";
	public static String Option = "";
	public static String Amount = "";
	public static String Cost = "";
	public static String sort_by_age = "";
	public static String sort_by_option = "";
	public static String Normal = "";
	public static String Elder = "";
	public static String Kid = "";
	public static String Baby = "";
	public static String Nothing = "";
	public static String Disabled = "";
	public static String Merit = "";
	public static String ThreeKids = "";
	public static String PregWoman = "";

	
	public static void bundleControl() {
		Locale currentLocale = Locale.getDefault();
		ResourceBundle rb = ResourceBundle.getBundle("LanguageBundle", currentLocale);
		
		todayis = rb.getString("Today_is");
		Todays_ticket_type_is = rb.getString("Todays_ticket_type_is");
		Please_input_your_ID_number = rb.getString("Please_input_your_ID_number");
		Please_choose_your_Preferential_Treatment = rb.getString("Please_choose_your_Preferential_Treatment");
		How_many_tickets_less_than_10 = rb.getString("How_many_tickets_less_than_10");
		Quantity = rb.getString("Quantity");
		your_age_is = rb.getString("your_age_is");
		Option_ = rb.getString("Option_");
		Option_applied_cost = rb.getString("Option_applied_cost");
		Age_applied_Cost = rb.getString("Age_applied_Cost");
		Total_Cost = rb.getString("Total_Cost");
		More_order_n_1_Yes_n_2_NO = rb.getString("More_order_n_1_Yes_n_2_NO");
		Total_order_count = rb.getString("Total_order_count");
		ID = rb.getString("ID");
		Age = rb.getString("Age");
		Gender = rb.getString("Gender");
		Option = rb.getString("Option");
		Amount = rb.getString("Amount");
		Cost = rb.getString("Cost");
		sort_by_age = rb.getString("sort_by_age");
		sort_by_option = rb.getString("sort_by_option");
		Normal = rb.getString("Normal");
		Elder = rb.getString("Elder");
		Kid = rb.getString("Kid");
		Baby = rb.getString("Baby");
		Nothing = rb.getString("Nothing");
		Disabled = rb.getString("Disabled");
		Merit = rb.getString("Merit");
		ThreeKids = rb.getString("ThreeKids");
		PregWoman = rb.getString("PregWoman");

	}

	public static String[] getAgeCriterieas() {
		String ageCriterieas[] = {Normal, Elder, Kid, Baby};
		return ageCriterieas;
	}

	public static String[] getOptionCriterias() {
		String optionCriterias[] = {Nothing, Disabled, Merit, ThreeKids, PregWoman};
		return optionCriterias;
	}

	public static String[] getResultCriterias() {
		String resultCriterias[] = {ID,Age,Gender,Option,Amount,Cost};
		return resultCriterias;
	}
	
	
	
}
