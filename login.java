/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagenemt;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Lenovo
 */
public class login {
    private JFrame frame;
    private JLabel Title, UserName, Password, footertxt;
    private JTextField UserField, PassField;
    private JButton Submit;
    
    public login(){
        frame =new JFrame("ABC School Login");    
        
        LoginGUI();
    
        frame.setSize(1400,800);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void LoginGUI(){
        
        JPanel GUI=new JPanel();
        GUI.setBounds(400,150,300,300);
        frame.add(GUI);
        GUI.setBackground(Color.gray);
        GUI.setSize(500,400);
        
        Title = new JLabel("ABC School Login System");
        Title.setFont(new Font("Arial",Font.PLAIN,28));
        Title.setBounds(100,20,400,100);
        GUI.add(Title);
        
        UserName = new JLabel("Username: ");
        UserName.setFont(new Font("Arial",Font.PLAIN,18));
        UserName.setBounds(50,170,150,30);
        GUI.add(UserName);
        UserField=new JTextField();
        UserField.setBounds(170,170,150,30);
        GUI.add(UserField);
                
        Password = new JLabel("Password: ");
        Password.setFont(new Font("Arial",Font.PLAIN,18));
        Password.setBounds(50,220,150,30);
        GUI.add(Password);
        PassField=new JTextField();
        PassField.setBounds(170,220,150,30);
        GUI.add(PassField);
        
        Submit=new JButton("Submit");
        Submit.setBounds(170,300,100,30);
        GUI.add(Submit);
        
        JPanel footer=new JPanel();
        footer.setBounds(0,650,300,300);
        frame.add(footer);
        footer.setBackground(Color.gray);
        footer.setSize(700,50);
        
        footertxt = new JLabel("Copyright 2020 by BasyalTech");
        footertxt.setFont(new Font("Arial",Font.PLAIN,12)); 
        footer.add(footertxt);
        
        GUI.setLayout(null);
        GUI.setVisible(true);
    }
    public static void main(String[] args) {
        new login();
    }
    
}
