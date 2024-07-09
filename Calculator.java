import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TestWindow3 implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JFrame f;
    TextField tf;
    String x="",y="",opr="";
    TestWindow3()
    {
        f=new JFrame("Calculator");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("+");
        b6=new JButton("-");
        b7=new JButton("=");
        b8=new JButton("+/-");
        tf=new TextField(25);
        FlowLayout fl=new FlowLayout();
        f.setLayout(fl);
        f.add(tf);
        f.add(b1);    
        f.add(b2);
        f.add(b3);    
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        f.setSize(400,400);
        f.setVisible(true);
       
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("1"))
        {
            x=tf.getText();
            tf.setText(x+"1");
        }
        else if(ae.getActionCommand().equals("2"))
        {
            x=tf.getText();
            tf.setText(x+"2");
        }
        else if(ae.getActionCommand().equals("3"))
        {
            x=tf.getText();
            tf.setText(x+"3");
        }
        else if(ae.getActionCommand().equals("4"))
        {
            x=tf.getText();
            tf.setText(x+"4");
        }
        else if(ae.getActionCommand().equals("+"))
        {
            y=tf.getText();
            tf.setText("");
            opr="+";
        }
        else if(ae.getActionCommand().equals("-"))
        {
            y=tf.getText();
            tf.setText("");
            opr="-";
        }
        else if(ae.getActionCommand().equals("="))
        {
            if(opr.equals("+"))
            {
                int z=Integer.parseInt(y)+Integer.parseInt(tf.getText());
                tf.setText(String.valueOf(z));
            }
            else if(opr.equals("-"))
            {
                int z=Integer.parseInt(y)-Integer.parseInt(tf.getText());
                tf.setText(String.valueOf(z));
            }
        }
        else if(ae.getActionCommand().equals("+/-"))
        {
            int y1=Integer.parseInt(tf.getText());
            tf.setText(String.valueOf(y1*-1));
        }
    }
       
}

class Calculator
{
    public static void main(String ar[])
    {
        TestWindow3 t=new TestWindow3();
    }
}