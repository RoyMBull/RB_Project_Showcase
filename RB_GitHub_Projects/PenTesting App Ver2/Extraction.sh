#!/usr/bin/env bash

function df_human_readable
{
	df -h -la 
}

function Clone
{ filesys="Disk_to_clone"
  CloneTo="/dev/sda"
	echo "Displaying File systems >>>>"
	clear
		df_human_readable
	echo "   "
	echo "   "
	echo "Enter the filesystem as you see it described and insert disk drive /dev/sda now"
		read filesys 
		dd if=$filesys of=$CloneTo bs=512
}

function Extraction_Type_
{ emailaddr="E-mail_addr"
  respnose="yes/enter anything or no"
  response2="yes/enter anything no"

	echo "E-mail?"
	read response
		if [ $response == "y" ];
		then
			read emailaddr
		fi
		
	echo "Cloning? This will require a second disk drive"
		read respnose2
			
			if [ $response2 == "y" ];
			then
				Clone
			fi
	
	echo "....Process Complete... MOVE MANUALLY TO USB"

	
}

function Wipe_Sys_Data
{
	echo "testing 1... 2... 3"
}

function Rm_Evidence
{
	cd 
	touch blankfile.txt
	cat blankfile.txt > .bash_history
	rm -R Host_Data
	rm -R Env_Data
	
	echo "Detroy the drive?"
		read choice 
			if [ choice == "y" ];
			then 
				Wipe_Sys_Data
			fi
	
	
}



function Move_Env_information
{
	mkdir Env_Data
		mv whoami.txt Env_Data
		mv id.txt Env_Data
		mv whoU.txt Env_Data
		mv whoT.txt Env_Data
		mv Users.txt Env_Data
		mv Finger.txt Env_Data
		mv LastX.txt Env_Data
		mv Lasti.txt Env_Data
		mv printenv.txt Env_Data
		mv env.txt Env_Data

	
}

function Move_Host_Info
{
	mkdir Host_Data
		mv username.txt Host_Data
		mv ip.txt Host_Data
		mv aliass.txt Host_Data
		mv shortname.txt Host_Data
		mv qualifiedname.txt Host_Data
		mv DNSName.txt Host_Data
		mv NIS_YP_Name.txt Host_Data
		mv addr.txt Host_Data
		mv maddr.txt Host_Data
		mv link.txt Host_Data
		mv route.txt Host_Data

	
}

function Sync_To_Main_Hub
{
	Move_Env_information
	Move_Host_Info
}

#Main_Prog 
function Extract_User_Machine_Data
{
	logname >logname.txt
	whoami >whoami.txt
	id > id.txt
	who -u >whoU.txt
	who -T >whoT.txt
	users  >Users.txt
	finger >Finger.txt
	last -x >LastX.txt
	last -i >Lasti.txt
	printenv >printenv.txt
	env > env.txt
		
	uname -a >username.txt
	hostname -i >ip.txt
	hostname -a >aliass.txt
	hostname -s >shortname.txt
	hostname -f >qualifiedname.txt
	hostname -d >DNSName.txt
	hostname -y >NIS_YP_Name.txt
	ip addr > addr.txt
	ip maddr > maddr.txt
	ip link > link.txt
	ip route > route.txt
#	ip monitor

		Sync_To_Main_Hub
		Extraction_Type_
		Rm_Evidence
}

Extract_User_Machine_Data
