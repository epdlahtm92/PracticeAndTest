#include <stdio.h>

int main(){
	int column;
	int tableCount;
	int index;
	int multiNumber;
	int row;
	
	printf("How many tables\n");
	scanf("%d", &tableCount);
	printf("Please input column\n");
	scanf("%d", &column);
	
	
	for(row = 2; row < tableCount + 1; row += column){
		for(multiNumber = 1; multiNumber < 10; multiNumber++){
			for(index = row; index < row + column; index++){
				if(index == tableCount + 1) {
					break;
				}
				printf(" %-2d * %d = %-5d ", index, multiNumber, (multiNumber * index));
			}
			printf("\n");
		}
		printf("\n");
	}
	
	return 0;
}
