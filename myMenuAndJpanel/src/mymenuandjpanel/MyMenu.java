/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymenuandjpanel;
import java.awt.event.*;
import javax.swing.*;

public class MyMenu {
    private JMenuBar menuBar;
    private JMenu menuFile; 
    private JMenuItem menuItemNew;
    private JMenuItem menuItemOpen;
    public void createMenuBar(){
        menuBar = new JMenuBar();
        menuFile= new JMenu("File");
        menuItemNew = new JMenuItem("New",KeyEvent.VK_N);
        menuItemOpen = new JMenuItem("Register",KeyEvent.VK_O);
        menuBar.add(menuFile);
        menuFile.add(menuItemNew);
        menuFile.add(menuItemOpen);
    }
    public JMenuBar getMenuBar()
    {
        return menuBar; 
    }
    public JMenuItem getMenuItemNew(){
        return menuItemNew; 
    }
    public JMenuItem getMenuItemOpen(){
        return menuItemOpen; 
    }
}
