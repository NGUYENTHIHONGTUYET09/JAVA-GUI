
package mypanel;

import java.awt.GridLayout;
import javax.swing.*;

public class MyPanel {
    public MyPanel(){
    JFrame fr= new JFrame("Demo về panel");  
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.setLayout(new GridLayout(2,1,5,5));
    //fr.setSize(200,200);
    JPanel pn=new JPanel(new GridLayout(1,2,5,5));
    JButton ok=new JButton("OK");
    JButton cancel=new JButton("CANCEL");
    pn.add(ok);  pn.add(cancel);
    JPanel pn1=new JPanel(new GridLayout(2,1,5,5));  
    JTextField username=new JTextField("");  
    JTextField password=new JTextField("");  
    JLabel user=new JLabel("User Name:");
    JLabel pass=new JLabel("Pass word:");  pn1.add(user);
    pn1.add(username);
    pn1.add(pass);  
    pn1.add(password);  
    fr.getContentPane().add(pn1);  
    fr.getContentPane().add(pn);  
    fr.setLocationRelativeTo(null);  
    fr.pack();
    fr.setVisible(true);

    }
    public static void main(String[] args) {
        new MyPanel();
    }
    
}
