//Tic tac toe in C
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <math.h>
void Playerselect(), Board(), Phase1(), Phase2();
int Output();
//var for player names and tack assignment
 char p1[50], p2[50], fst[50];
 char p1tack, p2tack;
 char P1Sel[20], P2Sel[20];
//default position values when not selected/taken
 char pos1 = '1', pos2 = '2', pos3 = '3', pos4 = '4', pos5 = '5', pos6 = '6', pos7 = '7', pos8 = '8', pos9 = '9';

int main()
{
    printf("Tic_Tac_toe\n");
   // system("sleep 2");
    system("clear");
    Playerselect();

    //the game begins

}

/**
    Modules of the game:
        player select
        the board
        phases
        decision

**/

void Playerselect()
{
    printf("Player Names\n");

    printf("Player 1...");
    scanf("%s", &p1);

    printf("Player 2...");
    scanf("%s", &p2);

    printf("Players: %s && %s\n", p1, p2);
    printf("Who goes first?...");
        while (1)
        {
            scanf("%s", &fst);
            if ( strcmp(fst, "p1") == 0)
            {
                p1tack = 'X';
                p2tack = 'O';
                //flow control is here
                while (1)
                {system("clear");
                    Board();
                    Phase1();
                system("clear");
                    Board();
                    Phase2();

                
                }

            }

            if ( strcmp(fst, "p2") == 0)
            {
                p1tack = 'O';
                p2tack = 'X';
                //flow control is here
                while (1)
                {system("clear");
                    
                    Board();
                    Phase2();
                    Phase1();
                }
            }
        }
}

void Board()
{   
   
    printf("___%c___|___%c___|___%c___\n", pos1, pos2, pos3);
    printf("___%c___|___%c___|___%c___\n", pos4, pos5, pos6);
    printf("___%c___|___%c___|___%c___\n", pos7, pos8, pos9);
    


}

void Phase1()
{
    printf("%s place tack \n", p1);
    while (1)
    {
        scanf("%s", &P1Sel);
            if (strcmp(P1Sel,"1") == 0)
            {
                pos1 = 'X';
                break;
            }
            if (strcmp(P1Sel,"2") == 0)
            {
                pos2 = 'X';
                break; 
            }
            if (strcmp(P1Sel,"3") == 0)
            {
                pos3 = 'X';
                break;
            }
            if (strcmp(P1Sel,"4") == 0)
            {
                pos4 = 'X';
                break;
            }
            if (strcmp(P1Sel,"5") == 0)
            {
                pos5 = 'X';
                break;
            }
            if (strcmp(P1Sel,"6") == 0)
            {
                pos6 = 'X';
                break;
            }
            if (strcmp(P1Sel,"7") == 0)
            {
                pos7 = 'X';
                break;
            }
            if (strcmp(P1Sel,"8") == 0)
            {
                pos8 = 'X';
                break;
            }
            if (strcmp(P1Sel,"9") == 0)
            {
                pos9 = 'X';
                break;
            }
            if (strcmp(P1Sel, "clear") == 0)
            {
                pos1 = '1', pos2 = '2', pos3 = '3', pos4 = '4', pos5 = '5', pos6 = '6', pos7 = '7', pos8 = '8', pos9 = '9';
                break;
            }
    }

     if ( (pos1 == 'X') && (pos2 == 'X') && (pos3 == 'X')) 
		{	
			printf("%s wins!!!!\n", p1);
            Output();
            
		}

    if ( (pos1 == 'X') && (pos4 == 'X') && (pos7 == 'X')) 
		{	
			printf("%s wins!!!!\n", p1);
		}
    if ( (pos1 == 'X') && (pos5 == 'X') && (pos9 == 'X')) 
		{	
			printf("%s wins!!!!\n", p1);
		}
    if ( (pos2 == 'X') && (pos5 == 'X') && (pos8 == 'X')) 
		{	
			printf("%s wins!!!!\n", p1);
		}
    if ( (pos3 == 'X') && (pos6 == 'X') && (pos9 == 'X')) 
		{	
			printf("%s wins!!!!\n", p1);
		}
    if ( (pos3 == 'X') && (pos5 == 'X') && (pos7 == 'X')) 
		{	
			printf("%s wins!!!!\n", p1);
		}
    if ( (pos4 == 'X') && (pos5 == 'X') && (pos6 == 'X')) 
		{	
			printf("%s wins!!!!\n", p1);
		}
    if ( (pos7 == 'X') && (pos8 == 'X') && (pos9 == 'X')) 
		{	
			printf("%s wins!!!!\n", p1);
		}
				
    
}


void Phase2()
{
    printf("%s place tack \n", p2);
    while (1)
    {
        scanf("%s", &P2Sel);
            if (strcmp(P2Sel,"1") == 0)
            {
                pos1 = 'O';
                break;
            }
            if (strcmp(P2Sel,"2") == 0)
            {
                pos2 = 'O';
                break;
            }
            if (strcmp(P2Sel,"3") == 0)
            {
                pos3 = 'O';
                break;
            }
            if (strcmp(P2Sel,"4") == 0)
            {
                pos4 = 'O';
                break;
            }
            if (strcmp(P2Sel,"5") == 0)
            {
                pos5 = 'O';
                break;
            }
            if (strcmp(P2Sel,"6") == 0)
            {
                pos6 = 'O';
                break;
            }
            if (strcmp(P2Sel,"7") == 0)
            {
                pos7 = 'O';
                break;
            }
            if (strcmp(P2Sel,"8") == 0)
            {
                pos8 = 'O';
                break;
            }
            if (strcmp(P2Sel,"9") == 0)
            {
                pos9 = 'O';
                break;
            }
            if (strcmp(P2Sel, "clear") == 0)
            {
                pos1 = '1', pos2 = '2', pos3 = '3', pos4 = '4', pos5 = '5', pos6 = '6', pos7 = '7', pos8 = '8', pos9 = '9';
                break;
            }
    }

 if ( (pos1 == 'O') && (pos2 == 'O') && (pos3 == 'O')) 

		{	
			printf("%s wins!!!!\n", p2);
        
		}

    if ( (pos1 == 'O') && (pos4 == 'O') && (pos7 == 'O')) 
		{	
			printf("%s wins!!!!\n", p2);
		}
    if ( (pos1 == 'O') && (pos5 == 'O') && (pos9 == 'O')) 
		{	
			printf("%s wins!!!!\n", p2);
		}
    if ( (pos2 == 'O') && (pos5 == 'O') && (pos8 == 'O')) 
		{	
			printf("%s wins!!!!\n", p2);
		}
    if ( (pos3 == 'O') && (pos6 == 'O') && (pos9 == 'O')) 
		{	
			printf("%s wins!!!!\n", p2);
		}
    if ( (pos3 == 'O') && (pos5 == 'O') && (pos7 == 'O')) 
		{	
			printf("%s wins!!!!\n", p2);
		}
    if ( (pos4 == 'O') && (pos5 == 'O') && (pos6 == 'O')) 
		{	
			printf("%s wins!!!!\n", p2);
		}
    if ( (pos7 == 'O') && (pos8 == 'O') && (pos9 == 'O')) 
		{	
			printf("%s wins!!!!\n", p2);
		}
				   
}

int Output()
{

    system("clear");
    printf("thanks for playing");
    system("sleep 2");
    return 0;
}