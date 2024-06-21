/*
z * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mybutton;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyButton implements ActionListener {
    private JFrame fr;
    private JButton btOk;
    private JLabel lbName; 
    public MyButton()
    {
        fr= new JFrame("Hiển thị thông báo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,400);
      
        GridLayout fl=new GridLayout(2,1,5,5);
        fr.setLayout(fl);
        lbName= new JLabel("Hiển thị thông báo:"); 
       //fr.getContentPane().action(lbName);
        
        fr.add(lbName);
        btOk = new JButton("OK");
        fr.add(btOk);
        
        JTextField txt;
        txt=new JTextField();
        txt.getText();
        fr.add(txt);
        
        //btOk.addActionListener(this);
        btOk.addMouseListener(new MouseAdapter() {
        
	public void mouseClicked(MouseEvent e) {
                    lbName.setText("Button Ok ");
                    
                }
        });
        
        //fr.setBackground(Color.yellow);
        fr.pack();
        fr.setLocationRelativeTo(null);//Hien thi giua man hinh 
        fr.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==btOk)
            lbName.setText("Button Ok ");
    }   
    public static void main(String[] args) 
    {
        new MyButton();
    }

}
