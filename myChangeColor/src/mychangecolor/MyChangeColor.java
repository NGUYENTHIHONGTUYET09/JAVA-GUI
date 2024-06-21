/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mychangecolor;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class MyChangeColor implements ActionListener {
    private JButton Red;
    private JButton Blue;
    private JFrame JF; 
    public MyChangeColor()
    {
        JF = new JFrame("Thay đổi màu nền");  
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // JF.setBackground(Color.RED);        
        
        JF.setSize(300,200);
        
        FlowLayout JGL= new FlowLayout(FlowLayout.CENTER);
        JF.setLayout(JGL);
        
        Red=new JButton("Red");
        Blue=new JButton("Blue");
        Red.setMnemonic('a');
        JF.add(Red);
        JF.add(Blue);
        
        Red.addActionListener(this);
        Blue.addActionListener(this);
  
        JF.setLocationRelativeTo(null);
        
        JF.setVisible(true);
        //JF.getContentPane().setBackground(Color.red); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== Red)
             JF.getContentPane().setBackground(Color.red);
            //JOptionPane.showMessageDialog(null, "Red duoc nhan");
        else
            //JOptionPane.showMessageDialog(null, "nut xanh duoc ");
             JF.getContentPane().setBackground(Color.BLUE);
    
    }  
    public static void main(String[] args) {
    		new MyChangeColor(); 
    }
    
}
