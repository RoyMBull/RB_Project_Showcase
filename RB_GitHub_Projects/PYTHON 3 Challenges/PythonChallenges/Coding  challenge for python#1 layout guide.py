How to tackle the variable baner project
Goal: The banner must match the length of the variables inside when the user types something

Techniques used in the code

Steps to take: 
#1: 
Create an overloading function that will prompt the user to input, overloading/overidding
the following variables for the program
->  text, BannerCh, and the length

What needs to be thought out: THE CODE WILL ONLY TAKE STRING VALUES IN MY CASE
-Work on centering the text for the banner
	->Solved:
		We will use a simple string center technique in python
		
	EX: String Centering in python
		#!/usr/bin/python3

		#str.center(40, 'a') : 
		str = "this is string example....wow!!!"

		##His code centered the text in the program
		print  ("",str.center(40, 'a'))
		
-Work on adjusting the size of the banner based on text entry, the length
We need to take and count the text length, so that we can use it later for overidding
	->Solved:
	EX: Finding the length of the text we entered
		#!/usr/bin/python

		str = "this is string example....wow!!!";

		print "Length of the string: ", len(str)

-Work on conditionals, even a conditional for if there is no text, which will print a blank
Banner

Set up a conditional, over overloading nesting. If I overload with text of 64 characters for
example, overload the next variable to match that

Example

a (in some function) = 64 characters

def smoefunctino (b)

b = shdhsb(64)

return b



