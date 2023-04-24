package ParkTicketProgram;

public class LanguageSelection {
	
	private static final String LANUGUAGE_OPTION_QUESTION_PRINT = "Language : \n1. English\n2. Korean";

	private static final String HEADER_LANGUAGE_VARIATIONS[][] = {{"Today is ", "Today's ticket type is ", " Please input your ID number"},
														{"오늘의 날짜는 ", "오늘의 티켓 종류는 ", "주민번호를 입력하세요"}};
	

	private static final String BODY_LANGUAGE_VARIATIONS[][] = {{"Please choose your Preferential Treatment\n"
														+ "1. Nothing\n" 
														+ "2. The Disabled\n"
														+ "3. A men of national merit\n"
														+ "4. More than three kids\n"
														+ "5. Pregnant Woman",
														"How many tickets (less than 10)"},
			
														{"우대사항을 입력하세요\n"
														+ "1. 우대사항 없음\n"
														+ "2. 장애인\n"
														+ "3. 국가유공자\n"
														+ "4. 세자녀 이상\n"
														+ "5. 임신부",
														"몇 장 구매하시겠습니까"}};
	

	private static final String INFO_LANGUAGE_VARATIONS[][] = {{"Quantity : ", "your age is ", "Option : ", "Option applied cost : ", "Age applied Cost : ", "Total Cost : "},
															  {"수량 :", "고객님의 나이 : ", "우대사항 : ", "우대사항 할인 적용 금액 : ", "연령 할인 적용 금액 : ", "총 금액 : "}};		
	
	
	private static final String END_MORE_ORDER_LANGUAGE_VARIATIONS[] = {"More order?\n 1. Yes\n 2. NO","추가 주문 하시겠습니까?\n1. 예\n2. 아니오"};
	
	private static final String RESULT_1_ORDER_COUNT_VARIATIONS[] = {"Total order count : ", "총 주문 횟수 :"};
	private static final String RESULT_2_LIST_FIELD_NAME_VARIATIONS[][] = {{"ID", "Age", "Gender", "Option", "Amount", "Cost"}, 
																  {"주민번호", "나이", "성별", "우대사항", "수량", "금액"}};

	
	private static final String SORT_1_SORT_CRITERIA_VARIATIONS[][] = {{"sort by age", "sort by option"}, 
															   {"나이별 분류", "우대사항별 분류"}};
	
	private static final String SORT_2_AGE_FIRELD_PRINTS[][] =  {{"Normal", "Elder", "Kid", "Baby"},
															{"일반", "경로", "아동", "유아"}};
	
	private static final String SORT_3_OPTION_FIELD_PRINTS[][] = {{"Nothing", "Disabled", "Merit", "3Kids", "PregWoman"},
															  {"없음", "장애인", "국가유공자", "다자녀", "임신부"}};

	public String getLanuguageOptionQuestionPrint() {
		return LANUGUAGE_OPTION_QUESTION_PRINT;
	}

	public String[][] getHeaderLanguageVariations() {
		return HEADER_LANGUAGE_VARIATIONS;
	}

	public String[][] getBodyLanguageVariations() {
		return BODY_LANGUAGE_VARIATIONS;
	}

	public String[][] getInfoLanguageVarations() {
		return INFO_LANGUAGE_VARATIONS;
	}

	public String[] getEndMoreOrderLanguageVariations() {
		return END_MORE_ORDER_LANGUAGE_VARIATIONS;
	}

	public String[] getResult1OrderCountVariations() {
		return RESULT_1_ORDER_COUNT_VARIATIONS;
	}

	public String[][] getResult2ListFieldNameVariations() {
		return RESULT_2_LIST_FIELD_NAME_VARIATIONS;
	}

	public String[][] getSort1SortCriteriaVariations() {
		return SORT_1_SORT_CRITERIA_VARIATIONS;
	}

	public String[][] getSort2AgeFireldPrints() {
		return SORT_2_AGE_FIRELD_PRINTS;
	}

	public String[][] getSort3OptionFieldPrints() {
		return SORT_3_OPTION_FIELD_PRINTS;
	}
	
	
	
	
	
	
}
