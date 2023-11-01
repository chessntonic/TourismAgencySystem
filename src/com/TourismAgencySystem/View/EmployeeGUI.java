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
    private JComboBox comboBoxRoomType;
    private JButton buttonRoomTypeSelect;
    private JButton buttonRoomTypeUpdate;
    private JButton buttonRoomTypeAdd;
    private JTextField fieldRoomTypeName;
    private JTextField fieldRoomStock;
    private JTextField fieldRoomBedCount;
    private JTextField fieldRoomSize;
    private JTextField fieldRoomTv;
    private JTextField fieldRoomMinibar;
    private JComboBox comboBoxPeriodSingle;
    private JComboBox comboBoxPeriodDouble;
    private JComboBox comboBoxPeriodKingSuite;
    private JComboBox comboBoxGuestTypeSingle;
    private JComboBox comboBoxGuestTypeDouble;
    private JComboBox comboBoxGuestTypeKingSuite;
    private JComboBox comboBoxHostelTypeSingle;
    private JComboBox comboBoxHostelTypeDouble;
    private JComboBox comboBoxHostelTypeKingSuite;
    private JTextField fieldPriceSingle;
    private JTextField fieldPriceDouble;
    private JTextField fieldPriceKingSuite;
    private JButton buttonAddSingle;
    private JButton buttonAddDouble;
    private JButton buttonAddKingSuite;
    private JRadioButton radioButtonSingle;
    private JRadioButton radioButtonDouble;
    private JRadioButton radioButtonKingSuite;
    private JButton buttonDeletePrice;
    private JTable tableRoomPriceList;
    private JTable tableSearchList;
    private JButton buttonSearchSelect;
    private JButton buttonSearchSearch;
    private JTextField fieldSearchHotelCityDistrict;
    private JTextField fieldSearchStar;
    private JTextField fieldSearchCheckin;
    private JTextField fieldSearchCheckout;
    private JTextField fieldSearchAdult;
    private JTextField fieldSearchChild;
    private JTextField fieldHotelHotelCityDistrictSearch;
    private JTextField fieldHotelStarSearch;
    private JButton buttonHotelSearch;
    private JTextField fieldResDetailCity;
    private JTextField fieldResDetailDistrict;
    private JTextField fieldResDetailAddress;
    private JTextField fieldResDetailPhone;
    private JTextField fieldResDetailStar;
    private JCheckBox freeParkingCheckBox;
    private JCheckBox wiFiCheckBox1;
    private JCheckBox swimmingPoolCheckBox;
    private JCheckBox fitnessCenterCheckBox;
    private JCheckBox conciergeCheckBox;
    private JCheckBox spaCheckBox;
    private JCheckBox a724RoomServicesCheckBox;
    private JTextField fieldResBed;
    private JTextField fieldResRoomSize;
    private JTextField fieldResTv;
    private JTextField fieldResMinibar;
    private JLabel labelRoomType;
    private JTextField fieldResCheckin;
    private JTextField fieldResCheckout;
    private JLabel labelResAdult;
    private JLabel labelResChild;
    private JPanel field;
    private JLabel labelResDuration;
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
        radioButtonSingle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBoxPeriodSingle.setEnabled(true);
                comboBoxGuestTypeSingle.setEnabled(true);
                comboBoxHostelTypeSingle.setEnabled(true);
                fieldPriceSingle.setEnabled(true);
                fieldPriceSingle.setEditable(true);
                buttonAddSingle.setEnabled(true);
                if (!radioButtonSingle.isSelected()) {
                    comboBoxPeriodSingle.setEnabled(false);
                    comboBoxPeriodSingle.setEditable(false);
                    comboBoxGuestTypeSingle.setEnabled(false);
                    comboBoxGuestTypeSingle.setEditable(false);
                    comboBoxHostelTypeSingle.setEnabled(false);
                    comboBoxHostelTypeSingle.setEditable(false);
                    fieldPriceSingle.setEnabled(false);
                    fieldPriceSingle.setEditable(false);
                    fieldPriceSingle.setText(null);
                    buttonAddSingle.setEnabled(false);
                }
            }
        });
        radioButtonDouble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBoxPeriodDouble.setEnabled(true);
                comboBoxGuestTypeDouble.setEnabled(true);
                comboBoxHostelTypeDouble.setEnabled(true);
                fieldPriceDouble.setEnabled(true);
                fieldPriceDouble.setEditable(true);
                buttonAddDouble.setEnabled(true);
                if (!radioButtonDouble.isSelected()) {
                    comboBoxPeriodDouble.setEnabled(false);
                    comboBoxPeriodDouble.setEditable(false);
                    comboBoxGuestTypeDouble.setEnabled(false);
                    comboBoxGuestTypeDouble.setEditable(false);
                    comboBoxHostelTypeDouble.setEnabled(false);
                    comboBoxHostelTypeDouble.setEditable(false);
                    fieldPriceDouble.setEnabled(false);
                    fieldPriceDouble.setEditable(false);
                    fieldPriceDouble.setText(null);
                    buttonAddDouble.setEnabled(false);
                }
            }
        });
        radioButtonKingSuite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBoxPeriodKingSuite.setEnabled(true);
                comboBoxGuestTypeKingSuite.setEnabled(true);
                comboBoxHostelTypeKingSuite.setEnabled(true);
                fieldPriceKingSuite.setEnabled(true);
                fieldPriceKingSuite.setEditable(true);
                buttonAddKingSuite.setEnabled(true);
                if (!radioButtonKingSuite.isSelected()) {
                    comboBoxPeriodKingSuite.setEnabled(false);
                    comboBoxPeriodKingSuite.setEditable(false);
                    comboBoxGuestTypeKingSuite.setEnabled(false);
                    comboBoxGuestTypeKingSuite.setEditable(false);
                    comboBoxHostelTypeKingSuite.setEnabled(false);
                    comboBoxHostelTypeKingSuite.setEditable(false);
                    fieldPriceKingSuite.setEnabled(false);
                    fieldPriceKingSuite.setEditable(false);
                    fieldPriceKingSuite.setText(null);
                    buttonAddKingSuite.setEnabled(false);
                }
            }
        });
    }
}
