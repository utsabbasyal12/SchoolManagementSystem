/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagenemt;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class Home {
    
    private JFrame frame;
    private JButton Home, StdReg, TeachReg, Program, Exam;
    private JLabel H1, H2, H3, Paragraph, Contact, Email;
    
    
 
   public Home(){
        
       frame = new JFrame("Home Page");
       
       HomeGUI();
       rightBar();
       
       frame.setSize(1400,800);
       frame.setLayout(null);
       frame.setVisible(true);
   }
   
   public void HomeGUI(){
       JPanel sideBar = new JPanel(); 
       frame.add(sideBar);
       sideBar.setBackground(Color.gray);
       sideBar.setSize(200,800);
       
       Home = new JButton("School Details");
       Home.setBounds(20,50,150,50);
       sideBar.add(Home);
       
       StdReg = new JButton("Student Details");
       StdReg.setBounds(20,120,150,50);
       sideBar.add(StdReg);
       
       TeachReg = new JButton("Teacher Details");
       TeachReg.setBounds(20,190,150,50);
       sideBar.add(TeachReg);
       
       Program = new JButton("Programs");
       Program.setBounds(20,260,150,50);
       sideBar.add(Program);
       
       Exam = new JButton("Exam/ Result");
       Exam.setBounds(20,330,150,50);
       sideBar.add(Exam);
       
       JPanel rightBar = new JPanel();
       rightBar.setBackground(Color.gray);
       rightBar.setBounds(220,0,0,0);
       frame.add(rightBar);
       rightBar.setSize(1200,800);
       rightBar.setLayout(null);
       rightBar.setVisible(true);
       
       sideBar.setLayout(null);
       sideBar.setVisible(true);
   }
   public void rightBar(){
       
       
   }
   public void SchoolDetails(){
       
       H1 = new JLabel("Welcome");
       H1.setBounds(40,23,43,54);
       
   }
   public static void main(String[] args) {
        new Home();
    }
    
}