/* Challenge#1: Goal:
	--->Player enters 4 numbers and guesses on certain number of tries pre-set. 

	*/

#include <iostream>
#include <fstream>
#include <string>
#include <iomanip>

using namespace std;
int NormalMode(), ChallengeMode();


int NormalMode()
{
	system("clear");
	int num1, num2, num3, num4;
	string name;

	num1 = 45;
	num2 = 67;
	num3 = 88;
	num4 = 33;

	cout << "What is your name?" << endl;
	cin >> name;
	cout << "Welcome " << name << endl;

	cout << "Hints" << endl;
	cout << "num1: between 1 and 50" << endl;
	cout << "num2: between 65 and 88" << endl;
	cout << "num3: between 65 and 88" << endl;
	cout << "num4: between 1 and 37" << endl;

	cout << "Please Guess the 4 numbers in the fewest number of tries. All numbers are in the tenth's place" << endl;
	cout << "Enter like so...... EX:    1 454 7664 343   , the four numbers are to be entered like shown when you guess" << endl;
	
		//Main Loop controlling the program
		for (int tries = 1; tries <=5; tries++)
		{ 
			cin >> num1 >> num2 >> num3 >> num4;

			
			if (num1 == 45 && num2 == 67 && num3 == 88 && num4 == 33)
			{
				if (tries == 1)
				{
					cout << "WELL DONE KIDO ;)" << endl;
					cout << "Tries for " << name << "-> " << tries << endl;
					tries = 6;
					
					
				}
			}


			if (num1 == 45 && num2 == 67 && num3 == 88 && num4 == 33)
			{
				if (tries == 2)
				{
					cout << "WELL DONE KIDO ;)" << endl;
					cout << "Tries for " << name << "-> " << tries << endl;
					tries = 6;
				}
			}


			if (num1 == 45 && num2 == 67 && num3 == 88 && num4 == 33)
			{
				if (tries == 3)
				{
					cout << "WELL DONE KIDO ;)" << endl;
					cout << "Tries for " << name << "-> " << tries << endl;
					tries = 6;
				}
			}


			if (num1 == 45 && num2 == 67 && num3 == 88 && num4 == 33)
			{
				if (tries == 4)
				{
					cout << "WELL DONE KIDO ;)" << endl;
					cout << "Tries for " << name << "-> " << tries << endl;
					tries = 6;
				}
			}


			//if the player fails

			if (tries == 5)
			{
				cout << "Attempts reached. Thanks for playing" << endl;
				system("read -p hit enter");
				return 0;
				
			}

		//Hints for each individual number
			//if your warm on num1
			if (num1 == 35)
			{
				cout << "Warmer for num1 ;) " << endl;

			}

			if (num1 < 35)
			{
				cout << "Cold on num1 :( booo hooo" << endl;
				
			}

		
			//if your warm on num2
			if (num2 == 45)
			{
				cout << "Warmer for num2 ;) " << endl;

			}

			if (num2 < 45)
			{
				cout << "Cold on num2 :( booo hooo" << endl;

			}


			//if your warm on num3
			if (num3 == 75)
			{
				cout << "Warmer for num3 ;) " << endl;

			}

			if (num3 < 75)
			{
				cout << "Cold on num3 :( booo hooo" << endl;

			}



			//if your warm on num4
			if (num4 == 30)
			{
				cout << "Warmer for num4 ;) " << endl;

			}

			if (num4 < 30)
			{
				cout << "Cold on num4 :( booo hooo" << endl;

			}



		
		}


		
		cout << "Thanks for playing :)" << endl;
				

	


	system("read -p hit enter");
	return 440;
}

int ChallengeMode()
{
	system("clear");
	string READY, PName;
	int Pchoice;

	int RunTenthsFirst = 0, PlayerHundredsSecond = 0, PlayerThousandsThird = 0, PlayerMillionsFourth = 0;
	int PlayerChoiceforTenths, PlayerChoiceforHundreds, PlayerChoiceforThousands, PlayerChoiceforMillions;

	cout << "Enter your name" << endl;
	cin >> PName;

	cout << "Are you ready to enter " << PName << " Y/N?" << endl;
	cin >> READY;


	if (READY == "Y")
	{

		while (RunTenthsFirst <= 1)
		{
			system("clear");
			cout << "Pick a number from 1 to 20. You have 5 attempts player." << endl;

			for (int ten = 0; ten <= 5; ten++)
			{
				cout << "Please enter your value from 1-20" << endl;

				cin >> PlayerChoiceforTenths;

				if (PlayerChoiceforTenths == 15)
				{
					cout << "Warmer" << endl;

				}

				if (PlayerChoiceforTenths < 15)
				{
					cout << "Cold" << endl;

				}


				if (PlayerChoiceforTenths == 20)
				{
					cout << "Correct!!!!" << endl;
					cout << "Raising the difficulty" << endl;
					ten = 10;
					RunTenthsFirst = 2;
				}

				if (ten == 4)
				{
					cout << "WRONG NUMBER OF TRIES!!!! Game Over" << endl;
					system("clear");
					return 0;
				}
			}


		}


		//If the user guesses correctly#1 for the tenths
		if (RunTenthsFirst == 2)
		{
			cout << "Raising the difficulty of the challenge" << endl;

			while (PlayerHundredsSecond <= 1)
			{
				system("clear");
				cout << "Pick a number from 100 to 250. You have 5 attempts player." << endl;

				for (int hundreds = 0; hundreds <= 5; hundreds++)
				{
					cout << "Please enter your value from 100-250" << endl;

					cin >> PlayerChoiceforHundreds;

					if (PlayerChoiceforHundreds == 130)
					{
						cout << "Warmer" << endl;

					}

					if (PlayerChoiceforHundreds < 130)
					{
						cout << "Cold" << endl;

					}


					if (PlayerChoiceforHundreds == 150)
					{
						cout << "Correct!!!!" << endl;
						cout << "Raising the difficulty" << endl;
						hundreds = 10;
						PlayerHundredsSecond = 2;


					}

					if (hundreds == 4)
					{
						cout << "WRONG NUMBER OF TRIES!!!! Game Over" << endl;
						system("read -p hit enter");
						return 0;
					}

				}

			}

		}


		//If the user guesses correctly#2 for the Hundreds
		if (PlayerHundredsSecond == 2)
		{

			while (PlayerThousandsThird <= 1)
			{
				system("clear");
				cout << "Raising the difficulty of the challenge" << endl;
				cout << "Pick a number from 1000 to 2500. You have 5 attempts player." << endl;

				for (int thousands = 0; thousands <= 5; thousands++)
				{
					cout << "Please enter your value from 1000-4000" << endl;

					cin >> PlayerChoiceforThousands;

					if (PlayerChoiceforThousands == 2000)
					{
						cout << "Warmer" << endl;

					}

					if (PlayerChoiceforThousands < 2000)
					{
						cout << "Cold" << endl;

					}


					if (PlayerChoiceforThousands == 3579)
					{
						cout << "Correct!!!!" << endl;
						cout << "Raising the difficulty" << endl;
						thousands = 10;
						PlayerThousandsThird = 2;


					}

					if (thousands == 5)
					{
						cout << "WRONG NUMBER OF TRIES!!!! Game Over" << endl;
						system("read -p hit enter");
						return 0;
					}

				}

			}

		}


		//If the user guesses correctly#3 for the Millions
		if (PlayerThousandsThird == 2)
		{

			while (PlayerMillionsFourth <= 1)
			{
				system("clear");
				cout << "Raising the difficulty of the challenge" << endl;
				cout << "Pick a number from 1,000,000 to 4,000,000. You have 5 attempts player." << endl;

				for (int millions = 0; millions <= 5; millions++)
				{
					cout << "Please enter your value from to 1,000,000 to 4,000,000. No commas in the actual input" << endl;

					cin >> PlayerChoiceforMillions;

					if (PlayerChoiceforMillions == 2000000)
					{
						cout << "Warmer" << endl;

					}

					if (PlayerChoiceforMillions < 2000000)
					{
						cout << "Cold" << endl;

					}


					if (PlayerChoiceforMillions == 2567989)
					{
						cout << "Correct!!!!" << endl;
						millions = 10;
						PlayerMillionsFourth = 2;


					}

					if (millions == 4)
					{
						cout << "WRONG NUMBER OF TRIES!!!! Game Over" << endl;
						system("read -p hit enter");
						return 0;
					}

				}

			}

		}


		//if the player successfully completes ChallengeMode
		if (PlayerMillionsFourth == 2)
		{
			cout << "ALL NUMBERS GUESSED CORRECTLY. YOU WIN!!!!" << endl;
			system("read -p hit enter");
			return 0;

		}



	}

	if (READY == "N")
	{

		cout << "OK....	Terminating now..... " << endl;
		system("read -p hit enter");
		return 0;

	}
	


	system("read -p hit enter");
	return 0;
}


int main()
{
	int mode;
	cout << "View the NormalMode() to see the answers and how the code works. Have Fun!!!!" << endl;
	cout << "Which Mode would you like to play?" << endl;
	cout << "Modes" << endl;
	cout << "1 for NormalMode standard mode that lists tries, and satisfies the challenge" << endl;
	cout << "2 for ChallengeMode" << endl;

	cin >> mode;

	if (mode == 1)
	{
		NormalMode();

	}

	if (mode == 2)
	{
		ChallengeMode();

	}


	system("read -p hit enter");
	return 0;
}



