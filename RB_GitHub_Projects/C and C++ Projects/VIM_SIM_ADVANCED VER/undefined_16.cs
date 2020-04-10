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
    class Cortana: Modules, Male, Female
    {
     Male RunProgM = new Male()
     Female RunProgF = new Female();
     static int StartProgifMale;
     static int StartProgifFemale;
        static int Main()
        {
            
            Console.WriteLine("Hi, I'm Cortana, I'll be taking your information");
            while (1)
            {
                Console.ReadLine(gender);
                    if (gender == 'm')
                    {
                        StartProgifMale = RunProgM.Mroute();
                        break;
                        
                    }
                    
                    if (gender == 'f')
                    {
                        StartProgifMale = RunProgF.Froute();
                        break;
                    }
            }
            
            
            
            while (1)
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
    {protected static string name, social, dob, addr, number;
        protected static void Name()
        {
            Console.WriteLine("What is your name");
            Console.ReadLine(name);
        }
        
         protected static void Social()
        {
            Console.WriteLine("Social?");
            Console.ReadLine(social);
        }
        
         protected static void DOB()
        {
            Console.WriteLine("DOB?");
            Console.ReadLine(dob);
        }
        
         protected static void Addr()
        {
            Console.WriteLine("What is your Address?");
            Console.ReadLine(addr);
        }
        
         protected static void Number()
        {
            Console.WriteLine("Number?");
            Console.ReadLine(number);
        }
        
        
    }
    
    
    class Male:Modules
    {Modules WriteMName = new Modules();
     Modules MSocial = new Modules();
     Modules MAddr = new Modules();
     Modules MDOB = new Modules();
     Modules MNumber = new Modules();
     protected static int  CallmName, CallmSocial, CallmAddr, CallmNumber, CadllmDOB;
         
        static void Mroute()
        {char response;
         
            Console.WriteLine("Welcome sir.");
                CallmName = WriteMName.Name();
                CallmSocial = MSocial.Social();
                CadllmDOB = MDOB.DOB();
                CallmAddr = MAddr.Addr();
                CallmNumber = MNumber.Number();
                
                
        }
        
        
        
        
    }
    
    
    
    class Female:Modules
    {Modules WriteFName = new Modules();
     Modules FSocial = new Modules();
     Modules FAddr = new Modules();
     Modules FDOB = new Modules();
     Modules FNumber = new Modules();
     protected static int CallfName, CallfSocial, CallfAddr, CallfNumber, CadllfDOB;
         
       protected static void Froute()
        {
         
             Console.WriteLine("Welcome ma'am.");
                CallmName = WriteMName.Name();
                CallmSocial = MSocial.Social();
                CadllmDOB = MDOB.DOB();
                CallmAddr = MAddr.Addr();
                CallmNumber = MNumber.Number();
            
        }
        
        
        
    }
    
}