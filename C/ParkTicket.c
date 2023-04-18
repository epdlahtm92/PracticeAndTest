#include <stdio.h>
#include <stdlib.h>
#include <time.h>

const int ORIGINAL_TICKET_COSTS[] = {62000,52000,46000,68000};
const int TIME_TICKET_TYPE = 1;
const int ID_NUMBER = 2;
const int AGE_PREFER = 3;
const int TICKET_COUNT = 4;
const int TOTAL_COST = 5;

int * today ();	
int typeCalendar();
int * birthdayArray();
int ageCalculator();
int preferOptionCalculator();
int ageDiscount ();
int sumCalculator();
void headerPrint();
int * reportList();
int * ticketSort();
int * dailySort();
int * preferSort();

int main() {
	long long idNum;
	int ticketType;
	int index;
	int indexCol;
	int preferOption;
	int ticketCount;
	int optionTicketCost;
	int ageTicketCost;
	int totalTicketCost;
	int age;
	int orderCount = 1;
	int sumCost = 0;
	int sumPerson = 0;
	int stopOption = 0;
	int reportLists[100][6];
	
	//time & ticket type (1)
	int * nowArray = today();
	ticketType = typeCalendar(nowArray);
	headerPrint(TIME_TICKET_TYPE, nowArray, ticketType); //headerprint : option 1 - time & today's ticket type print
	
	while(orderCount < 101){	

		// id number (no print)
		headerPrint(ID_NUMBER);// headerprint : option 2 - ID Number print  
		scanf("%lld", &idNum);
		printf("\n%lld\n", idNum);
		
		//id Nums (no print)
		int * idNums = birthdayArray(idNum);
		printf("idNums Array : ");
		for (index = 0; index < 7; index++) {
			printf("%d ", idNums[index]);
		}
		
		// age & prefer treatment
		age = ageCalculator(nowArray, idNums);
		headerPrint(AGE_PREFER,NULL,NULL,age); // headerprint : Option 3 - age & preferential treatment option print
		scanf("%d", &preferOption); 
		optionTicketCost = preferOptionCalculator(preferOption, ticketType);
		printf("option ticket cost : %d", optionTicketCost); // no print
		
		//age discount (no print)
		ageTicketCost = ageDiscount(optionTicketCost, age, preferOption);
		printf("\nage discounted cost : %d Won\n", ageTicketCost); 
		
		// ticket count & total ticket cost(3)
		headerPrint(TICKET_COUNT); // headerprint : option 4 - ticket count
		scanf("%d", &ticketCount);
		totalTicketCost = ageTicketCost * ticketCount;
		headerPrint(TOTAL_COST, NULL,NULL,NULL, ticketCount, totalTicketCost); // headerprint : option 5 - total cost print
		
		// sum ticket counts & sum ticket cost
		sumCost += totalTicketCost;
		sumPerson += ticketCount;
		
		//report list
		int (*reportLists)[100] = (void*) reportList(nowArray, ticketType, age, ticketCount, totalTicketCost, preferOption);
		
		//end
		printf("more order?\n 1. Y\n 2. N\n");
		scanf("%d", &stopOption);
		if (stopOption == 2) {
			break;
		} else {
			orderCount++;
			continue;
		}
		
	}
	printf("total ticket cost : %d\ntotal count : %d", sumCost, sumPerson);
	for (index = 0 ; index < orderCount; index++){
		for (indexCol = 0; indexCol < 6; indexCol++){
			printf("%d", reportLists[index][indexCol]);
		}
		printf("\n");
	}
		
}
int * today () {
	static int nowArray[3];
	
	struct tm* t;
	time_t base = time(NULL);
	t = localtime(&base);
	
	nowArray[0] = t -> tm_year + 1900;
	nowArray[1] = t -> tm_mon + 1;
	nowArray[2] = t -> tm_mday;
	
	return nowArray;
}	
	
int typeCalendar(int nowArray[3]){

	const int calendar[10][31] = {
		{1,2,2,1,1,2,2,2,2,2,1,1,2,2,2,2,2,0,0,1,1,1,1,1,0,0,1,1,1,1,1}, // MARCH
		{3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3}, // APRIL
		{3,0,0,0,3,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,3,0,0}, // MAY
		{0,0,3,3,3,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1}, // JUNE
		{0,0,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1,0,0,0}, // JULY
		{0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1}, // AUGUST
		{0,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0,0,3,3,3}, // SEPTEMBER
		{3,3,3,0,0,0,3,3,3,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0,0,0,0,3,3,0,0}, // OCTOBER
		{0,0,0,3,3,0,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,1,1}, // NOVEMBER
		{2,1,1,2,2,2,2,2,1,1,2,2,2,2,2,1,1,2,2,2,2,2,0,0,0,2,2,2,2,0,0}}; //DECEMBER

	int todayType = calendar[nowArray[1] - 3][nowArray[2]];
	
	return todayType;
}

void headerPrint(int printOption, int nowArray[3], int ticketType, int age, int ticketCount, int totalTicketCost) {

	if (printOption == TIME_TICKET_TYPE) {
		const char types[4] = {'A','B','C','D'};
		//today
		printf("%d %d %d\n", nowArray[0], nowArray[1], nowArray[2]);
		// ticket type
		printf("ticket type\n1.A\n2.B\n3.C\n4.D\n");
		printf("today's ticket type is : %c\n", types[ticketType]); 
	
	} else if (printOption == ID_NUMBER) {
		printf("input your ID number\n");
	
	} else if (printOption == AGE_PREFER){
		// age
		printf("\nage : %d\n", age); //(2)
		// prefer treatment option
		printf("choose your Preferential treatment\n1. nothing\n2. the Disabled\n3. national merit\n4. more than three kids\n5. pregnant woman\n"); //(2)
		
	} else if (printOption == TICKET_COUNT) {
		printf("how many ticket (lees than 10)\n");
	} else if (printOption == TOTAL_COST) {
		printf("\ntickets : %d\n", ticketCount); // (4)
		printf("Total Cost : %d Won\nthank you\n", totalTicketCost); // (4)
		
	} else {
		printf("%d", 112233);
	}
}

int * birthdayArray(long long idNum){
	const long long birthDenom = 1000000;
	static int idNums[7] = {0};
	
	lldiv_t dt;
	dt = lldiv(idNum, birthDenom);
	int idBirth = (int) dt.quot;
	
	if (idBirth / 100000 == 0) { // need refactoring
		idNums[1] = idBirth / 100000;
		  idBirth = idBirth % 100000;
       	idNums[2] = idBirth / 10000;
		  idBirth = idBirth % 10000;
       	idNums[3] = idBirth / 1000;
		  idBirth = idBirth % 1000;
       	idNums[4] = idBirth / 100;
		  idBirth = idBirth % 100;
		idNums[5] = idBirth / 10;
		idNums[6] = idBirth % 10;
	} else {
		idNums[0] = idBirth / 1000000;
		  idBirth = idBirth % 1000000;
		idNums[1] = idBirth / 100000;
		  idBirth = idBirth % 100000;
       	idNums[2] = idBirth / 10000;
		  idBirth = idBirth % 10000;
       	idNums[3] = idBirth / 1000;
		  idBirth = idBirth % 1000;
       	idNums[4] = idBirth / 100;
		  idBirth = idBirth % 100;
		idNums[5] = idBirth / 10;
		idNums[6] = idBirth % 10; 
	}
	
	return idNums;
}

int ageCalculator(int nowArray[3], int idNums[7]){
	int age;
	int birthYear = idNums[0] * 10 + idNums[1];
		printf("\nbirthYear : %d\n", birthYear);
	
	int birthMon = idNums[2] * 10 + idNums[3];
		printf("birthMon : %d\n", birthMon);

	int birthDate = idNums[4] * 10 + idNums[5];
		printf("birthDate : %d\n", birthDate);
	
	if(idNums[6] == 3 || idNums[6] == 4) {	
		if (birthMon <= nowArray[1] && birthDate <= nowArray[2]) {
			age = nowArray[0] - (birthYear + 2000);
		} else{
			age = nowArray[0] - (birthYear + 2000) - 1;
		}
	} else {
		if (birthMon <= nowArray[1] && birthDate <= nowArray[2]) {
			age = nowArray[0] - (birthYear + 1900);
		} else{
			age = nowArray[0] - (birthYear + 1900) - 1;
		}
	}
	return age;
}

int preferOptionCalculator(int prefrOption, int ticketType){ // using double array
	
	int convertedCost;
	const int disabledDiscounts[] = {25000,21000,19000,28000};
	const int meritsDiscounts[] = {31000,26000,23000,34000}; // just half price
	const int threeKidsDiscounts[] = {13000,11000,10000,14000};
	const int pregnantWomanDiscounts[] = {10000,8000,7000,11000}; 
	
	if (prefrOption == 1) {
		convertedCost = ORIGINAL_TICKET_COSTS[ticketType];
	} else if (prefrOption == 2){ // disabled
		convertedCost = convertedCost = ORIGINAL_TICKET_COSTS[ticketType] - disabledDiscounts[ticketType];
	} else if (prefrOption == 3){ // merits
		convertedCost = convertedCost = ORIGINAL_TICKET_COSTS[ticketType] - meritsDiscounts[ticketType];
	} else if (prefrOption == 4){ //threeKids
		convertedCost = convertedCost = ORIGINAL_TICKET_COSTS[ticketType] - threeKidsDiscounts[ticketType];
	} else if (prefrOption == 5){ // pregnantwoman
		convertedCost = convertedCost = ORIGINAL_TICKET_COSTS[ticketType] - pregnantWomanDiscounts[ticketType];
	}
	return convertedCost;
}

int ageDiscount (int optionTicketCost, int age, int prferOption){
	
	int resCost;
	const int normalAgeDC = 10000;
	const int disabledAgeDC = 6000;
	const int meritsAgeDC = 5000;
	const int threeKidsAgeDC = 8000;
	
	if (age >= 65 || age <=12 && age >=3){
	
		if (prferOption == 1){
			resCost = optionTicketCost - normalAgeDC;
		} else if (prferOption == 2) {
			resCost = optionTicketCost - disabledAgeDC;
		} else if (prferOption == 3) {
			resCost = optionTicketCost - meritsAgeDC;
		} else if (prferOption == 4) {
			resCost = optionTicketCost - threeKidsAgeDC;
		} else {
			resCost = optionTicketCost;
		}

	} else if(age < 3){
		resCost = 0;
	
	} else {
		resCost = optionTicketCost;
	}
	
	return resCost;
}

int * reportList(int nowArray[3], int ticketType, int age, int ticketCount, int totalTicketCost, int preferOption){
	int index;
	static int reportLists[100][6] = {0,};
	
	for(index = 0; index < 100; index++){
		if (reportLists[index][0] != 0) {
				reportLists[index][0] = (nowArray[0] * 10000) + (nowArray[1] * 100) + nowArray[2];
				reportLists[index][1] = age;
				reportLists[index][2] = ticketType;
				reportLists[index][3] = ticketCount;
				reportLists[index][4] = totalTicketCost;
				reportLists[index][5] = preferOption;
				break;
		} else {
			continue;
		}
	}
	return (int*) reportLists;
	
}
	

