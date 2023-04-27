//package ParkTicketProgram;
//
//import java.util.Locale;
//
//public class LanguageSelection {
//	
//	private static final Locale CURRENT_LOCALE = Locale.getDefault();
//	private static final String LOCALE_TO_STRING = CURRENT_LOCALE.toLanguageTag();
//	
//	private static final String LANGUAGE_TAG[] = {"en", "ko", "jp"};
//	
//	private static final String LANUGUAGE_OPTION_QUESTION_PRINT = "Language : \n1. English\n2. Korean\n3. Japanese";
//
//	private static final String HEADER_LANGUAGE_VARIATIONS[][] = {{"Today is ", "Today's ticket type is ", "Please input your ID number"},
//														{"오늘의 날짜는 ", "오늘의 티켓 종류는 ", "주민번호를 입력하세요"},
//														{"今日の日付は : ", "今日のチケットの種類は : ", "id番号を入力してください"}};
//	
//
//	private static final String BODY_LANGUAGE_VARIATIONS[][] = {{"Please choose your Preferential Treatment\n"
//														+ "1. None\n" 
//														+ "2. The Disabled\n"
//														+ "3. A men of national merit\n"
//														+ "4. More than three kids\n"
//														+ "5. Pregnant Woman",
//														"How many tickets (less than 10)"},
//			
//														{"우대사항을 입력하세요\n"
//														+ "1. 우대사항 없음\n"
//														+ "2. 장애인\n"
//														+ "3. 국가유공자\n"
//														+ "4. 세자녀 이상\n"
//														+ "5. 임신부",
//														"몇 장 구매하시겠습니까"},
//														
//														{"優待事項を入力してください\n"
//														+"1. なし\n"
//														+"2. 障害者\n"
//														+"3. 国家有功者\n"
//														+"4. 三人の子供\n"
//														+"5. 妊婦",
//														"何枚ご購入なさいますか"}};
//	
//
//	private static final String INFO_LANGUAGE_VARATIONS[][] = {{"Quantity : ", "your age is ", "Option : ", "Option applied cost : ", "Age applied Cost : ", "Total Cost : "},
//															  {"수량 : ", "고객님의 나이 : ", "우대사항 : ", "우대사항 할인 적용 금액 : ", "연령 할인 적용 금액 : ", "총 금액 : "},
//															  {"数量 : ", "お客様の年 : ", "優待事項 : ", "優待事項 割引金額 : ", "年齢 割引金額 : ", "合計金額 : "}};		
//	
//	
//	private static final String END_MORE_ORDER_LANGUAGE_VARIATIONS[] = {"More order?\n 1. Yes\n 2. NO",
//																		"추가 주문 하시겠습니까?\n1. 예\n2. 아니오",
//																		"もっと注文しますか\n1. はい\n2. いいえ"};
//	
//	private static final String RESULT_1_ORDER_COUNT_VARIATIONS[] = {"Total order count : ", "총 주문 횟수 : ", "総注文回数 : "};
//	
//	private static final String RESULT_2_LIST_FIELD_NAME_VARIATIONS[][] = {{"ID", "Age", "Gender", "Option", "Amount", "Cost"}, 
//																		   {"주민번호", "나이", "성별", "우대사항", "수량", "금액"},
//																		   {"id番号", "年齢", "性別", "優待事項", "数量", "金額"}};
//
//	
//	private static final String SORT_1_SORT_CRITERIA_VARIATIONS[][] = {{"sort by age", "sort by option"}, 
//																	   {"나이별 분류", "우대사항별 분류"},
//																	   {"年齢別分類", "優待事項別分類"}};
//	
//	private static final String SORT_2_AGE_FIELD_PRINTS[][] =  {{"Normal", "Elder", "Kid", "Baby"},
//																 {"일반", "경로", "아동", "유아"},
//																 {"一般", "敬老", "児童", "幼児"}};
//	
//	private static final String SORT_3_OPTION_FIELD_PRINTS[][] = {{"Nothing", "Disabled", "Merit", "3Kids", "PregWoman"},
//																  {"없음", "장애인", "국가유공자", "다자녀", "임신부"},
//																  {"なし", "障害者", "国家有功者", "三人の子供", "妊婦"}};
//
//	
//	public int getLanguageSelectionNum() {
//		int languageSelectionNum = 0;
//		for (int index = 0; index < LANGUAGE_TAG.length; index++) {
//			if (LOCALE_TO_STRING.contains(LANGUAGE_TAG[index])) {
//				languageSelectionNum = index;
//			}
//		}
//		return languageSelectionNum;
//
//	}
//	
//	
//	public String getLocaleToString() {
//		return LOCALE_TO_STRING;
//	}
//
//	public String getLanuguageOptionQuestionPrint() {
//		return LANUGUAGE_OPTION_QUESTION_PRINT;
//	}
//
//	public String[][] getHeaderLanguageVariations() {
//		return HEADER_LANGUAGE_VARIATIONS;
//	}
//
//	public String[][] getBodyLanguageVariations() {
//		return BODY_LANGUAGE_VARIATIONS;
//	}
//
//	public String[][] getInfoLanguageVarations() {
//		return INFO_LANGUAGE_VARATIONS;
//	}
//
//	public String[] getEndMoreOrderLanguageVariations() {
//		return END_MORE_ORDER_LANGUAGE_VARIATIONS;
//	}
//
//	public String[] getResult1OrderCountVariations() {
//		return RESULT_1_ORDER_COUNT_VARIATIONS;
//	}
//
//	public String[][] getResult2ListFieldNameVariations() {
//		return RESULT_2_LIST_FIELD_NAME_VARIATIONS;
//	}
//
//	public String[][] getSort1SortCriteriaVariations() {
//		return SORT_1_SORT_CRITERIA_VARIATIONS;
//	}
//
//	public String[][] getSort2AgeFieldPrints() {
//		return SORT_2_AGE_FIELD_PRINTS;
//	}
//
//	public String[][] getSort3OptionFieldPrints() {
//		return SORT_3_OPTION_FIELD_PRINTS;
//	}
//	
//	
//	
//	
//	
//	
//}
