#include <stdio.h>
#include <time.h>

int main(){
	int lastDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	int lastOddDays[] = {31,29,31,30,31,30,31,31,30,31,30,31};
	int inputYear;
	int weekDay = 1; // 1 is monday
	int totalDay; // from 1900;
	int oddDay;
	int index;
	int weekSpace;
	int day;
	
	printf("Please input Year\n");
	scanf("%d", &inputYear);
	
	for (index = 1900; index < inputYear; index++){
		if((index % 4 == 0) && (index % 100 != 0) || (index % 400 == 0)){
		oddDay = oddDay +1;
		} 
	}
	
	printf("OddDay : %d\n", oddDay);
	
	totalDay = ((inputYear - 1900) * 365) + oddDay;
	
	printf("%d\n", totalDay);
	weekDay = totalDay % 7;	
	printf("%d\n\n", weekDay);
	
	if ((inputYear % 4 == 0) && (inputYear % 100 != 0) ||(inputYear % 400 == 0)) {
		for (index = 0; index < 12; index++){
			lastDays[index] = lastOddDays[index];
		}
	}
	
	for (index = 0; index < 12; index++) {
		printf("\t %d¿ù\n", index + 1);
		printf("=====================\n");
		printf("%3c%3c%3c%3c%3c%3c%3c\n",'S','M','T', 'W', 'T', 'F', 'S');
		
		for (weekSpace = 0; weekSpace < weekDay; weekSpace++) { 
			printf("   ");
		}
		
		for(day = 1; day < lastDays[index] + 1; day++){
			printf("%3d", day);
			weekDay = weekDay + 1;
				if (weekDay == 7){
					printf("\n");
					weekDay = 0;
				}
		}
		printf("\n\n");
	}
	return 0;
}
