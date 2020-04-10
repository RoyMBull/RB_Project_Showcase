//Cortana is a security defense mechanism that requires 4 passcodes to pass the user through.
// There are 5 passwords the user must enter in correctly so the user may recieve the output "PASSWORD ACCEPTED"
// PASSWORD#1: Enter the correct 4-digit passcode
// PASSWORD#2: Enter the word based passcode "riddle me this, riddle me that"
// PASSWORD#3: Answer a question (String based only)
// PASSWORD#4: Guess Cortana's number
// Allow the user to access other half of the program (learn to use multiple funtions for this part. THIS IS NOT THE GOAL, ONLY AN ADVANCED VER GOAL!!!!)

#include "stdafx.h"
#include <iostream>
#include <string> 
using namespace std;

int main() //Work on the 4-digit section of the program
{
	int RUNIF, passcode, attempts, number;
	string riddle;
		RUNIF = 0;
	
	while (RUNIF != 1) // The loop is to run this entire series of commands until the user inputs to stop. 
	{
		for (int a = 0; a < 5; a++) //Designed to lock the user out if they fail to enter the first passcode correctly 5 times
		{ //the program does not obey this section of the forloop inside the whileloop.
			cout << "Please enter the 4-digit passcode" << endl;
			cin >> passcode; //declare passcode as an INT

			if (passcode == 9127)
			{
				cout << "C0RRECT! Please enter the next password" << endl;
				cout << "Type 9 to proceed please" << endl;
				cin >> a; 
			}
			else 
			{
				cout << "Incorrect Passcode entered. Please try again." << endl;
				
			}

			if (a == 4) //You CAN use just if statements by themselves without else statements. Else's are 100% optional!!!!
				//4 is 5 becaue in C++ we start counting from 0( 0==1, 1==2, etc etc)
			{
				return 0; //Mehanism to close the program. No pause neccessary!!!!
			
			}

			

					
			
		}//first forloop end brakcet

			
		 

		for (int b = 0; b < 5; b++) //The program obeys the riddel section but not the passcode section
		{
			cout << "Riddle me this riddle me that" << endl;
			cout << "You will always find me in the past. I can be created in the present,But the future can never taint me. What am I?" << endl;
			cin >> riddle; //riddle must be a STRING!!!!!

			if (riddle == "History")
			{
				cout << "Correct. Please proceed" << endl;
				cout << "Type 9 to proceed" << endl;
				cin >> b;
			}
			else {
				cout << "Incorrect answer. Please try again." << endl; // if entered incorrectly 5 times the program will completely spazz out
			}


			if (b == 4) 
			{
				return 0;
			
			}

		} // second forloop end bracket

		for (int c = 0; c < 5; c++)
		{
			cout << "How many attempts do you have before I lock you out?" << endl;
			cin >> attempts; // declare attempts as an INT!!!!

			if (attempts == 5)
			{
				cout << "Correct! Please Proceed" << endl;
				cout << "Type 9 to continue" << endl;
				cin >> c;

			}
			else {
				cout << "Incorrect answer. Please try again." << endl;
			}
			
			if (c == 4) 
			{
				return 0;
			
			}
		} // third forloop end bracket

		for (int d = 0; d < 3; d++)
		{
			cout << "What number am I thinking of?" << endl;
			cin >> number; // number must be an INT!!!!! The answer is the number of times this forloop will lock you out.
			
			if (number == 3)
			{
				cout << "Security measures lifted. You may proceed" << endl;
				cout << "Type 4 to continue" << endl;
				cin >> d;

			}

			else {
				cout << "Wrong! Try again please" << endl;
			}

			if (d == 2) 
			{
				return 0;
			
			}

		} //forth forloop end bracket

		cin >> RUNIF;

	} //while loop end bracket 

	system("pause");
	
	system("pause");
	return 0;
} // int main function end bracket