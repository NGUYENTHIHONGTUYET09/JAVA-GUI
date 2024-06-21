/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mytoolbar;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class MyToolBar  implements ActionListener{
    private JFrame fr; 
   protected JTextArea textArea;
    protected String newline = "\n";
    static final private String PREVIOUS = "previous";
    static final private String UP = "up";
    static final private String NEXT = "next";

    public MyToolBar()
    {
        fr= new JFrame("Toolbar");
        fr.setLayout(new BorderLayout());
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400,300);
        JToolBar toolBar = new JToolBar("Still draggable");
        addButtons(toolBar);
        fr.add(toolBar);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
    protected void addButtons(JToolBar toolBar) {
        
        JButton button = null;

        //first button
        button = makeNavigationButton("Back24", PREVIOUS,
                                      "Back to previous something-or-other",
                                      "Previous");
        toolBar.add(button);

        //second button
        button = makeNavigationButton("Up24", UP,
                                      "Up to something-or-other",
                                      "Up");
        toolBar.add(button);

        //third button
        button = makeNavigationButton("Forward24", NEXT,
                                      "Forward to something-or-other",
                                      "Next");
        toolBar.add(button);
    }
protected JButton makeNavigationButton(String imageName,
                                           String actionCommand,
                                           String toolTipText,
                                           String altText) {
        //Look for the image.
        String imgLocation = "images/"
                             + imageName
                             + ".gif";
        URL imageURL = MyToolBar.class.getResource(imgLocation);
       
        //Create and initialize the button.
        JButton button = new JButton();
        button.setActionCommand(actionCommand);
        button.setToolTipText(toolTipText);
        button.addActionListener(this);

        if (imageURL != null) {                      //image found
            button.setIcon(new ImageIcon(imageURL, altText));
        } else {                                     //no image found
            button.setText(altText);
            System.err.println("Resource not found: "
                               + imgLocation);
        }
        return button;
    }

    public static void main(String[] args) {
       new MyToolBar(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          String cmd = e.getActionCommand();
        String description = null;

        // Handle each button.
        if (PREVIOUS.equals(cmd)) { //first button clicked
            description = "Pre Button";
        } else if (UP.equals(cmd)) { // second button clicked
            description = "Up button";
        } else if (NEXT.equals(cmd)) { // third button clicked
            description = "Next button";
        }

        displayResult("press:"
                        + description);
   
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
