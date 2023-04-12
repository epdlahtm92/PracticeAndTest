#include <stdio.h>
#include <process.h>
#include <Windows.h>
#include <string.h>

int char_cnt(char *ptr, char ch) {
	int i = 0;
	while (*ptr) {
		if(*ptr++ == ch){
			i++;
		}
	}
	return(i);
}

int main(){
	int index;
	int numbers[1000];
	int count;
	int clap;
	
	for (index = 1; index < 1001; index++) {
		char buffer[4];
		_itoa(index, buffer, 10);
		if (strstr(buffer, "3") != NULL || strstr(buffer, "6") != NULL || strstr(buffer, "9") != NULL) {
			count = 0;
			count = char_cnt(buffer, '3');
			count += char_cnt(buffer, '6');
			count += char_cnt(buffer, '9');
			for(clap = 0; clap < count; clap++) {
				printf("%s\a ", "Clap!");
				Sleep(200);
			}
			printf("\n");
		} else{
			printf("%s\n", buffer);
		}	

		Sleep(500);
	}
	
	return 0;
}

