package application;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KaliLinuxFileOptions {

	public static void BypassingAntiVirus() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\CyberSecurity\\BypassingAntiVirus.txt"));
			final JFrame frame = new JFrame("BypassingAntiVirus");  
			  
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
	
	public static void ChaptersToCheckOut() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\CyberSecurity\\ChaptersToCheckOut.txt"));
			final JFrame frame = new JFrame("ChaptersToCheckOut");  
			  
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
	
	
	public static void CrackingWPAandWPAWPA2Encryption() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\CyberSecurity\\CrackingWPAandWPAWPA2Encryption.txt"));
			final JFrame frame = new JFrame("CrackingWPAandWPAWPA2Encryption");  
			  
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
	
	
	public static void InfoGatheringAndVulnerabilityTests() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\CyberSecurity\\InfoGatheringAndVulnerabilityTests.txt"));
			final JFrame frame = new JFrame("InfoGatheringAndVulnerabilityTests");  
			  
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
	
	
	public static void IntrotoPasswordCracking() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\CyberSecurity\\IntrotoPasswordCracking.txt"));
			final JFrame frame = new JFrame("IntrotoPasswordCracking");  
			  
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
	
	
	public static void Metaspoloit() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\CyberSecurity\\Metaspoloit.txt"));
			final JFrame frame = new JFrame("Metaspoloit");  
			  
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
	
	
	public static void WEPWPA() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\CyberSecurity\\WEPWPA.txt"));
			final JFrame frame = new JFrame("WEPWPA");  
			  
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
	
	
	public static void AndroidHacking() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\Kali-LinuxAttackMethods\\AndroidHacking.txt"));
			final JFrame frame = new JFrame("AndroidHacking");  
			  
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
	
	public static void BluetoothHacking() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\Kali-LinuxAttackMethods\\BluetoothHacking.txt"));
			final JFrame frame = new JFrame("BluetoothHacking");  
			  
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
	
	
	public static void CCTVHacking() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\Kali-LinuxAttackMethods\\CCTVHacking.txt"));
			final JFrame frame = new JFrame("CCTVHacking");  
			  
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
	
	
	public static void EvilTwinAttacks() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\Kali-LinuxAttackMethods\\EvilTwinAttacks.txt"));
			final JFrame frame = new JFrame("EvilTwinAttacks");  
			  
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
	
	
	public static void IOSHacking() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\Kali-LinuxAttackMethods\\IOSHacking.txt"));
			final JFrame frame = new JFrame("IOSHacking");  
			  
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
	
	
	public static void IPTracer() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\Kali-LinuxAttackMethods\\IPTracer.txt"));
			final JFrame frame = new JFrame("IPTracer");  
			  
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
	
	
	public static void MetasploitAttacks() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\Kali-LinuxAttackMethods\\MetasploitAttacks.txt"));
			final JFrame frame = new JFrame("MetasploitAttacks");  
			  
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
	
	
	public static void NetworkSniffAttack() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\Kali-LinuxAttackMethods\\NetworkSniffAttack.txt"));
			final JFrame frame = new JFrame("NetworkSniffAttack");  
			  
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
	
	
	public static void PhyicalPasswordAttacks() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\Kali-LinuxAttackMethods\\PhyicalPasswordAttacks.txt"));
			final JFrame frame = new JFrame("PhyicalPasswordAttacks");  
			  
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
	
	
	public static void WirelessAttacks() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\Kali-LinuxAttackMethods\\WirelessAttacks.txt"));
			final JFrame frame = new JFrame("WirelessAttacks");  
			  
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
