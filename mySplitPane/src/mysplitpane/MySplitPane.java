/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mysplitpane;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ListSelectionModel;

public class MySplitPane {
    private JFrame fr;
    public MySplitPane()
    {
        fr= new JFrame("SplitPane");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // fr.setSize(300,200);
        JSplitPane splitpane;
        String str[]={"Áo sơ mi","Áo thun", "Quần tây","Quần jean","Dép","Giày"};
        String str1[]={"mì","phở","cháo","chè"}; 
        
        JList list=new JList(str);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        list.setSelectedIndex(0);
        JScrollPane listScrollPane = new JScrollPane(list);
        
        JList list1=new JList(str1);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        list1.setSelectedIndex(0);
        JScrollPane listScrollPane1 = new JScrollPane(list1);
        
        
        splitpane= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, listScrollPane1,listScrollPane);
        
        splitpane.setOneTouchExpandable(true);
        splitpane.setDividerLocation(150);
       
        Dimension minimumsize= new Dimension(100,50);
        listScrollPane.setMinimumSize(minimumsize);
        listScrollPane1.setMinimumSize(minimumsize);
        
        splitpane.setPreferredSize(new Dimension(400,200));
        fr.getContentPane().add(splitpane) ; 
        fr.pack();
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        //splitpane= new JSplitPane();
       
    }
    public static void main(String[] args) 
    {
        new MySplitPane();
    }
}
