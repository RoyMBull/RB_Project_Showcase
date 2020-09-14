
        	//ADVANCED VERSION OF THE PROGRAM ADD ONS
        	
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
        	