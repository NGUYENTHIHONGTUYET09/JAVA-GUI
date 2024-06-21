/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myshowcombobox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyShowComboBox {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   public MyShowComboBox(){
       prepareGUI();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Vi du Java Swing");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    

      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
    private void showComboboxDemo(){       
        
      headerLabel.setText("JComboBox"); 

      final DefaultComboBoxModel fruitsName = new DefaultComboBoxModel();

      fruitsName.addElement("Táo");
      fruitsName.addElement("Xoài");
      fruitsName.addElement("Ổi");
      fruitsName.addElement("Cóc");

      final JComboBox fruitCombo = new JComboBox(fruitsName);    
      fruitCombo.setSelectedIndex(0);
      //fruitsName.removeElementAt(0);
      JScrollPane fruitListScrollPane = new JScrollPane(fruitCombo);    

      JButton showButton = new JButton("Show");

      showButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) { 
            String data = "";
            if (fruitCombo.getSelectedIndex() != -1) {                     
               data = "Trái cây được chọn : " 
                  + fruitCombo.getItemAt(fruitCombo.getSelectedIndex());             
            }              
            statusLabel.setText(data);
         }
      }); 
      JButton Delete = new JButton("Delete");
      Delete.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) { 
            if (fruitCombo.getSelectedIndex()!= -1) {                     
              fruitsName.removeElementAt(fruitCombo.getSelectedIndex());      
             //fruitCombo.removeItemAt(fruitCombo.getSelectedIndex());     
        //fruitCombo.getSelectedIndex());         
            }              
         }
      }); 
      controlPanel.add(fruitListScrollPane);     
      
      controlPanel.add(showButton);   
      controlPanel.add(Delete);   
      
      mainFrame.setVisible(true);             
   }
    public static void main(String[] args) {
      MyShowComboBox  swingControlDemo = new MyShowComboBox();      
      swingControlDemo.showComboboxDemo();
    }
    
}
