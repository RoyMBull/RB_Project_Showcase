#include<iostream>
#include<string>
#include<fstream>

using namespace std;
//this variable will be used to remember the numeber of lines typed globally and 
int remline = 0;


class  EssenFuncs
{

    protected:
     void SaveFunction()
    {
    ifstream ReadBaseFile("BaseFile.txt");
    ofstream NewFile;
    string FileName, BaseFileExtr;
    
    cout << "Enter the file's name" << endl;
    cin >> FileName;

    NewFile.open(FileName);

    for (int a=0; a<=remline; a++)
    {
    getline(ReadBaseFile, BaseFileExtr);
    NewFile << BaseFileExtr << endl;
    }
    //from here the code will begin an execution of a loop to read from the base file and store it to the new file
    NewFile.close();
    cout << "...." << endl;
    system("sleep 2");
    system("rm BaseFile.txt");
    
    cout << FileName << " SAVED!" << endl;
    }

void ReadFiles()
{   
    string ExtractPoint, Fname;
    cout << "Enter the files name now" << endl;
    cin >> Fname;

    ifstream CATFile(Fname);
    while (!CATFile.eof())
    {

    getline(CATFile, ExtractPoint);
    cout << ExtractPoint << endl;

    }
    
}


void ext()
{   cout << "removing Base file... " << endl;
    system("sleep 2");

    system("rm BaseFile.txt");
    
    cout << "Exiting.... " << endl;
    system("sleep 2");

}

 void Options()
{   string cmmnd;


        cout << "Save = sv" << endl;
        cout << "reset/clear = rclr" << endl;
        cout << "exit ext000" << endl;

        cin >> cmmnd;

        if (cmmnd == "sv" )
        {
            SaveFunction();
        
        }   

        if (cmmnd == "ext000")
        {
            ext();
        }
 }


   
};





class Txts: EssenFuncs
{
    public:

    void TxtPad()
    {
        ofstream Basetext;
        string proceed;
        string Write = "runext000";

        cout << "begin writing to text file now" << endl;
        system("sleep 2");

        Basetext.open("BaseFile.txt");
        system("clear");
        cout << "enter ext000 in order to close the text file" << endl;
        cout << "enter clr000 to clear the text, overwritting the file" << endl;
        cout << " " << endl;
        cout << " " << endl;
        cout << " " << endl;
        
        while(Write != "ext000")
        {
        getline(cin, Write);
        Basetext << Write << endl;
        remline+=1;
        if (Write == "ext000")
        {
            break;
        }

        if(Write == "clr000")
        {
            TxtPad();
        }

        }

        Basetext.close();
        
        
        while (1)
        {

        cout << "clr or options. (type 'p') to proceed" << endl;
        cin >> proceed;

        if (proceed == "p")
        {
            Options();
            break;
        }

        if (proceed == "clr")
        {
            TxtPad();
        }
        }

        
    }
  
    void RCatFile()
    {
        ReadFiles();
    }
};


int main()
{
    string VimSim;
    cout << "Vim-Sim" << endl;
    
    Txts RunPad, ReadPad;

    cout << "Enter 'mkfl' to start working on a new file" << endl;
    cout << "Enter 'rdfl' to read a file'" << endl;
    
    cin >> VimSim;

    if (VimSim == "mkfl")
    {
        RunPad.TxtPad();
    }

    if (VimSim == "rdfl")
    {
        ReadPad.RCatFile();
    }
    return 0;
}
