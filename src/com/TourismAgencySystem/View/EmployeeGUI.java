package com.TourismAgencySystem.View;

import com.TourismAgencySystem.Helper.Config;
import com.TourismAgencySystem.Helper.Helper;
import com.TourismAgencySystem.Model.Employee;

import javax.swing.*;

public class EmployeeGUI extends JFrame{
    private JPanel wrapper;
    private Employee employee;

    public EmployeeGUI(Employee employee) {
        this.employee = employee;
        add(wrapper);
        setSize(1000, 500);
        setLocation(Helper.screenCenterLocation("x", getSize()), Helper.screenCenterLocation("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
        //labelEmployeeWelcome.setText("Welcome " + employee.getName());

    }
}
