package com.TourismAgencySystem.View;

import com.TourismAgencySystem.Helper.Config;
import com.TourismAgencySystem.Helper.Helper;
import com.TourismAgencySystem.Model.*;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
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
    private JTextField fieldRoomSeasonStock;
    private JTextField fieldRoomBedCount;
    private JTextField fieldRoomSize;
    private JTextField fieldRoomTv;
    private JTextField fieldRoomMinibar;
    private JComboBox comboBoxPeriodSingle;
    private JComboBox comboBoxPeriodDouble;
    private JComboBox comboBoxPeriodKingSuite;
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
    private JCheckBox swimmingPoolCheckBox;
    private JCheckBox fitnessCenterCheckBox;
    private JCheckBox conciergeCheckBox;
    private JCheckBox spaCheckBox;
    private JCheckBox roomServiceCheckBox;
    private JTextField fieldResBed;
    private JTextField fieldResRoomSize;
    private JTextField fieldResTv;
    private JTextField fieldResMinibar;
    private JTextField fieldResCheckin;
    private JTextField fieldResCheckout;
    private JLabel labelResAdult;
    private JLabel labelResChild;
    private JPanel field;
    private JLabel labelResDuration;
    private JComboBox comboBoxResHostelType;
    private JButton buttonResHostelTypeSelect;
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
    private JLabel labelHotelName;
    private JCheckBox wiFiCheckBox;
    private JLabel labelResRoomType;
    private JButton clearButton;
    private JTextField fieldGuestName2;
    private JTextField fieldGuestName3;
    private JTextField fieldGuestName4;
    private JTextField fieldGuestName5;
    private JTextField fieldGuestName6;
    private JTextField fieldGuestName7;
    private JTextField fieldGuestName8;
    private JTextField fieldGuestName9;
    private JTextField fieldGuestName10;
    private JComboBox comboBoxGuestNat2;
    private JComboBox comboBoxGuestNat3;
    private JComboBox comboBoxGuestNat4;
    private JComboBox comboBoxGuestNat5;
    private JComboBox comboBoxGuestNat6;
    private JComboBox comboBoxGuestNat7;
    private JComboBox comboBoxGuestNat8;
    private JComboBox comboBoxGuestNat9;
    private JComboBox comboBoxGuestNat10;
    private JTextField fieldGuestId2;
    private JTextField fieldGuestId3;
    private JTextField fieldGuestId4;
    private JTextField fieldGuestId5;
    private JTextField fieldGuestId6;
    private JTextField fieldGuestId7;
    private JTextField fieldGuestId8;
    private JTextField fieldGuestId9;
    private JTextField fieldGuestId10;
    private JTextField fieldGuestPhone2;
    private JTextField fieldGuestPhone3;
    private JTextField fieldGuestPhone4;
    private JTextField fieldGuestPhone5;
    private JTextField fieldGuestPhone6;
    private JTextField fieldGuestMail2;
    private JTextField fieldGuestMail3;
    private JTextField fieldGuestMail4;
    private JTextField fieldGuestMail5;
    private JTextField fieldGuestMail6;
    private JButton buttonComplete;
    private JTextField fieldGuestName1;
    private JComboBox comboBoxGuestNat1;
    private JTextField fieldGuestId1;
    private JTextField fieldGuestPhone1;
    private JTextField fieldGuestMail1;
    private JLabel labelGuest1;
    private JLabel labelGuest2;
    private JLabel labelGuest3;
    private JLabel labelGuest4;
    private JLabel labelGuest5;
    private JLabel labelGuest6;
    private JLabel labelGuest7;
    private JLabel labelGuest8;
    private JLabel labelGuest9;
    private JLabel labelGuest10;
    private JTextField fieldGuestPhone7;
    private JTextField fieldGuestPhone8;
    private JTextField fieldGuestPhone9;
    private JTextField fieldGuestPhone10;
    private JTextField fieldGuestMail7;
    private JTextField fieldGuestMail8;
    private JTextField fieldGuestMail9;
    private JTextField fieldGuestMail10;
    private JComboBox comboBoxGuestType1;
    private JComboBox comboBoxGuestType2;
    private JComboBox comboBoxGuestType3;
    private JComboBox comboBoxGuestType4;
    private JComboBox comboBoxGuestType5;
    private JComboBox comboBoxGuestType6;
    private JComboBox comboBoxGuestType7;
    private JComboBox comboBoxGuestType8;
    private JComboBox comboBoxGuestType9;
    private JComboBox comboBoxGuestType10;
    private JTextField fieldRoomOffSeasonStock;
    private JButton buttonLogResDelete;
    private JPanel panelGuestInfo;
    private DefaultTableModel modelHotelHotelList;
    private Object[] rowHotelHotelList;
    private Employee employee;
    private DefaultTableModel modelPriceRoomList;
    private Object[] rowPriceRoomList;
    private DefaultTableModel modelSearchHotelList;
    private Object[] rowSearchHotelList;
    private DefaultTableModel modelLogResReservationList;
    private Object[] rowLogResReservationList;
    private DefaultTableModel modelLogGuestGuestList;
    private Object[] rowLogGuestGuestList;

    public EmployeeGUI(Employee employee) {
        this.employee = employee;
        add(wrapper);
        setSize(1100, 700);
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

        modelPriceRoomList = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2 || column == 3) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        Object[] colPriceRoomList = {"ID", "Period", "Room Type", "Hostel Type", "Adult Price", "Child Price"};
        modelPriceRoomList.setColumnIdentifiers(colPriceRoomList);
        rowPriceRoomList = new Object[colPriceRoomList.length];

        tablePriceRoomList.setModel(modelPriceRoomList);
        tablePriceRoomList.getTableHeader().setReorderingAllowed(false);
        tablePriceRoomList.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int id = Integer.parseInt(tablePriceRoomList.getValueAt(tablePriceRoomList.getSelectedRow(), 0).toString());
                    int hotel_id = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());
                    int period_id = EmployeeOp.getFetchPeriodIdByName(tablePriceRoomList.getValueAt(tablePriceRoomList.getSelectedRow(), 1).toString()).getId();
                    int room_type_id = EmployeeOp.getFetchRoomType(tablePriceRoomList.getValueAt(tablePriceRoomList.getSelectedRow(), 2).toString()).getId();
                    int acco_id = EmployeeOp.getFetchAccoIdByName(tablePriceRoomList.getValueAt(tablePriceRoomList.getSelectedRow(), 3).toString()).getId();
                    int adult_price = Integer.parseInt(tablePriceRoomList.getValueAt(tablePriceRoomList.getSelectedRow(), 4).toString());
                    int child_price = Integer.parseInt(tablePriceRoomList.getValueAt(tablePriceRoomList.getSelectedRow(), 5).toString());

                    if (EmployeeOp.updateRoomPrice(id, hotel_id, period_id, room_type_id, acco_id, adult_price, child_price)) {
                        Helper.showMessage("done");
                    }
                    loadPriceRoomModel();
                }
            }
        });

        modelSearchHotelList = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2 || column == 3) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        Object[] colSearchHotelList = {"ID", "Hotel ID", "Hotel Name", "City", "District", "Star", "Period", "Start Date", "End Date", "Room Type", "Stock"};
        modelSearchHotelList.setColumnIdentifiers(colSearchHotelList);
        rowSearchHotelList = new Object[colSearchHotelList.length];
        loadSalesRoomModel();
        tableSearchHotelList.setModel(modelSearchHotelList);
        tableSearchHotelList.getTableHeader().setReorderingAllowed(false);
        modelLogResReservationList = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2 || column == 3
                        || column == 4 || column == 5 || column == 6) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        Object[] colLogResReservationList = {"ID", "Hotel Name", "City", "Number of Guests", "Check-in Date", "Check-out Date", "Duration", "Total Price"};
        modelLogResReservationList.setColumnIdentifiers(colLogResReservationList);
        rowLogResReservationList = new Object[colLogResReservationList.length];

        loadResModel();

        tableLogResReservationList.setModel(modelLogResReservationList);
        tableLogResReservationList.getTableHeader().setReorderingAllowed(false);

        modelLogGuestGuestList = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1 || column == 2 || column == 3
                        || column == 4 || column == 5) {
                    return false;
                }
                return super.isCellEditable(row, column);
            }
        };

        Object[] colLogGuestGuestList = {"ID", "Reservation ID", "Full Name", "Nationality ID", "Phone Number", "Email"};
        modelLogGuestGuestList.setColumnIdentifiers(colLogGuestGuestList);
        rowLogGuestGuestList = new Object[colLogGuestGuestList.length];

        loadGuestModel();

        tableLogGuestGuestList.setModel(modelLogGuestGuestList);
        tableLogGuestGuestList.getTableHeader().setReorderingAllowed(false);


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
                Helper.enableComboBoxes(comboBoxPeriodSingle, comboBoxHostelTypeSingle);
                Helper.enableTextFields(fieldAdultPriceSingle, fieldChildPriceSingle);
                buttonAddSingle.setEnabled(true);
                if (!radioButtonSingle.isSelected()) {
                    Helper.resetComboBoxes(comboBoxPeriodSingle, comboBoxHostelTypeSingle);
                    Helper.resetTextFields(fieldAdultPriceSingle, fieldChildPriceSingle);
                    buttonAddSingle.setEnabled(false);
                }
            }
        });
        radioButtonDouble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Helper.enableComboBoxes(comboBoxPeriodDouble, comboBoxHostelTypeDouble);
                Helper.enableTextFields(fieldAdultPriceDouble, fieldChildPriceDouble);
                buttonAddDouble.setEnabled(true);

                if (!radioButtonDouble.isSelected()) {
                    Helper.resetComboBoxes(comboBoxPeriodDouble, comboBoxHostelTypeDouble);
                    Helper.resetTextFields(fieldAdultPriceDouble, fieldChildPriceDouble);
                    buttonAddDouble.setEnabled(false);
                }
            }
        });
        radioButtonKingSuite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Helper.enableComboBoxes(comboBoxPeriodKingSuite, comboBoxHostelTypeKingSuite);
                Helper.enableTextFields(fieldAdultPriceKingSuite, fieldChildPriceKingSuite);
                buttonAddKingSuite.setEnabled(true);

                if (!radioButtonKingSuite.isSelected()) {
                    Helper.resetComboBoxes(comboBoxPeriodKingSuite, comboBoxHostelTypeKingSuite);
                    Helper.resetTextFields(fieldAdultPriceKingSuite, fieldChildPriceKingSuite);
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
                        Helper.resetTextFields(fieldSeasonStartDate, fieldSeasonEndDate, fieldOffSeasonStartDate, fieldOffSeasonEndDate);
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
                        Helper.resetTextFields(fieldSeasonStartDate, fieldSeasonEndDate, fieldOffSeasonStartDate, fieldOffSeasonEndDate);
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
                loadPriceRoomModel();
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
                        Helper.resetTextFields(fieldSeasonStartDate, fieldSeasonEndDate, fieldOffSeasonStartDate, fieldOffSeasonEndDate);
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
                Helper.resetFormFields(fieldRoomTypeName, fieldRoomBedCount, fieldRoomSize, fieldRoomTv, fieldRoomMinibar, fieldRoomSeasonStock, fieldRoomOffSeasonStock);
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
                Helper.resetTextFields(fieldSeasonStartDate, fieldSeasonEndDate, fieldOffSeasonStartDate, fieldOffSeasonEndDate);
                Helper.resetRadioButtons(radioButtonSeason, radioButtonOffSeason);
            }
        });
        buttonRoomTypeAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Helper.isFieldEmpty(fieldRoomSeasonStock) || (Helper.isFieldEmpty(fieldRoomOffSeasonStock) || Helper.isFieldEmpty(fieldRoomBedCount) || Helper.isFieldEmpty(fieldRoomSize) || Helper.isFieldEmpty(fieldRoomTv)
                        || Helper.isFieldEmpty(fieldRoomMinibar)))) {
                    Helper.showMessage("fill");
                } else {
                    int hotel_id = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());
                    int room_type_id = EmployeeOp.getFetchRoomType(comboBoxRoomType.getSelectedItem().toString()).getId();
                    int seasonStock = Integer.parseInt(fieldRoomSeasonStock.getText());
                    int offSeasonStock = Integer.parseInt(fieldRoomOffSeasonStock.getText());
                    int bed = Integer.parseInt(fieldRoomBedCount.getText());
                    int size = Integer.parseInt(fieldRoomSize.getText());
                    int tv = Integer.parseInt(fieldRoomTv.getText());
                    int minibar = Integer.parseInt(fieldRoomMinibar.getText());

                    if (EmployeeOp.addRoomDetails(hotel_id, room_type_id, seasonStock, offSeasonStock, bed, size, tv, minibar)) {
                        Helper.showMessage("done");
                    }

                    String name = fieldHotelName.getText();
                    String city = fieldHotelCity.getText();
                    String district = fieldHotelDistrict.getText();
                    String star = fieldHotelStar.getText();
                    String periodName;
                    String roomName = comboBoxRoomType.getSelectedItem().toString();
                    Date periodStart;
                    Date periodEnd;

                    if (radioButtonSeason.isSelected()) {
                        periodName = "Season";
                        periodStart = EmployeeOp.getHotelPeriodDateByHotelId(hotel_id).getSeasonStart();
                        periodEnd = EmployeeOp.getHotelPeriodDateByHotelId(hotel_id).getSeasonEnd();

                        if (EmployeeOp.addRoomSalesDetails(hotel_id, name, city, district, star, periodName, periodStart, periodEnd, roomName, seasonStock)) {

                        }
                    }
                    if (radioButtonOffSeason.isSelected()) {
                        periodName = "Off Season";
                        periodStart = EmployeeOp.getHotelPeriodDateByHotelId(hotel_id).getOffSeasonStart();
                        periodEnd = EmployeeOp.getHotelPeriodDateByHotelId(hotel_id).getOffSeasonStart();
                        if (EmployeeOp.addRoomSalesDetails(hotel_id, name, city, district, star, periodName, periodStart, periodEnd, roomName, offSeasonStock)) {

                        }
                    }
                    loadSalesRoomModel();

                    scrollPaneHotelDetails.getVerticalScrollBar().setValue(0);
                }
            }
        });
        buttonRoomTypeUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((Helper.isFieldEmpty(fieldRoomSeasonStock) || (Helper.isFieldEmpty(fieldRoomOffSeasonStock) || Helper.isFieldEmpty(fieldRoomBedCount) || Helper.isFieldEmpty(fieldRoomSize) || Helper.isFieldEmpty(fieldRoomTv)
                        || Helper.isFieldEmpty(fieldRoomMinibar)))) {
                    Helper.showMessage("fill");
                } else {
                    int hotel_id = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());
                    int room_type_id = EmployeeOp.getFetchRoomType(comboBoxRoomType.getSelectedItem().toString()).getId();
                    int season_stock = Integer.parseInt(fieldRoomSeasonStock.getText());
                    int offseason_stock = Integer.parseInt(fieldRoomOffSeasonStock.getText());
                    int bed = Integer.parseInt(fieldRoomBedCount.getText());
                    int size = Integer.parseInt(fieldRoomSize.getText());
                    int tv = Integer.parseInt(fieldRoomTv.getText());
                    int minibar = Integer.parseInt(fieldRoomMinibar.getText());

                    if (EmployeeOp.updateRoomDetails(hotel_id, room_type_id, season_stock, offseason_stock, bed, size, tv, minibar)) {
                        Helper.showMessage("done");

                    }
                    scrollPaneHotelDetails.getVerticalScrollBar().setValue(0);
                    ;
                }
            }
        });
        buttonAddSingle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(fieldAdultPriceSingle) || Helper.isFieldEmpty(fieldChildPriceSingle)) {
                    Helper.showMessage("fill");
                } else {
                    int hotel_id = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());
                    int period_id = EmployeeOp.getFetchPeriodIdByName(comboBoxPeriodSingle.getSelectedItem().toString()).getId();
                    int room_type_id = 1;
                    int acco_id = EmployeeOp.getFetchAccoIdByName(comboBoxHostelTypeSingle.getSelectedItem().toString()).getId();
                    int adult_price = Integer.parseInt(fieldAdultPriceSingle.getText());
                    int child_price = Integer.parseInt(fieldChildPriceSingle.getText());

                    if (EmployeeOp.addPriceDetails(hotel_id, period_id, room_type_id, acco_id, adult_price, child_price)) {
                        Helper.showMessage("done");
                        loadPriceRoomModel();

                    } else {
                        Helper.showMessage("error");
                    }

                    radioButtonSingle.setSelected(false);
                    Helper.resetComboBoxes(comboBoxPeriodSingle, comboBoxHostelTypeSingle);
                    Helper.resetTextFields(fieldAdultPriceSingle, fieldChildPriceSingle);
                    buttonAddSingle.setEnabled(false);
                }
            }
        });
        buttonAddDouble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(fieldAdultPriceDouble) || Helper.isFieldEmpty(fieldChildPriceDouble)) {
                    Helper.showMessage("fill");
                } else {
                    int hotel_id = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());
                    int period_id = EmployeeOp.getFetchPeriodIdByName(comboBoxPeriodDouble.getSelectedItem().toString()).getId();
                    int room_type_id = 2;
                    int acco_id = EmployeeOp.getFetchAccoIdByName(comboBoxHostelTypeDouble.getSelectedItem().toString()).getId();
                    int adult_price = Integer.parseInt(fieldAdultPriceDouble.getText());
                    int child_price = Integer.parseInt(fieldChildPriceDouble.getText());

                    if (EmployeeOp.addPriceDetails(hotel_id, period_id, room_type_id, acco_id, adult_price, child_price)) {
                        Helper.showMessage("done");
                        loadPriceRoomModel();
                        radioButtonDouble.setSelected(false);
                        Helper.resetComboBoxes(comboBoxPeriodDouble, comboBoxHostelTypeDouble);
                        Helper.resetTextFields(fieldAdultPriceDouble, fieldChildPriceDouble);
                        buttonAddDouble.setEnabled(false);
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
        });
        buttonAddKingSuite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(fieldAdultPriceKingSuite) || Helper.isFieldEmpty(fieldChildPriceKingSuite)) {
                    Helper.showMessage("fill");
                } else {
                    int hotel_id = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());
                    int period_id = EmployeeOp.getFetchPeriodIdByName(comboBoxPeriodKingSuite.getSelectedItem().toString()).getId();
                    int room_type_id = 3;
                    int acco_id = EmployeeOp.getFetchAccoIdByName(comboBoxHostelTypeKingSuite.getSelectedItem().toString()).getId();
                    int adult_price = Integer.parseInt(fieldAdultPriceKingSuite.getText());
                    int child_price = Integer.parseInt(fieldChildPriceKingSuite.getText());

                    if (EmployeeOp.addPriceDetails(hotel_id, period_id, room_type_id, acco_id, adult_price, child_price)) {
                        Helper.showMessage("done");
                        loadPriceRoomModel();
                        radioButtonKingSuite.setSelected(false);
                        Helper.resetComboBoxes(comboBoxPeriodKingSuite, comboBoxHostelTypeKingSuite);
                        Helper.resetTextFields(fieldAdultPriceKingSuite, fieldChildPriceKingSuite);
                        buttonAddKingSuite.setEnabled(false);
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
        });
        buttonDeletePrice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.confirm("sure")) {
                    int id = Integer.parseInt(tablePriceRoomList.getValueAt(tablePriceRoomList.getSelectedRow(), 0).toString());
                    if (EmployeeOp.deleteRoomPriceDetails(id)) {
                        Helper.showMessage("done");
                        loadPriceRoomModel();
                    } else {
                        Helper.showMessage("error");
                    }
                }
            }
        });
        buttonSearchSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean isRowSelected = !(tableSearchHotelList.getSelectionModel().isSelectionEmpty());
                if (isRowSelected) {
                    int hotelId = Integer.parseInt(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 1).toString());
                    labelHotelName.setText(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 2).toString());
                    labelResRoomType.setText(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 9).toString());
                    fieldResCheckin.setText(fieldSearchCheckin.getText().toString());
                    fieldResCheckout.setText(fieldSearchCheckout.getText().toString());

                    if (fieldSearchAdult.getText().isEmpty()) {
                        labelResAdult.setText("");
                    } else if (Integer.parseInt(fieldSearchAdult.getText().toString()) == 0) {
                        labelResAdult.setText("");
                    } else if (Integer.parseInt(fieldSearchAdult.getText().toString()) > 1) {
                        labelResAdult.setText(fieldSearchAdult.getText().toString() + "x Adults");
                    } else {
                        labelResAdult.setText(fieldSearchAdult.getText().toString() + "x Adult");
                    }
                    if (fieldSearchChild.getText().isEmpty()) {
                        labelResChild.setText("");
                    } else if (Integer.parseInt(fieldSearchChild.getText().toString()) == 0) {
                        labelResChild.setText("");
                    } else if (Integer.parseInt(fieldSearchChild.getText().toString()) > 1) {
                        labelResChild.setText(fieldSearchChild.getText().toString() + "x Children");
                    } else {
                        labelResChild.setText(fieldSearchChild.getText().toString() + "x Child");
                    }
                    for (Hotel obj : EmployeeOp.getHotelDetailsByHotelId(hotelId)) {
                        fieldResDetailCity.setText(obj.getCity().toString());
                        fieldResDetailDistrict.setText(obj.getDistrict().toString());
                        fieldResDetailAddress.setText(obj.getAddress().toString());
                        fieldResDetailPhone.setText(obj.getPhoneNumber().toString());
                        fieldResDetailStar.setText(obj.getStar().toString());
                        if (obj.getParking().equals("Yes")) {
                            freeParkingCheckBox.setSelected(true);
                        }
                        if (obj.getWifi().equals("Yes")) {
                            wiFiCheckBox.setSelected(true);
                        }
                        if (obj.getPool().equals("Yes")) {
                            swimmingPoolCheckBox.setSelected(true);
                        }
                        if (obj.getGym().equals("Yes")) {
                            fitnessCenterCheckBox.setSelected(true);
                        }
                        if (obj.getConcierge().equals("Yes")) {
                            conciergeCheckBox.setSelected(true);
                        }
                        if (obj.getSpa().equals("Yes")) {
                            spaCheckBox.setSelected(true);
                        }
                        if (obj.getRoomService().equals("Yes")) {
                            roomServiceCheckBox.setSelected(true);
                        }
                    }
                    String roomName = (tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 9).toString());
                    for (Room obj : EmployeeOp.getRoomDetailsByHotelId(hotelId, EmployeeOp.getFetchRoomIdByName(roomName).getId())) {
                        fieldResBed.setText(String.valueOf(obj.getBed()));
                        fieldResMinibar.setText(String.valueOf(obj.getMinibar()));
                        fieldResRoomSize.setText(String.valueOf(obj.getRoomSize()));
                        fieldResTv.setText(String.valueOf(obj.getTv()));
                    }
                    int daysBetween = Helper.daysBetweenToDates(fieldSearchCheckin, fieldSearchCheckout);
                    labelResDuration.setText("for " + (daysBetween) + " nights" + " and " + (daysBetween + 1) + " days");
                    tabbedPane3.setSelectedIndex(1);
                    loadAccoCombo();
                } else {
                    Helper.showMessage("Please make a selection from the table below");
                }

            }
        });
        buttonResReserve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane3.setSelectedIndex(2);
                labelGuestRoomType.setText(labelResRoomType.getText());
                int hotelId = Integer.parseInt(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 1).toString());
                int roomTypeId = EmployeeOp.getFetchRoomIdByName(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 9).toString()).getId();

                String bed = String.valueOf(EmployeeOp.getGuestRoomDetailsByHotelId(hotelId, roomTypeId).getBed());
                String size = String.valueOf(EmployeeOp.getGuestRoomDetailsByHotelId(hotelId, roomTypeId).getRoomSize());
                String tv = String.valueOf(EmployeeOp.getGuestRoomDetailsByHotelId(hotelId, roomTypeId).getTv());
                String minibar = String.valueOf(EmployeeOp.getGuestRoomDetailsByHotelId(hotelId, roomTypeId).getMinibar());
                labelGuestBed.setText("Number of Beds: " + bed);
                labelGuestMinibar.setText("Number of Minibars: " + minibar);
                labelGuestTv.setText("Number of TVs: " + tv);
                labelGuestRoomSize.setText("Room Size: " + size + " m²");
                int adultNumber = Integer.parseInt(fieldSearchAdult.getText().toString());
                int childNumber = Integer.parseInt(fieldSearchChild.getText().toString());
                int totalGuestNumber = childNumber + adultNumber;
                switch (totalGuestNumber) {
                    case 1:
                        Helper.visibleComboBoxes(comboBoxGuestNat1, comboBoxGuestType1);
                        Helper.visibleJLabel(labelGuest1);
                        Helper.visibleTextFields(fieldGuestPhone1, fieldGuestId1, fieldGuestMail1, fieldGuestName1);
                        break;
                    case 2:
                        Helper.visibleComboBoxes(comboBoxGuestNat1, comboBoxGuestType1, comboBoxGuestNat2, comboBoxGuestType2);
                        Helper.visibleJLabel(labelGuest1, labelGuest2);
                        Helper.visibleTextFields(fieldGuestPhone1, fieldGuestId1, fieldGuestMail1, fieldGuestName1, fieldGuestPhone2, fieldGuestId2, fieldGuestMail2, fieldGuestName2);
                        break;
                    case 3:
                        Helper.visibleComboBoxes(comboBoxGuestNat1, comboBoxGuestType1, comboBoxGuestNat2, comboBoxGuestType2, comboBoxGuestNat3, comboBoxGuestType3);
                        Helper.visibleJLabel(labelGuest1, labelGuest2, labelGuest3);
                        Helper.visibleTextFields(fieldGuestPhone1, fieldGuestId1, fieldGuestMail1, fieldGuestName1, fieldGuestPhone2, fieldGuestId2, fieldGuestMail2, fieldGuestName2,
                                fieldGuestPhone3, fieldGuestId3, fieldGuestMail3, fieldGuestName3);
                        break;
                    case 4:
                        Helper.visibleComboBoxes(comboBoxGuestNat1, comboBoxGuestType1, comboBoxGuestNat2, comboBoxGuestType2, comboBoxGuestNat3, comboBoxGuestType3,
                                comboBoxGuestNat4, comboBoxGuestType4);
                        Helper.visibleJLabel(labelGuest1, labelGuest2, labelGuest3, labelGuest4);
                        Helper.visibleTextFields(fieldGuestPhone1, fieldGuestId1, fieldGuestMail1, fieldGuestName1, fieldGuestPhone2, fieldGuestId2, fieldGuestMail2, fieldGuestName2,
                                fieldGuestPhone3, fieldGuestId3, fieldGuestMail3, fieldGuestName3, fieldGuestPhone4, fieldGuestId4, fieldGuestMail4, fieldGuestName4);
                        break;
                    case 5:
                        Helper.visibleComboBoxes(comboBoxGuestNat1, comboBoxGuestType1, comboBoxGuestNat2, comboBoxGuestType2, comboBoxGuestNat3, comboBoxGuestType3,
                                comboBoxGuestNat4, comboBoxGuestType4, comboBoxGuestNat5, comboBoxGuestType5);
                        Helper.visibleJLabel(labelGuest1, labelGuest2, labelGuest3, labelGuest4, labelGuest5);
                        Helper.visibleTextFields(fieldGuestPhone1, fieldGuestId1, fieldGuestMail1, fieldGuestName1, fieldGuestPhone2, fieldGuestId2, fieldGuestMail2, fieldGuestName2,
                                fieldGuestPhone3, fieldGuestId3, fieldGuestMail3, fieldGuestName3, fieldGuestPhone4, fieldGuestId4, fieldGuestMail4, fieldGuestName4,
                                fieldGuestPhone5, fieldGuestId5, fieldGuestMail5, fieldGuestName5);
                        break;
                    case 6:
                        Helper.visibleComboBoxes(comboBoxGuestNat1, comboBoxGuestType1, comboBoxGuestNat2, comboBoxGuestType2, comboBoxGuestNat3, comboBoxGuestType3, comboBoxGuestNat4, comboBoxGuestType4, comboBoxGuestNat5, comboBoxGuestType5,
                                comboBoxGuestNat6, comboBoxGuestType6);
                        Helper.visibleJLabel(labelGuest1, labelGuest2, labelGuest3, labelGuest4, labelGuest5, labelGuest6);
                        Helper.visibleTextFields(fieldGuestPhone1, fieldGuestId1, fieldGuestMail1, fieldGuestName1, fieldGuestPhone2, fieldGuestId2, fieldGuestMail2, fieldGuestName2,
                                fieldGuestPhone3, fieldGuestId3, fieldGuestMail3, fieldGuestName3, fieldGuestPhone4, fieldGuestId4, fieldGuestMail4, fieldGuestName4,
                                fieldGuestPhone5, fieldGuestId5, fieldGuestMail5, fieldGuestName5, fieldGuestPhone6, fieldGuestId6, fieldGuestMail6, fieldGuestName6);
                        break;
                    case 7:
                        Helper.visibleComboBoxes(comboBoxGuestNat1, comboBoxGuestType1, comboBoxGuestNat2, comboBoxGuestType2, comboBoxGuestNat3, comboBoxGuestType3, comboBoxGuestNat4, comboBoxGuestType4, comboBoxGuestNat5, comboBoxGuestType5,
                                comboBoxGuestNat6, comboBoxGuestType6, comboBoxGuestNat7, comboBoxGuestType7);
                        Helper.visibleJLabel(labelGuest1, labelGuest2, labelGuest3, labelGuest4, labelGuest5,
                                labelGuest6, labelGuest7);
                        Helper.visibleTextFields(fieldGuestPhone1, fieldGuestId1, fieldGuestMail1, fieldGuestName1, fieldGuestPhone2, fieldGuestId2, fieldGuestMail2, fieldGuestName2,
                                fieldGuestPhone3, fieldGuestId3, fieldGuestMail3, fieldGuestName3, fieldGuestPhone4, fieldGuestId4, fieldGuestMail4, fieldGuestName4,
                                fieldGuestPhone5, fieldGuestId5, fieldGuestMail5, fieldGuestName5, fieldGuestPhone6, fieldGuestId6, fieldGuestMail6, fieldGuestName6,
                                fieldGuestPhone7, fieldGuestId7, fieldGuestMail7, fieldGuestName7);
                        break;
                    case 8:
                        Helper.visibleComboBoxes(comboBoxGuestNat1, comboBoxGuestType1, comboBoxGuestNat2, comboBoxGuestType2, comboBoxGuestNat3, comboBoxGuestType3, comboBoxGuestNat4, comboBoxGuestType4, comboBoxGuestNat5, comboBoxGuestType5,
                                comboBoxGuestNat6, comboBoxGuestType6, comboBoxGuestNat7, comboBoxGuestType7, comboBoxGuestNat8, comboBoxGuestType8);
                        Helper.visibleJLabel(labelGuest1, labelGuest2, labelGuest3, labelGuest4, labelGuest5,
                                labelGuest6, labelGuest7, labelGuest8);
                        Helper.visibleTextFields(fieldGuestPhone1, fieldGuestId1, fieldGuestMail1, fieldGuestName1, fieldGuestPhone2, fieldGuestId2, fieldGuestMail2, fieldGuestName2,
                                fieldGuestPhone3, fieldGuestId3, fieldGuestMail3, fieldGuestName3, fieldGuestPhone4, fieldGuestId4, fieldGuestMail4, fieldGuestName4,
                                fieldGuestPhone5, fieldGuestId5, fieldGuestMail5, fieldGuestName5, fieldGuestPhone6, fieldGuestId6, fieldGuestMail6, fieldGuestName6,
                                fieldGuestPhone7, fieldGuestId7, fieldGuestMail7, fieldGuestName7, fieldGuestPhone8, fieldGuestId8, fieldGuestMail8, fieldGuestName8);
                        break;
                    case 9:
                        Helper.visibleComboBoxes(comboBoxGuestNat1, comboBoxGuestType1, comboBoxGuestNat2, comboBoxGuestType2, comboBoxGuestNat3, comboBoxGuestType3, comboBoxGuestNat4, comboBoxGuestType4, comboBoxGuestNat5, comboBoxGuestType5,
                                comboBoxGuestNat6, comboBoxGuestType6, comboBoxGuestNat7, comboBoxGuestType7, comboBoxGuestNat8, comboBoxGuestType8, comboBoxGuestNat9, comboBoxGuestType9);
                        Helper.visibleJLabel(labelGuest1, labelGuest2, labelGuest3, labelGuest4, labelGuest5,
                                labelGuest6, labelGuest7, labelGuest8, labelGuest9);
                        Helper.visibleTextFields(fieldGuestPhone1, fieldGuestId1, fieldGuestMail1, fieldGuestName1, fieldGuestPhone2, fieldGuestId2, fieldGuestMail2, fieldGuestName2,
                                fieldGuestPhone3, fieldGuestId3, fieldGuestMail3, fieldGuestName3, fieldGuestPhone4, fieldGuestId4, fieldGuestMail4, fieldGuestName4,
                                fieldGuestPhone5, fieldGuestId5, fieldGuestMail5, fieldGuestName5, fieldGuestPhone6, fieldGuestId6, fieldGuestMail6, fieldGuestName6,
                                fieldGuestPhone7, fieldGuestId7, fieldGuestMail7, fieldGuestName7, fieldGuestPhone8, fieldGuestId8, fieldGuestMail8, fieldGuestName8,
                                fieldGuestPhone9, fieldGuestId9, fieldGuestMail9, fieldGuestName9);
                        break;
                    case 10:
                        Helper.visibleComboBoxes(comboBoxGuestNat1, comboBoxGuestType1, comboBoxGuestNat2, comboBoxGuestType2, comboBoxGuestNat3, comboBoxGuestType3, comboBoxGuestNat4, comboBoxGuestType4, comboBoxGuestNat5, comboBoxGuestType5,
                                comboBoxGuestNat6, comboBoxGuestType6, comboBoxGuestNat7, comboBoxGuestType7, comboBoxGuestNat8, comboBoxGuestType8, comboBoxGuestNat9, comboBoxGuestType9, comboBoxGuestNat10, comboBoxGuestType10);
                        Helper.visibleJLabel(labelGuest1, labelGuest2, labelGuest3, labelGuest4, labelGuest5,
                                labelGuest6, labelGuest7, labelGuest8, labelGuest9, labelGuest10);
                        Helper.visibleTextFields(fieldGuestPhone1, fieldGuestId1, fieldGuestMail1, fieldGuestName1, fieldGuestPhone2, fieldGuestId2, fieldGuestMail2, fieldGuestName2,
                                fieldGuestPhone3, fieldGuestId3, fieldGuestMail3, fieldGuestName3, fieldGuestPhone4, fieldGuestId4, fieldGuestMail4, fieldGuestName4,
                                fieldGuestPhone5, fieldGuestId5, fieldGuestMail5, fieldGuestName5, fieldGuestPhone6, fieldGuestId6, fieldGuestMail6, fieldGuestName6,
                                fieldGuestPhone7, fieldGuestId7, fieldGuestMail7, fieldGuestName7, fieldGuestPhone8, fieldGuestId8, fieldGuestMail8, fieldGuestName8,
                                fieldGuestPhone9, fieldGuestId9, fieldGuestMail9, fieldGuestName9, fieldGuestPhone10, fieldGuestId10, fieldGuestMail10, fieldGuestName10);
                        break;
                }

                if ((Helper.isFieldEmpty(fieldResPrice))) {
                    Helper.showMessage("fill");
                } else {

                    String city = fieldResDetailCity.getText();
                    Date checkinDate = Helper.stringToDate(fieldResCheckin.getText());
                    Date checkoutDate = Helper.stringToDate(fieldResCheckout.getText());
                    int duration = Helper.daysBetweenToDates(fieldResCheckin, fieldResCheckout);
                    int totalPrice = Integer.parseInt(fieldResPrice.getText());


                    if (EmployeeOp.addReservationDetails(hotelId, city, totalGuestNumber, checkinDate, checkoutDate, duration, totalPrice)) {
                        Helper.showMessage("done");
                        loadResModel();
                    }
                }
            }
        });
        buttonSearchSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(fieldSearchHotelCityDistrict) || Helper.isFieldEmpty(fieldSearchCheckin) || Helper.isFieldEmpty(fieldSearchCheckout)) {
                    Helper.showMessage("fill");
                } else {

                    String input = fieldSearchHotelCityDistrict.getText();
                    String star = fieldSearchStar.getText();
                    Date checkIn = Helper.stringToDate(fieldSearchCheckin.getText());
                    Date checkOut = Helper.stringToDate(fieldSearchCheckout.getText());

                    String query = EmployeeOp.searchRoomSalesQuery(input, star, checkIn, checkOut);
                    ArrayList<RoomSales> searchRoomSales = EmployeeOp.searchRoomSalesList(query);
                    loadSalesRoomModel(searchRoomSales);
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadSalesRoomModel();
                Helper.resetFormFields(fieldSearchHotelCityDistrict, fieldSearchStar, fieldSearchCheckin, fieldSearchCheckout, fieldSearchAdult, fieldSearchChild);
            }
        });
        buttonResHostelTypeSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldResPrice.setText(String.valueOf(getPrice()));
            }
        });
        buttonComplete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int lastRow = tableLogResReservationList.getRowCount() - 1;
                tableLogResReservationList.setRowSelectionInterval(lastRow, lastRow);
                int adultNumber = Integer.parseInt(fieldSearchAdult.getText().toString());
                int childNumber = Integer.parseInt(fieldSearchChild.getText().toString());
                int total = adultNumber + childNumber;
                int reservationId = Integer.parseInt(tableLogResReservationList.getValueAt(tableLogResReservationList.getSelectedRow(), 0).toString());
                String guestName1, guestName2, guestName3, guestName4, guestName5, guestName6, guestName7, guestName8, guestName9, guestName10;
                String guestId1, guestId2, guestId3, guestId4, guestId5, guestId6, guestId7, guestId8, guestId9, guestId10;
                String guestPhone1, guestPhone2, guestPhone3, guestPhone4, guestPhone5, guestPhone6, guestPhone7, guestPhone8, guestPhone9, guestPhone10;
                String guestMail1, guestMail2, guestMail3, guestMail4, guestMail5, guestMail6, guestMail7, guestMail8, guestMail9, guestMail10;
                String guestNat1, guestNat2, guestNat3, guestNat4, guestNat5, guestNat6, guestNat7, guestNat8, guestNat9, guestNat10;
                String guestType1, guestType2, guestType3, guestType4, guestType5, guestType6, guestType7, guestType8, guestType9, guestType10;

                if (total >= 1) {
                    guestName1 = fieldGuestName1.getText();
                    guestId1 = fieldGuestId1.getText();
                    guestPhone1 = fieldGuestPhone1.getText();
                    guestMail1 = fieldGuestMail1.getText();
                    guestNat1 = comboBoxGuestNat1.getSelectedItem().toString();
                    guestType1 = comboBoxGuestType1.getSelectedItem().toString();
                    if (EmployeeOp.addGuestDetails(reservationId, guestName1, guestId1, guestPhone1, guestMail1)) {
                        Helper.showMessage("done");
                        loadGuestModel();
                    }

                    if (total >= 2) {
                        guestName2 = fieldGuestName2.getText();
                        guestId2 = fieldGuestId2.getText();
                        guestPhone2 = fieldGuestPhone2.getText();
                        guestMail2 = fieldGuestMail2.getText();
                        guestNat2 = comboBoxGuestNat2.getSelectedItem().toString();
                        guestType2 = comboBoxGuestType2.getSelectedItem().toString();
                        if (EmployeeOp.addGuestDetails(reservationId, guestName2, guestId2, guestPhone2, guestMail2)) {
                            Helper.showMessage("done");
                            loadGuestModel();
                        }

                        if (total >= 3) {
                            guestName3 = fieldGuestName3.getText();
                            guestId3 = fieldGuestId3.getText();
                            guestPhone3 = fieldGuestPhone3.getText();
                            guestMail3 = fieldGuestMail3.getText();
                            guestNat3 = comboBoxGuestNat3.getSelectedItem().toString();
                            guestType3 = comboBoxGuestType3.getSelectedItem().toString();
                            if (EmployeeOp.addGuestDetails(reservationId, guestName3, guestId3, guestPhone3, guestMail3)) {
                                Helper.showMessage("done");
                                loadGuestModel();
                            }

                            if (total >= 4) {
                                guestName4 = fieldGuestName4.getText();
                                guestId4 = fieldGuestId4.getText();
                                guestPhone4 = fieldGuestPhone4.getText();
                                guestMail4 = fieldGuestMail4.getText();
                                guestNat4 = comboBoxGuestNat4.getSelectedItem().toString();
                                guestType4 = comboBoxGuestType4.getSelectedItem().toString();
                                if (EmployeeOp.addGuestDetails(reservationId, guestName4, guestId4, guestPhone4, guestMail4)) {
                                    Helper.showMessage("done");
                                    loadGuestModel();
                                }

                                if (total >= 5) {
                                    guestName5 = fieldGuestName5.getText();
                                    guestId5 = fieldGuestId5.getText();
                                    guestPhone5 = fieldGuestPhone5.getText();
                                    guestMail5 = fieldGuestMail5.getText();
                                    guestNat5 = comboBoxGuestNat5.getSelectedItem().toString();
                                    guestType5 = comboBoxGuestType5.getSelectedItem().toString();
                                    if (EmployeeOp.addGuestDetails(reservationId, guestName5, guestId5, guestPhone5, guestMail5)) {
                                        Helper.showMessage("done");
                                        loadGuestModel();
                                    }

                                    if (total >= 6) {
                                        guestName6 = fieldGuestName6.getText();
                                        guestId6 = fieldGuestId6.getText();
                                        guestPhone6 = fieldGuestPhone6.getText();
                                        guestMail6 = fieldGuestMail6.getText();
                                        guestNat6 = comboBoxGuestNat6.getSelectedItem().toString();
                                        guestType6 = comboBoxGuestType6.getSelectedItem().toString();
                                        if (EmployeeOp.addGuestDetails(reservationId, guestName6, guestId6, guestPhone6, guestMail6)) {
                                            Helper.showMessage("done");
                                            loadGuestModel();
                                        }

                                        if (total >= 7) {
                                            guestName7 = fieldGuestName7.getText();
                                            guestId7 = fieldGuestId7.getText();
                                            guestPhone7 = fieldGuestPhone7.getText();
                                            guestMail7 = fieldGuestMail7.getText();
                                            guestNat7 = comboBoxGuestNat7.getSelectedItem().toString();
                                            guestType7 = comboBoxGuestType7.getSelectedItem().toString();
                                            if (EmployeeOp.addGuestDetails(reservationId, guestName7, guestId7, guestPhone7, guestMail7)) {
                                                Helper.showMessage("done");
                                                loadGuestModel();
                                            }

                                            if (total >= 8) {
                                                guestName8 = fieldGuestName8.getText();
                                                guestId8 = fieldGuestId8.getText();
                                                guestPhone8 = fieldGuestPhone8.getText();
                                                guestMail8 = fieldGuestMail8.getText();
                                                guestNat8 = comboBoxGuestNat8.getSelectedItem().toString();
                                                guestType8 = comboBoxGuestType8.getSelectedItem().toString();
                                                if (EmployeeOp.addGuestDetails(reservationId, guestName8, guestId8, guestPhone8, guestMail8)) {
                                                    Helper.showMessage("done");
                                                    loadGuestModel();
                                                }

                                                if (total >= 9) {
                                                    guestName9 = fieldGuestName9.getText();
                                                    guestId9 = fieldGuestId9.getText();
                                                    guestPhone9 = fieldGuestPhone9.getText();
                                                    guestMail9 = fieldGuestMail9.getText();
                                                    guestNat9 = comboBoxGuestNat9.getSelectedItem().toString();
                                                    guestType9 = comboBoxGuestType9.getSelectedItem().toString();
                                                    if (EmployeeOp.addGuestDetails(reservationId, guestName9, guestId9, guestPhone9, guestMail9)) {
                                                        Helper.showMessage("done");
                                                        loadGuestModel();
                                                    }

                                                    if (total >= 10) {
                                                        guestName10 = fieldGuestName10.getText();
                                                        guestId10 = fieldGuestId10.getText();
                                                        guestPhone10 = fieldGuestPhone10.getText();
                                                        guestMail10 = fieldGuestMail10.getText();
                                                        guestNat10 = comboBoxGuestNat10.getSelectedItem().toString();
                                                        guestType10 = comboBoxGuestType10.getSelectedItem().toString();
                                                        if (EmployeeOp.addGuestDetails(reservationId, guestName10, guestId10, guestPhone10, guestMail10)) {
                                                            Helper.showMessage("done");
                                                            loadGuestModel();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } // end of ifs
                if (false) {
                    Helper.showMessage("fill");
                } else {
                    int id = Integer.parseInt(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 0).toString());
                    int stock = Integer.parseInt(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 10).toString());

                    if (EmployeeOp.updateStock(id, stock-1)) {
                        loadSalesRoomModel();
                    }
                    scrollPaneHotelDetails.getVerticalScrollBar().setValue(0);
                }
            }
        });
        buttonLogResDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void loadAccoCombo() {
        comboBoxResHostelType.removeAllItems();
        int hotelId = Integer.parseInt(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 1).toString());
        int roomTypeId = EmployeeOp.getFetchRoomIdByName(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 9).toString()).getId();
        int periodId = EmployeeOp.getFetchPeriodIdByName(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 6).toString()).getId();
        for (RoomPrice obj : EmployeeOp.getAccoIdByHotel(hotelId, roomTypeId, periodId)) {
            comboBoxResHostelType.addItem(EmployeeOp.getFetchAccoNameById(obj.getAccommodationId()).getAccoName());
        }
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
        Helper.enableTextFields(fieldSeasonStartDate, fieldSeasonEndDate, fieldOffSeasonStartDate, fieldOffSeasonEndDate);
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
            fieldRoomSeasonStock.setText(String.valueOf(obj.getSeasonStock()));
        }
    }

    public void loadPriceRoomModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tablePriceRoomList.getModel();
        clearModel.setRowCount(0);
        int i;
        int id = Integer.parseInt(tableHotelHotelList.getValueAt(tableHotelHotelList.getSelectedRow(), 0).toString());
        for (RoomPrice obj : EmployeeOp.getRoomPriceListByHotelId(id)) {
            i = 0;
            rowPriceRoomList[i++] = obj.getId();
            rowPriceRoomList[i++] = EmployeeOp.getFetchPeriodNameById(obj.getPeriodId()).getPeriodName();
            rowPriceRoomList[i++] = EmployeeOp.getFetchRoomNameById(obj.getRoomTypeId()).getRoomName();
            rowPriceRoomList[i++] = EmployeeOp.getFetchAccoNameById(obj.getAccommodationId()).getAccoName();
            rowPriceRoomList[i++] = obj.getAdultPrice();
            rowPriceRoomList[i++] = obj.getChildPrice();

            modelPriceRoomList.addRow(rowPriceRoomList);
        }
    }

    public void loadSalesRoomModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tableSearchHotelList.getModel();
        clearModel.setRowCount(0);
        int i;
        for (RoomSales obj : EmployeeOp.getRoomSalesList()) {
            i = 0;
            rowSearchHotelList[i++] = obj.getId();
            rowSearchHotelList[i++] = obj.getHotelId();
            rowSearchHotelList[i++] = obj.getHotelName();
            rowSearchHotelList[i++] = obj.getCity();
            rowSearchHotelList[i++] = obj.getDistrict();
            rowSearchHotelList[i++] = obj.getStar();
            rowSearchHotelList[i++] = obj.getPeriod();
            rowSearchHotelList[i++] = obj.getStartDate();
            rowSearchHotelList[i++] = obj.getEndDate();
            rowSearchHotelList[i++] = obj.getRoomType();

            if (obj.getStock() != 0) {
                rowSearchHotelList[i++] = obj.getStock();
                modelSearchHotelList.addRow(rowSearchHotelList);
            }
        }
    }

    public void loadSalesRoomModel(ArrayList<RoomSales> list) {
        DefaultTableModel clearModel = (DefaultTableModel) tableSearchHotelList.getModel();
        clearModel.setRowCount(0);
        int i;
        for (RoomSales obj : list) {
            i = 0;
            rowSearchHotelList[i++] = obj.getId();
            rowSearchHotelList[i++] = obj.getHotelId();
            rowSearchHotelList[i++] = obj.getHotelName();
            rowSearchHotelList[i++] = obj.getCity();
            rowSearchHotelList[i++] = obj.getDistrict();
            rowSearchHotelList[i++] = obj.getStar();
            rowSearchHotelList[i++] = obj.getPeriod();
            rowSearchHotelList[i++] = obj.getStartDate();
            rowSearchHotelList[i++] = obj.getEndDate();
            rowSearchHotelList[i++] = obj.getRoomType();

            if (obj.getStock() != 0) {
                rowSearchHotelList[i++] = obj.getStock();
                modelSearchHotelList.addRow(rowSearchHotelList);
            }
        }
    }

    public void loadResModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tableLogResReservationList.getModel();
        clearModel.setRowCount(0);
        int i;

        for (Reservation obj : EmployeeOp.getResList()) {
            i = 0;

            rowLogResReservationList[i++] = obj.getId();
            rowLogResReservationList[i++] = EmployeeOp.getHotelNameByHotelId(obj.getHotelId()).getName();
            rowLogResReservationList[i++] = obj.getCity();
            rowLogResReservationList[i++] = obj.getGuestCount();
            rowLogResReservationList[i++] = obj.getCheckinDate();
            rowLogResReservationList[i++] = obj.getCheckoutDate();
            rowLogResReservationList[i++] = obj.getDuration();
            rowLogResReservationList[i++] = obj.getTotalPrice();
            modelLogResReservationList.addRow(rowLogResReservationList);
        }
    }

    public void loadGuestModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tableLogGuestGuestList.getModel();
        clearModel.setRowCount(0);
        int i;

        for (Guest obj : EmployeeOp.getGuestList()) {
            i = 0;

            rowLogGuestGuestList[i++] = obj.getId();
            rowLogGuestGuestList[i++] = obj.getReservationId();
            rowLogGuestGuestList[i++] = obj.getFullName();
            rowLogGuestGuestList[i++] = obj.getNationalId();
            rowLogGuestGuestList[i++] = obj.getPhone();
            rowLogGuestGuestList[i++] = obj.getEmail();

            modelLogGuestGuestList.addRow(rowLogGuestGuestList);
        }
    }

    public int getPrice() {
        int hotelId = Integer.parseInt(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 1).toString());
        int roomTypeId = EmployeeOp.getFetchRoomIdByName(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 9).toString()).getId();
        int periodId = EmployeeOp.getFetchPeriodIdByName(tableSearchHotelList.getValueAt(tableSearchHotelList.getSelectedRow(), 6).toString()).getId();
        int accoId = EmployeeOp.getFetchAccoIdByName(comboBoxResHostelType.getSelectedItem().toString()).getId();
        int duration = Helper.daysBetweenToDates(fieldSearchCheckin, fieldSearchCheckout);
        int total = 0;
        RoomPrice obj = EmployeeOp.getAccoPrice(hotelId, roomTypeId, periodId, accoId);
        int a = obj.getAdultPrice();
        int b = obj.getChildPrice();
        total = Helper.resPrice(fieldSearchAdult, fieldSearchChild, a, b, duration);

        return total;
    }
}
