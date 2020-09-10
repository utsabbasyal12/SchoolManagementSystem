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
    
 
   public Home(){
        
       frame = new JFrame("Home Page");
       
       HomeGUI();
       
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
       
       sideBar.setLayout(null);
       sideBar.setVisible(true);
   }
   public static void main(String[] args) {
        new Home();
    }
    
}