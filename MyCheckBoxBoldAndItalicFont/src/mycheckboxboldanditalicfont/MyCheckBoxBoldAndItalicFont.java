
package mycheckboxboldanditalicfont;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCheckBoxBoldAndItalicFont implements ItemListener 
{
    private JTextField txtFont;
    private JCheckBox chbBold, chbItalic;
    private JFrame fr;
    private Font font; 
    private int fontBold=Font.PLAIN,fontItalic=Font.PLAIN; 
       
    public MyCheckBoxBoldAndItalicFont()
    {
        fr= new JFrame("Hiển thị thông báo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,400);
        GridLayout fl=new GridLayout(2,1,5,5);
        fr.setLayout(fl);
        
        txtFont=new JTextField("Khoa HTTT");
        fr.add(txtFont);
       
        JPanel panel= new JPanel(new GridLayout(1,2,5,5)); 
       
        chbBold = new JCheckBox("Bold");
        panel.add(chbBold);
        
        
        chbItalic = new JCheckBox("Italic");
        panel.add(chbItalic);
        fr.add(panel);
        
        //Event 
        chbBold.addItemListener(this);
        chbItalic.addItemListener(this);
        //fr.pack();
        fr.setLocationRelativeTo(null);//Hien thi giua man hinh 
       
        fr.setVisible(true); 
       
    }
    @Override
    public void itemStateChanged(ItemEvent ie) 
    {
        if(ie.getItem()==chbBold)
        {
            if(ie.getStateChange()==ItemEvent.SELECTED)
                fontBold=Font.BOLD;
            else
                fontBold=Font.PLAIN;
        }
        if(ie.getItem()==chbItalic)
        {
            if(ie.getStateChange()==ItemEvent.SELECTED)
                fontItalic=Font.ITALIC;
            else
                fontItalic=Font.PLAIN;
        }
        
        txtFont.setFont(new Font("Tahoma",fontBold+fontItalic,16));
                
                
    }
    
    public static void main(String[] args) 
    {
        new MyCheckBoxBoldAndItalicFont();
    }

}
