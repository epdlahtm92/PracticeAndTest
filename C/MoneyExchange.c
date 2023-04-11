#include <stdio.h>

int main() {
	int inputMoney = 0;
	const double CURRENCY_EXCHANGE_RATES[] = {1322.50, 9.99358, 1436.21, 978.18, 1636.20};
	//const char CURRENCY_UNITS[] = {'$', 'Y', 'E', 'H', 'P'};
	const double EXCHANGE_FEE = 0.0175;
	double feePerBill;
	double totalFee;
	int option;
	int exchangedMoney;
	int choosenNumber;
	int remainMoney;

	
	printf("Choose Option\n1.KOR WON -> others\n2.Others -> KOR WON\n");
	scanf("%d",&option);

	printf("Please input money\n");
	scanf("%d", &inputMoney);
	
	printf("\nChoose Currency\n1.USD 2.JPY 3.EUR 4.CAD 5.GBP\nExchange Fee : %f %% \n", 
																	EXCHANGE_FEE * 100);
	scanf("%d", &choosenNumber);
	
	if (choosenNumber == 1){
		printf("\nUSD");
	} else if (choosenNumber == 2) {
		printf("\nJPY");
	} else if (choosenNumber == 3) {
		printf("\nEUR");
	} else if (choosenNumber == 4) {
		printf("\nHKD");
	} else if (choosenNumber == 5) {
		printf("\nGBP");
	}
	printf(" - Currency Exchange Rate : %f\n", CURRENCY_EXCHANGE_RATES[choosenNumber - 1]);
	
	feePerBill = EXCHANGE_FEE * CURRENCY_EXCHANGE_RATES[choosenNumber - 1];
	printf("Fee Per Bill : %f Won\n",feePerBill);
	
	if(option == 1){
		exchangedMoney = (int)(inputMoney / 
								(CURRENCY_EXCHANGE_RATES[choosenNumber - 1] + feePerBill));
	} else {
		exchangedMoney = (inputMoney * (CURRENCY_EXCHANGE_RATES[choosenNumber - 1] - feePerBill));
	}
	
	printf("Exchanged Money : %d\n", exchangedMoney);
	
	if (option ==1){
		totalFee = feePerBill * exchangedMoney;
	} else {
		totalFee = feePerBill * inputMoney;
	}
	
	if(totalFee == (int) totalFee) {
		totalFee = (int) totalFee;
	} else {
		totalFee = (int) totalFee + 1;
	}
	printf("Total Fee : %.f Won\n", totalFee);
	
	if (option == 1){
		remainMoney = inputMoney - (exchangedMoney * 
									CURRENCY_EXCHANGE_RATES[choosenNumber -1]) - totalFee;
	} else {
		remainMoney = inputMoney - (exchangedMoney / 
									CURRENCY_EXCHANGE_RATES[choosenNumber -1]);
	}
	
	remainMoney = (int) (remainMoney / 10) * 10;
	printf("Remain Money : %d Won\n", remainMoney);

	printf("1000 : %d\n", remainMoney / 1000);
	remainMoney = remainMoney % 1000;
	printf("500 : %d\n", remainMoney / 500);
	remainMoney = remainMoney % 500;
	printf("100 : %d\n", remainMoney / 100);
	remainMoney = remainMoney % 100;
	printf("50 : %d\n", remainMoney / 50);
	remainMoney = remainMoney % 50;
	printf("10 : %d\n", remainMoney / 10);
	
	
return 0;	
}
