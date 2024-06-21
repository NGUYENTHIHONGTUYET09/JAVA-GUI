
package mydatechoose;
import java.awt.GridLayout;
import javax.swing.JFrame;
import com.toedter.calendar.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MyDateChoose {
    private JFrame fr;
    JTextField txtDate; 
    JDateChooser date; 
    //private JDateChooser date;
    public MyDateChoose(){
        fr= new JFrame("Date choose trong Java");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,400);
        GridLayout fl=new GridLayout(3,1,5,5);
        fr.setLayout(fl);
        
        date=new JDateChooser(); 
        
        date.setFont(new Font("tahoma",Font.PLAIN,20));
        date.setBounds(112,24,269,44);
        
        fr.getContentPane().add(date); 
        date.setDateFormatString("yyyy-MM-dd");
        
        JButton btnGetDate = new JButton("Get Date");
        btnGetDate.setFont(new Font("Tahoma",Font.PLAIN,20));
        
        btnGetDate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
                //txtDate.setText(df.format(date.getDate()));
                String str = df.format(date.getDate());
                Date dt;
                try {
                    dt = df.parse(str);
                    
                    LocalDate d = dt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    
                    int year  = d.getYear();
                    int month=d.getMonthValue();
                    int day=d.getDayOfMonth(); 
                    
                    txtDate.setText("Ngay "+ Integer.toString(day)+" Tháng "+Integer.toString(month)+" Năm "+Integer.toString(year));
                    
                   
                } catch (ParseException ex) {
                    Logger.getLogger(MyDateChoose.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        });
        fr.getContentPane().add(btnGetDate);
        txtDate = new JTextField();
        txtDate.setFont(new Font("Tahoma", Font.PLAIN,20));
        txtDate.setBounds(112,24,269,44);
        
        fr.getContentPane().add(txtDate);
        
        fr.setLocationRelativeTo(null);//Hien thi giua man hinh 
        fr.setVisible(true);
        
    }
 public static void main(String[] args) {
     new MyDateChoose();
    }
    
}
