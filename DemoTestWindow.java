import java.awt.*; 
import java.awt.event.*;
class TestWindow implements ActionListener
{
Frame f=null;
Button b1=null,b2=null;
FlowLayout fl=null;
TextField tf;
TestWindow()
{
f=new Frame();
b1=new Button("OK");
b2=new Button("Cancel");
fl=new FlowLayout();
tf=new TextField(20);
f.add(tf);
f.add(b1);
f.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
f.setLayout(fl);
f.setTitle("GUI");
f.setSize(500,500);
f.setVisible(true);
}
  public void actionPerformed(ActionEvent ae)
    {
        System.out.println(ae.getSource());
    }
}
class DemoTestWindow
{
    public static void main(String ar[])
    {
        TestWindow t=new TestWindow();
    }
}
