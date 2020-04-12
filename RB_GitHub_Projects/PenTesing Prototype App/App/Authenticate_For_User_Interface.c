#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <math.h>

void SecurityProtocol();
int extprog();

int main()
{
	SecurityProtocol();
	return 0;
}


int extprog()
{
	return 0;
}

void SecurityProtocol()
{
	char UsrName[20];
	int countervar = 5;
	printf("User Name?\n");
	
	
	for (int a = 0; a<=4; a++)
	{
		scanf("%s", &UsrName);
	
		if (strcmp(UsrName, "futaba") == 0)
			{
				system("python MainWin.py");
				break;
			}
			
		else
		{	countervar -= 1;
			printf("Access Denied!!!!\n");
			printf("You have %d attemps left\n", countervar);
		}
		
		if (a == 4)
			{
				printf("Max Attemps reached, closing prog now\n");
				extprog();
			}
	}
}