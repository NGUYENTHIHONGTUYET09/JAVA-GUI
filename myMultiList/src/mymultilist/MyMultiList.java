/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mymultilist;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyMultiList implements ActionListener{

   private JFrame fr;
    private Container container; 
     private JList listMonhoc;
     private JList listMonhoc1;
     private JButton btNext; 
     
     private String MonHoc[]={"Toán","Lý","Hóa","Anh văn", "Sử","Địa","Lịch sử"};  
     public MyMultiList()
     {
        fr= new JFrame("Hiển thị thông báo");
        container= new Container();
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,200);
        
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        listMonhoc= new JList(MonHoc);
        container.add(listMonhoc);
        
        listMonhoc.setVisibleRowCount(5);
        listMonhoc.setFixedCellHeight(15);
        
        listMonhoc.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        container.add(new JScrollPane(listMonhoc));
    
        btNext=new JButton("Next");
        btNext.addActionListener(this);
        container.add(btNext);
        
        listMonhoc1= new JList();
        listMonhoc1.setVisibleRowCount(5);
        listMonhoc1.setFixedCellHeight(15);
        listMonhoc1.setFixedCellWidth(100);
        listMonhoc1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        container.add(listMonhoc1);
        container.add(new JScrollPane(listMonhoc1));
        
    /*
        listMonhoc.addListSelectionListener(new ListSelectionListener() {
        @Override
            public void valueChanged(ListSelectionEvent e) {
               // JOptionPane.showInputDialog(listMonhoc.getSelectedValue());
                
                
            }
        });*/
        
        fr.add(container); 
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
     }
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btNext)
        {
            //JOptionPane.showInputDialog("test");
            Object a[]=listMonhoc.getSelectedValues();
            if(a.length>0)
                listMonhoc1.setListData(a);             
            else
                JOptionPane.showInputDialog("Bạn chưa chọn mục nào hết");
                
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public static void main(String[] args) {
        new MyMultiList(); 
    }

}
