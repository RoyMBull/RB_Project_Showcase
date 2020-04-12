

function lpr_tst
{ Pname="Printer_Name"
  Fname="File_Name"
  NumOfFiles="Number_Of_Files"
 
	echo "Printer Name?"
	read Pname
	echo "File Name?"
	read Fname
	echo "How many files do you need printed?"
	read NumOfFiles
				
		lpr -P $Pname $Fname -# NumOfFiles
	
}

function lpq_tst
{ queuetype="Queue_Type"
  PrinterName="Printer_Name"
		echo "....queueinng now"
			sleep 2 
			echo "commands:"
			echo "Specific queue: 1"
			echo "Specific but verbose : 5"
			echo "All queues : 2"
			echo "All but verbose : 7"
			echo "Verbose : 3"
			read queuetype
				
				if [ queuetype == 1 ];
				then 
					lpq -P $PrinterName
				fi 
				
				if [ queuetype == 5 ];
				then 
					lpq -P -l $PrinterName
				fi 
				
				if [ queuetype == 2 ];
				then 
					lpq -a
				fi 
				
				if [ queuetype == 7 ];
				then 
					lpq -a -l
				fi 
				
				if [ queuetype == 3 ];
				then 
					lpq -l
				fi 
	
}

function lprm_tst
{
	
	JobNum="Job_Number"
		
			echo "Processes...:"
				lpq -a
				
			echo "Job Number? space between each ID number"
			read JobNum
			lprm $JobNum
			
}


lprcmd="printer_options"
echo "Print: p"
echo "current queues: q"
echo "remove job: rmlpr"
read lprcmd 
	
	if [ $lprcmd == "p" ];
	then 
		lpr_tst	
	fi
	
	
	if [ $lprcmd == "q" ];
	then 
		lpq_tst
	fi
	
	
	if [ $lprcmd == "rmlpr" ];
	then 
		lprm_tst
	fi
	
	
