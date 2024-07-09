import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import invalidex.InvalidEmplno;
class EmployeeDetails implements ActionListener
 {
 JFrame f=null;
 JTextField tf1,tf2,tf3;
 Label l1,l2,l3;
 JTextArea ta;
JButton b=null;
 EmployeeDetails()
  {
   f=new JFrame();
   tf1=new JTextField(20);
   tf2=new JTextField(20);
   tf3=new JTextField(20);
   l1=new Label("Enter empl name:");
   l2=new Label("Enter empl no:");
   l3=new Label("Enter empl basic pay:");
   ta=new JTextArea();
   b=new JButton("OK");
   f.setLayout(null);
   f.add(l1);
   f.add(tf1);
   f.add(l2);
   f.add(tf2);
   f.add(l3);
   f.add(tf3);
   f.add(b);
   f.add(ta);
   l1.setBounds(100,100,150,70);
   l2.setBounds(100,250,150,70);
   l3.setBounds(100,400,150,70);
   tf1.setBounds(300,100,150,70);
   tf2.setBounds(300,250,150,70);
   tf3.setBounds(300,400,150,70);
   ta.setBounds(200,700,150,100);
   b.setBounds(200,500,100,50);
   b.addActionListener(this);
   f.setVisible(true);
   f.setSize(700,700);
  }
public void actionPerformed(ActionEvent ae)
 {
  if(ae.getSource()==b)
  {
  try
 {
 if(Integer.parseInt(tf2.getText())<=0)
 {
 InvalidEmplno ie=new InvalidEmplno("Invalid empl no");
 throw ie;
 }
 }
 catch(InvalidEmplno ie)
 {
 ta.setText(ie.getMessage());
 }
  }
 }
 }
class EmployeeDetailsDemo
 {
  public static void main(String ar[])
  {
   EmployeeDetails e=new EmployeeDetails();
  }
 }