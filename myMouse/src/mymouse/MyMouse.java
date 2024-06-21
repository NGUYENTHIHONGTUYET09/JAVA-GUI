/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mymouse;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyMouse implements MouseListener, MouseMotionListener{
    private JLabel jlabel;
    private JFrame fr; 
    public MyMouse()
    {
        fr= new JFrame("Mouse demo"); 
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabel = new JLabel("Hiển thị thông báo");
        
        
        fr.getContentPane().add(jlabel,BorderLayout.SOUTH);
        
        fr.addMouseListener(this);
        fr.addMouseMotionListener(this);
        
        fr.setBounds(50,50,400,300);
        fr.setVisible(true);
        
    }
   
    public static void main(String[] args)
   {
       new MyMouse();
    }

   @Override
    public void mouseClicked(MouseEvent event) 
    {
        jlabel.setText("Nhấn tại vị trí: x="+event.getX()+":y="+event.getY());
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void mousePressed(MouseEvent me) 
    {
        jlabel.setText("Press mouse");
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent me) 
    {
        jlabel.setText("Released at["+me.getX()+","+me.getY()+"]");
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent me) 
    {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseDragged(MouseEvent me) 
    {
        jlabel.setText("Dragged at["+me.getX()+"]["+me.getY()+"]");
        
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }
    
@Override
    public void mouseMoved(MouseEvent me) 
    {
        jlabel.setText("Moved at ["+me.getX()+","+me.getY()+"]");
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    
    }
}