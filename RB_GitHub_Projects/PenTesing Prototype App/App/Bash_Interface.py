import sys
import os
from PyQt5 import QtWidgets, QtGui
from PyQt5.QtWidgets import(QApplication, QMainWindow, qApp, QSlider, QHBoxLayout, QPushButton, QLabel, QWidget, QLineEdit, QVBoxLayout, QTextEdit, QRadioButton, QCheckBox)

def Bash_interface():
	#Main_app set up
	Bash_interface_App = QtWidgets.QApplication(sys.argv)
	Bash_interface_Win = QtWidgets.QWidget()
	
	#Modules
	Bash_interfaceLabel = QtWidgets.QLabel(Bash_interface_Win)
	Encrypted_Folder = QtWidgets.QPushButton(Bash_interface_Win)
	Data_Feed = QtWidgets.QPushButton(Bash_interface_Win)
	Network_Data_feed = QtWidgets.QPushButton(Bash_interface_Win)
	Automated_Service = QtWidgets.QPushButton(Bash_interface_Win)
	Calculator = QtWidgets.QPushButton(Bash_interface_Win)
	Printer_Control_Module = QtWidgets.QPushButton(Bash_interface_Win)
	File_Sys_Module = QtWidgets.QPushButton(Bash_interface_Win)
	Clone = QtWidgets.QPushButton(Bash_interface_Win)
	Extract_usr_data = QtWidgets.QPushButton(Bash_interface_Win)
	
	
	#Module modifications
	Bash_interfaceLabel.setPixmap(QtGui.QPixmap("futaba2.jpg"))
	
	Printer_Control_Module.move(475, 25)
	Printer_Control_Module.setText("Print_Mod")
	Printer_Control_Module.clicked.connect(Print_Prog)
	
	File_Sys_Module.move(475, 50)
	File_Sys_Module.setText("Display_file_sys")
	File_Sys_Module.clicked.connect(File_Sys_Prog)
	
	Clone.move(475, 70)
	Clone.setText("Clone Drive")
	Clone.clicked.connect(Clone_Prog)
	
	Extract_usr_data.move(475, 100)
	Extract_usr_data.setText("Extraction")
	Extract_usr_data.clicked.connect(Extraction_Prog)
	
	Encrypted_Folder.move(475, 200)
	Encrypted_Folder.setText("Make an Encrypted Folder")
	Encrypted_Folder.clicked.connect(Encrypt_Folder)
	
	Data_Feed.move(475, 270)
	Data_Feed.setText("Retrieve Sys Data_Feed")
	Data_Feed.clicked.connect(Data_Feed_func)
	
	Network_Data_feed.move(475, 300)
	Network_Data_feed.setText("Retrieve Network_Data_feed")
	Network_Data_feed.clicked.connect(Net_data_feed)
	
	Automated_Service.move(475, 350)
	Automated_Service.setText("Automated Service")
	Automated_Service.clicked.connect(Auto_serv)
	
	Calculator.move(475, 400)
	Calculator.setText("Calculator")
	Calculator.clicked.connect(Calc)
	
	#App modificationss
	Bash_interface_Win.setWindowTitle("$Bash_$Scripts <\>$")
	Bash_interface_Win.setGeometry(1000, 1000, 680, 675)
	
	#App ends here
	Bash_interface_Win.show()
	sys.exit(Bash_interface_App.exec_())
	

def Print_Prog():
	os.system("./Print_Module.sh")
	
def File_Sys_Prog():
	os.system("./File_Systems.sh")
	
def Clone_Prog():
	os.system("./Clone_Module")
	
def Extraction_Prog():
	os.system("./Extraction.sh")
	
def Encrypt_Folder():
	os.system("./Advanced_Protected_Folder.sh")

def Data_Feed_func():
	os.system("./Data_Feed.sh")
	
def Net_data_feed():
	os.system("./Network_Data_Feed.sh")

def Auto_serv():
	os.system("./Automated_Service_In_Bash.sh")
	
def Calc():
	os.system("./Calculator_In_Bash.sh")
	
Bash_interface()