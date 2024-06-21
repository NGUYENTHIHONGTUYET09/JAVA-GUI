
package mytextfield;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyTextField {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public MyTextField(){
       prepareGUI();
    }
    private void prepareGUI(){
      mainFrame = new JFrame("Vi du Java Swing");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    

      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showTextFieldDemo(){
       
      headerLabel.setText("JTextField"); 
      JLabel  namelabel= new JLabel("Username:", JLabel.RIGHT);
      JLabel  passwordLabel = new JLabel("Password: ", JLabel.CENTER);
      final JTextField userText = new JTextField(6);
      final JPasswordField passwordText = new JPasswordField(6);      

      JButton loginButton = new JButton("Login");
      
      loginButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Username " + userText.getText();
            data += ", Password: " 
            + new String(passwordText.getPassword()); 
            statusLabel.setText(data);        
         }
      }); 

      controlPanel.add(namelabel);
      controlPanel.add(userText);
      controlPanel.add(passwordLabel);       
      controlPanel.add(passwordText);
      controlPanel.add(loginButton);
      mainFrame.setVisible(true);  
   }
    public static void main(String[] args) {
      MyTextField  textField = new MyTextField();      
      textField.showTextFieldDemo();
    }
    
}
