package application; //this is used when working with eclipse
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.sun.javafx.geom.Shape;

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.*;  
import javax.swing.*; 
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class CSharpFileOptions {
	
	public static void IntroToCSharp() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\C#\\IntroToC#.txt"));
			final JFrame frame = new JFrame("Intro To C#");  
			  
	        // Display the window.  
	        frame.setSize(500, 500);  
	        frame.setVisible(true);  
	         
	        // set flow layout for the frame  
	        frame.getContentPane().setLayout(new FlowLayout());  
	  
	        JTextArea textArea = new JTextArea(50, 100);  
	        textArea.read(file, null);
			file.close();
			textArea.requestFocus();
	        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
	  
	        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
	        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
	  
	        frame.getContentPane().add(scrollableTextArea);
	        			
		}
		
				
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
		
	}
	
	public static void AutoMatedServiceSample() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\C#\\AUTTOMATEDSERVICE.cs"));
			final JFrame frame = new JFrame("Automated Service Sample");  
			  
	        // Display the window.  
	        frame.setSize(500, 500);  
	        frame.setVisible(true);  
	         
	        // set flow layout for the frame  
	        frame.getContentPane().setLayout(new FlowLayout());  
	  
	        JTextArea textArea = new JTextArea(50, 100);  
	        textArea.read(file, null);
			file.close();
			textArea.requestFocus();
	        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
	  
	        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
	        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
	  
	        frame.getContentPane().add(scrollableTextArea);
	        			
		}
		
				
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
		
	}

	public static void PasscodeSample() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\C#\\PASSCODE.cs"));
			final JFrame frame = new JFrame("PassCode Sample");  
			  
	        // Display the window.  
	        frame.setSize(500, 500);  
	        frame.setVisible(true);  
	         
	        // set flow layout for the frame  
	        frame.getContentPane().setLayout(new FlowLayout());  
	  
	        JTextArea textArea = new JTextArea(50, 100);  
	        textArea.read(file, null);
			file.close();
			textArea.requestFocus();
	        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
	  
	        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
	        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
	  
	        frame.getContentPane().add(scrollableTextArea);
	        			
		}
		
				
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
		
	}

	
	public static void CalculatorSample() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\C#\\CALCBASIC.cs"));
			final JFrame frame = new JFrame("Calculator Sample");  
			  
	        // Display the window.  
	        frame.setSize(500, 500);  
	        frame.setVisible(true);  
	         
	        // set flow layout for the frame  
	        frame.getContentPane().setLayout(new FlowLayout());  
	  
	        JTextArea textArea = new JTextArea(50, 100);  
	        textArea.read(file, null);
			file.close();
			textArea.requestFocus();
	        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
	  
	        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
	        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
	  
	        frame.getContentPane().add(scrollableTextArea);
	        			
		}
		
				
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
		
	}

	
	public static void TicTacToeSample() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\C#\\TICTACTOE.cs"));
			final JFrame frame = new JFrame("Tic Tac Toe game sample");  
			  
	        // Display the window.  
	        frame.setSize(500, 500);  
	        frame.setVisible(true);  
	         
	        // set flow layout for the frame  
	        frame.getContentPane().setLayout(new FlowLayout());  
	  
	        JTextArea textArea = new JTextArea(50, 100);  
	        textArea.read(file, null);
			file.close();
			textArea.requestFocus();
	        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
	  
	        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
	        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
	  
	        frame.getContentPane().add(scrollableTextArea);
	        			
		}
		
				
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
		
	}

	
	public static void OOPSample() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\C#\\OOP.cs"));
			final JFrame frame = new JFrame("OOP Sample");  
			  
	        // Display the window.  
	        frame.setSize(500, 500);  
	        frame.setVisible(true);  
	         
	        // set flow layout for the frame  
	        frame.getContentPane().setLayout(new FlowLayout());  
	  
	        JTextArea textArea = new JTextArea(50, 100);  
	        textArea.read(file, null);
			file.close();
			textArea.requestFocus();
	        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
	  
	        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
	        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
	  
	        frame.getContentPane().add(scrollableTextArea);
	        			
		}
		
				
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
		
	}


}
