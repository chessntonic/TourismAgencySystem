package com.TourismAgencySystem.View;

import javax.swing.*;
import com.TourismAgencySystem.Helper.*;

public class LoginGUI extends JFrame {
    private JPanel wtop;
    private JPanel wbottom;
    private JPanel wrapper;
    private JTextField fld_username;
    private JTextField fld_password;
    private JButton loginButton;

    public LoginGUI() {
        add(wrapper);
        setSize(400, 400);
        setLocation(Helper.screenCenterLocation("x", getSize()),Helper.screenCenterLocation("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
    }
}
