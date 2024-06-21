/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydefaultlistmodel;
import javax.swing.*;  
public class MyDefaultListModel {

    public MyDefaultListModel(){
        JFrame f= new JFrame();  
        DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("Xoài");  
          l1.addElement("Ổi");  
          l1.addElement("Mía");  
          l1.addElement("Mít");  
          JList<String> list = new JList<>(l1);  
          list.setBounds(100,100, 75,75);  
          f.add(list);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true);  
    }
    public static void main(String[] args) {
        new MyDefaultListModel();
    }
    
}
