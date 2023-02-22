
package employee.management; //Adress of my class

import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
  
       Splash(){
           
           getContentPane().setBackground(Color.WHITE);
           setLayout(null);
           
           JLabel heading = new JLabel("Employee Management");
           heading.setBounds(170,70,1200,110);
           heading.setFont(new Font("Serif",Font.BOLD,70));
           heading.setForeground(Color.black);
           add(heading);
           
           ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/2.jpg"));
           Image i2 = image1.getImage().getScaledInstance(1200,1000,Image.SCALE_DEFAULT);
           ImageIcon image3 = new ImageIcon(i2);
           JLabel image = new JLabel(image3);
           image.setBounds(50,50,1050,500);
           add(image);
           
           
           JButton ClickHere = new JButton("Click Here To Continue");
           ClickHere.setBounds(400,400,300,70);
           
           ClickHere.setBackground(Color.BLACK);
           ClickHere.setForeground(Color.white);
//           ClickHere.setSize(100, 100);
            ClickHere.addActionListener(this);
           image.add(ClickHere);
           
           
           setSize(1170 , 650);
           setLocation(200, 150);
           setVisible(true);
           
           
    
        }
       
       
       @Override
       public void actionPerformed(ActionEvent ae){
           setVisible(false);
           new Login();
       }
    
    
    public static void main(String args[]){
        new Splash();
    }
    
}
