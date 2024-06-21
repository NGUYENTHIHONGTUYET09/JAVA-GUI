/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mytabbedpane;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MyTabbedPane {

    public MyTabbedPane()
    {
    
        JTabbedPane tabPane= new JTabbedPane();
        
        JPanel p1=new JPanel(new FlowLayout()); 
        p1.add(new JLabel("Tab thứ nhất được nhấn"));
        
        tabPane.addTab("Tab1",null, p1, "Tab thứ nhất");
        
        JPanel p2=new JPanel(new FlowLayout()); 
        p2.add(new JLabel("Tab thứ hai được nhấn"));
      
        tabPane.addTab("Tab2",null, p2, "Tab thứ hai");
       
        JFrame fr= new JFrame("tab demo");
          
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        fr.setBounds(50,50,400,300);
        //fr.setSize(400,300);
        fr.add(tabPane,BorderLayout.CENTER);
        
        fr.setVisible(true);
        
    }
    public static void main(String[] args) {
    new MyTabbedPane();
    }
}
