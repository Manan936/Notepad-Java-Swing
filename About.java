/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;
import javax.swing.*;  
import java.awt.event.*; 

public class About extends JFrame implements ActionListener{ 
    About(){ 
        setBounds(160,200,500,250);
        setLayout(null);
        JLabel l1 = new JLabel("<html> Notepad is a basic editor to create text files <br>Manan Upadhyay <br> version 2021 <br>ALL RIGHTS RESERVERD</html>");
        l1.setBounds(15,18,600,150);
        add(l1);  
        JButton b1 = new JButton("ok"); 
        b1.setBounds(250,150,50,25);
        b1.addActionListener(this);
        add(b1);  
        

    } 
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false); 
    }
    public static void main(String[] args){ 
        new About().setVisible(true); 
        
    }
}
