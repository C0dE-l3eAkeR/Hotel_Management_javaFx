package application;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Base_Panel_Controller {

    @FXML
    private Button placeOrder;

    @FXML
    private Button addEmployee;

    @FXML
    private Button employeeList;

    @FXML
    private Button addFoodItem;

    @FXML
    private Button foodItemList;

    @FXML
    private Button logOut;
    @FXML
    private BorderPane BasePanel;
    @FXML
    void handleAddEmployeeButton(ActionEvent event) throws IOException {
    
    	 Parent root = FXMLLoader.load(getClass().getResource("EmployeeInfo_Panel.fxml"));
         BasePanel.setCenter(root);
         
    }

    @FXML
    void handleAddFoodItemButton(ActionEvent event) throws IOException {
    	 Parent root = FXMLLoader.load(getClass().getResource("AddFoodItem_Panel.fxml"));
         BasePanel.setCenter(root);
    }

    @FXML
    void handleEmployeeListButton(ActionEvent event) throws IOException {
    	 Parent root = FXMLLoader.load(getClass().getResource("EmployeeList_Panel.fxml"));
        BasePanel.setCenter(root);
    }

    @FXML
    void handleFoodItemListButton(ActionEvent event) throws IOException {
    	 Parent root = FXMLLoader.load(getClass().getResource("FoodItemList_Panel.fxml"));
         BasePanel.setCenter(root);
    }

    @FXML
    void handleLogOutButton(ActionEvent event) throws IOException {
    	
     Parent root = FXMLLoader.load(getClass().getResource("Login_Panel.fxml"));
     JOptionPane.showMessageDialog(null, "Log Out Successful!","Log Out", 1);
      BasePanel.setCenter(root);
    }

    @FXML
    void handlePlaceOrederButton(ActionEvent event) throws IOException {
    	 Parent root = FXMLLoader.load(getClass().getResource("Place_Order_Panel.fxml"));
         BasePanel.setCenter(root);
    }

}