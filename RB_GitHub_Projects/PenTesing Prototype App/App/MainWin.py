import sys
import os
from PyQt5 import QtWidgets, QtGui
from PyQt5.QtWidgets import(QApplication, QMainWindow, qApp, QSlider, QHBoxLayout, QPushButton, QLabel, QWidget, QLineEdit, QVBoxLayout, QTextEdit, QRadioButton, QCheckBox)
#

#how to set up a button to do an automatic call 
	#somebutton.clicked,connect(function())
			#place the "()" next to the functions name to have it automatically run
		
#if this works, then I can re_use the authenticate function in all of the other user interfaces
	
def RB_Futaba_Main_App_Win():
	#Setup of the app	
	Main_App = QtWidgets.QApplication(sys.argv)
	Main_Win = QtWidgets.QWidget()
	
	
	#contents of the Main_Win
	BackgroundIMG = QtWidgets.QLabel(Main_Win)
	Bash_Scripts = QtWidgets.QPushButton(Main_Win)
	C_prog = QtWidgets.QPushButton(Main_Win)
	NotePad = QtWidgets.QPushButton(Main_Win)
	Thread_GUI = QtWidgets.QPushButton(Main_Win)
	Open_Terminal = QtWidgets.QPushButton(Main_Win)
	
	#button module configurations
	C_prog.setText("Void C Prog()")
	C_prog.move(300, 300)
	C_prog.clicked.connect(Call_C_Interface)
	
	Bash_Scripts.setText("$Bash_$Scripts <\>$")
	Bash_Scripts.move(15, 300)
	Bash_Scripts.clicked.connect(Call_Bash_Interface)
	
	NotePad.setText("$Note_Pad <\>$")
	NotePad.move(175, 300)
	NotePad.clicked.connect(Call_TextEdit_Interface)
	
	Thread_GUI.setText("Add_GUI")
	Thread_GUI.move(15, 330)
	Thread_GUI.clicked.connect(Thread_GUI_Prog)
	
	Open_Terminal.setText("Terminal")
	Open_Terminal.move(300, 330)
	Open_Terminal.clicked.connect(Add_Terminal_Prog)
	
	#GUI modifications
	BackgroundIMG.setPixmap(QtGui.QPixmap("futaba.jpg"))
	Main_Win.setWindowTitle("Prototype code....")
	Main_Win.setGeometry(800, 10, 1350, 500)
	
	#runtime and showing of the app
	Main_Win.show()
	sys.exit(Main_App.exec_())

#button functions for the C_prog
def Call_C_Interface():
	os.system("python C_Interface.py")
	
def Call_Bash_Interface():
	os.system("python Bash_Interface.py")
	
def Call_TextEdit_Interface():
	os.system("python NotePad.py")
	
def Thread_GUI_Prog():
	os.system("xterm -e python MainWin.py")
	
def Add_Terminal_Prog():
	os.system("xterm")
	
	

RB_Futaba_Main_App_Win()



