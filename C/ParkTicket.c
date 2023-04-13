#include <stdio.h>
#include <stdlib.h>
#include <time.h>

	const int ticketCosts[] = {62000,52000,46000,68000};
	const long long birthDenom = 1000000;
	int idNums[7] = {0};
	int nowYear; 
	int nowMon; 
	int nowDate;
	int birthYear, birthMon, birthDate;
	

void today () {

	struct tm* t;
	time_t base = time(NULL);
	t = localtime(&base);
	
	nowYear = t -> tm_year + 1900;
	nowMon = t -> tm_mon + 1;
	nowDate = t -> tm_mday;
	
}	
	
int typeCalendar(){

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

	int todayType = calendar[nowMon - 3][nowDate];
	
//	char types[4] = {'A','B','C','D'};
	
//	return types[todayType];
	return todayType;
}

void birthdayArray(int idBirth){

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

}

int ageCalculator(){
	int age;
	birthYear = idNums[0]*10 + idNums[1];
		printf("\nbirthYear : %d\n", birthYear);
	
	birthMon = idNums[2]*10 + idNums[3];
		printf("birthMon : %d\n", birthMon);

	birthDate = idNums[4]*10 + idNums[5];
		printf("birthDate : %d\n", birthDate);
	
	if(idNums[6] == 3 || idNums[6] == 4) {	
		if (birthMon <= nowMon && birthDate <= nowDate) {
			age = nowYear - (birthYear + 2000);
		} else{
			age = nowYear - (birthYear + 2000) - 1;
		}
	} else {
		if (birthMon <= nowMon && birthDate <= nowDate) {
			age = nowYear - (birthYear + 1900);
		} else{
			age = nowYear - (birthYear + 1900) - 1;
		}
	}
	return age;
}

int preferOption(int option, int ageOption, int ticketType){
	
	int convertedCost;
	int disabledDiscounts[] = {25000,21000,19000,28000};
	int meritsDiscounts[] = {31000,26000,23000,34000}; // just half price
	int threeKidsDiscounts[] = {13000,11000,10000,14000};
	int pregnantWomanDiscounts[] = {10000,8000,7000,11000}; 
	
	if (option == 1) {
		convertedCost = ticketCosts[ticketType];
	} else if (option == 2){ // disabled
		convertedCost = convertedCost = ticketCosts[ticketType] - disabledDiscounts[ticketType];
	} else if (option == 3){ // merits
		convertedCost = convertedCost = ticketCosts[ticketType] - meritsDiscounts[ticketType];
	} else if (option == 4){ //threeKids
		convertedCost = convertedCost = ticketCosts[ticketType] - threeKidsDiscounts[ticketType];
	} else if (option == 5){ // pregnantwoman
		convertedCost = convertedCost = ticketCosts[ticketType] - pregnantWomanDiscounts[ticketType];
	}
	return convertedCost;
}

int ageDiscount (int cost, int age, int DCoption){
	int resCost;
	int normalAgeDC = 10000;
	int disabledAgeDC = 6000;
	int meritsAgeDC = 5000;
	int threeKidsAgeDC = 8000;
	
	if (age >= 65 || age <=12){
		if (age >=3){
			if (DCoption == 1){
				resCost = cost - normalAgeDC;
			} else if (DCoption == 2) {
				resCost = cost - disabledAgeDC;
			} else if (DCoption == 3) {
				resCost = cost - meritsAgeDC;
			} else if (DCoption == 4) {
				resCost = cost - threeKidsAgeDC;
			} else {
				resCost = cost;
			}
		} else {
			resCost = 0;
		}
	} else {
		resCost = cost;
	}
	resCost = cost;
	
	return resCost;
}
int main() {
	long long idNum;
	int idBirth;
	int ticketType;
	int index;
	int option;
	int ticketCount;
	int newTicketCost;
	int finalCost;
	int totalCost;
	int age;
	int sumCost = 0;
	int sumPerson = 0;
	int stopOption = 0;
	char c;
	char types[4] = {'A','B','C','D'};
	
	today();
	lldiv_t dt;
	
	//time
	printf("%d %d %d\n", nowYear, nowMon, nowDate);
	
	// ticket type
	printf("ticket type\n1.A\n2.B\n3.C\n4.D\n");
	ticketType = typeCalendar();
	printf("today's ticket type is : %c\n", types[ticketType]); 
	
	while(stopOption != 3){	
	// id number
	printf("input your ID number\n");
	scanf("%lld", &idNum);
	printf("\n%lld\n", idNum);

	//id birth
	dt = lldiv(idNum, birthDenom);
	idBirth = (int) dt.quot;
	printf("idBirth int : %d\n", idBirth);
	
	//id Nums
	birthdayArray(idBirth);
	printf("idNums Array : ");
	for (index = 0; index < 7; index++) {
		printf("%d ", idNums[index]);
	}
	
	// age
	age = ageCalculator();
	printf("\nage : %d\n", age);
	
	// option
	printf("choose your Preferential treatment\n1. nothing\n2. the Disabled\n3. national merit\n4. more than three kids\n5. pregnant woman\n");
	scanf("%d", &option);
	newTicketCost = preferOption(option, age, ticketType);
	printf("new ticket cost : %d", newTicketCost);
	
	//age discount
	finalCost = ageDiscount(newTicketCost, age, option);
	printf("\nfinal cost : %d Won\n", finalCost);
	
	// ticket count
	printf("how many ticket (lees than 10)\n");
	scanf("%d", &ticketCount);
	printf("\ntickets : %d\n", ticketCount);
	
	// ticket cost
	totalCost = newTicketCost * ticketCount;
	printf("Total Cost : %d Won\nthank you\n", totalCost);
	
	sumCost += totalCost;
	sumPerson += ticketCount;
	
	//end
	printf("more order?\n 1. Y\n 2. N\n");
	scanf("%d", stopOption);
	if (stopOption == 2) {
		printf("sumCost : %d\n sumPerson : %d", sumCost, sumPerson);
		stopOption++;
		break;
	} else {
		continue;
	}
	
	}
		
}
	

