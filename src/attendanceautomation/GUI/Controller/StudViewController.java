/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceautomation.GUI.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author BBran
 */
public class StudViewController implements Initializable {

    @FXML
    private Label lblStudentFullname;
    @FXML
    private JFXListView<String> listviewTodaysClasses;
    @FXML
    private JFXButton btnAttendCurrentClass;
    @FXML
    private PieChart piechartAttendance;
    @FXML
    private JFXListView<String> listviewMissedClasses;

    private int absence = 20;
    @FXML
    private Label lblAbsencepercent;
    @FXML
    private Label lblCurrentClass;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       handlePieChart();
       handleCurrentclass();
       handleMissedClasses();
       lblAbsencepercent.setText(absence + "%");
       lblStudentFullname.setText("John Doe");
       lblCurrentClass.setText("SDE");
    }    
           
    
    public void handlePieChart()
    {
         ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Present", 100-absence),
                new PieChart.Data("Absent", absence)
        );
         
         piechartAttendance.setData(pieChartData);
         piechartAttendance.setClockwise(true);
         piechartAttendance.setLabelLineLength(10);
         piechartAttendance.setLegendVisible(false);
         piechartAttendance.setStartAngle(90);

    }
    
    public void handleCurrentclass()
    {
        ObservableList<String> currentClass = FXCollections.observableArrayList(
                "SDE - C3 (9:00-11:30)",
                "SCO - C3 (12:00-14:30)"
                
        );
        
        listviewTodaysClasses.setItems(currentClass);
        listviewTodaysClasses.setFocusTraversable(false);
        listviewTodaysClasses.setMouseTransparent(true);
    }
    
    public void handleMissedClasses()
    {
        ObservableList<String> missedClass = FXCollections.observableArrayList(
                "SDE | (Monday - 11.01.2020)",
                "SCO | (Friday - 15.01.2020)",
                "DBO | (Monday - 18.01.2020)"
                
        );
        
        listviewMissedClasses.setItems(missedClass);
        listviewMissedClasses.setFocusTraversable(false);
        listviewMissedClasses.setMouseTransparent(true);
        
    }
}
