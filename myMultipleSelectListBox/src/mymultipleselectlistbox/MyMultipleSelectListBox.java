/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymultipleselectlistbox;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class MyMultipleSelectListBox {
private static void createWindow() {    
      JFrame frame = new JFrame("Swing Tester");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      createUI(frame);
      frame.setSize(560, 200);      
      frame.setLocationRelativeTo(null);  
      frame.setVisible(true);
   }

   private static void createUI(final JFrame frame){  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      String[] numbers = {"One", "Two", "Three", "Four", "Five"};
      JList<String> listBox = new JList<>(numbers);
      listBox.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      listBox.setVisibleRowCount(-1); // to keep all values visible
      listBox.setSelectedIndex(3);
      listBox.addListSelectionListener(new ListSelectionListener() {		
         @Override
         public void valueChanged(ListSelectionEvent e) {
            JList list = (JList)e.getSource();			
            JOptionPane.showMessageDialog(frame,list.getSelectedValue());
         }
      });

      panel.add(listBox);   
      frame.getContentPane().add(panel, BorderLayout.CENTER);    
   }
    public static void main(String[] args) {
      createWindow();
    }
    
}
