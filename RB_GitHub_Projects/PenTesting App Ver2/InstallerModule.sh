#!/usr/bin/env bash
Install="Enter_the_name_of_the_compiler_to_install"


function InstallGpp
{
	sudo apt-get install g++	
}

function InstallGcc
{
	sudo apt-get install gcc
}

function InstallMono
{
	sudo apt-get install mono	
}

function InstallPy
{
	sudo apt-get install python
	sudo apt-get install python3
}

	InstallGpp
	InstallGcc
	InstallPy