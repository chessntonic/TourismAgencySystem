package com.TourismAgencySystem.View;

import com.TourismAgencySystem.Helper.Config;
import com.TourismAgencySystem.Helper.Helper;
import com.TourismAgencySystem.Model.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

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
    private JButton buttonRoomTypeNew;
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
    private JTextField fieldAdultPriceSingle;
    private JTextField fieldAdultPriceDouble;
    private JTextField fieldAdultPriceKingSuite;
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
    private JScrollPane scrollPaneHotelDetails;
    private JLabel labelRoomHotelName;
    private JButton buttonHotelClear;
    private JTextField fieldChildPriceSingle;
    private JTextField fieldChildPriceDouble;
    private JTextField fieldChildPriceKingSuite;
    private DefaultTableModel modelHotelHotelList;
    private Object[] rowHotelHotelList;
    private Employee employee;

    public EmployeeGUI(Employee employee) {
        this.employee = employee;
        add(wrapper);
        setSize(1000, 800);
        setLocation(Helper.screenCenterLocation("x", getSize()), Helper.screenCenterLocation("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
        labelWelcome.setText("Welcome " + employee.getName());


        modelHotelHotelList = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2 || column == 3 || column == 4 || column == 5 || column == 6) {
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
                fieldAdultPriceSingle.setEnabled(true);
                fieldAdultPriceSingle.setEditable(true);
                buttonAddSingle.setEnabled(true);
                if (!radioButtonSingle.isSelected()) {
                    comboBoxPeriodSingle.setEnabled(false);
                    comboBoxGuestTypeSingle.setEnabled(false);
                    comboBoxHostelTypeSingle.setEnabled(false);
                    fieldAdultPriceSingle.setEnabled(false);
                    fieldAdultPriceSingle.setEditable(false);
                    fieldAdultPriceSingle.setText(null);
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
                fieldAdultPriceDouble.setEnabled(true);
                fieldAdultPriceDouble.setEditable(true);
                buttonAddDouble.setEnabled(true);
                if (!radioButtonDouble.isSelected()) {
                    comboBoxPeriodDouble.setEnabled(false);
                    comboBoxGuestTypeDouble.setEnabled(false);
                    comboBoxHostelTypeDouble.setEnabled(false);
                    fieldAdultPriceDouble.setEnabled(false);
                    fieldAdultPriceDouble.setEditable(false);
                    fieldAdultPriceDouble.setText(null);
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
                fieldAdultPriceKingSuite.setEnabled(true);
                fieldAdultPriceKingSuite.setEditable(true);
                buttonAddKingSuite.setEnabled(true);
                if (!radioButtonKingSuite.isSelected()) {
                    comboBoxPeriodKingSuite.setEnabled(false);
                    comboBoxGuestTypeKingSuite.setEnabled(false);
                    comboBoxHostelTypeKingSuite.setEnabled(false);
                    fieldAdultPriceKingSuite.setEnabled(false);
                    fieldAdultPriceKingSuite.setEditable(false);
                    fieldAdultPriceKingSuite.setText(null);
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
                    Date seasonStart = Helper.stringToDate(fieldSeasonStartDate.getText());
                    Date seasonEnd = Helper.stringToDate(fieldSeasonEndDate.getText());
                    Date offSeasonStart = Helper.stringToDate(fieldOffSeasonStartDate.getText());
                    Date offSeasonEnd = Helper.stringToDate(fieldOffSeasonEndDate.getText());

                    if (EmployeeOp.addHotelDetails(name, city, district, star, address, mail, phone, parking, wifi, pool, gym, concierge, spa, roomService)
                            && EmployeeOp.addHotelPeriodDetails(seasonStart, seasonEnd, offSeasonStart, offSeasonEnd)) {
                        Helper.showMessage("done");
                        loadHotelModel();

                        Helper.resetFormFields(fieldHotelName, fieldHotelCity, fieldHotelAddress, fieldHotelDistrict, fieldHotelMail, fieldHotelPhone, fieldHotelStar);
                        Helper.resetCheckBoxes(checkBoxPool, checkBoxWifi, checkBoxParking, checkBoxGym, checkBoxConcierge, checkBoxSpa, checkBoxRoomService);
                        Helper.resetDateFields(fieldSeasonStartDate, fieldSeasonEndDate, fieldOffSeasonStartDate, fieldOffSeasonEndDate);
                        Helper.resetRadioButtons(radioButtonSeason, radioButtonOffSeason);
                    }
                    scrollPaneHotelDetails.getVerticalScrollBar().setValue(0);
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
                    Date seasonStart = Helper.stringToDate(fieldSeasonStartDate.getText());
                    Date seasonEnd = Helper.stringToDate(fieldSeasonEndDate.getText());
                    Date offSeasonStart = Helper.stringToDate(fieldOffSeasonStartDate.getText());
                    Date offSeasonEnd = Helper.stringToDate(fieldOffSeasonEndDate.getText());

                    if (EmployeeOp.updateHotelDetails(id, name, city, district, star, address, mail, phone, parking, wifi, pool, gym, concierge, spa, roomService) &&
                            EmployeeOp.updateHotelPeriodDetails(id, seasonStart, seasonEnd, offSeasonStart, offSeasonEnd)) {
                        Helper.showMessage("done");
                        loadHotelModel();

                        Helper.resetFormFields(fieldHotelName, fieldHotelCity, fieldHotelAddress, fieldHotelDistrict, fieldHotelMail, fieldHotelPhone, fieldHotelStar);
                        Helper.resetCheckBoxes(checkBoxPool, checkBoxWifi, checkBoxParking, checkBoxGym, checkBoxConcierge, checkBoxSpa, checkBoxRoomService);
                        Helper.resetDateFields(fieldSeasonStartDate, fieldSeasonEndDate, fieldOffSeasonStartDate, fieldOffSeasonEndDate);
                        Helper.resetRadioButtons(radioButtonSeason, radioButtonOffSeason);
                    }
                    scrollPaneHotelDetails.getVerticalScrollBar().setValue(0);
                }
            }
        });
        buttonHotelSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadHotelDetailsModel();
                scrollPaneHotelDetails.getVerticalScrollBar().setValue(0);
                labelRoomHotelName.setText(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 1).toString());
            }
        });
        buttonHotelDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (Helper.confirm("sure")) {
                    int id = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());
                    if (EmployeeOp.deleteHotelDetails(id) && EmployeeOp.deleteHotelPeriodDetails(id)) {
                        Helper.showMessage("done");
                        loadHotelModel();
                        Helper.resetFormFields(fieldHotelName, fieldHotelCity, fieldHotelAddress, fieldHotelDistrict, fieldHotelMail, fieldHotelPhone, fieldHotelStar);
                        Helper.resetCheckBoxes(checkBoxPool, checkBoxWifi, checkBoxParking, checkBoxGym, checkBoxConcierge, checkBoxSpa, checkBoxRoomService);
                        Helper.resetDateFields(fieldSeasonStartDate, fieldSeasonEndDate, fieldOffSeasonStartDate, fieldOffSeasonEndDate);
                        Helper.resetRadioButtons(radioButtonSeason, radioButtonOffSeason);
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
        });
        buttonHotelSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = fieldHotelHotelCityDistrictSearch.getText();
                String star = fieldHotelStarSearch.getText();

                String query = EmployeeOp.searchHotelQuery(a, star);
                ArrayList<Hotel> searchHotel = EmployeeOp.searchHotelList(query);
                loadHotelModel(searchHotel);
            }
        });
        buttonRoomTypeNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Helper.resetFormFields(fieldRoomTypeName, fieldRoomBedCount, fieldRoomSize, fieldRoomTv, fieldRoomMinibar, fieldRoomStock);
                fieldRoomTypeName.setText(comboBoxRoomType.getSelectedItem().toString());
            }
        });
        comboBoxRoomType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadRoomDetailsModel();
            }
        });
        buttonHotelClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Helper.resetFormFields(fieldHotelName, fieldHotelCity, fieldHotelAddress, fieldHotelDistrict, fieldHotelMail, fieldHotelPhone, fieldHotelStar);
                Helper.resetCheckBoxes(checkBoxPool, checkBoxWifi, checkBoxParking, checkBoxGym, checkBoxConcierge, checkBoxSpa, checkBoxRoomService);
                Helper.resetDateFields(fieldSeasonStartDate, fieldSeasonEndDate, fieldOffSeasonStartDate, fieldOffSeasonEndDate);
                Helper.resetRadioButtons(radioButtonSeason, radioButtonOffSeason);
            }
        });
        buttonRoomTypeAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Helper.isFieldEmpty(fieldRoomStock) || Helper.isFieldEmpty(fieldRoomBedCount) || Helper.isFieldEmpty(fieldRoomSize) || Helper.isFieldEmpty(fieldRoomTv)
                        || Helper.isFieldEmpty(fieldRoomMinibar))) {
                    Helper.showMessage("fill");
                } else {
                    int hotel_id = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());
                    int room_type_id = EmployeeOp.getFetch(comboBoxRoomType.getSelectedItem().toString()).getId();
                    int stock = Integer.parseInt(fieldRoomStock.getText());
                    int bed = Integer.parseInt(fieldRoomBedCount.getText());
                    int size = Integer.parseInt(fieldRoomSize.getText());
                    int tv = Integer.parseInt(fieldRoomTv.getText());
                    int minibar = Integer.parseInt(fieldRoomMinibar.getText());

                    if (EmployeeOp.addRoomDetails(hotel_id, room_type_id, stock, bed, size, tv, minibar)) {
                        Helper.showMessage("done");

                    }
                    scrollPaneHotelDetails.getVerticalScrollBar().setValue(0);
                    ;
                }
            }
        });
        buttonRoomTypeUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Helper.isFieldEmpty(fieldRoomStock) || Helper.isFieldEmpty(fieldRoomBedCount) || Helper.isFieldEmpty(fieldRoomSize) || Helper.isFieldEmpty(fieldRoomTv)
                        || Helper.isFieldEmpty(fieldRoomMinibar))) {
                    Helper.showMessage("fill");
                } else {
                    int hotel_id = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());
                    int room_type_id = EmployeeOp.getFetch(comboBoxRoomType.getSelectedItem().toString()).getId();
                    int stock = Integer.parseInt(fieldRoomStock.getText());
                    int bed = Integer.parseInt(fieldRoomBedCount.getText());
                    int size = Integer.parseInt(fieldRoomSize.getText());
                    int tv = Integer.parseInt(fieldRoomTv.getText());
                    int minibar = Integer.parseInt(fieldRoomMinibar.getText());

                    if (EmployeeOp.updateRoomDetails(hotel_id, room_type_id, stock, bed, size, tv, minibar)) {
                        Helper.showMessage("done");

                    }
                    scrollPaneHotelDetails.getVerticalScrollBar().setValue(0);
                    ;
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

    public void loadHotelModel(ArrayList<Hotel> list) {
        DefaultTableModel clearModel = (DefaultTableModel) tableHotelHotelList.getModel();
        clearModel.setRowCount(0);
        for (Hotel obj : list) {
            int i = 0;
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

    private void loadHotelDetailsModel() {
        int hotelId = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());

        for (Hotel obj : EmployeeOp.getHotelDetailsByHotelId(hotelId)) {
            fieldHotelName.setText(obj.getName());
            fieldHotelCity.setText(obj.getCity());
            fieldHotelDistrict.setText(obj.getDistrict());
            fieldHotelStar.setText(obj.getStar());
            fieldHotelAddress.setText(obj.getAddress());
            fieldHotelMail.setText(obj.getEmail());
            fieldHotelPhone.setText(obj.getPhoneNumber());
            checkBoxParking.setSelected(false);
            checkBoxWifi.setSelected(false);
            checkBoxPool.setSelected(false);
            checkBoxGym.setSelected(false);
            checkBoxConcierge.setSelected(false);
            checkBoxSpa.setSelected(false);
            checkBoxRoomService.setSelected(false);


            if (obj.getParking().equals("Yes")) {
                checkBoxParking.setSelected(true);
            }

            if (obj.getWifi().equals("Yes")) {
                checkBoxWifi.setSelected(true);
            }
            if (obj.getPool().equals("Yes")) {
                checkBoxPool.setSelected(true);
            }
            if (obj.getGym().equals("Yes")) {
                checkBoxGym.setSelected(true);
            }
            if (obj.getConcierge().equals("Yes")) {
                checkBoxConcierge.setSelected(true);
            }
            if (obj.getSpa().equals("Yes")) {
                checkBoxSpa.setSelected(true);
            }
            if (obj.getRoomService().equals("Yes")) {
                checkBoxRoomService.setSelected(true);
            }
        }
        for (HotelPeriod obj : EmployeeOp.getHotelPeriodByHotelId(hotelId)) {
            if (obj.getSeasonStart() != null) {
                radioButtonSeason.setSelected(true);
                fieldSeasonStartDate.setText(obj.getSeasonStart().toString());
                fieldSeasonEndDate.setText(obj.getSeasonEnd().toString());
            }
            if (obj.getOffSeasonStart() != null) {
                radioButtonOffSeason.setSelected(true);
                fieldOffSeasonStartDate.setText(obj.getOffSeasonStart().toString());
                fieldOffSeasonEndDate.setText(obj.getOffSeasonEnd().toString());
            }
        }
        Helper.enableDateFields(fieldSeasonStartDate, fieldSeasonEndDate, fieldOffSeasonStartDate, fieldOffSeasonEndDate);
    }

    private void loadRoomDetailsModel() {
        int hotelId = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());
        int roomTypeId = 0;
        String roomTypeName = comboBoxRoomType.getSelectedItem().toString();

        switch (roomTypeName) {
            case "Single":
                roomTypeId = 1;
                break;
            case "Double":
                roomTypeId = 2;
                break;
            case "King Suite":
                roomTypeId = 3;
                break;
            default: {
                Helper.showMessage("error");
                ;
            }
        }
        for (Room obj : EmployeeOp.getRoomDetailsByHotelId(hotelId, roomTypeId)) {
            fieldRoomTypeName.setText(roomTypeName);
            fieldRoomBedCount.setText(String.valueOf(obj.getBed()));
            fieldRoomSize.setText(String.valueOf(obj.getRoomSize()));
            fieldRoomTv.setText(String.valueOf(obj.getTv()));
            fieldRoomMinibar.setText(String.valueOf(obj.getMinibar()));
            fieldRoomStock.setText(String.valueOf(obj.getStock()));
        }
    }
}
