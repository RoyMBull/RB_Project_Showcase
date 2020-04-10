using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using static SimpleProg.testMethod;
using System.IO;

namespace SimpleProg
{
	class HelloWorld: testMethod
	{
		static void Main()
		{
				Console.WriteLine("hello");
				RunMethod();
		}
		
		
	}
	
	
}


namespace SimpleProg
{
	class testMethod
	{ protected static string storethis;
		protected static void RunMethod()
		{
		
			using(StreamWriter opnfile = new StreamWriter("newfile.txt"))
			{
				opnfile.WriteLine("this works");
				
			}
			
			using(StreamReader readfile = new StreamReader("newfile.txt"))
			{
				while(readfile.ReadLine() != null)
				{
					storethis = readfile.ReadLine();
				}
			
			}
			
			
		}
		
	}
	
	
}
