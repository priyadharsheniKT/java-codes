import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class TestWindows4 implements ActionListener
{
JFrame f=null;
Font ft;
JMenuBar mb;
JMenu file,edit,view;
JMenuItem open,save,ne,exit;
JTextArea ta;
JFileChooser fc;
FlowLayout f1;
TestWindows4()
{
f=new JFrame("Menu");
mb=new JMenuBar();
file=new JMenu("File");
edit=new JMenu("Edit");
view=new JMenu("View");
f.setJMenuBar(mb);
mb.add(file);
mb.add(edit);
mb.add(view);
ne=new JMenuItem("New");
open=new JMenuItem("Open");
save=new JMenuItem("Save");
exit=new JMenuItem("Exit");
file.add(ne);
file.addSeparator();
file.add(open);
file.addSeparator();
file.add(save);
file.addSeparator();
file.add(exit);
ne.setMnemonic('N');
open.setMnemonic('O');
save.setMnemonic('S');
exit.setMnemonic('E');
fc=new JFileChooser();
ta=new JTextArea();
f1=new FlowLayout();
f.setLayout(f1);
f.add(ta);
open.addActionListener(this);
f.setSize(500,500);
f.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==open)
{
try
{
fc.showOpenDialog(f);
File fn=fc.getSelectedFile();
FileInputStream fin=new FileInputStream(fn);
int y;
while((y=fin.read())!=-1)
ta.setText(ta.getText()+(char)y);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
}
class MenuBarDemo
{
public static void main(String ar[])
{
TestWindows4 t=new TestWindows4();
}
}