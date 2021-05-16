package application;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;



public class EmployeeInfo_Panel_Controller implements Initializable {

    @FXML
    private TextField FirstName;

    @FXML
    private TextField LastName;

    @FXML
    private TextField Designation;

    @FXML
    private TextField Salary;

    @FXML
    private ComboBox<String> Gender;

    @FXML
    private DatePicker JoiningDate;

    @FXML
    private TextField Address;

    @FXML
    private TextField Phone;

    @FXML
    private TextField EmployeeID;

    @FXML
    private TextField NIDnumber;

    ObservableList<String> Genderlist = FXCollections.observableArrayList("Male","Female","Others");
    static ObservableList<EmployeeInfo> emplist = FXCollections.observableArrayList();
    
   
    
    @FXML
    void handleAddress(ActionEvent event) {

    }

    @FXML
    void handleDesignation(ActionEvent event) {

    }

    @FXML
    void handleEmployeeID(ActionEvent event) {

    }

    @FXML
    void handleFirstName(ActionEvent event) {

    }

    @FXML
    void handleGender(ActionEvent event) {

    }

    @FXML
    void handleJoiningDate(ActionEvent event) {

    }

    @FXML
    void handleLastName(ActionEvent event) {

    }

    @FXML
    void handleNIDnumber(ActionEvent event) {

    }

    @FXML
    void handlePhone(ActionEvent event) {

    }

    @FXML
    void handleSalary(ActionEvent event) {

    }
    
    @FXML
    void handleAddEmployeeButton(ActionEvent event) {
    try{
        int id = Integer.parseInt(EmployeeID.getText());
        String designation = this.Designation.getText();
        Date Joindate = Date.valueOf(JoiningDate.getValue());
        double salary = Double.parseDouble(Salary.getText());
        String firstName = FirstName.getText();
        String lastName = LastName.getText();
        int phone = Integer.parseInt(Phone.getText());
        String gender = Gender.getValue();
        String Nidnumber = NIDnumber.getText();
        String address = Address.getText();
        
        if(designation.equals("") || Joindate.equals("")  || firstName.equals("") || lastName.equals("") || gender.equals("") || NIDnumber.equals("") || address.equals("") )
        {
            JOptionPane.showMessageDialog(null, "Please fill up all field!");
            
        }else{
            
        //System.out.println(""+id+" "+designation+" "+Jdate+" "+salary);
        //Database Action 
        
        //Create Employee Object to get Insert Value For Employee Table
        	EmployeeInfo employee = new EmployeeInfo(id,designation, Joindate, salary, address,  Nidnumber,  firstName, lastName,  phone,  gender);
        //dbaction.InsertEmployee(employee);
        
        
        
        
        JOptionPane.showMessageDialog(null, "Congrats! Employee has been Added");
        //Clear All Field Text After Added
        EmployeeID.clear();
        Designation.clear();
        FirstName.clear();
        LastName.clear();
        Phone.clear();
        Gender.setValue("Male");
 
        NIDnumber.clear();
        Address.clear();
        Salary.clear();
        JoiningDate.setValue(null);
        }}
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"Wrong! Please Check All Information!");
        System.out.println(""+e);
    }
    
        
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		 Gender.setValue("Male");
		  Gender.setItems(Genderlist);
		
	}

}
