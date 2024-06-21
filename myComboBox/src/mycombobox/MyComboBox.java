/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mycombobox;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author xuanhungmai
 */
public class MyComboBox{
  private JFrame fr;
  private JComboBox combb;
  private JTextField txtMonHoc; 
  
  private String MonHoc[]={"CTDL","CSDL","Web","Java"};  
  
  public MyComboBox()
  {
        fr= new JFrame("Hiển thị thông báo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,200);
        fr.setLayout(new GridLayout(2,1,5,5));
        
        txtMonHoc=new JTextField();
        fr.add(txtMonHoc);
        
        combb= new JComboBox(MonHoc);
        combb.addItem("Mạng Máy Tính");
        
        
        //số mục được hiển thị 
        combb.setMaximumRowCount(3);
        
        fr.add(combb);
        //Bắt bộ lắng nghe trực tiếp, không qua lớp "implements  ActionListener,ItemListener" 
        combb.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if(ie.getStateChange()==ItemEvent.SELECTED)
                {
                    /*int index=combb.getSelectedIndex();//lấy vị trí mục chọn 
                    txtMonHoc.setText(combb.getItemAt(index).toString());//lấy nội dung mục được chọn 
                    */
                    txtMonHoc.setText(combb.getSelectedItem().toString());
                }
            }
        }); 
        
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new MyComboBox();
    }
}
