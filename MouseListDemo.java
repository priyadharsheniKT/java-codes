import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TestWindows5 implements MouseListener
{
JFrame f=null;

TestWindows5()
{
f=new JFrame("Mouse listener");
f.addMouseListener(this);
f.setSize(500,500);
f.setVisible(true);
}
public void mousePressed(MouseEvent me)
{
System.out.println("pressed");
}
public void mouseReleased(MouseEvent me)
{
System.out.println("released");
}
public void mouseClicked(MouseEvent me)
{
System.out.println("clicked");
}
public void mouseEntered(MouseEvent me)
{
System.out.println("entered");
}
public void mouseExited(MouseEvent me)
{
System.out.println("exited");
}
}
class MouseListDemo
{
public static void main(String ar[])
{
TestWindows5 t=new TestWindows5();
}
}