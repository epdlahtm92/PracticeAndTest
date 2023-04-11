#include <stdio.h>
#include <time.h>

int main () {
	int idNumbers[6];
	int inputNumber;
	int yearOfBirth;
	int monthOfBirth;
	int dayOfBirth;
	int year;
	int month;
	int day;
	int age;
	int i;
	int numberPlace = 100000;
	
	struct tm* t;
	time_t base = time(NULL);
	t = localtime(&base);
	
	printf("Please input your ID Number\n");
	scanf("%d", &inputNumber);
	
	for (i = 0; i < 6; i++){
		idNumbers[i] = inputNumber / numberPlace;
		inputNumber = inputNumber % numberPlace;
		numberPlace /= 10;
	}
	
	for (i = 0; i < 6; i++) {
		printf("%d", idNumbers[i]);
	}
	
	printf("\n%d %d %d\n", t->tm_year + 1900, t->tm_mon + 1, t->tm_mday);
	year = t->tm_year + 1900;
	month = t->tm_mon + 1;
	day = t->tm_mday;
	
	if (idNumbers[0] == 0) {
		yearOfBirth = 2000 + (idNumbers[0]*10) + idNumbers[1];
	} else {
		yearOfBirth = 1900 + (idNumbers[0]*10) + idNumbers[1];
	}
	
	monthOfBirth = idNumbers[2] * 10 + idNumbers[3];
	dayOfBirth = idNumbers[4] * 10 + idNumbers[5];
	
	
	if(month + 1 > monthOfBirth && day > dayOfBirth){
		age = year - yearOfBirth - 1;
	} else {
		age = year - yearOfBirth;
	}
	
	printf("%d", age);
	return 0;
}
