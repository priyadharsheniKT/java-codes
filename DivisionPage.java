import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.Exception.*;
class InvalidIntegerException extends Exception
{
InvalidIntegerException(String msg)
{
super(msg);
}
}
class Test  implements ActionListener
{
JFrame f=null;
JButton b=null;
JTextField tf1,tf2,tf3;
Label l1,l2,l3;
JTextArea ta;
Test()
{
f=new JFrame();
tf1=new JTextField(10);
tf2=new JTextField(10);
tf3=new JTextField(10);
l1=new Label("Num1");
l2=new Label("Num2");
l3=new Label("Result");
b=new JButton("Divide");
ta=new JTextArea();
f.setLayout(null);
f.add(l1);
l1.setBounds(100,100,70,50);
f.add(tf1);
tf1.setBounds(250,100,100,70);
f.add(l2);
l2.setBounds(100,300,70,50);
f.add(tf2);
tf2.setBounds(250,300,100,70);
f.add(l3);
l3.setBounds(100,500,70,50);
f.add(tf3);
tf3.setBounds(250,500,200,100);
f.add(ta);
ta.setBounds(700,300,300,100);
f.add(b);
b.addActionListener(this);
b.setBounds(100,50,100,40);
f.setSize(700,700);
f.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b)
{
try
{
int x,y;
x=Integer.parseInt(tf1.getText());
y=Integer.parseInt(tf2.getText());
if(Integer.parseInt(tf2.getText())==0)
{
ta.setText("Denominator should not be 0");
}
int q=x/y;
int r=x%y;
tf3.setText("Quotient="+String.valueOf(q)+" "+"Remainder="+String.valueOf(r));
ta.setText(" ");
}
catch(NumberFormatException e)
{
ta.setText("Invalid integer");
}
}
}
}
class DivisionPage
{
public static void main(String ar[])
{
Test t=new Test();
}
}
