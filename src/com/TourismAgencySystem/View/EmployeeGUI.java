package com.TourismAgencySystem.View;

import com.TourismAgencySystem.Helper.Config;
import com.TourismAgencySystem.Helper.Helper;
import com.TourismAgencySystem.Model.Employee;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JLabel labelWelcome;
    private JTabbedPane tabbedPane3;
    private JTabbedPane tabbedPane4;
    private JTable table1;
    private JTable table2;
    private JButton buttonHotelDelete;
    private JButton buttonHotelSelect;
    private JTable tableHotelList;
    private JTextField fieldHotelName;
    private JTextField fieldHotelCity;
    private JTextField fieldHotelDistrict;
    private JTextField fieldHotelStar;
    private JTextField fieldHotelAddress;
    private JTextField fieldHotelMail;
    private JTextField fieldHotelPhone;
    private JCheckBox checkBoxParking;
    private JCheckBox wiFiCheckBox;
    private JCheckBox checkBoxPool;
    private JCheckBox checkBoxGym;
    private JCheckBox checkBoxSpa;
    private JCheckBox checkBoxRoomService;
    private JCheckBox checkBoxConcierge;
    private JScrollPane checkBoxWifi;
    private JRadioButton radioButtonSeason;
    private JRadioButton radioButtonOffSeason;
    private JTextField fieldSeasonEndDate;
    private JTextField fieldOffSeasonEndDate;
    private JTextField fieldSeasonStartDate;
    private JTextField fieldOffSeasonStartDate;
    private JButton buttonHotelUpdate;
    private JButton buttonHotelAdd;
    private JPanel roomPanelTop;
    private JPanel roomPanelBottom;
    private JComboBox comboBoxRoomType;
    private JButton buttonRoomTypeSelect;
    private JButton button1;
    private JButton button2;
    private Employee employee;

    public EmployeeGUI(Employee employee) {
        this.employee = employee;
        add(wrapper);
        setSize(1000, 700);
        setLocation(Helper.screenCenterLocation("x", getSize()), Helper.screenCenterLocation("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
        //labelEmployeeWelcome.setText("Welcome " + employee.getName());


        radioButtonSeason.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldSeasonStartDate.setEnabled(true);
                fieldSeasonStartDate.setEditable(true);
                fieldSeasonEndDate.setEnabled(true);
                fieldSeasonEndDate.setEditable(true);
                if (!radioButtonSeason.isSelected()) {
                    fieldSeasonStartDate.setEnabled(false);
                    fieldSeasonStartDate.setEditable(false);
                    fieldSeasonEndDate.setEnabled(false);
                    fieldSeasonEndDate.setEditable(false);
                    fieldSeasonEndDate.setText(null);
                    fieldSeasonStartDate.setText(null);
                }
            }
        });
        radioButtonOffSeason.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldOffSeasonStartDate.setEnabled(true);
                fieldOffSeasonStartDate.setEditable(true);
                fieldOffSeasonEndDate.setEnabled(true);
                fieldOffSeasonEndDate.setEditable(true);
                if (!radioButtonOffSeason.isSelected()) {
                    fieldOffSeasonStartDate.setEnabled(false);
                    fieldOffSeasonStartDate.setEditable(false);
                    fieldOffSeasonEndDate.setEnabled(false);
                    fieldOffSeasonEndDate.setEditable(false);
                    fieldOffSeasonEndDate.setText(null);
                    fieldOffSeasonStartDate.setText(null);
                }
            }
        });
    }
}
