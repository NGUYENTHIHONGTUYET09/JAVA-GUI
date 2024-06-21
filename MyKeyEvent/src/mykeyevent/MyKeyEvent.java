package mykeyevent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JTextField;
public class MyKeyEvent{
   private JFrame fr; 
   private String str;  
   private JTextField text; 
   private JTextArea textArea;
   private JButton btok;
    public MyKeyEvent()
    {
        fr= new JFrame("Key Event");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400,300);
        fr.setLayout(new GridLayout(2,1,5,5));

        text=new JTextField();
        fr.getContentPane().add(text);  
       
        textArea = new JTextArea(10,5);
        textArea.setText("Hiển thị ký tự được nhấn"); 
        textArea.setEnabled(false);
        
        text.addKeyListener(new KeyListener(){
                @Override 
               public void keyPressed(KeyEvent e){
                    if(e.getKeyCode() == KeyEvent.VK_ENTER){
                        str="Ký tự lấy được:"+text.getText();
                        textArea.setText(str);
                    }       
                }
                
                @Override
                public void keyTyped(KeyEvent e) {
                /*        if(e.getKeyCode() == KeyEvent.VK_ENTER){

                            str="Ký tự lấy được là:"+text.getText();
                            textArea.setText(str);
                        }
                    */ 
                   // throw new UnsupportedOperationException("Not supported yet.");
                }

                @Override
                public void keyReleased(KeyEvent e) {
                      /* if(e.getKeyCode() == KeyEvent.VK_ENTER){

                            str="Ký tự lấy được:"+text.getText();
                            textArea.setText(str);
                        }  */     
                   //  throw new UnsupportedOperationException("Not supported yet.");
                } 
            }
        );

        fr.getContentPane().add(textArea);  
       
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
       
    }
    public static void main(String[] args) {
       new MyKeyEvent();

    }
}