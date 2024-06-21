/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymenuandjpanel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class panelLogin {
    private JPanel panelLogin;
    private JTextField txtUserName;
    private JButton btnLogin; 
    public void createPanelLogin()
    {
        panelLogin = new JPanel();
        panelLogin.setLayout(new GridLayout(2,1,5,5));
        txtUserName = new JTextField();
        txtUserName.setColumns(10);
        panelLogin.add(txtUserName);
        btnLogin=new JButton("Login");
        btnLogin.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btnLogin)
                    JOptionPane.showInputDialog("Login duoc nhan");
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
        panelLogin.add(btnLogin);
    }
    public JPanel getPanelLogin()
    {
        return panelLogin; 
    }
}
