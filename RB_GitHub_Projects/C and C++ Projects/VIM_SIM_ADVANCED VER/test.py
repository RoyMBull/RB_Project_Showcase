
import sys
import os
from PyQt5 import QtWidgets, QtGui
from PyQt5.QtWidgets import(QApplication, QMainWindow, qApp, QSlider, QHBoxLayout, QPushButton, QLabel, QWidget, QLineEdit, QVBoxLayout, QTextEdit, QRadioButton, QCheckBox)

def RB_Futaba_Main_App_Win():
	#Setup of the app	
	Main_App = QtWidgets.QApplication(sys.argv)
	Main_Win = QtWidgets.QWidget()
	
	
	#contents of the Main_Win
	BackgroundIMG = QtWidgets.QLabel(Main_Win)
	Bash_Scripts = QtWidgets.QPushButton(Main_Win)
	C_prog = QtWidgets.QPushButton(Main_Win)	
	
	#button module configurations
	C_prog.setText("Void C Prog()")
	C_prog.move(1400, 650)
	
	Bash_Scripts.setText("$Bash_$Scripts <\>$")
	Bash_Scripts.move(1550, 650)
	
	#GUI modifications
	BackgroundIMG.setPixmap(QtGui.QPixmap("futaba.jpg"))
	Main_Win.setWindowTitle("Prototype code....")
	Main_Win.setGeometry(100, 400, 1900, 1000)
	
	#runtime and showing of the app
	Main_Win.show()
	sys.exit(Main_App.exec_())





RB_Futaba_Main_App_Win()