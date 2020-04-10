using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using static AutomatedService.Modules;
using static AutomatedService.Female;
using static AutomatedService.Male;

namespace AutomatedService
{
    class Cortana
    {
        static void Main()
        {	int Val = 0;
            
            Console.WriteLine("Hi, I'm Cortana, I'll be taking your information");
            while (Val !=1)
            {
                Console.ReadLine(gender);
                    if (gender == 'm')
                    {
                    	Mroute();   
                        break;
                        
                    }
                    
                    if (gender == 'f')
                    {
                    	Froute();   
                        break;
                    }
            }
            
            
            
            while (Val != 1)
            {
                Console.WriteLine("Is this all correct?");
                Console.ReadLine(response);
                if (response == 'y')
                {
                    Console.WriteLine("Thank you for your information.");
                    break;
                }
                
                if (response == 'n')
                {	
                	Console.WriteLine("Correcting that information now");
                    return Main(); 
                }
                
                
            }
            
            return 0;
        }
        
        
    }
    
    
}



namespace AutomatedService
{
    class Modules
    {
         protected static void Name()
        { string name;
            Console.WriteLine("What is your name");
            Console.ReadLine(name);
        }
        
         protected static void Social()
        {  string social;
            Console.WriteLine("Social?");
            Console.ReadLine(social);
        }
        
         protected static void DOB()
        {  string dob;
            Console.WriteLine("DOB?");
            Console.ReadLine(dob);
        }
        
         protected static void Addr()
        {  string addr; 
            Console.WriteLine("What is your Address?");
            Console.ReadLine(addr);
        }
        
         protected static void Number()
        {  string number;
            Console.WriteLine("Number?");
            Console.ReadLine(number);
        }
        
        
    }
    
    
    class Male
    {

        static void Mroute()
        {
            Console.WriteLine("Welcome sir.");
                Name();
                Social();
                DOB();
                Addr();
                Number();
                
                
        }
        
        
        
        
    }
    
    
    
    class Female
    {
       protected static void Froute()
        {
         
             Console.WriteLine("Welcome ma'am.");
                Name();
                Social();
                MDOB.DOB();
                MAddr.Addr();
                MNumber.Number();
            
        }
        
        
        
    }
    
}