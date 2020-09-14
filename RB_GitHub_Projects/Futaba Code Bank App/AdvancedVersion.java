package application; //this is used when working with eclipse
import java.io.File;

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.*;  
import javafx.scene.layout.BorderPane;  
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class AdvancedVersion
{
	 //This is where modules are declared
    //MainWindow Scene Modules
    
    public static void win3()
    {
        //Set the window title 
        Stage mainwin3 = new Stage();
        mainwin3.setTitle("Futaba_Webs_Code_Bank (Advanced-Version)");

        //Set our layout and scene for the main window
        BorderPane rbmenu2 = new BorderPane();
        Scene mainscene3 = new Scene(rbmenu2, 1280, 600);
        mainscene3.getStylesheets().add("AdvancedVersion.css");
        
        
        //Add the menu bar
        MenuBar menbar = new MenuBar();
        
        Menu home = new Menu("File...");
        MenuItem opn = new MenuItem("Open...");
        opn.setOnAction(e -> 
        
        {
      		FileChooser introfile = new FileChooser();
      		File selectedFile = introfile.showOpenDialog(null);
      		String filename = selectedFile.getAbsolutePath();
      		System.out.println(filename);
      		
        }
        
        );
        
        home.getItems().add(opn);
        
        Menu grayHatCpp = new Menu("Gray-Hat-C++");
    	MenuItem openProcess = new MenuItem("Opening A Process");
    	MenuItem openWindowHandle = new MenuItem("Opening A Window Handle");
    	MenuItem processEnumeration = new MenuItem("Process Enumeration");
    	MenuItem threadEnumeration = new MenuItem("Thread Enumeration");
    	MenuItem dllInjection = new MenuItem("DLL Injection");
    	MenuItem debugger = new MenuItem("Custom Debugger");
    	MenuItem memoryBreakPoint = new MenuItem("Memory BreakPoint Technique");
    	MenuItem defaultLibsCppg = new MenuItem("Default Libraries");
    	
    	
    	openProcess.setOnAction(e -> 
    	
    	{
    		GrayHatCppFileOptions.OpeningProcessSample();
    	}
    			
    	);
    	
    	openWindowHandle.setOnAction(e -> 
    	
    	{
    		GrayHatCppFileOptions.OpeningWinHandleSample();
    	}
    			
    	);
		
    	processEnumeration.setOnAction(e -> 

    	{
    		GrayHatCppFileOptions.ProcessEnumeration();
    	}
	
    	);

    	threadEnumeration.setOnAction(e -> 

    	{
    		GrayHatCppFileOptions.ThreadEnumeration();
    	}
	
    	);

    	dllInjection.setOnAction(e -> 

    	{
    		GrayHatCppFileOptions.DllInjection();
    	}
	
    	);

    	debugger.setOnAction(e -> 

    	{
    		GrayHatCppFileOptions.CustomDebugger();
    	}
	
    	);

    	memoryBreakPoint.setOnAction(e -> 

    	{
    		GrayHatCppFileOptions.MemoryBreakPointTechnique();
    	}
	
    	);
    	
    	defaultLibsCppg.setOnAction(e -> 

    	{
    		GrayHatCppFileOptions.DefaultLibraries();
    	}
	
    	);


    	grayHatCpp.getItems().addAll(openProcess, openWindowHandle, processEnumeration, threadEnumeration, dllInjection, debugger, memoryBreakPoint);
    	
    	
    	Menu grayHatPython = new Menu("Gray-Hat-Python");
     	MenuItem fuzzer1 = new MenuItem("Building Fuzzer Part 1");
     	MenuItem fuzzer2 = new MenuItem("Building Fuzzer Part 2");
     	MenuItem windowDebugger1 = new MenuItem("Building A Windows Debugger Part 1");
     	MenuItem windowDebugger2 = new MenuItem("Building A Windows Debugger Part 2");
     	MenuItem windowDebugger3 = new MenuItem("Building A Windows Debugger Part 3");
     	MenuItem dllCode = new MenuItem("DLL And Code Injection Part 1");
     	MenuItem dllCode2 = new MenuItem("DLL And Code Injection Part 2");
     	MenuItem debugerTypes = new MenuItem("Debugger Types");
     	MenuItem windowDebuggerSample = new MenuItem("Windows Debugger Sample");
     	MenuItem ctypes = new MenuItem("Ctypes");
     	
     	
     	fuzzer1.setOnAction(e -> 
     	
     	{
     		GrayHatPythonFileOptions.BuildingAFuzzerPart1();
     	}
     			
     	);
     	
     	fuzzer2.setOnAction(e -> 
     	
     	{
     		GrayHatPythonFileOptions.BuildingAFuzzerPart2();
     	}
     			
     	);
 		
     	windowDebugger1.setOnAction(e -> 

     	{
     		GrayHatPythonFileOptions.BuuldingAWinwosDebuggerInPythonPart1();
     	}
 	
     	);

     	windowDebugger2.setOnAction(e -> 

     	{
     		GrayHatPythonFileOptions.BuuldingAWinwosDebuggerInPythonPart2();
     	}
 	
     	);

     	windowDebugger3.setOnAction(e -> 

     	{
     		
     		GrayHatPythonFileOptions.BuuldingAWinwosDebuggerInPythonPart3();     	
     	
     	}
 	
     	);

     	dllCode.setOnAction(e -> 

     	{
     		GrayHatPythonFileOptions.DLLAndCodeInjectionPart1();
     	}
 	
     	);

     	dllCode2.setOnAction(e -> 

     	{
     		GrayHatPythonFileOptions.DLLAndCodeInjectionPart2();
     	}
 	
     	);
     	
     	debugerTypes.setOnAction(e -> 

     	{
     		GrayHatPythonFileOptions.DebuggerTypesAndDesigns();
     	}
 	
     	);
     	
     	windowDebuggerSample.setOnAction(e -> 

     	{
     		GrayHatPythonFileOptions.WindowDebuggerCodeExample();
     	}
 	
     	);
     	
     	ctypes.setOnAction(e -> 

     	{
     		GrayHatPythonFileOptions.CtypesinPython();
     	}
 	
     	);

     	grayHatPython.getItems().addAll(fuzzer1, fuzzer2, windowDebugger1, windowDebugger2, windowDebugger3, dllCode, dllCode2, debugerTypes, windowDebuggerSample, ctypes);
     	
     	Menu kaliLinux = new Menu("Kali-Linux");
     	MenuItem chapters = new MenuItem("Recommended Chapters To Read");
     	MenuItem bypass = new MenuItem("Bypassing Anti-Virus");
     	MenuItem webCracking = new MenuItem("Cracking WEP & WPA/WPA2");
     	MenuItem infoGather = new MenuItem("Info Gather/Vulnerability tests");
     	MenuItem passwordCracking = new MenuItem("Physical Hacks Hash Grabbing");
     	MenuItem metasploit = new MenuItem("Metasploit Framework");
     	MenuItem wepWPA = new MenuItem("What is WEP & WPA/WPA2?");
     	
     	chapters.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.ChaptersToCheckOut();
     	}
 	
     	);
     	
     	bypass.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.BypassingAntiVirus();     	
     		
     	}
 	
     	);
     	
     	webCracking.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.CrackingWPAandWPAWPA2Encryption();   	
     		
     	}
 	
     	);
     	
     	infoGather.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.InfoGatheringAndVulnerabilityTests();     	
     		
     	}
 	
     	);
     	
     	passwordCracking.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.IntrotoPasswordCracking();    	
     		
     	}
 	
     	);
     	
     	metasploit.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.Metaspoloit();     	
     		
     	}
 	
     	);
     	
     	wepWPA.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.WEPWPA();    	
     		
     	}
 	
     	);
     	
     	kaliLinux.getItems().addAll(chapters, bypass, webCracking, infoGather, passwordCracking, metasploit, wepWPA);
     	
     	Menu kaliLinuxAttacks = new Menu("Kali-Linux-Attacks");
     	MenuItem androidHacking = new MenuItem("Android Hacking");
     	MenuItem bluetoothHacking = new MenuItem("BlueTooth Hacking");
     	MenuItem cctvHacking = new MenuItem("CCTV Hacking");
     	MenuItem evilTwinAttack = new MenuItem("Evil Twin Attack");
     	MenuItem iosHacking = new MenuItem("IOS Hacking");
     	MenuItem ipTracer = new MenuItem("IP Tracer");
     	MenuItem metasploitattck = new MenuItem("Metasploit Hacking");
     	MenuItem networkSniffer = new MenuItem("Network Sniffing");
     	MenuItem physicalHacking = new MenuItem("Physical Hack");
     	MenuItem wirelessHacking = new MenuItem("Wireless Attacks");
     	

     	androidHacking.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.AndroidHacking();     	
     		
     	}
 	
     	);
     	
     	bluetoothHacking.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.BluetoothHacking();    		
     	}
 	
     	);
     	
     	cctvHacking.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.CCTVHacking();     		
     	}
 	
     	);
     	
     	evilTwinAttack.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.EvilTwinAttacks();     		
     	}
 	
     	);
     	
     	iosHacking.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.IOSHacking();     		
     	}
 	
     	);
     	
     	ipTracer.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.IPTracer();     		
     	}
 	
     	);
     	
     	metasploitattck.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.MetasploitAttacks();     		
     	}
 	
     	);
     	
     	networkSniffer.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.NetworkSniffAttack();    		
     	}
 	
     	);
     	
     	physicalHacking.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.PhyicalPasswordAttacks();     		
     	}
 	
     	);
     	
     	wirelessHacking.setOnAction(e -> 

     	{
     		KaliLinuxFileOptions.WirelessAttacks();     		
     	}
 	
     	);
     	
     	kaliLinuxAttacks.getItems().addAll(androidHacking, bluetoothHacking, cctvHacking, evilTwinAttack, iosHacking, ipTracer, metasploitattck, physicalHacking, wirelessHacking);
  	
     	     	
     	Menu asm = new Menu("Assembly");
    	MenuItem introasm = new MenuItem("Intro_To_Assembly");
    	MenuItem autoasm = new MenuItem("Automated Service Sample");
    	MenuItem calcasm = new MenuItem("Calculator Sample");
    	MenuItem passcodeasm = new MenuItem("PassCode Sample");
    	MenuItem userInput = new MenuItem("Taking User Input");
    	MenuItem helloWorld = new MenuItem("Hello World");
    	
    	
    	
    	introasm.setOnAction(e ->
    	{
    		AssemblyFileOptions.IntroToAssembly();
    	}        		
    	);
    	
    	autoasm.setOnAction(e ->
		{
			AssemblyFileOptions.AutoMatedServiceSample();
		}        		
	   );    
    	
    	calcasm.setOnAction(e ->
		{
			AssemblyFileOptions.CalculatorSample();
		}        		
	   );    
    	
    	passcodeasm.setOnAction(e ->
		{
			AssemblyFileOptions.PasscodeSample();
		}        		
	   );    
    	
    	userInput.setOnAction(e ->
		{
			AssemblyFileOptions.UserInput();
		}        		
	   );    
    	
    	helloWorld.setOnAction(e ->
		{
			AssemblyFileOptions.HelloWorld();
		}        		
	   );    
    	       	
    	asm.getItems().addAll(introasm, autoasm, calcasm, passcodeasm, userInput, helloWorld);      	       	       	  	
    		        	
    	Menu powerShell = new Menu("PowerShell");
    	MenuItem introPowerShell = new MenuItem("Intro_To_PowerShell");
    	MenuItem basicPSCmds = new MenuItem("Basic CMD commands");
    	
    	introPowerShell.setOnAction(e ->
		{
			PowerShellFileOptions.IntrotoPowerShell();
		}        		
	   );    
    	
    	basicPSCmds.setOnAction(e ->
		{
			PowerShellFileOptions.WindowsCMDBasicCommands();
		}        		
	   ); 
    	
    	powerShell.getItems().addAll(introPowerShell, basicPSCmds);
    	
    	Menu blackHatPython = new Menu("Black-Hat-Python");
    	
    	Menu networkBasics = new Menu("Python Networking Basics...");
    	MenuItem bpnetwork = new MenuItem("Part1");
    	MenuItem bpnetwork2 = new MenuItem("Part2");
    	MenuItem bpnetwork3 = new MenuItem("Part3");
    	MenuItem bpnetwork4 = new MenuItem("Part4");
    	MenuItem bpnetwork5 = new MenuItem("Part5");
    	    	
    	bpnetwork.setOnAction(e ->
		{
			BlackHatPythonFileOptions.PythonNetworkingBasics();	
			
		}        		
	   ); 
    	
    	bpnetwork2.setOnAction(e ->
		{
			BlackHatPythonFileOptions.PythonNetworkingBasics2();		
			
		}        		
	   ); 
    	
    	bpnetwork3.setOnAction(e ->
		{
			BlackHatPythonFileOptions.PythonNetworkingBasics3();		
			
		}        		
	   ); 
    	
    	bpnetwork4.setOnAction(e ->
		{
			BlackHatPythonFileOptions.PythonNetworkingBasics4();		
			
		}        		
	   ); 
    	
    	bpnetwork5.setOnAction(e ->
		{
			BlackHatPythonFileOptions.PythonNetworkingBasics5();		
			
		}        		
	   ); 
    	
    	networkBasics.getItems().addAll(bpnetwork, bpnetwork2, bpnetwork3, bpnetwork4, bpnetwork5);

    	
    	Menu netSniffer = new Menu("Building A Network Sniffer...");
    	MenuItem snf = new MenuItem("Part1");
    	MenuItem snf2 = new MenuItem("Part2");
    	
    	snf.setOnAction(e ->
		{
			BlackHatPythonFileOptions.BuildingANetworkSnifferInPython();		
			
		}        		
	   ); 
    	
    	snf2.setOnAction(e ->
		{
			BlackHatPythonFileOptions.BuildingANetworkSnifferInPython2();		
			
		}        		
	   ); 
    	
    	netSniffer.getItems().addAll(snf, snf2);
    	
    	Menu webhacking = new Menu("Fundamentals Of Web Hacking...");
    	MenuItem wbpy = new MenuItem("Part1");
    	MenuItem wbpy2 = new MenuItem("Part2");
    	MenuItem wbpy3 = new MenuItem("Part3");
    	MenuItem wbpy4 = new MenuItem("Part4");
    	
    	wbpy.setOnAction(e ->
		{
			BlackHatPythonFileOptions.FundamentalsOfWebHacking();		
			
		}        		
	   ); 
    	
    	wbpy2.setOnAction(e ->
		{
			BlackHatPythonFileOptions.FundamentalsOfWebHacking2();		
			
		}        		
	   ); 
    	
    	wbpy3.setOnAction(e ->
		{
			BlackHatPythonFileOptions.FundamentalsOfWebHacking3();		
			
		}        		
	   ); 
    	
    	wbpy4.setOnAction(e ->
		{
			BlackHatPythonFileOptions.FundamentalsOfWebHacking4();		
			
		}        		
	   ); 
    	
    	webhacking.getItems().addAll(wbpy, wbpy2, wbpy3, wbpy4);

    	
    	Menu forensics = new Menu("Forensics...");
    	MenuItem forenpy = new MenuItem("Part1");
    	MenuItem forenpy2 = new MenuItem("Part2");
    	MenuItem forenpy3 = new MenuItem("Part3");
    	
    	forenpy.setOnAction(e ->
		{
			BlackHatPythonFileOptions.Forensics();		
			
		}        		
	   ); 
    	
    	forenpy2.setOnAction(e ->
		{
			BlackHatPythonFileOptions.Forensics2();	
			
		}        		
	   ); 
    	
    	forenpy3.setOnAction(e ->
		{
			BlackHatPythonFileOptions.Forensics3();	
			
		}        		
	   ); 
    	
    	
    	forensics.getItems().addAll(forenpy, forenpy2, forenpy3);
    	
    	Menu trojan = new Menu("Trojan Malware with GitHub...");
    	MenuItem trojanpy = new MenuItem("Part1");
    	MenuItem trojanpy2 = new MenuItem("Part2");
    	MenuItem trojanpy3 = new MenuItem("Part3");
    	MenuItem trojanpy4 = new MenuItem("Part4");
    	MenuItem trojanpy5 = new MenuItem("Part5");
    	
    	trojanpy.setOnAction(e ->
		{
			BlackHatPythonFileOptions.TrojanMalwarewithGitHub();		
			
		}        		
	   ); 
    	
    	trojanpy2.setOnAction(e ->
		{
			BlackHatPythonFileOptions.TrojanMalwarewithGitHub2();		
			
		}        		
	   ); 
    	
    	trojanpy3.setOnAction(e ->
		{
			BlackHatPythonFileOptions.TrojanMalwarewithGitHub3();		
			
		}        		
	   ); 
    	
    	trojanpy4.setOnAction(e ->
		{
			BlackHatPythonFileOptions.TrojanMalwarewithGitHub4();		
			
		}        		
	   ); 
    	
    	trojanpy5.setOnAction(e ->
		{
			BlackHatPythonFileOptions.TrojanMalwarewithGitHub5();		
			
		}        		
	   ); 
    	
    	trojan.getItems().addAll(trojanpy, trojanpy2, trojanpy3, trojanpy4, trojanpy5);
    	
    	Menu trojanTasks = new Menu("Common Trojan Tasks...");
    	MenuItem trotpy = new MenuItem("Part1");
    	MenuItem trotpy2 = new MenuItem("Part2");
    	MenuItem trotpy3 = new MenuItem("Part3");
    	MenuItem trotpy4 = new MenuItem("Part4");
    	
    	trotpy.setOnAction(e ->
		{
			BlackHatPythonFileOptions.CommonTasksforTrojans();		
			
		}        		
	   ); 
    	
    	trotpy2.setOnAction(e ->
		{
			BlackHatPythonFileOptions.CommonTasksforTrojans2();		
			
		}        		
	   ); 
    	
    	trotpy3.setOnAction(e ->
		{
			BlackHatPythonFileOptions.CommonTasksforTrojans3();		
			
		}        		
	   ); 
    	
    	trotpy4.setOnAction(e ->
		{
			BlackHatPythonFileOptions.CommonTasksforTrojans4();		
			
		}        		
	   ); 
    	
    	trojanTasks.getItems().addAll(trotpy, trotpy2, trotpy3, trotpy4);
    	
    	Menu mitB = new Menu("Man In The Browser Attacks...");
    	MenuItem mitBpy = new MenuItem("MITB Attack");
    	
    	mitBpy.setOnAction(e ->
		{
			BlackHatPythonFileOptions.ManintheBrowserAttacks();		
			
		}        		
	   ); 
    	
    	mitB.getItems().add(mitBpy);
    	
    	Menu blackHatPythonCode = new Menu("Black Hat Python Code..."); 
    	
    	Menu clientServers = new Menu("Client/Servers...");
    	MenuItem httpClient = new MenuItem("HTTP Client");
    	MenuItem httpServer = new MenuItem("HTTP Server");
    	MenuItem sshClient = new MenuItem("SSH Client");
    	MenuItem sshServer = new MenuItem("SSH Server");
    	MenuItem tcpClient = new MenuItem("TCP Client");
    	MenuItem tcpServer = new MenuItem("TCP Server");
    	MenuItem tcpBackDoorClient = new MenuItem("TCP BackDoor Client");
    	MenuItem udpClient = new MenuItem("UDP Client");
    	MenuItem udpServer = new MenuItem("UDP Server");
    	MenuItem udpBackDoorClient = new MenuItem("UDP BackDoor Client");
    	MenuItem tcpBackDoorServer = new MenuItem("TCP BackDoor Server");
    	MenuItem udpBackDoorServer = new MenuItem("UDP BackDoor Client");
    	
    	httpClient.setOnAction(e ->
		{
			BlackHatPythonFileOptions.HTTPClient();			
		}        		
	   ); 
    	
    	httpServer.setOnAction(e ->
		{
			BlackHatPythonFileOptions.HTTPServer();			
		}        		
	   ); 
    	
    	sshClient.setOnAction(e ->
		{
			BlackHatPythonFileOptions.SSHClient();			
		}        		
	   ); 
    	
    	sshServer.setOnAction(e ->
		{
			BlackHatPythonFileOptions.SSHServer();			
		}        		
	   ); 
    	
    	tcpClient.setOnAction(e ->
		{
			BlackHatPythonFileOptions.TCPClient();			
		}        		
	   ); 
    	
    	tcpServer.setOnAction(e ->
		{
			BlackHatPythonFileOptions.TCPServer();			
		}        		
	   ); 
    	
    	tcpBackDoorClient.setOnAction(e ->
		{
			BlackHatPythonFileOptions.TCPBackDoorClient();			
		}        		
	   ); 
    	
    	tcpBackDoorServer.setOnAction(e ->
		{
			BlackHatPythonFileOptions.TCPBackDoorServer();			
		}        		
	   ); 
    	
    	udpClient.setOnAction(e ->
		{
			BlackHatPythonFileOptions.UDPClient();			
		}        		
	   ); 
    	
    	udpServer.setOnAction(e ->
		{
			BlackHatPythonFileOptions.UDPServer();			
		}        		
	   ); 
    	
    	udpBackDoorClient.setOnAction(e ->
		{
			BlackHatPythonFileOptions.UDPBackDoorClient();			
		}        		
	   ); 
    	
    	udpBackDoorServer.setOnAction(e ->
		{
			BlackHatPythonFileOptions.UDPBackDoorServer();			
		}        		
	   ); 
    	
    	
    	clientServers.getItems().addAll(httpClient, httpServer, sshClient, sshServer, tcpClient, tcpServer, tcpBackDoorClient, udpClient, udpServer, tcpBackDoorServer, udpBackDoorServer, udpBackDoorClient);
    	
    	Menu webhckTools = new Menu("Web Hacking Tools...");
    	MenuItem flaskServer = new MenuItem("Flask Server");
    	MenuItem webScanner = new MenuItem("FullWebScanner");
    	MenuItem mitbAttack = new MenuItem("MitB Attack");
    	MenuItem urlOpen = new MenuItem("Openning URL Link");
    	MenuItem queries = new MenuItem("Queries");
    	MenuItem redirection = new MenuItem("Redirection");
    	MenuItem spider = new MenuItem("Spider Web Application Scanner");
    	MenuItem sqlInjection = new MenuItem("SQL Injection");
    	MenuItem sysOSWalk = new MenuItem("System OS Walk");
    	MenuItem urlRequest = new MenuItem("URL Request");
    	MenuItem osWalk = new MenuItem("Walking Directories");
    	MenuItem webAppMapping = new MenuItem("Web Applcation Mapping");
    	MenuItem webBruteForcer = new MenuItem("Web Brute Forcer");
    	
    	flaskServer.setOnAction(e ->
		{
			BlackHatPythonFileOptions.FlaskServer();		
			
		}        		
	   ); 
    	
    	webScanner.setOnAction(e ->
		{
			BlackHatPythonFileOptions.FullWebScanner();	
			
		}        		
	   ); 
    	
    	mitbAttack.setOnAction(e ->
		{
			BlackHatPythonFileOptions.MitBAttack();	
			
		}        		
	   ); 
    	
    	urlOpen.setOnAction(e ->
		{
			BlackHatPythonFileOptions.OpeningURLLink();		
			
		}        		
	   ); 
    	
    	urlRequest.setOnAction(e ->
		{
			BlackHatPythonFileOptions.URLRequest();		
			
		}        		
	   ); 
    	
    	queries.setOnAction(e ->
		{
			BlackHatPythonFileOptions.Queries();		
			
		}        		
	   ); 
    	
    	redirection.setOnAction(e ->
		{
			BlackHatPythonFileOptions.Redirection();		
			
		}        		
	   ); 
    	
    	spider.setOnAction(e ->
		{
			BlackHatPythonFileOptions.SpiderWebApplicationScanner();		
			
		}        		
	   ); 
    	
    	sqlInjection.setOnAction(e ->
		{
			BlackHatPythonFileOptions.SQLInjection();		
			
		}        		
	   ); 
    	
    	sysOSWalk.setOnAction(e ->
		{
			BlackHatPythonFileOptions.SystemOSWalkFULL();		
			
		}        		
	   ); 
    	
    	osWalk.setOnAction(e ->
		{
			BlackHatPythonFileOptions.WalkingDirectoriesInOS();		
			
		}        		
	   ); 
    	
    	webAppMapping.setOnAction(e ->
		{
			BlackHatPythonFileOptions.WebApplicationMapping();		
			
		}        		
	   ); 
    	
    	webBruteForcer.setOnAction(e ->
		{
			BlackHatPythonFileOptions.WebBruteForcer();		
			
		}        		
	   ); 
    	
    	webhckTools.getItems().addAll(flaskServer, webScanner, mitbAttack, urlOpen, urlRequest, queries, redirection, spider, sqlInjection, sysOSWalk, osWalk, webBruteForcer, webAppMapping);
   	
    	
    	Menu cryptography = new Menu("Cryptography...");
    	MenuItem cryptographyNotes = new MenuItem("Cryptography Notes");
    	MenuItem keyGen = new MenuItem("Key Generator");
    	MenuItem rsaTool = new MenuItem("Custom Encrypton/Decryption Tool(RSA)");
    	
    	cryptographyNotes.setOnAction(e ->
		{
			BlackHatPythonFileOptions.CryptographyNotes();			
		}        		
	   ); 
    	
    	keyGen.setOnAction(e ->
		{
			BlackHatPythonFileOptions.KeyGen();			
		}        		
	   ); 
    	
    	rsaTool.setOnAction(e ->
		{
			BlackHatPythonFileOptions.RSACryptographyTool();			
		}        		
	   ); 
    	
    	cryptography.getItems().addAll(cryptographyNotes, keyGen, rsaTool);
    	
    	Menu networkTools = new Menu("Network Hacking Tools");
    	MenuItem netsn = new MenuItem("Network Sniffer");
    	
    	netsn.setOnAction(e ->
		{
			BlackHatPythonFileOptions.NetworkSniffer();			
		}        		
	   ); 
    	
    	networkTools.getItems().add(netsn);
    	
    	
    	Menu webTools = new Menu("CHECK HERE FIRST...");
    	MenuItem bpydefaultLibs = new MenuItem("Default Libraries");
    	MenuItem classStruct = new MenuItem("Classes And Structs Needed");
    	MenuItem installScript = new MenuItem("Install Script (USE THIS)");
    	
    	bpydefaultLibs.setOnAction(e ->
		{
			BlackHatPythonFileOptions.DefaultLibraries();		
			
		}        		
	   ); 
    	
    	classStruct.setOnAction(e ->
		{
			BlackHatPythonFileOptions.MainClassesAndStructs();		
			
		}        		
	   ); 
    	
    	installScript.setOnAction(e ->
		{
			BlackHatPythonFileOptions.INSTALLSCRIPT();		
			
		}        		
	   ); 
    	
    	webTools.getItems().addAll(bpydefaultLibs, classStruct, installScript);
    	
    	
    	blackHatPythonCode.getItems().addAll(clientServers, cryptography, networkTools, webTools);
    		
    	blackHatPython.getItems().addAll(networkBasics, netSniffer, webhacking, forensics, trojan, trojanTasks, mitB, blackHatPythonCode);
    		        	
        menbar.getMenus().addAll(home, grayHatCpp, grayHatPython, kaliLinux, kaliLinuxAttacks, asm, powerShell, blackHatPython);
        
        //Set the scene and show the window
        rbmenu2.setTop(menbar);
        mainwin3.setScene(mainscene3);
        mainwin3.showAndWait();
    }
}
