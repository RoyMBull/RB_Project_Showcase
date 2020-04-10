#!/usr/bin/env bash

Exec="Enter_file_to_exe_here"
FILETYPE="cpp, py, etc etc"
	
	read Exec
	read FILETYPE
		
		if [ $FILETYPE == ".cpp" ];
		then 
			ExecCPP="$Exec$FILETYPE"
			CompileCPP=$(g++ $Exec$FILETYPE -o $Exec)
			RunCPP=$(./$Exec)
			
			clear 
			echo $CompileCPP
			echo $RunCPP
		
		fi 
		
		if [ $FILETYPE == ".py" ];
		then 
			ExecPY="$Exec$FILETYPE"
			RunPY=$(python $Exec$FILETYPE)
			
			clear 
			echo $RunPY
		
		fi
		
		if [ $FILETYPE == ".cs" ];
		then 
			ExecCS="$Exec$FILETYPE"
			CompileCS=$(gmcs $Exec$FILETYPE)
			ExecFileCS="$Exec.exe"
			RunCS=$(mono $ExecFileCS)
		fi 
		
		if [ $FILETYPE == ".c" ];
		then 
			ExecC="$Exec$FILETYPE"
			CompileC=$(gcc $Exec$FILETYPE -o $Exec)
			RunC=$(./$Exec)
			
			clear 
			echo $CompileC
			echo $RunC
		fi 
		
		