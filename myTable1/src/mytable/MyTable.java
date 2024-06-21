
package mytable;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MyTable {
    private JFrame f;  
    private DefaultTableModel defaultTable;
    
    private JTextField id;
    private JTextField name;
    private JTextField gia;
    
    private JPanel p1;
    private JPanel p2; 
    private JPanel p3; 
    
    private JButton btnDelete; 
    private JButton btnDuyetBang; 
    private JButton btnThem; 
    
    public MyTable(){  
        f = new JFrame();  
        f.setLayout(new GridLayout(5,1,5,5));
        f.setLocationRelativeTo(null);
        
        String data[][]={ {"1","101","iphoe5","670000"},  
                  {"2","102","iphone5s","780000"},  
                              {"3","103","iphone6s","700000"}};  
        
        String column[]={"STT","Mã Số","Tên sp","giá"};  
        
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(3,2,5,5));
        
        p1.add(new JLabel("Mã sản phẩm"));
        id = new JTextField();
        id.setColumns(10);
        p1.add(id);
        
        p1.add(new JLabel("Tên sản phẩm"));
        name = new JTextField();
        name.setColumns(10);
        p1.add(name);
        
        p1.add(new JLabel("Giá"));
        gia = new JTextField();
        gia.setColumns(10);
        p1.add(gia);
        f.add(p1);
        
        
        //String insert[]={"104","Hùng","1000000"};
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        defaultTable = new DefaultTableModel(data,column){
            @Override
            public boolean isCellEditable(int rows, int cols) {
                if(cols<2)
                    return false; //To change body of generated methods, choose Tools | Templates.
                else 
                    return true; 
            }
        };
        JTable jt=new JTable(defaultTable);
        
        jt.setSize(600,300);
        //jt.setBounds(30,40,00,200);  
        jt.setPreferredScrollableViewportSize(new Dimension(500, 70));
        jt.setFillsViewportHeight(true);
        //jt.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JScrollPane sp=new JScrollPane(jt);  
        
        jt.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                   //JOptionPane.showInputDialog("thong bao");
                int row = jt.rowAtPoint(e.getPoint());
                int col = jt.columnAtPoint(e.getPoint()); 
                int numcols = defaultTable.getColumnCount();
               // String a=""; 
                for(int i=1;i<numcols;i++) 
                {
                   String str  = (String)defaultTable.getValueAt(row, i);
                   if(i==1)
                       id.setText(str);
                   if(i==2)
                       name.setText(str);
                   if(i==3)
                       gia.setText(str);
                    //a+=str;
                   
                }
                //JOptionPane.showInputDialog(a);
         //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
         
        });
        f.add(sp);
        
        btnDelete = new JButton("Delete");
        
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row;
                String str;
                
                row=jt.getSelectedRow();//lấy dòng duoc chọn
                //str=Integer.toString(row);
                defaultTable.removeRow(row);
            }
        });
        btnDuyetBang = new JButton("Duyệt Bảng");
        btnDuyetBang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numrows=defaultTable.getRowCount();
                int numcols = defaultTable.getColumnCount();
                String str="";
                int i,j;
                for(i=0;i<numrows;i++)
                    for(j=1;j<numcols;j++) //cột đầu tiên là số thứ tự rồi
                    {
                        str  += (String)defaultTable.getValueAt(i, j);
                        
                    }
                    //str=Integer.toString(row);
                    JOptionPane.showInputDialog(str);
                
            }
        });
        f.add(btnDuyetBang);
           
        btnThem = new JButton("Thêm");
        btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //cách 1 
                /*Object[] newSp= new Object[4];
                newSp[0]="4";
                newSp[1]="1004";
                newSp[2]="Iphone X";
                newSp[3]="19000";
                defaultTable.addRow(newSp);
                */
                //cach 2
                //defaultTable.addRow(new Object[] {'4',"004","Ky thuật máy tính", "8"});
                
                //Cách 3 
                Vector v = new Vector(); 
                v.add(1); 
                v.add("1005"); 
                v.add("Iphone XS"); 
                v.add("20000"); 
                defaultTable.addRow(v);
                
                //JOptionPane.showInputDialog("test");
            }
        });
        
        f.add(btnThem);
        f.add(btnDelete);
        f.setSize(400,400);  
        f.setVisible(true);  
    }
    public static void main(String[] args) {
          new MyTable();
    }
    
}
