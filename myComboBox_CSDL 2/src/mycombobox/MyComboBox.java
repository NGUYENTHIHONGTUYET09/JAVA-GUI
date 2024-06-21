/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mycombobox;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author xuanhungmai
 */
public class MyComboBox {
  private JFrame fr;
  private JComboBox combb;
  private JButton btnLietKe;
 // private JTextField txtMonHoc; 
  //private String MonHoc[]={"CTDL","CSDL","Web","Java"};  
  private String CaSi[];//={"CTDL","CSDL","Web","Java"};  
  private Connection conn; 
  String driver = "com.mysql.jdbc.Driver";
        
  public MyComboBox()
  {
      /*Truy xuat CSDL*/
      try {
            Class.forName(driver).newInstance();
            //conn = DriverManager.getConnection(url+dbName+strUnicode,userName,password);
           
            //Kết nối với Font chữ Unicode
            String urlUnicode = "jdbc:mysql://localhost:3306/quanlycasi1?user=root&password=&useUnicode=true&characterEncoding=utf8";
            conn = DriverManager.getConnection(urlUnicode); 
            //-----
            System.out.println("Connected to the database");
           
            String SQL = "SELECT * FROM casi";         
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(SQL);
            rs.last();
            int count;
            count = rs.getRow();
            CaSi = new String[count];
            rs.first(); 
            int i=0; 
            while (rs.next()) 
            {
                //String ten=String.valueOf(rs.getString(1));
                String maso =rs.getString("MACS");//lấy mã ca sỉ 
                //ten = "test";
                CaSi[i] = maso; 
                //System.out.println(ten);
                //count++;
                i++;     
            }
           // System.out.println("Số dòng đọc được "+count+" rows selected");
            //conn.close();
            //System.out.println("Disconnected from database");
            rs.close();
            stat.close();
           // conn.close();
        }catch(SQLException se)
        {
               se.printStackTrace();
        }catch(Exception e){
                // Xu ly cac loi cho Class.forName
                e.printStackTrace();
        }finally{
                // Khoi finally duoc su dung de dong cac resource
                       /* try{
                               // if(conn!=null)
                                 //   conn.close();
                                 
                            }catch(SQLException se){
                                    se.printStackTrace();
                            }*/
               }// Ket thuc khoi finally
    
        fr= new JFrame("Hiển thị thông báo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,200);
        fr.setLayout(new GridLayout(3,1,5,5));
        
        //txtMonHoc=new JTextField();
        //fr.add(txtMonHoc);
        combb= new JComboBox(CaSi);
        combb.setMaximumRowCount(3);
        fr.add(combb);
        btnLietKe = new JButton("Liệt kê");
        fr.add(btnLietKe);
        btnLietKe.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              String ma;
              ma = combb.getSelectedItem().toString();//lấy nội dung mục được chọn
              int macs;
              macs = Integer.parseInt(ma);
              String SQL2="SELECT * FROM album where MACS=?";
              PreparedStatement stat2;
              try {
                  stat2 = conn.prepareStatement(SQL2);
                  stat2.setInt(1, macs);
                  ResultSet rs2=stat2.executeQuery();
                  while (rs2.next()) 
                 {
                        String ten1=String.valueOf(rs2.getString(2));
                        //System.out.print(ten);
                        JOptionPane.showInputDialog(ten1);
            
                 }
              } catch (SQLException ex) {
                  Logger.getLogger(MyComboBox.class.getName()).log(Level.SEVERE, null, ex);
              }
                    
              
          }
        
        });
        //đoạn dưới đây không dùng
        combb.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if(ie.getStateChange()==ItemEvent.SELECTED)
                {
                    int index=combb.getSelectedIndex();
                   
                   // txtMonHoc.setText(combb.getItemAt(index).toString());
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
