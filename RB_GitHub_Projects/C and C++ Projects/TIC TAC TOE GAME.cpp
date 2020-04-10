//PURPOSE: Design a simple tic tac toe game that will simply be won once either player 1 or player 2 have gotten a row of 3.
//THIS PROGRAM WILL BE RAN WITHOUT MATRIXES. MATRIXES WILL BE HEAVILY USED IN THE NEXT PROJECT!!!!


//THIS PROJECT WILL FULLY TEST MY CAPABILITIES OF CONDITIONALS WITHOUT INPUT, USING A SET OF VARIABLES FOR ALL FUNCTIONS (skill set lacked in the last project)
//AND FULLY UNDERSTANDING HOW TO CONTROL THE FLOW OF FUNCTION CALLING.

//THE TIC TAC TOE PROGRAM DOES THE FOLLOWING
//Takes the players names
//Draws and loads the board
//Allows the players to pick amongst themselves as to who will stat first. This has an alternative flow effect on the calling of the main functions for main.
//Allows each player to input for their respective positions on a turn base decided amongst the players
//Check to see who won based on input from the players
//Ask the players would they like to play again, and close the program if they choose not to. 

//Function names: 
//Main(): Calls the game's name, and will control the flow of how the functions are to be called.
//Main() also checks the winning position when it is reached, and assigns the correct winner, along with their name. 
//Main() will then ask if the players would like to play again; will restart the program if they input yes; 
//
//will print to the screen, "THANKS FOR PLAYING", closing the program afterwards.
//PLAYERWHO():Asks for the players names, assigns them their button, and then asks the players who wants to start first
//DRAW(): Draws the tic tac toe board
//FIELDSELECT(): Allows the players to input for their respective positions
//DECIDE(): Decides the winner based on winning positions

//All possible win outcomes for the tic tac toe game on a board with 9 positions (8 possible winning outcomes)
//	1, 2, 3
//	1, 4, 7
//	1, 5, 9
//	2, 5, 8
//	3, 6, 9
//	3, 5, 7
//	4, 5, 6
//	7, 8, 9

#include <iostream>
#include <string>
using namespace std;
string player1, player2;
int playerselection1, playerselection2, MARKERPLACE, firstpick, RUNIF = 0, PLAYAGAIN;

char P1, P2, PLAYER, DECIDE();

char Positions[9] = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

void PLAYERWHO(), DRAW(), FIELDSELECT();

void PLAYERWHO()
{
	cout << "Player 1, please enter your name." << endl;
	cin >> player1;

	cout << "Player 2, please enter your name" << endl;
	cin >> player2;

	cout << "Player 1 is " << player1  << " (X)" << " and " << "Player 2 is " << player2 << " (O)" << endl;
	cout << " " << endl;

	
		P1 = 'X';
		P2 = 'O';

		cout << " " << endl;
		cout << player1 << " ->  'X' " << endl;
		cout << " " << endl;
		cout << player2 << " ->  'O' " << endl;
	
	
	cout << "Player selection done. I will begin printing the board " << player1 << " and " << player2 << endl;
	cout << "Hit enter after viewing your information" << endl;
	system("read -p Press Enter");


}

void DRAW()
{
	system("clear"); //This will reset the board for us each time this function is called.

	cout << " " << endl;
	cout << " " << endl;

	cout << "	_____ " << Positions[0] << " _____ " << "|" << " _____ " << Positions[1] << " _____" << "|" << "_____ " << Positions[2] << " _____ " << endl;
	cout << "		      " << "			" << endl;
	cout << "		       " << endl;
	cout << "	_____ " << Positions[3] << " _____ " << "|" << " _____ " << Positions[4] << " _____" << "|" << "_____ " << Positions[5] << " _____ " << endl;
	cout << "				     " << endl;
	cout << "	               " << endl;
	cout << "	_____ " << Positions[6] << " _____ " << "|" << " _____ " << Positions[7] << " _____" << "|" << "_____ " << Positions[8] << " _____ " << endl;
	cout << " " << endl;
	cout << " " << endl;
	cout << " " << endl;
	
	
	
}

void FIELDSELECT()
{	cout << " " << endl;
		cout << player1 << " ->  'X' " << endl;
		cout << " " << endl;
		cout << player2 << " ->  'O' " << endl;
	cout << "Select a positon, followed by your Tac" << endl;
	cout << "ex:  2 X" << " (The number of the position, followed by a space, then your Tac (Uppercase))" << endl;
	cin >> MARKERPLACE >> PLAYER;

	if (MARKERPLACE == 1 && PLAYER == 'X')
	{
		Positions[0] = P1;

	}

	if (MARKERPLACE == 1 && PLAYER == 'O')
	{
		Positions[0] = P2;

	}

	if (MARKERPLACE == 2 && PLAYER == 'X')
	{
		Positions[1] = P1;

	}

	if (MARKERPLACE == 2 && PLAYER == 'O')
	{
		Positions[1] = P2;

	}

	if (MARKERPLACE == 3 && PLAYER == 'X')
	{
		Positions[2] = P1;

	}

	if (MARKERPLACE == 3 && PLAYER == 'O')
	{
		Positions[2] = P2;

	}

	if (MARKERPLACE == 4 && PLAYER == 'X')
	{
		Positions[3] = P1;

	}

	if (MARKERPLACE == 4 && PLAYER == 'O')
	{
		Positions[3] = P2;

	}

	if (MARKERPLACE == 5 && PLAYER == 'X')
	{
		Positions[4] = P1;

	}

	if (MARKERPLACE == 5 && PLAYER == 'O')
	{
		Positions[4] = P2;

	}

	if (MARKERPLACE == 6 && PLAYER == 'X')
	{
		Positions[5] = P1;

	}

	if (MARKERPLACE == 6 && PLAYER == 'O')
	{
		Positions[5] = P2;

	}

	if (MARKERPLACE == 7 && PLAYER == 'X')
	{
		Positions[6] = P1;

	}

	if (MARKERPLACE == 7 && PLAYER == 'O')
	{
		Positions[6] = P2;

	}

	if (MARKERPLACE == 8 && PLAYER == 'X')
	{
		Positions[7] = P1;

	}

	if (MARKERPLACE == 8 && PLAYER == 'O')
	{
		Positions[7] = P2;

	}

	if (MARKERPLACE == 9 && PLAYER == 'X')
	{
		Positions[8] = P1;

	}

	if (MARKERPLACE == 9 && PLAYER == 'O')
	{
		Positions[8] = P2;

	}
}

char DECIDE()
{ //NOT DONE USING MATRIX!!!!
	if (Positions[0] == 'X' && Positions[1] == 'X' && Positions[2] == 'X') 
		{	
			cout << player1 << " WINS!" << endl;
			return 'X';

		}
				

		if (Positions[3] == 'X' && Positions[4] == 'X' && Positions[5] == 'X')
		{
			cout << player1 << " WINS!" << endl;
			return 'X';

		}

		if (Positions[6] == 'X' && Positions[7] == 'X' && Positions[8] == 'X')
		{
			cout << player1 << " WINS!" << endl;
			return 'X';
		}

		if (Positions[0] == 'X' && Positions[3] == 'X' && Positions[6] == 'X')
		{
			cout << player1 << " WINS!" << endl;
			return 'X';
		}

		if (Positions[1] == 'X' && Positions[4] == 'X' && Positions[7] == 'X' == 'X')
		{
			cout << player1 << " WINS!" << endl;
			return 'X';
		}

		if (Positions[2] == 'X' && Positions[5] == 'X' && Positions[8] == 'X')
		{
			cout << player1 << " WINS!" << endl;
			return 'X';
		}

		if (Positions[0] == 'X' && Positions[4] == 'X' && Positions[8] == 'X')
		{
			cout << player1 << " WINS!" << endl;
			return 'X';
		}

		if (Positions[6] == 'X' && Positions[4] == 'X' && Positions[2] == 'X')
		{
			cout << player1 << " WINS!" << endl;
			return 'X';
		}
		////////////////////////////////////////////////////// CARBON COPY FOR 'O' STARTS AFTER THIS LINE!!/////////////////////////////////////////////////////////////////////

		if (Positions[0] == 'O' && Positions[1] == 'O' && Positions[2] == 'O') 
		{
			cout << player2 << " WINS!" << endl;
			return 'O';
		}


		if (Positions[3] == 'O' && Positions[4] == 'O' && Positions[5] == 'O')
		{
			cout << player2 << " WINS!" << endl;
			return 'O';
		}

		if (Positions[6] == 'O' && Positions[7] == 'O' && Positions[8] == 'O')
		{
			cout << player2 << " WINS!" << endl;
			return 'O';
		}

		if (Positions[0] == 'O' && Positions[3] == 'O' && Positions[6] == 'O')
		{
			cout << player2 << " WINS!" << endl;
			return 'O';
		}

		if (Positions[1] == 'O' && Positions[4] == 'O' && Positions[7] == 'O')
		{
			cout << player2 << " WINS!" << endl;
			return 'O';
		}

		if (Positions[2] == 'O' && Positions[5] == 'O' && Positions[8] == 'O')
		{
			cout << player2 << " WINS!" << endl;
			return 'O';
		}

		if (Positions[0] == 'O' && Positions[4] == 'O' && Positions[8] == 'O')
		{
			cout << player2 << " WINS!" << endl;
			return 'O';
		}

		if (Positions[6] == 'O' && Positions[4] == 'O' && Positions[2] == 'O')
		{
			cout << player2 << " WINS!" << endl;
			return 'O';
		}

}

int main()
{

	system("clear"); //EXISTS SOLEY TO CLEAR THE BOARD AND THIS MAIN FUNCTION WHEN THEY RE-RUN, and show the current contents.
	cout << "WELCOME TO TIC TAC TOE!" << endl;
	cout << " " << endl;

	PLAYERWHO();
	DRAW();
	

	while (RUNIF != 1) 
	{
		FIELDSELECT();
		DRAW();

		if (DECIDE() == 'X') //Since char returned something, the function now becomes a place holder for a returned variable.
		{
			break;
		}

		if (DECIDE() == 'O') 
		{
			break; 
		}

	} //RUNIF end bracket

	cout << "THANKS FOR PLAYING ^_^" << endl;

	system("read -p");
	return 0;
}