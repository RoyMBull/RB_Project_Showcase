/**VIM SIM: Key components
    NEw modules for the program
		code executor()
		{
			this function serves to run program files in the same directory as the VIM	
			and is also applicable to be run in while the user is writin a file 
					ex: ener command "//c++"
							or 
						enter command "#python2"
				
			before running in either version the code will prompt the user if they've installed the proper packages
			yet. this code is set to run on linux terminal ONLY
		}
		package installer()
		{
			this program runs a script set to install the ccompiler of a program 
		}

**/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <math.h>
void WriteFile(), OpenFile(), Manual(), Optns(), Ssfv();

int main()
{system("clear");
    Optns();

return 0;
}


void InstallerModule()
{
	printf("Installin all lates compilers now...\n");
	system("sleep 2");
	system("./InstallerModule.sh");
	
}
void CodeExeForOptns()
{
	printf("Enter name of the file to execute now\n");
	system("./CodeExeForOptns.sh");
	
	
}



void OpenFile()
{system("clear");
    char dec[20];
    for(int a; a<=5; a++)
    {
    printf("<<<<<<<<<<\n");
    }
    printf("......... \n");
    system("sleep 0.6");
    printf("which file would you like to open\n");
    //a bash script will be ran here in the code using the system function

    //control is switched to the terminal now
    system("echo enter file name now....");
    system("./OpnFile.sh");
    printf("Would you like to open another file, Y/n? \n");
    scanf("%s", &dec);

        if (strcmp(dec, "Y") == 0)
        {
        	system("clear");
            OpenFile();
        }

        if(strcmp(dec, "n") == 0)
        {
            //i want this program to be a runnin program, where teh main way to exit is through the options menu
            Optns();
        }
}

void Ssfv()
{
    system("./VimSaveFcuntion.sh");

}

void WriteFile()
{//ADD A FUNCTION I HERE THAT WILL TURN SCRIPTS AND ALLOW THEM TO EXECUTR AFTER SAVING> ADD AN EXECUTE FILE FUNCTION IN THIS PROGRAM
    //system("clear");
    FILE *WriteToFile;
    char Text[300];
    //the body of the file. we can now write to the file if need be
    WriteToFile = fopen("NewFile.txt", "w");
    
    while (1)
    {

    fgets(Text, 300, stdin);
    //think of fprintf, subbing the %s for the name of the file stream itself
    fprintf(WriteToFile, Text);
    Text[strlen(Text) -1] = '\0';

    if (strcmp(Text, "ext-000") == 0)
    {
        break;
    }
    if (strcmp(Text, "sav-000") == 0)
    {
        //this runs, just the scritp is in development
        Ssfv();
        break;
        
    }
    
    
    }
    printf("we are here\n");
    fclose(WriteToFile);

    Optns();
}

void Manual()
{system("clear");
    char enter[0];
    for (int a = 0; a<=5; a++)
    {
        printf("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< \n");
        system("sleep 0.2");
    }

    printf("here\n");
    
    FILE *ReadFile;
    char TextPerLine[100];

    ReadFile = fopen("Man.txt", "r");

    while (!feof(ReadFile))
    {
    fgets(TextPerLine, 100, ReadFile);
    puts(TextPerLine);
    }

    fclose(ReadFile);
    puts("type anything and hit enter");
    scanf("%s", enter);
    
    Optns();

}

void Optns()
{system("clear");
    char options[20];
    printf("Commands:\n");
    printf("Open a file: opn\n");
    printf("exit: ext\n");
    printf("New File: mkfl\n");
    printf("Man: man\n");
    printf("CodeExecutor: Codex\n");
    printf("Installer: Installer\n");
	printf("");
    while (1)
    {
    scanf("%s", &options);

        if(strcmp(options, "opn") == 0)
        {
            OpenFile();
        }

        
        if(strcmp(options, "ext") == 0)
        {   
            
            printf("exiting\n");
            system("sleep 0.4 && echo ......");
            break;
            
            
        }
        if(strcmp(options, "mkfl") == 0)
        {
            WriteFile();
            break;
        }
       
       //this function will simply be how i warm up with reading from file in C
        if(strcmp(options, "man") == 0)
        {
            Manual();
            break;
        }
        
    	if(strcmp(options, "Codex") == 0)
    	{
    		CodeExeForOptns();
    		break;
    	}
    	
    	
    	if(strcmp (options, "Installer") == 0)
    	{
    		InstallerModule();
    		break;
    	}
        
    
    }
}


