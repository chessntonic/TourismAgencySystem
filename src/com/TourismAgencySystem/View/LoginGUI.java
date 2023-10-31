package com.TourismAgencySystem.View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.TourismAgencySystem.Helper.*;
import com.TourismAgencySystem.Model.Admin;
import com.TourismAgencySystem.Model.Employee;
import com.TourismAgencySystem.Model.User;
import com.TourismAgencySystem.Model.UserOp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JPanel wtop;
    private JPanel wbottom;
    private JPanel wrapper;
    private JTextField fieldUsername;
    private JTextField fieldPassword;
    private JButton buttonLogin;

    public LoginGUI() {
        add(wrapper);
        setSize(400, 400);
        setLocation(Helper.screenCenterLocation("x", getSize()), Helper.screenCenterLocation("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Helper.isFieldEmpty(fieldUsername) || Helper.isFieldEmpty(fieldPassword)) {
                    Helper.showMessage("fill");
                } else {
                    User u = UserOp.getFetch(fieldUsername.getText(), fieldPassword.getText());
                    if (u == null) {
                        Helper.showMessage("User not found");
                    } else {
                        switch (u.getType()) {
                            case "admin":
                                AdminGUI adminGUI = new AdminGUI((Admin) u);
                                break;
//                            case "employee":
//                                EmployeeGUI employeeGUI = new Employee((Employee) u);
//                                break;
                        }
                        dispose();
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI loginGUI = new LoginGUI();
    }
}
