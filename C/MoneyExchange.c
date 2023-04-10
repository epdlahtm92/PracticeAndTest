#include <stdio.h>

int main() {
	int inputMoney = 0;
	double const currencyExchangeRates[] = {1322.50, 9.99358, 1436.21, 978.18, 1636.20};
	//char const currencyUnits[] = {'$', 'Y', 'E', 'H', 'P'};
	double const exchangeFee  = 0.0175;
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
	
	printf("\nChoose Currency\n1.USD 2.JPY 3.EUR 4.CAD 5.GBP\nExchange Fee : %f %% \n", exchangeFee * 100);
	scanf("%d", &choosenNumber);
	
	if (choosenNumber == 1){
		printf("\nUSD - Currency Exchange Rate : %f\n", currencyExchangeRates[choosenNumber - 1]);
	} else if (choosenNumber == 2) {
		printf("\nJPY - Currency Exchange Rate : %f\n", currencyExchangeRates[choosenNumber - 1]);
	} else if (choosenNumber == 3) {
		printf("\nEUR - Currency Exchange Rate : %f\n", currencyExchangeRates[choosenNumber - 1]);
	} else if (choosenNumber == 4) {
		printf("\nHKD - Currency Exchange Rate : %f\n", currencyExchangeRates[choosenNumber - 1]);
	} else if (choosenNumber == 5) {
		printf("\nGBP - Currency Exchange Rate : %f\n", currencyExchangeRates[choosenNumber - 1]);
	}
	
	feePerBill = exchangeFee * currencyExchangeRates[choosenNumber - 1];
	printf("Fee Per Bill : %f Won\n",feePerBill);
	
	if(option == 1){
		exchangedMoney = (int)(inputMoney / (currencyExchangeRates[choosenNumber - 1] + feePerBill));
	} else {
		exchangedMoney = (inputMoney * (currencyExchangeRates[choosenNumber - 1] - feePerBill));
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
		remainMoney = inputMoney - (exchangedMoney * currencyExchangeRates[choosenNumber -1]) - totalFee;
	} else {
		remainMoney = inputMoney - (exchangedMoney / currencyExchangeRates[choosenNumber -1]);
	}
	
	remainMoney = (int) (remainMoney / 10) * 10;
	printf("Remain Money : %d Won", remainMoney);

return 0;	
}
