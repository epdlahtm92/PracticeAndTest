package ParkTicketProgram;

public class LanguageSelection {

	private static final String headerLanguageVarations[][] = {{"Today is ", "Today's ticket type is ", " Please input your ID number"},
														{"오늘의 날짜는 ", "오늘의 티켓 타입은 ", "주민번호를 입력하세요"}};
	

	private static final String bodyLanguageVariations[][] = {{"Please choose your Preferential Treatment\n"
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
	

	private static final String infoLanguageVariations[][] = {{"Quantity : ", "your age is ", "Option : ", "Option applied cost : ", "Age applied Cost : ", "Total Cost : "},
															  {"수량 :", "고객님의 나이 : ", "우대사항 : ", "우대사항 할인 적용 금액 : ", "연령 할인 적용 금액 : ", "총 금액 : "}};		
	
	
	private static final String endMoreOrderPrints[] = {"More order?\n 1. Yes\n 2. NO","추가 주문 하시겠습니까?\n1. 예\n2. 아니오"};
	
	private static final String result1orderCountPrints[] = {"Total order count : ", "총 주문 횟수 :"};
	private static final String result2ListFieldNamePrints[][] = {{"ID", "Age", "Gender", "Option", "Amount", "Cost"}, 
																  {"주민번호", "나이", "성별", "우대사항", "수량", "금액"}};

	
	private static final String sort1SortCriteriaPrints[][] = {{"sort by age", "sort by option"}, 
															   {"나이별 분류", "우대사항별 분류"}};
	
	private static final String sort2AgeFieldPrints[][] =  {{"Normal", "Elder", "Kid", "Baby"},
															{"일반", "경로", "아동", "유아"}};
	
	private static final String sort4OptionFieldPrints[][] = {{"Nothing", "Disabled", "Merit", "3Kids", "PregWoman"},
															  {"없음", "장애인", "국가유공자", "다자녀", "임신부"}};
	
	
	
	public String[][] getHeaderLanguageVarations() {
		return headerLanguageVarations;
	}
	public String[][] getBodyLanguageVariations() {
		return bodyLanguageVariations;
	}
	public String[][] getInfoLanguageVariations() {
		return infoLanguageVariations;
	}
	public String[] getEndMoreOrderPrints() {
		return endMoreOrderPrints;
	}
	public String[] getResult1orderCountPrints() {
		return result1orderCountPrints;
	}
	public String[][] getResult2ListFieldNamePrints() {
		return result2ListFieldNamePrints;
	}
	public String[][] getSort1SortCriteriaPrints() {
		return sort1SortCriteriaPrints;
	}
	public String[][] getSort2AgeFieldPrints() {
		return sort2AgeFieldPrints;
	}
	public String[][] getSort4OptionFieldPrints() {
		return sort4OptionFieldPrints;
	}
	
	
}
