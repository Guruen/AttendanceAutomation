/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceautomation.GUI.Controller;

import com.jfoenix.controls.JFXListView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author BBran
 */
public class TeachViewController implements Initializable
{

    @FXML
    private Label lblSelectedclass;
    @FXML
    private JFXListView<String> listviewStudents;
    @FXML
    private ImageView imgStudent;
    @FXML
    private Label lblStudentname;
    @FXML
    private Label lblEmail;
    @FXML
    private Label lblPhone;
    @FXML
    private JFXListView<String> listviewAbsenceDays;
    @FXML
    private BarChart<?, ?> chartAbsenceperDay;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        lblStudentname.setText("John Doe");
        lblEmail.setText("JohnDoe@easv.dk");
        lblPhone.setText("88 88 88 88");
        lblSelectedclass.setText("SDE");
        handleStudentList();
        handleStudentAbsence();
        handleBarChart();
    }

    public void handleStudentList()
    {
        ObservableList<String> currentClass = FXCollections.observableArrayList(
                "John Doe",
                "Bill Gates"
        );

        listviewStudents.setItems(currentClass);
    }

    public void handleStudentAbsence()
    {
        ObservableList<String> currentClass = FXCollections.observableArrayList(
                "16-02-2020",
                "17-02-2020",
                "18-02-2020"
        );

        listviewAbsenceDays.setItems(currentClass);
    }
    
    public void handleBarChart()
    {
        XYChart.Series dataSeries1 = new XYChart.Series();

        dataSeries1.getData().add(new XYChart.Data("Monday", 10));
        dataSeries1.getData().add(new XYChart.Data("Toesday", 0));
        dataSeries1.getData().add(new XYChart.Data("Wednesday", 50));
        dataSeries1.getData().add(new XYChart.Data("Thursday", 20));
        dataSeries1.getData().add(new XYChart.Data("Friday", 40));
        
        chartAbsenceperDay.getData().add(dataSeries1);
    }
    

}
