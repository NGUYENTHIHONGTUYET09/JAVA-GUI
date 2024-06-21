/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymenuandjpanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author PC01
 */
public class MyMenuAndJpanel {
    private JFrame frame;
    private JPanel pnLogin,pnAddUser;
    private JMenuItem menuItemNew,menuItemOpen; 
    private MyMenu menuClass; 
    public void createFrame(){
        frame = new JFrame("Xử lý các sự kiện liên quan menu");
        //menuBar= new JMenuBar();
        //menu = new JMenu("File");
        
        menuClass  = new MyMenu();
        menuClass.createMenuBar();
        
        JMenuBar  menuBar=menuClass.getMenuBar(); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(400, 500);
        
        menuItemNew = menuClass.getMenuItemNew();
        
        menuItemNew.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showInputDialog("da bat duoc new item");
                panelLogin panellogin = new panelLogin();
                panellogin.createPanelLogin();
                if(pnLogin==null)
                    pnLogin= panellogin.getPanelLogin();
                
                if(pnAddUser!=null){
                    //pnAddUser.setVisible(false);
                   // pnAddUser.removeAll();
                   // pnAddUser=null;
                    frame.remove(pnAddUser);
                    frame.revalidate();
                    frame.repaint();
                } 
                frame.add(pnLogin);
                frame.setVisible(true);
            }
        });
        menuItemOpen = menuClass.getMenuItemOpen();
        menuItemOpen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                AddUser paneladduser = new AddUser();
                paneladduser.createPanelRegister();
                if(pnAddUser==null)
                    pnAddUser= paneladduser.getPanelUser();
                
                if(pnLogin!=null){
                    //pnLogin.setVisible(false);
                    //pnLogin.removeAll();
                    //pnLogin=null; 
                    frame.remove(pnLogin);
                    frame.revalidate();
                    frame.repaint();
                }
                frame.add(pnAddUser);
                frame.setVisible(true);
            }
        });
       // frame.setVisible(true);
        frame.setJMenuBar(menuBar);
    }
    
    public void closeFrame()
    {
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
     MyMenuAndJpanel f = new MyMenuAndJpanel();//
     f.createFrame();
     f.closeFrame();
    }
    
}
