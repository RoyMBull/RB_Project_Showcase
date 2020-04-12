import sys
import os
from PyQt5 import QtWidgets, QtGui
from PyQt5.QtWidgets import(QApplication, QMainWindow, qApp, QSlider, QHBoxLayout, QPushButton, QLabel, QWidget, QLineEdit, QVBoxLayout, QTextEdit, QRadioButton, QCheckBox)

def C_interface():
	#Main_app set up
	C_interface_App = QtWidgets.QApplication(sys.argv)
	C_interface_Win = QtWidgets.QWidget()
	
	#Modules
	C_interfaceLabel = QtWidgets.QLabel(C_interface_Win)
	VIM_SIM = QtWidgets.QPushButton(C_interface_Win)
	Tic_Tac_Toe = QtWidgets.QPushButton(C_interface_Win)
	
	
	#Module modifications
	C_interfaceLabel.setPixmap(QtGui.QPixmap("hacker.jpg"))
	
	VIM_SIM.move(475, 200)
	VIM_SIM.setText("VIM_SIM")
	VIM_SIM.clicked.connect(VimSim)
	
	Tic_Tac_Toe.move(475, 270)
	Tic_Tac_Toe.setText("Tic_Tac_Toe")
	Tic_Tac_Toe.clicked.connect(tic_tac_toe)
	
	#App modifications
	C_interface_Win.setWindowTitle("Void C(){}")
	C_interface_Win.setGeometry(1000, 1000, 1000, 675)
	
	#App ends here
	C_interface_Win.show()
	sys.exit(C_interface_App.exec_())
	


def VimSim():
	os.system("gcc Vim_SIm.c -o VimSim")
	os.system("./VimSim")


def tic_tac_toe():
	os.system("gcc Tic_Tac_Toe_In_C.c -o tic")
	os.system("./tic")
	
C_interface()