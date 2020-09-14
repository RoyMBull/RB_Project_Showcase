package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent>
{
    //Define the contentes of the window here for global use
    Button bttn = new Button();

    public static void main(String args[])
    {
        //Launch the main application 
        launch(args);        
    }

    //Set the stage of the window
    @Override 
        
        public void start(Stage mainwin) throws Exception
        {
            //Define the MainWindow title
            mainwin.setTitle("RB GUI Main");

            //Set the layout and scene of the MainWindow
            VBox layout = new VBox(10);
            layout.setPadding(new Insets(100, 100, 100, 100));
            Scene scene = new Scene(layout, 400, 400); //Sets the dimensions of the window, width & Length
            scene.getStylesheets().add("RBGUIBackGround.css");
            
            //Add in the contents
            
            Label username = new Label("UserName");
            username.setStyle("-fx-text-fill: orange");
                        
            TextField nameInput = new TextField(); //Makes a text box where we can take input
            
            Label passwd = new Label("Password");
            passwd.setStyle("-fx-text-fill: orange");
            
            TextField passwdInput = new TextField();
            
            bttn.setText("Pen-Test-App-Login");
            bttn.setOnAction( e ->
                {
                    String uservalid = nameInput.getText();
                    String passfield = passwdInput.getText();
               
                    //Authenticate the user
                    if (uservalid.contentEquals("kali") && passfield.contentEquals("kali"))
                    {
                    	StandardVersion.win2();                    	
                    }
                    
                    else if (uservalid.contentEquals("kali") && passfield.contentEquals("kali2"))
                    {
                    	AdvancedVersion.win3();                    	
                    }
                    
                    else if (uservalid.contentEquals("kali") && passfield.contentEquals("kali3"))
                    {
                    	System.out.println("Currently Unavailable");                    	
                    }
                    
                }

            );
            
           /**
            * File Opener needs to be a button/interactable menu object that opens file directories 
            * Upon Selection, a window will be opened with a label containing the contentes of a read file
            * The label needs to be read the contents of the file        
            */
     
                     
            //Add the contents 
            layout.getChildren().addAll(username, nameInput, passwd, passwdInput, bttn);

            //Show the window
            mainwin.setScene(scene);
            mainwin.show();

        }
        
}
