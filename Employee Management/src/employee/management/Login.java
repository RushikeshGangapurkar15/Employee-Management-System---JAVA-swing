
package employee.management;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
 

public class Login extends JFrame implements ActionListener{
    
    JTextField tfUsername,tfPassword;
    
        Login(){
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);
            
            JLabel lblUsername = new JLabel("Username :");
            lblUsername.setBounds(50,40,100,30);
            lblUsername.setForeground(Color.BLUE);
            add(lblUsername);
            
            tfUsername = new JTextField();
            tfUsername.setBounds(160, 40, 150, 30);
            add(tfUsername);
            
            
            
            JLabel lblPassword = new JLabel("Password :");
            lblPassword.setBounds(50,80,100,30);
            lblPassword.setForeground(Color.BLUE);
            add(lblPassword);
            
            JButton Loginbtn = new JButton("Log In");
             Loginbtn.setBounds(160,140,150,30);
           
           Loginbtn.setBackground(Color.BLUE);
           Loginbtn.setForeground(Color.white);
           Loginbtn.addActionListener(this);
           add(Loginbtn);
            
           tfPassword = new JTextField();
            tfPassword.setBounds(160, 80, 150, 30);
            add(tfPassword);
            
            
           ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/employees.png"));
           Image i2 = image1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
           ImageIcon image3 = new ImageIcon(i2);
           JLabel image = new JLabel(image3);
           image.setBounds(360,20,200,200);
           add(image);
            
            setSize(600,300);
            setLocation(450,200);
            
            
            setVisible(true);
        }
        
         @Override
       public void actionPerformed(ActionEvent ae){
           try{
               String Username = tfUsername.getText();
               String Password = tfPassword.getText();
               Conn c = new Conn();
               String query = "select * from Login WHERE Username = '"+Username+"' and Password = '"+Password+"';";
               
               c.s.executeQuery(query);
               ResultSet rs = c.s.executeQuery(query);
               
               if(rs.next()){
                   setVisible(false);
               }else{
                   JOptionPane.showMessageDialog(null,"Incorrect Username or Password ");
                   setVisible(false);
               }
               
               
           }catch(Exception e){
               e.printStackTrace();
           }
       }

    public static void main(String[] args){
        new Login();
    }
}
