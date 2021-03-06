

function df_human_readable
{
	df -h -la 
}

function df_Kilo
{
	df -k -la
}

function df_Mega
{
	df -m -la
}

function df_Bytes
{
	df -B -la
}

function df_H
{
	df -H -la
}

function df_Local_Only
{
	df -l -la
}

function df_Types
{
	df -T -la
}



function df_i 
{
	df -i -la
}

function Specific_Type_Only
{ yourtype2="enter_type_here"
	
	clear
	echo "Enter your type"
	echo " "
	echo " "
	cat AvailableTypes.txt
	read yourtype2
	df -x $yourtype2 -la 
	echo "enter r to repeat"
	read response2
		if [ $response2 == "r" ];
		then 
			Specific_Type_Only
		fi 
	Main_Hub
	
}

function Specify_Type 
{ yourtype="enter_type_here"
	
	
	clear
	echo "Enter your type"
	echo " "
	echo " "
	cat AvailableTypes.txt
	read yourtype
	df -t $yourtype -la
	echo "enter r to repeat"
	read response
		if [ $response == "r" ];
		then 
			Specify_Type
		fi 
	Main_Hub
	
	
}


function Loop_through_Viewings 
{
	clear 
	echo "Listing File systems>>>>>" 
	sleep 1
	clear
	
	while [ 1 ]
	do 
		df_human_readable
		sleep 4 
		clear
		
		df_Kilo
		sleep 4 
		clear
		
		df_Mega
		sleep 4 
		clear
		
		df_Local_Only
		sleep 4 
		clear
		
		df_Types
		sleep 4 
		clear 
		
		df_Bytes
		sleep 4 
		clear
		
		df_H
		sleep 4 
		clear 
		
		df_i 
		sleep 4 
		clear 
		
	done 
		
		
}

function Main_Hub
{ listnow="listings"
	echo "File_System_listings"
	echo "All: all"
	echo "Display types desired: t"
	echo "Types to not display: x"
		read listnow
		
			if [ $listnow == "all" ];
			then 
				Loop_through_Viewings
			fi 
			
			if [ $listnow == "t" ];
			then 
				Specify_Type
			fi 
			
			if [ $listnow == "x" ];
			then 
				Specific_Type_Only
			fi 
}

Main_Hub

