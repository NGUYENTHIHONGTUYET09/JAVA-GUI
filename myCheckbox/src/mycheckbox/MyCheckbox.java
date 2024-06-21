/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mycheckbox;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyCheckbox implements  ActionListener,ItemListener {
    private JFrame fr;
    private JCheckBox chbGioiTinh;
    private JLabel lbName;
    private JButton btOk;
    private JRadioButton radioTienSy;
    private JRadioButton radioThacSy;
    private JRadioButton radioKySu;
    private JTextField txtName;
    private int trangthai;
    private int bangcap;
    
    public MyCheckbox()
    {
    
        fr= new JFrame("Hiển thị thông báo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,400);
      
        GridLayout fl=new GridLayout(7,1,5,5);
        fr.setLayout(fl);
        
        lbName= new JLabel("Hiển thị thông báo:"); 
        fr.add(lbName);
        
        txtName=new JTextField();
        fr.add(txtName);
        
        chbGioiTinh = new JCheckBox("Giới tính ");
        chbGioiTinh.setSelected(true);
        fr.add(chbGioiTinh);
        
        
        radioTienSy=new JRadioButton("Tien sỹ");
        radioTienSy.setSelected(true);
        radioThacSy=new JRadioButton("Thạc sỹ");
        radioKySu =new JRadioButton("Kỹ sư");
        
        ButtonGroup btGroup = new ButtonGroup();
        btGroup.add(radioTienSy);
        btGroup.add(radioThacSy);
        btGroup.add(radioKySu);
        
       fr.add(radioTienSy);
       fr.add(radioThacSy);
       fr.add(radioKySu); 
          
        btOk=new JButton("OK");
        fr.add(btOk);
       
        btOk.addActionListener(this);
        
        chbGioiTinh.addItemListener(this);
        
        radioTienSy.addItemListener(this);
        radioThacSy.addItemListener(this);
        radioKySu.addItemListener(this);
        
        
        //fr.setBackground(Color.yellow);
        //fr.pack();
        fr.setLocationRelativeTo(null);//Hien thi giua man hinh 
        fr.setVisible(true);
     
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btOk)
        {
            
           if(trangthai==1)
               txtName.setText("CheckBox gioi tinh duoc chọn");
           else
               txtName.setText("CheckBox gioi tinh khong duoc chọn");
           
            if(bangcap==1)
                lbName.setText("Tien sỹ");
            if(bangcap==2)
                lbName.setText("Thạc sỹ");
            if(bangcap==3)
                lbName.setText("Ky sư");
            
            //String  strName= txtName.getText();
            
           //lbName.setText(strName);
           // txtName.setText("");
            txtName.requestFocusInWindow();
            //txtName.setFocusCycleRoot(true);
        }
    }
     @Override
    public void itemStateChanged(ItemEvent ie)
    {
        Object oj=ie.getItem();
        
        if(oj== chbGioiTinh) 
            trangthai=ie.getStateChange(); 
        
        if(oj==radioTienSy)
            if(ie.getStateChange()==1)//lấy trạng thái của radio
                bangcap=1;
                
        if(oj==radioThacSy)
            if(ie.getStateChange()==1)
                bangcap=2;
                
        if(oj== radioKySu)
            if(ie.getStateChange()==1)
                bangcap=3;
        // lbName.setText("CheckBox gioi tinh duoc chọn");

    }
  public static void main(String[] args) {
      new MyCheckbox(); 
    }

   
}
