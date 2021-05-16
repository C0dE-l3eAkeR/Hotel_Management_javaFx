package application;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class Login_Panel_Controller {

    @FXML
    private TextField userNameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button enter;
    
    
    Stage stage = new Stage();
    static ObservableList<AppUser> login = FXCollections.observableArrayList();

    @FXML
    void handleEnterButton(ActionEvent event) throws IOException {
    	
    	 String username = userNameField.getText();
         String password = passwordField.getText();
        System.out.println(username);
        
         //login = (ObservableList<application.AppUser>) new AppUser(007,"user","pass");
         
         int i=0;
       //  for(AppUser app : login)
       //  {
            // String usern = app.UserName;
             //String pass = app.Password;
             
             if(username.equalsIgnoreCase("user") && password.equalsIgnoreCase("pass"))
             {
                 Parent root = FXMLLoader.load(getClass().getResource("Base_Panel.fxml"));
                 Scene scene = new Scene(root);
               
                 stage.setTitle("Admin Panel");
                 stage.setScene(scene);              
                 
                Main.stage.close();
                 stage.show();
                 i = 1;
                
                 //JOptionPane.showMessageDialog(null, "Welcome to Admin Panel","Welcome",1);
                 
             }else{
                 i =0;
             }
            // i =0;                        
       //  }
         //Provide Information to better user interface.
         if(i==1){
             JOptionPane.showMessageDialog(null, "Welcome to Admin Panel","Welcome",1);
         }else{
             JOptionPane.showMessageDialog(null, "Your id or password Wrong!","Wrong Information",0);
         }

    }

    @FXML
    void handlepasswordField(ActionEvent event) {

    }

    @FXML
    void handleuserNameField(ActionEvent event) {

    }

}