/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mymenu;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author xuanhungmai
 */
public class MyMenu  implements ItemListener, ActionListener{
 private JMenuBar menuBar;
 private JMenu menuFile;
 private JMenuItem itemOpen;
 private JMenuItem itemNew;
 private JCheckBoxMenuItem itemSave;
 private JLabel lbText; 
 
 public JFrame fr;
 public MyMenu()
 {
        fr= new JFrame("Hiển thị thông báo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,200);
        fr.setLayout(new GridLayout(4,3,5,5));
        
        menuBar= new JMenuBar();
        
        menuFile= new JMenu("File");
        menuBar.add(menuFile);
        
        itemNew= new JMenuItem("new");
        menuFile.add(itemNew);
        
        itemOpen=new JMenuItem("Open");
        menuFile.add(itemOpen);
        
        itemSave=new JCheckBoxMenuItem("Save",true);
        menuFile.add(itemSave);
        
        lbText=new JLabel("hiển thị thông báo");
                
        itemNew.addActionListener(this);
        /*
        itemNew.addItemListener(this);
        itemOpen.addItemListener(this);
        itemSave.addItemListener(this);
        */
        
        fr.add(menuBar);
        fr.add(lbText); 
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
 }

    @Override
    public void itemStateChanged(ItemEvent ie) 
    {
       // if(ie.getItem()==itemNew)
           JOptionPane.showInputDialog("test");
            /*if(ie.getStateChange()==ItemEvent.SELECTED)
            {    JOptionPane.showInputDialog("test");
                lbText.setText("New");
            }
            else
                 lbText.setText("");*/
            
        throw new UnsupportedOperationException("Not supported yet.");
        
    }
   
 
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==itemNew)
            JOptionPane.showInputDialog("New");
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public static void main(String[] args) 
    {
         new MyMenu();
    }

}
