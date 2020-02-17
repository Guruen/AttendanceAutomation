/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceautomation.GUI.Controller;

import attendanceautomation.GUI.Model.AttendanceAutomationModel;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author BBran
 */
public class LoginController implements Initializable {
    
    private Label label;
    @FXML
    private TextField txtfieldUsername;
    @FXML
    private PasswordField passwordfieldPassword;
    @FXML
    private JFXButton btnLogIn;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void handleLogIn(ActionEvent event)
    {
        String username = txtfieldUsername.getText();
                       
        
        if (username == "Teacher")
        {
            
        }
        
        if (username == "Student")
        {
            
        }

        
        
    }
    
}
