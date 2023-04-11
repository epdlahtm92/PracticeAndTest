#include <stdio.h>
#include <stdbool.h>

int main() {
	int inputMoney = 0;
	const double CURRENCY_EXCHANGE_RATES[] = {1322.50, 9.99358, 1436.21, 978.18, 1636.20};
	const char CURRENCY_UNITS[] = {'U', 'S', 'D', 'J', 'P', 'Y', 'E', 'U', 'R', 'C', 'A', 'D', 'G', 'B', 'P'};
	const double EXCHANGE_FEE = 0.0175;
	double feePerBill;
	double totalFee;
	double temp;
	int option;
	int exchangedMoney;
	int choosenNumber;
	int remainMoney;
	int remainChange = 1000;
	int i;
	
	while(true){
		printf("Choose Option\n1.KOR WON -> others\n2.Others -> KOR WON\n3. exit\n");
		scanf("%d",&option);
			if (option == 1 || option ==2){
				break;
			} else if (option == 3){
				return 0;
			} else {
				printf("Error : Please choose 1 or 2\n");
				continue;
			}
	}
	
	printf("Please input money\n");
	scanf("%d", &inputMoney);

	while(true){
		printf("\nChoose Currency\n1.USD 2.JPY 3.EUR 4.CAD 5.GBP\nExchange Fee : %f %% \n", EXCHANGE_FEE * 100);
		scanf("%d", &choosenNumber);
			if (choosenNumber > 0 && choosenNumber < 6){
				break;
			} else {
				printf("Error : Please choose 1 to 5\n");
				continue;
			}
	}

	int menuNumber = choosenNumber - 1;
	
	printf("%c%c%c", CURRENCY_UNITS[menuNumber * 3], CURRENCY_UNITS[(menuNumber * 3) + 1],CURRENCY_UNITS[(menuNumber * 3) + 2]);

	printf(" - Currency Exchange Rate : %f\n", CURRENCY_EXCHANGE_RATES[menuNumber]);
	
	feePerBill = EXCHANGE_FEE * CURRENCY_EXCHANGE_RATES[menuNumber];
	printf("Fee Per Bill : %f Won\n",feePerBill);
	
	if(option == 1){
		exchangedMoney = (int)(inputMoney / (CURRENCY_EXCHANGE_RATES[menuNumber] + feePerBill));
	} else {
		exchangedMoney = (inputMoney * (CURRENCY_EXCHANGE_RATES[menuNumber] - feePerBill));
	}
	
	printf("Exchanged Money : %d\n", exchangedMoney);
	
	if (option ==1){
		totalFee = feePerBill * exchangedMoney;
	} else {
		totalFee = feePerBill * inputMoney;
	}
	
	temp = (int) totalFee;
	
	if(totalFee ==  temp) {
		totalFee = (int) totalFee;
	} else {
		totalFee = (int) totalFee + 1;
	}
	printf("Total Fee : %.f Won\n", totalFee);
	
	if (option == 1){
		remainMoney = inputMoney - (exchangedMoney * CURRENCY_EXCHANGE_RATES[menuNumber]) - totalFee;
	} else {
		remainMoney = inputMoney - (exchangedMoney / CURRENCY_EXCHANGE_RATES[menuNumber]);
	}
	
	remainMoney = (int) (remainMoney / 10) * 10;
	printf("Remain Money : %d Won\n", remainMoney);


	for (i = 0; i < 5; i++){
	printf("%d : %d\n", remainChange, remainMoney / remainChange);
	remainMoney = remainMoney % remainChange;
		if (i % 2 == 0){	
			remainChange /= 2;
		} else {
			remainChange /= 5;
		}
	}
	
return 0;	
}
