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

public class GrayHatCppFileOptions {
	
	public static void OpeningProcessSample() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\GrayHatC++\\OpeningAProcess.cpp"));
			final JFrame frame = new JFrame("OpeningProcessSample");  
			  
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
	
	public static void OpeningWinHandleSample() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\GrayHatC++\\OpeningWinHandle.cpp"));
			final JFrame frame = new JFrame("OpeningWinHandleSample");  
			  
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
	
	public static void ProcessEnumeration() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\GrayHatC++\\ProcessEnumeration.cpp"));
			final JFrame frame = new JFrame("ProcessEnumeration");  
			  
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
	
	public static void ThreadEnumeration() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\GrayHatC++\\ThreadEnumeration.cpp"));
			final JFrame frame = new JFrame("ThreadEnumeration");  
			  
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
	
	public static void DllInjection() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\GrayHatC++\\DllInjection.cpp"));
			final JFrame frame = new JFrame("DllInjection");  
			  
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
	
	public static void CustomDebugger() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\GrayHatC++\\CustomDebugger.cpp"));
			final JFrame frame = new JFrame("CustomDebugger");  
			  
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
	
	public static void MemoryBreakPointTechnique() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\GrayHatC++\\MemoryBreakPointTechnique.txt"));
			final JFrame frame = new JFrame("MemoryBreakPointTechnique");  
			  
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
	
	public static void DefaultLibraries() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiFilesBasicV\\GrayHatC++\\DefaultLibraries.txt"));
			final JFrame frame = new JFrame("DefaultLibraries");  
			  
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
