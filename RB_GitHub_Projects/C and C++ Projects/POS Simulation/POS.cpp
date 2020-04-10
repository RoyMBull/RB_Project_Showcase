/**
 * POS functions are to include
 * -Authenticate the server
 * -Provides the menu
 * -Tallys all items
 * -Prompts the user for their desired payment option
 *
 **/
 
//#include "stdafx"
#include <iostream>
#include <string>
#include <fstream>

using namespace std;

class POSEssentials
{
	protected:
		
		//authenticates the servers id
		void ServerAuthenticatation()
		{ string SID;
		
			cout << "Server ID" << endl;
			
			while (1)
			{
				cin >> SID;
			
				if (SID == "Roy")
				{
				cout << "initializing...." << endl;
				system("sleep 1");
				break;
				}
			}

		}
		
		//pulls up the menu for the server to see
		void Menu()
		{
			system("clear");
			
			string MenuData;
			
			ifstream MenuExtract("Menu.txt");
			
			while (!MenuExtract.eof())
			{
				getline(MenuExtract, MenuData);
				cout << MenuData << endl;
				
			}
			
		
		}
		
		//shows the commands to enter into the POS system
		void CommandList()
		{
			string ShowServer;
			ifstream Commands("Commands.txt");

				while (!Commands.eof())
			{
				getline(Commands, ShowServer);
				cout << ShowServer << endl;
				
			}
		
			
		}
	
	//tally's items for purchase
	//each time it runs it overwrites the text file to clear all data
		void Tally()
		{
			ofstream TallyData;
			int Total = 0; 
			int Cost = 0;
			char addrmv, fin;
			
			TallyData.open("TallyData.txt");
			
			cout << "enter the item name. second input will";
			cout << "prompt for the operand command (+) add";
			cout << "(-) remove" << endl;
			
				while (1)
				{
					cin >> Cost;
					cout << "add or remove item? Enter q to quit" << endl;
					cin >> addrmv;
						
						switch (addrmv)
						{
							case '+':
								Total += Cost;
								break;
							
							case '-':
								Total -= Cost;
							
							case 'q':
								cout << "Done? y/n (lowercase only)" << endl;
								cin >> fin;
						
								if (fin == 'y')
								{
									addrmv = 'p';
									break;
								}
								
					
								if (fin == 'n')
								{
									cout << "continue to enter" << endl;
								}
									break;
							
							default:
								cout << "error" << endl;
							
						}
					
					
					if (addrmv == 'p')
					{
						TallyData << Total << endl;
						TallyData.close();
						break;
						
					}
				}
				
		}
	
		void Payment()
		{
			cout << "... Payment Complete. Enjoy" << endl;	
		}

};

class POSControler: POSEssentials 
{
	public:
		
		void POSInitializer()
		{
			ServerAuthenticatation();
			Menu();
			CommandList();
			Tally();
			Payment();
		}
	
};

void POS();

void POS()
{
	POSControler ControllerModule;
	
		ControllerModule.POSInitializer();
		
	
}

int main()
{
	POS();
		
	return 0;
}

