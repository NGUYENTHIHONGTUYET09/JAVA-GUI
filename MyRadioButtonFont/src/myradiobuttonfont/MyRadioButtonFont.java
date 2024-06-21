/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myradiobuttonfont;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author xuanhungmai
 */
public class MyRadioButtonFont implements ItemListener{
    
  private JTextField txtFont;
    private JRadioButton radioPlain, radioBold, radioItalic, radioBoldItalic;
    private JFrame fr;
    public MyRadioButtonFont()
    {
    
        fr= new JFrame("Hiển thị thông báo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(450,300);
        GridLayout fl=new GridLayout(2,1,5,5);
        fr.setLayout(fl);
        
        txtFont=new JTextField("Trường Đại Học Công Nghệ Thông Tin");
        fr.add(txtFont);
       
        JPanel panel= new JPanel(new GridLayout(1,4,5,5)); 
       
        radioPlain = new JRadioButton("Plain");
        panel.add(radioPlain);
        
        
        radioBold = new JRadioButton("Bold");
        panel.add(radioBold);
        
        radioItalic= new JRadioButton("Italic");
        panel.add(radioItalic);
        
        
        radioBoldItalic = new JRadioButton("Bold/Italic");
        panel.add(radioBoldItalic);
       
        fr.add(panel);
        ButtonGroup btGroup= new ButtonGroup();
        btGroup.add(radioPlain);
        btGroup.add(radioBold);
        btGroup.add(radioItalic);
        btGroup.add(radioBoldItalic);
        
       
        radioPlain.setSelected(true);
        
        //Event  
        radioPlain.addItemListener(this);
        radioBold.addItemListener(this);
        radioItalic.addItemListener(this);
        radioBoldItalic.addItemListener(this);
       
        
        //fr.pack();
        fr.setLocationRelativeTo(null);//Hien thi giua man hinh 
       
        fr.setVisible(true); 
     
    }
    @Override
    public void itemStateChanged(ItemEvent ie) 
    {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
  public static void main(String[] args) 
  {
       new MyRadioButtonFont(); 
  }
}
