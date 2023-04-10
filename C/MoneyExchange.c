#include <stdio.h>

int main() {
	int inputMoney = 0;
	double const currencyExchangeRates[] = {1320, 9.96, 1438.80, 168.16, 1637.59};
	char const currencyUnits[] = {'$', 'Y', 'E', 'H', 'P'};
	double const exchangeFee  = 0.003;
	double feePerBill;
	double totalFee;
	int exchangedMoney;
	int choosenNumber;
	int remainMoney;
	
	printf("Please input money\n");
	scanf("%d", &inputMoney);
	
	printf("\nChoose Currency\n1.USD 2.JPY 3.EUR 4.HKD 5.GBP\nExchange Fee : %f %% \n", exchangeFee * 100);
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
	
	exchangedMoney = (int)(inputMoney / (currencyExchangeRates[choosenNumber - 1] + feePerBill));
	printf("Exchanged Money : %d ", exchangedMoney);
	printf("%c\n", currencyUnits[choosenNumber - 1]);
	
	totalFee = feePerBill * exchangedMoney;
		if(totalFee == (int) totalFee) {
			totalFee = (int) totalFee;
		} else {
			totalFee = (int) totalFee + 1;
		}
	printf("Total Fee : %.f Won\n", totalFee);
	
	remainMoney = inputMoney - (exchangedMoney * currencyExchangeRates[choosenNumber -1]) - totalFee;
	remainMoney = (int) (remainMoney / 10) * 10;
	printf("Remain Money : %d Won", remainMoney);

return 0;	
}
