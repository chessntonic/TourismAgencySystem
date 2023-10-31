package com.TourismAgencySystem.View;

import com.TourismAgencySystem.Helper.Config;
import com.TourismAgencySystem.Helper.Helper;
import com.TourismAgencySystem.Model.Admin;

import javax.swing.*;

public class AdminGUI extends JFrame{
    private JPanel wrapper;
    private JLabel labelAdminWelcome;
    private JButton buttonExit;
    private JTable tbl_userList;
    private JTextField fieldUserFullName;
    private JTextField fieldUserUsername;
    private JTextField fieldUserPassword;
    private JComboBox comboUserType;
    private JTextField fieldUserId;
    private JButton buttonDelete;
    private JButton buttonAddUser;
    private final Admin admin;

    public AdminGUI (Admin admin) {
        this.admin = admin;
        add(wrapper);
        setSize(1000, 500);
        int x = Helper.screenCenterLocation("x", getSize());
        int y = Helper.screenCenterLocation("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
    }
}