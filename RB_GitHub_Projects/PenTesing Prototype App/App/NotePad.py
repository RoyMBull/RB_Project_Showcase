import sys
import os
from PyQt5 import QtWidgets, QtGui
from PyQt5.QtWidgets import(QApplication, QMainWindow, qApp, QSlider, QHBoxLayout, QPushButton, QLabel, QWidget, QLineEdit, QVBoxLayout, QTextEdit, QRadioButton, QCheckBox)


def Clr():
	Note_Pad_Box.clear()


def Sav():
    print("somecode")

def Opn():
	print("sometext")
	

#Main app start
Note_Pad_Main_App = QtWidgets.QApplication(sys.argv)
Note_Pad_Main_Win = QtWidgets.QWidget()
	
#Box_Layout 
Note_Pad_Box = QtWidgets.QTextEdit(Note_Pad_Main_Win)
Note_Pad_Layout = QtWidgets.QVBoxLayout(Note_Pad_Main_Win)
Note_Pad_Sav = QtWidgets.QPushButton(Note_Pad_Main_Win)
Note_Pad_clr = QtWidgets.QPushButton(Note_Pad_Main_Win)
Note_Pad_Opn = QtWidgets.QPushButton(Note_Pad_Main_Win)
	
Note_Pad_Layout.addWidget(Note_Pad_Box)
Note_Pad_Layout.addWidget(Note_Pad_clr)
Note_Pad_Layout.addWidget(Note_Pad_Opn)
Note_Pad_Layout.addWidget(Note_Pad_Sav)
	
#Buttons
Note_Pad_Sav.clicked.connect(Sav)
Note_Pad_Opn.clicked.connect(Opn)
Note_Pad_clr.clicked.connect(Clr)
#App mods
	
Note_Pad_Main_Win.setGeometry(700, 700, 700, 700)
Note_Pad_Sav.setText("Save")
Note_Pad_clr.setText("Clear")
Note_Pad_Opn.setText("Open")
Note_Pad_Main_Win.setWindowTitle("Note_Pad")
#MainApp end 
Note_Pad_Main_Win.show()
sys.exit(Note_Pad_Main_App.exec_())
	

	
Note_Pad()
