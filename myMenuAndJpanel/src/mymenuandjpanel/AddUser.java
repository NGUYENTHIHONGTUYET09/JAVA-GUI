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

public class AddUser {
    private JPanel panelRegister;
    private JTextField txtUserName;
    private JTextField txtPassWord;
    private JButton btnRegister; 
    public void createPanelRegister(){
    panelRegister = new JPanel();
    panelRegister.setLayout(new GridLayout(3,1,5,5));
    txtUserName = new JTextField();
    txtUserName.setColumns(10);
    panelRegister.add(txtUserName);
    
    txtPassWord = new JTextField();
    txtPassWord.setColumns(10);
    panelRegister.add(txtPassWord);
        
    btnRegister=new JButton("Register");
    btnRegister.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
               if(e.getSource()==btnRegister){
                   int reply=JOptionPane.showConfirmDialog(null,"Register được nhấn","thông báo",JOptionPane.YES_NO_OPTION); 
                   if(reply==JOptionPane.YES_OPTION){
                       JOptionPane.showInputDialog("Ban chấp nhận đăng ký");
                       
                   }
                   else{
                       JOptionPane.showInputDialog("Không chấp nhận đăng ký");
                   }
               } 
        }
    
    });
    panelRegister.add(btnRegister);
    }
    public JPanel getPanelUser()
    {
        return panelRegister; 
    }
}
