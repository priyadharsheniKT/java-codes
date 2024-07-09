import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Method;
import java.util.*;
class ListenerEx extends WindowAdapter implements WindowListener,ItemListener
{
JFrame f=null;
JButton b=null;
JTextArea ta;
FlowLayout f1;
Font ft;
Random r;
JCheckBox c1,c2,c3;
JRadioButton r1,r2;
ButtonGroup bg;
ListenerEx()
{
f=new JFrame();
b=new JButton("Hi");
ta=new JTextArea();
r=new Random();
//f1=new FlowLayout();
ft=new Font("Arial Nova",Font.BOLD,15);
c1=new JCheckBox("CSE");
c2=new JCheckBox("EEE");
c3=new JCheckBox("ECE");
r1=new JRadioButton("Male");
r2=new JRadioButton("Female");
bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);
ta.setFont(ft);
f.setLayout(null);
f.add(b);
f.add(ta);
f.add(c1);
f.add(c2);
f.add(c3);
f.add(r1);
f.add(r2);
r1.addItemListener(this);
r2.addItemListener(this);
f.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
c1.setBounds(100,100,70,70);
c2.setBounds(100,200,70,70);
c3.setBounds(100,300,70,70);
//b.setBounds(100,100,70,70);
//ta.setBounds(100,200,200,200);
f.setVisible(true);
f.setSize(500,500);
Class c=java.awt.event.ItemEvent.class;
Method[] m=c.getMethods();
for(int i=0;i<m.length;i++)
System.out.println(m[i]);
}
public void itemStateChanged(ItemEvent ie)
{
if(ie.getSource()==r1)
{
if(ie.getStateChange()==1)
System.out.println("Male selected");
}
else
System.out.println("Female selected");
}
}
class ListenerDemo
{
public static void main(String ar[])
	{
		ListenerEx l=new ListenerEx();
	}
}