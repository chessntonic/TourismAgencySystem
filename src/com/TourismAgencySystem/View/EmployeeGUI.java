package com.TourismAgencySystem.View;

import com.TourismAgencySystem.Helper.Config;
import com.TourismAgencySystem.Helper.Helper;
import com.TourismAgencySystem.Model.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JLabel labelWelcome;
    private JTabbedPane tabbedPane3;
    private JTabbedPane tabbedPane4;
    private JTable tableLogGuestGuestList;
    private JTable tableLogResReservationList;
    private JButton buttonHotelDelete;
    private JButton buttonHotelSelect;
    private JTable tableHotelHotelList;
    private JTextField fieldHotelName;
    private JTextField fieldHotelCity;
    private JTextField fieldHotelDistrict;
    private JTextField fieldHotelStar;
    private JTextField fieldHotelAddress;
    private JTextField fieldHotelMail;
    private JTextField fieldHotelPhone;
    private JCheckBox checkBoxParking;
    private JCheckBox checkBoxWifi;
    private JCheckBox checkBoxPool;
    private JCheckBox checkBoxGym;
    private JCheckBox checkBoxSpa;
    private JCheckBox checkBoxRoomService;
    private JCheckBox checkBoxConcierge;
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
    private JTable tablePriceRoomList;
    private JTable tableSearchHotelList;
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
    private JLabel labelResRoomType;
    private JTextField fieldResCheckin;
    private JTextField fieldResCheckout;
    private JLabel labelResAdult;
    private JLabel labelResChild;
    private JPanel field;
    private JLabel labelResDuration;
    private JComboBox comboBoxResHostelType;
    private JButton buttonResRoomTypeSelect;
    private JTextField fieldResPrice;
    private JButton buttonResReserve;
    private JLabel labelGuestRoomType;
    private JLabel labelGuestBed;
    private JLabel labelGuestRoomSize;
    private JLabel labelGuestTv;
    private JLabel labelGuestMinibar;
    private JTextField fieldLogResHotelNameSearch;
    private JButton buttonLogResSearch;
    private JTextField fieldLogResCheckinSearch;
    private JTextField fieldLogResCheckoutSearch;
    private JTextField fieldLogResMinPriceSearch;
    private JTextField fieldLogResMaxPriceSearch;
    private JTextField fieldLogGuestResId;
    private JTextField fieldLogGuestFullname;
    private JTextField fieldLogGuestIdNumber;
    private JButton buttonLogGuestSearch;
    private DefaultTableModel modelHotelHotelList;
    private Object[] rowHotelHotelList;
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

        modelHotelHotelList = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        Object[] colHotelHotelList = {"ID", "Name", "City", "District", "Star", "E-Mail", "Phone"};
        modelHotelHotelList.setColumnIdentifiers(colHotelHotelList);
        rowHotelHotelList = new Object[colHotelHotelList.length];

        loadHotelModel();

        tableHotelHotelList.setModel(modelHotelHotelList);
        tableHotelHotelList.getTableHeader().setReorderingAllowed(false);
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
        buttonHotelAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Helper.isFieldEmpty(fieldHotelName) || Helper.isFieldEmpty(fieldHotelCity) || Helper.isFieldEmpty(fieldHotelAddress) || Helper.isFieldEmpty(fieldHotelDistrict)
                        || Helper.isFieldEmpty(fieldHotelMail) || Helper.isFieldEmpty(fieldHotelPhone) || Helper.isFieldEmpty(fieldHotelStar)) || ((!radioButtonSeason.isSelected()) && (!radioButtonOffSeason.isSelected()))) {
                    Helper.showMessage("fill");
                } else {
                    String name = fieldHotelName.getText();
                    String city = fieldHotelCity.getText();
                    String address = fieldHotelAddress.getText();
                    String district = fieldHotelDistrict.getText();
                    String mail = fieldHotelMail.getText();
                    String phone = fieldHotelPhone.getText();
                    String star = fieldHotelStar.getText();

                    String pool = "No";
                    String wifi = "No";
                    String parking = "No";
                    String gym = "No";
                    String concierge = "No";
                    String spa = "No";
                    String roomService = "No";

                    if (checkBoxPool.isSelected()) {
                        pool = "Yes";
                    }
                    if (checkBoxWifi.isSelected()) {
                        wifi = "Yes";
                    }
                    if (checkBoxParking.isSelected()) {
                        parking = "Yes";
                    }
                    if (checkBoxGym.isSelected()) {
                        gym = "Yes";
                    }
                    if (checkBoxConcierge.isSelected()) {
                        concierge = "Yes";
                    }
                    if (checkBoxSpa.isSelected()) {
                        spa = "Yes";
                    }
                    if (checkBoxRoomService.isSelected()) {
                        roomService = "Yes";
                    }

                    if (EmployeeOp.add(name, city, district, star, address, mail, phone, parking, wifi, pool, gym, concierge, spa, roomService)) {
                        Helper.showMessage("done");
                        loadHotelModel();

                        fieldHotelName.setText(null);
                        fieldHotelCity.setText(null);
                        fieldHotelAddress.setText(null);
                        fieldHotelDistrict.setText(null);
                        fieldHotelMail.setText(null);
                        fieldHotelPhone.setText(null);
                        fieldHotelStar.setText(null);
                        radioButtonSeason.setSelected(false);
                        radioButtonOffSeason.setSelected(false);
                        checkBoxPool.setSelected(false);
                        checkBoxWifi.setSelected(false);
                        checkBoxParking.setSelected(false);
                        checkBoxGym.setSelected(false);
                        checkBoxConcierge.setSelected(false);
                        checkBoxSpa.setSelected(false);
                        checkBoxRoomService.setSelected(false);
                        fieldSeasonStartDate.setText(null);
                        fieldSeasonEndDate.setText(null);
                        fieldOffSeasonStartDate.setText(null);
                        fieldOffSeasonEndDate.setText(null);
                        fieldSeasonStartDate.setEnabled(false);
                        fieldSeasonStartDate.setEditable(false);
                        fieldSeasonEndDate.setEnabled(false);
                        fieldSeasonEndDate.setEditable(false);
                        fieldOffSeasonStartDate.setEnabled(false);
                        fieldOffSeasonStartDate.setEditable(false);
                        fieldOffSeasonEndDate.setEnabled(false);
                        fieldOffSeasonEndDate.setEditable(false);
                    }
                }
            }
        });
        buttonHotelUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Helper.isFieldEmpty(fieldHotelName) || Helper.isFieldEmpty(fieldHotelCity) || Helper.isFieldEmpty(fieldHotelAddress) || Helper.isFieldEmpty(fieldHotelDistrict)
                        || Helper.isFieldEmpty(fieldHotelMail) || Helper.isFieldEmpty(fieldHotelPhone) || Helper.isFieldEmpty(fieldHotelStar)) || ((!radioButtonSeason.isSelected()) && (!radioButtonOffSeason.isSelected()))) {
                    Helper.showMessage("fill");
                } else {
                    int id = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());
                    String name = fieldHotelName.getText();
                    String city = fieldHotelCity.getText();
                    String address = fieldHotelAddress.getText();
                    String district = fieldHotelDistrict.getText();
                    String mail = fieldHotelMail.getText();
                    String phone = fieldHotelPhone.getText();
                    String star = fieldHotelStar.getText();

                    String pool = "No";
                    String wifi = "No";
                    String parking = "No";
                    String gym = "No";
                    String concierge = "No";
                    String spa = "No";
                    String roomService = "No";

                    if (checkBoxPool.isSelected()) {
                        pool = "Yes";
                    }
                    if (checkBoxWifi.isSelected()) {
                        wifi = "Yes";
                    }
                    if (checkBoxParking.isSelected()) {
                        parking = "Yes";
                    }
                    if (checkBoxGym.isSelected()) {
                        gym = "Yes";
                    }
                    if (checkBoxConcierge.isSelected()) {
                        concierge = "Yes";
                    }
                    if (checkBoxSpa.isSelected()) {
                        spa = "Yes";
                    }
                    if (checkBoxRoomService.isSelected()) {
                        roomService = "Yes";
                    }

                    if (EmployeeOp.update(id, name, city, district, star, address, mail, phone, parking, wifi, pool, gym, concierge, spa, roomService)) {
                        Helper.showMessage("done");
                        loadHotelModel();

                        fieldHotelName.setText(null);
                        fieldHotelCity.setText(null);
                        fieldHotelAddress.setText(null);
                        fieldHotelDistrict.setText(null);
                        fieldHotelMail.setText(null);
                        fieldHotelPhone.setText(null);
                        fieldHotelStar.setText(null);
                        radioButtonSeason.setSelected(false);
                        radioButtonOffSeason.setSelected(false);
                        checkBoxPool.setSelected(false);
                        checkBoxWifi.setSelected(false);
                        checkBoxParking.setSelected(false);
                        checkBoxGym.setSelected(false);
                        checkBoxConcierge.setSelected(false);
                        checkBoxSpa.setSelected(false);
                        checkBoxRoomService.setSelected(false);
                        fieldSeasonStartDate.setText(null);
                        fieldSeasonEndDate.setText(null);
                        fieldOffSeasonStartDate.setText(null);
                        fieldOffSeasonEndDate.setText(null);
                        fieldSeasonStartDate.setEnabled(false);
                        fieldSeasonStartDate.setEditable(false);
                        fieldSeasonEndDate.setEnabled(false);
                        fieldSeasonEndDate.setEditable(false);
                        fieldOffSeasonStartDate.setEnabled(false);
                        fieldOffSeasonStartDate.setEditable(false);
                        fieldOffSeasonEndDate.setEnabled(false);
                        fieldOffSeasonEndDate.setEditable(false);
                    }
                }
            }
        });
    }


    public void loadHotelModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tableHotelHotelList.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Hotel obj : EmployeeOp.getList()) {
            i = 0;
            rowHotelHotelList[i++] = obj.getId();
            rowHotelHotelList[i++] = obj.getName();
            rowHotelHotelList[i++] = obj.getCity();
            rowHotelHotelList[i++] = obj.getDistrict();
            rowHotelHotelList[i++] = obj.getStar();
            rowHotelHotelList[i++] = obj.getEmail();
            rowHotelHotelList[i++] = obj.getPhoneNumber();
            modelHotelHotelList.addRow(rowHotelHotelList);
        }
    }
}
