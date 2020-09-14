#!/usr/bin/env bash
#Goal: Write an ecrypted folder that relies soley on conditonals 

#################### COME BACK TO THIS PROJECT LATER ONCE WE'VE AQUIRED SUFFICIENT KNOWLEDGE



#How many if statements should be in the program?
#-> One for if user starts this program
#-> One for if a folder is made (Might be a nested conditional)
		#And if a folder is made, set a password for the folder
#-> One for if the user closes the folder. The folder then locks and requires
	#The set Password
#-> One for if the user opens the folder again, unlocking it only if the password matches
	#The program must remember the original password and be able to lock the foldder again
#From this project we will learn how to executre if statemetns with 
#We are learning how to use if statements for commands
#store outputs to variables
#use variables to store commands
#Ex    me=$( cat seeme.txt )
#EX or me=$( ls -la > seeme.txt)
#EX or (This is the method using quotes)     me='echo hello World' the code will simply execute the command, since the quotes break when 
																	#the var is called
#I need to figure out my own technique for how to make a lockable folder
#How to make a directory in another location
#Ex  mkdir thisdirecotory (TYPE THE LOCATION OF THE PLACEMENT HERE	

#The program starts off by printing the directory to a file
#This infor is then stored in a variable that will cat the outputs
#A if statement will check if that directory is true, and if so, 
#will make a directory in that directory
#Start by checking the directory I'm in when the code starts

#Locking mechanism of the code
#How does the lock work



echo Doing stuff ^^__^^......
sleep 0.5 

echo "Please mkdir for 'secret' Open another terminal and change to current directory to do so"
echo "Please make sure to pre-select files to secure. Place them inside the folder"
read -p "ready? Hit enter for yes, else ctrl-c"

zip -e -r secret secret

echo "PING PONG ^__^ DONE!!!!"


#THink... is what I'm doing even effective????/
#I need the program to make a folder in the designated directory
#I then need the folder to lock 
#I need a conditiona





#I need to figure out how to make a directory from the directory that is printed
#Maybe I can do a redo of the cd, adding the pwd to it... using a text file maybe
