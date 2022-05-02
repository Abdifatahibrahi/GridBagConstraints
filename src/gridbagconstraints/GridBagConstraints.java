/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridbagconstraints;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Abdelfatah Ibrahim
 */
public class GridBagConstraints {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
       
        bag1 obj = new bag1();
        
        
        
        
        
    }
   

    
}

class bag1 extends JFrame{
    private bag b;
    public bag1(){
        
        b = new bag();
        
        add(b);
        setLayout(new FlowLayout());
        setVisible(true);        
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class bag extends JPanel{
    private JLabel l1,l2;
    private JTextField f1,f2;
    
    public bag(){
        l1 = new JLabel("Name");
        l2 = new JLabel("Occupation");
        
         f1 = new JTextField(10);
        f2 = new JTextField(10);
        
         GridBagConstraints gb = new GridBagConstraints();
        setLayout(new GridBagLayout());
      
        add(l1);
        add(l2);
        add(f1);
        add(f1);
//        gb.Weightx = 0;
//        gb.weighty = 0;
        
//        gb.gridx = 0;
//        gb.gridy = 0;
        
      
        
        
        
        
        
    }
    
}
