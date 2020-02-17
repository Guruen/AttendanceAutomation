/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceautomation.GUI.Controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import java.net.URL;
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
    private JFXListView<?> listviewTodaysClasses;
    @FXML
    private Label lvlCurrentClass;
    @FXML
    private JFXButton btnAttendCurrentClass;
    @FXML
    private PieChart piechartAttendance;
    @FXML
    private JFXListView<?> listviewMissedClasses;

    private int absence = 20;
    @FXML
    private Label lblAbsencepercent;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       handlePieChart();
       lblAbsencepercent.setText(absence + "%");
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
}
