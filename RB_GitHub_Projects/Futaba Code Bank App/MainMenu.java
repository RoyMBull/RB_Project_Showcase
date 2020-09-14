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

public class AlertBox
{
	 //This is where modules are declared
    //MainWindow Scene Modules
    
    public static void win2()
    {
        //Set the window title 
        Stage mainwin2 = new Stage();
        mainwin2.setTitle("Futaba_Webs_Code_Bank");

        //Set our layout and scene for the main window
        BorderPane rbmenu = new BorderPane();
        Scene mainscene2 = new Scene(rbmenu, 1280, 600);
        mainscene2.getStylesheets().add("RBMainWin.css");
        
        
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
        	
        //Define Menu Contents
        	Menu cpp = new Menu("C++");
        	MenuItem introcpp = new MenuItem("Intro_To_C++");
        	MenuItem introc = new MenuItem("Intro_To_C");
        	MenuItem readfstcpp = new MenuItem("READ_FIRST");
        	MenuItem autocpp = new MenuItem("Automated Service Sample");
        	MenuItem calccpp = new MenuItem("Calculator Sample");
        	MenuItem passcodecpp = new MenuItem("PassCode Sample");
        	MenuItem tictactoecpp = new MenuItem("TicTacToe Sample");
        	MenuItem poscpp = new MenuItem("POS Sample");
        	
        	
        	
        	introcpp.setOnAction(e ->
        		{
        			CPPFileOptions.IntroToCPP();
        		}        		
        	);
        	
        	readfstcpp.setOnAction(e ->
    		{
    			CPPFileOptions.ReadFirst();
    		}        		
           );
        	
        	
        	introc.setOnAction(e ->
    		{
    			CPPFileOptions.IntroToC();
    		}        		
    	   );
        	
        	autocpp.setOnAction(e ->
    		{
    			CPPFileOptions.AutoMatedServiceSample();
    		}        		
    	   );    
        	
        	calccpp.setOnAction(e ->
    		{
    			CPPFileOptions.CalculatorSample();
    		}        		
    	   );    
        	
        	passcodecpp.setOnAction(e ->
    		{
    			CPPFileOptions.PasscodeSample();
    		}        		
    	   );    
        	
        	poscpp.setOnAction(e ->
    		{
    			CPPFileOptions.POSSample();
    		}        		
    	   );    
        	
        	tictactoecpp.setOnAction(e ->
    		{
    			CPPFileOptions.TicTacToeSample();
    		}        		
    	   );    
        	       	
        	cpp.getItems().addAll(introcpp, introc, readfstcpp, autocpp, calccpp, passcodecpp, poscpp, tictactoecpp);      	       	       	  	
        		        		
        	Menu csharp = new Menu("C#");
        	MenuItem introcsharp = new MenuItem("Intro_To_C#");
        	MenuItem autocsharp = new MenuItem("Automated Service Sample");
        	MenuItem calccsharp = new MenuItem("Calculator Sample");
        	MenuItem passcodecsharp = new MenuItem("PassCode Sample");
        	MenuItem tictactoecsharp = new MenuItem("TicTacToe Sample");
	        	
        	introcsharp.setOnAction(e ->
        		{
        			CSharpFileOptions.IntroToCSharp();
        		}        		
        	);
        	        	        	
        	autocsharp.setOnAction(e ->
    		{
    			CSharpFileOptions.AutoMatedServiceSample();
    		}        		
    	   );    
        	
        	calccsharp.setOnAction(e ->
    		{
    			CSharpFileOptions.CalculatorSample();
    		}        		
    	   );    
        	
        	passcodecsharp.setOnAction(e ->
    		{
    			CSharpFileOptions.PasscodeSample();
    		}        		
    	   );        
        	
        	tictactoecsharp.setOnAction(e ->
    		{
    			CSharpFileOptions.TicTacToeSample();
    		}        		
    	   );    
        	       	
        	csharp.getItems().addAll(introcsharp, autocsharp, calccsharp, passcodecsharp, tictactoecsharp);      	       	       	  	
        		        		
        
        		
        	Menu py3 = new Menu("Python3");
        	
        	MenuItem intropy3 = new MenuItem("Intro_To_Python3");
        	MenuItem readfstpy3 = new MenuItem("READ_FIRST");
        	MenuItem autopy3 = new MenuItem("Automated Service Sample");
        	MenuItem calcpy3 = new MenuItem("Calculator Sample");
        	MenuItem passcodepy3 = new MenuItem("PassCode Sample");
        	MenuItem tictactoepy3 = new MenuItem("TicTacToe Sample");
        	
        	
        	
        	intropy3.setOnAction(e ->
        		{
        			Python3FileOptions.IntroToPython();
        		}        		
        	);
        	
        	readfstpy3.setOnAction(e ->
    		{
    			Python3FileOptions.ReadFirst();
    		}        		
           );
        	        	        	
        	autopy3.setOnAction(e ->
    		{
    			Python3FileOptions.AutoMatedServiceSample();
    		}        		
    	   );    
        	
        	calcpy3.setOnAction(e ->
    		{
    			Python3FileOptions.CalculatorSample();
    		}        		
    	   );    
        	
        	passcodepy3.setOnAction(e ->
    		{
    			Python3FileOptions.PasscodeSample();
    		}        		
    	   );      
        	       	
        	py3.getItems().addAll(intropy3, readfstpy3, autopy3, calcpy3, passcodepy3);      	       	       	  		        		
        	
      	
        	Menu bash = new Menu("Bash_Scripting");
        	MenuItem introbash = new MenuItem("Intro_To_Bash");
        	MenuItem basiccmds = new MenuItem("BasicCommands");
        	MenuItem checkingFiles = new MenuItem("Checkin Files");
        	MenuItem errors = new MenuItem("Errors In Bash");
        	MenuItem fileSystems = new MenuItem("File Systems");
        	MenuItem graphics = new MenuItem("Graphics In Bash");
        	MenuItem hostInformation = new MenuItem("Host Information");
        	MenuItem hostLocation = new MenuItem("Host Location");
        	MenuItem inputBash = new MenuItem("Input In Bash");
        	MenuItem mathBash = new MenuItem("Math In Bash");
        	MenuItem networkConnections = new MenuItem("Network Connections");
        	MenuItem scheduleJobs = new MenuItem("Schedule Jobs");
        	MenuItem variablesBash = new MenuItem("Variables In Bash");
        	MenuItem viewingProcesses = new MenuItem("Viewing Processes");
        	MenuItem controllingProcesses = new MenuItem("Controling Processes");
        	
        	introbash.setOnAction(e -> 
        		
        	{
        		BashFileOptions.IntroToBash();
        	}
        		
        	);
        	
        	basiccmds.setOnAction(e -> 
    		
        	{
        		BashFileOptions.BasicCommands();
        	}
        		
        	);
        	checkingFiles.setOnAction(e -> 
    		
        	{
        		BashFileOptions.CheckingFilesAndFolders();
        	}
        		
        	);
        	errors.setOnAction(e -> 
    		
        	{
        		BashFileOptions.ErrorsInBash();
        	}
        		
        	);
        	fileSystems.setOnAction(e -> 
    		
        	{
        		BashFileOptions.FileSystems();
        	}
        		
        	);
        	graphics.setOnAction(e -> 
    		
        	{
        		BashFileOptions.GraphicsInBash();
        	}
        		
        	);
        	hostInformation.setOnAction(e -> 
    		
        	{
        		BashFileOptions.Host_Information();
        	}
        		
        	);
        	hostLocation.setOnAction(e -> 
    		
        	{
        		BashFileOptions.HostLocation();
        	}
        		
        	);
        	inputBash.setOnAction(e -> 
    		
        	{
        		BashFileOptions.InputInBash();
        	}
        		
        	);
        	mathBash.setOnAction(e -> 
    		
        	{
        		BashFileOptions.MathInBash();
        	}
        		
        	);
        	networkConnections.setOnAction(e -> 
    		
        	{
        		BashFileOptions.NetworkConnections();
        	}
        		
        	);
        	scheduleJobs.setOnAction(e -> 
    		
        	{
        		BashFileOptions.ScheduleJobs();
        	}
        		
        	);
        	variablesBash.setOnAction(e -> 
    		
        	{
        		BashFileOptions.VariablesInBash();
        	}
        		
        	);
        	viewingProcesses.setOnAction(e -> 
    		
        	{
        		BashFileOptions.ViewingProcesses();
        	}
        		
        	);
        	controllingProcesses.setOnAction(e -> 
    		
        	{
        		BashFileOptions.ControllingProcesses();
        	}
        		
        	);
        	
        	bash.getItems().addAll(introbash, basiccmds, checkingFiles, errors, fileSystems, graphics, hostInformation, inputBash, mathBash, networkConnections, scheduleJobs, variablesBash, viewingProcesses, controllingProcesses);
        	        		
        	Menu arduino = new Menu("Arduino");
        	MenuItem digwrite = new MenuItem("Digital Write");
        	MenuItem digread = new MenuItem("Digital Read");
        	MenuItem buttn = new MenuItem("Button Module");
        	MenuItem potentiometer = new MenuItem("Potentiometer Module");
        	MenuItem motor = new MenuItem("Motor Module");
        	MenuItem photoresistor = new MenuItem("Photoresistor Module");
        	MenuItem serialcom = new MenuItem("Serial Communication");
        	MenuItem wifiReciever = new MenuItem("Wireless Reciever Module");
        	MenuItem wifiTransmitter = new MenuItem("Wireless Transmitter Module");
        	MenuItem gy521 = new MenuItem("GY-521 Module");
        	
        	digwrite.setOnAction(e -> 
        	
        	{
        		ArduinoFileOptions.DigitalWriteSample();
        	}
        		
        	);
        	
        	digread.setOnAction(e -> 
        	
        	{
        		ArduinoFileOptions.DigitalReadSample();
        	}
        		
        	);

        	buttn.setOnAction(e -> 

        	{
        		ArduinoFileOptions.ButtonModule();
        	}
	
        	);
        	
        	potentiometer.setOnAction(e -> 

        	{
        		ArduinoFileOptions.PotentiometerModule();
        	}
	
        	);
        	
        	motor.setOnAction(e -> 

        	{
        		ArduinoFileOptions.Motor_Module();
        	}
	
        	);
        	
        	photoresistor.setOnAction(e -> 

        	{
        		ArduinoFileOptions.PhotoresisterModule();
        	}
	
        	);
        	
        	potentiometer.setOnAction(e -> 

        	{
        		ArduinoFileOptions.PotentiometerModule();
        	}
	
        	);
        	
        	serialcom.setOnAction(e -> 

        	{
        		ArduinoFileOptions.SerialCommunicationSample();
        	}
	
        	);
        	
        	wifiReciever.setOnAction(e -> 

        	{
        		ArduinoFileOptions.WirelessRecieverSample();
        	}
	
        	);
        	
        	wifiTransmitter.setOnAction(e -> 

        	{
        		ArduinoFileOptions.WirelessTransmitterSample();
        	}
	
        	);
        	gy521.setOnAction(e ->
        	
        	{
        		ArduinoFileOptions.GY521Module();
        	}
        	
        	);

        	arduino.getItems().addAll(digwrite, digread, buttn, potentiometer, motor, photoresistor, serialcom, wifiReciever, wifiTransmitter, gy521);
        		
        	Menu mysql = new Menu("MYSQL");
        	MenuItem introMYSQL = new MenuItem("Intro To MYSQL");
        	
        	introMYSQL.setOnAction(e -> SQLFileOptions.IntroToMYSQL());
        	
        	mysql.getItems().add(introMYSQL);
        	
        	Menu java = new Menu("Java/JavaFX");
        	MenuItem introjava = new MenuItem("Intro To Java");
        	MenuItem introjavafx = new MenuItem("Intro to JavaFX");
        	MenuItem introjavafxcss = new MenuItem("Intro to JavaFXCSS");
        	MenuItem jfxLibs = new MenuItem("JFX Libraries");
        	MenuItem installjava = new MenuItem("Installing Eclipse and JavaFX Manual");
        	MenuItem checkBox = new MenuItem("CheckBox");
        	MenuItem choiceBox = new MenuItem("ChoiceBox");
        	MenuItem comboBox = new MenuItem("ComboBox");
        	MenuItem eventHandler = new MenuItem("EventHandler");
        	MenuItem eventHandler2 = new MenuItem("EventHandler2");
        	MenuItem lambda = new MenuItem("EventHandler3 Lambda");
        	MenuItem lambda2 = new MenuItem("EventHandler4 Lambda");
        	MenuItem fileOpener = new MenuItem("FileOpener");
        	MenuItem guiFileReader = new MenuItem("GUIFileReader");
        	MenuItem hellowlrd = new MenuItem("HelloWorld");
        	MenuItem javaFXCSS = new MenuItem("JavaFXCSS");
        	MenuItem listView = new MenuItem("ListView");
        	MenuItem menujavafx = new MenuItem("Menu");
        	MenuItem multipleScenes = new MenuItem("Multiple_Scenes");
        	MenuItem treeView = new MenuItem("TreeView");
        	MenuItem windowjava = new MenuItem("Window");
        	MenuItem multipleWindows = new MenuItem("Multiple_Windows");
        	
        	
        	introjava.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.IntroToJava();
        	}
        	
        	);
        	
        	introjavafx.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.IntroToJavaFX();
        	}
        	
        	);
        	
        	introjavafxcss.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.IntroToJavaFXCSS();
        	}
        	
        	);
        	
        	jfxLibs.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.JavaFXLibraries();
        	}
        	
        	);
        	
        	
        	installjava.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.Installation();
        	}
        	
        	);
        	
        	checkBox.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.CheckBoxSample();
        	}
        	
        	);
        	
        	
        	choiceBox.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.ChoiceBoxSample();
        	}
        	
        	);
        	
        	comboBox.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.ComboBox();
        	}
        	
        	);
        	
        	
        	eventHandler.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.EventHandlerSample1();
        	}
        	
        	);
        	
        	eventHandler2.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.EventHandlerSample2();
        	}
        	
        	);
        	
        	
        	lambda.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.EventHandlerSample3();
        	}
        	
        	);
        	
        	lambda2.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.EventHandlerSample4();
        	}
        	
        	);
        	
        	
        	fileOpener.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.FileOpenerSample();
        	}
        	
        	);
        	
        	guiFileReader.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.GUIFileReader();
        	}
        	
        	);
        	
        	
        	hellowlrd.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.HelloWorld();
        	}
        	
        	);
        	
        	javaFXCSS.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.JavaFXCSS();
        	}
        	
        	);
        	
        	
        	listView.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.ListView();
        	}
        	
        	);
        	
        	menujavafx.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.MenuSample();
        	}
        	
        	);
        	
        	
        	multipleScenes.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.MultipleScenesSample();
        	}
        	
        	);
        	
        	treeView.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.TreeView();
        	}
        	
        	);
        	
        	
        	windowjava.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.WindowSample();
        	}
        	
        	);
        	
        	multipleWindows.setOnAction(e -> 
        	
        	{
        		JavaFileOptions.MultipleWindowsSample();
        	}
        	
        	);
        	
        	java.getItems().addAll(introjava, introjavafx, introjavafxcss, jfxLibs, installjava, checkBox, choiceBox, comboBox, eventHandler, eventHandler2, lambda, lambda2, fileOpener, guiFileReader, hellowlrd, javaFXCSS, listView, menujavafx, multipleScenes, treeView, windowjava, multipleWindows);
	       	
        	        		
        	Menu webdev = new Menu("Web_Development");
        	MenuItem introHTML = new MenuItem("Intro to HTML");
        	MenuItem introCSS = new MenuItem("Intro to CSS");
        	MenuItem introJavaScript = new MenuItem("Intro to JavaScript");
        	MenuItem htmlSample = new MenuItem("HTML Sample");
        	MenuItem cssSample = new MenuItem("CSS Sample");
        	MenuItem javaScriptSample = new MenuItem("JavaScript Sample");
        	
        	introHTML.setOnAction(e -> 
        	
        	{
        		WebDevFileOptions.IntroToHTML();
        	}
        	
        	);
        	
        	introCSS.setOnAction(e -> 
        	
        	{
        		WebDevFileOptions.IntroToCSS();
        	}
        	
        	);

        	introJavaScript.setOnAction(e -> 

        	{
        		WebDevFileOptions.IntroToJavaScript();
        	}

        	);

        	htmlSample.setOnAction(e -> 

        	{
        		WebDevFileOptions.HTMLSample();
        	}

        	);

        	cssSample.setOnAction(e -> 

        	{
        		WebDevFileOptions.CSSSample();
        	}

        	);

        	javaScriptSample.setOnAction(e -> 

        	{
        		WebDevFileOptions.JavaScriptSample();
        	}

        	);		

        	
        	webdev.getItems().addAll(introHTML, introCSS, introJavaScript, htmlSample, cssSample, javaScriptSample);
        	
        	
        	Menu advver = new Menu("Advanced-Version");
        	
        	        		
        	Menu omegaver = new Menu("Omega-Version");
        	
        	
        //Add items to the menubar
        menbar.getMenus().addAll(home, cpp, csharp, py3, bash, arduino, mysql, java, webdev, advver, omegaver);
        
        //Set the scene and show the window
        rbmenu.setTop(menbar);
        mainwin2.setScene(mainscene2);
        mainwin2.showAndWait();
    }
}
