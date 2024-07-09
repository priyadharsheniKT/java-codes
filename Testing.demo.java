import javax.swing.*;
import java.awt.*;
class Testing
{
JFrame f=null;
Testing()
{
f=new JFrame();
JOptionPane.showMessageDialog(f,"Hello java");
f.setVisible(true);
f.setSize(500,500);
}
}
class TestingDemo
{
public static void main(String ar[])
{
Testing t1=new Testing();
}
}