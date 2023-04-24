package ParkTicketReadProgram;

import java.util.Locale;

public class ConstValue {

	public static final Locale CURRENT_LOCALE = Locale.getDefault();
	public static final String LOCALE_TO_STRING = CURRENT_LOCALE.toString();
	public static final String OPTION_VARIATIONS[][] = {{"None", "the Disabled", "A man of merit", "More than three kids", "A pregnant woman"},
														{"없음", "장애인", "국가유공자", "다자녀", "임신부"},
														{"なし", "障害者", "国家有功者", "三人の子供", "妊婦"}};
	
	public static final String AGE_VARIATIONS[][] = {{"Normal", "Elder", "Kid", "Baby"},
													 {"일반", "경로", "아동", "유아"},
													 {"一般", "敬老", "児童", "幼児"}};

	public static final String LANGUAGE_OPTION[][]= {{"Total count", "Total cost", " Ticket count sorted by option", "Ticket cost sorted by option", "Ticket count sorted by age", "Ticket cost sorted by age"}, 
													{"총 매수", "총 금액", "우대사항 별 매수", "우대사항 별 금액", "연령 별 매수", "연령 별 금액"},
													{"總枚数", "合計金額", "優待事項別枚数", "優待事項別金額", "年齢別枚数", "年齢別金額"}};


}
