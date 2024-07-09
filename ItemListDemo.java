import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class TestWindow implements ActionListener,ItemListener
{
   
    JFrame f;
    JButton one,two;
    JCheckBox c1,c2;
JList b;
JPanel p;
    TestWindow()
    {
        f=new JFrame("Demo");
        f.setLayout(new FlowLayout());
        one=new JButton();
        two=new JButton("Two");
        c1=new JCheckBox("JAVA",true);
        c2=new JCheckBox("C++");
String week[]={"mon","tues","wed"};
       // ImageIcon i=new ImageIcon("d:\\sample1.png");
        //one.setIcon(i);
        c1.addItemListener(this);
//p=new JPanel();
b=new JList(week);
f.add(b);
        f.add(one);
        f.add(two);
        f.add(c1);
        f.add(c2);
        one.setMnemonic('o');
        two.setMnemonic('t');
        one.addActionListener(this);
        two.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setSize(500,500);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        System.out.println(ie.getItem()+" Checkbox: "+ (ie.getStateChange()==1?"checked":"unchecked"));
    }
    public void actionPerformed(ActionEvent ae)
    {
       
       
        if(ae.getActionCommand().equals("One"))
        {
                System.out.println(one.getText());    
                //two.setText("SASTRA");
                two.setEnabled(false);
        }
        else if(ae.getActionCommand().equals("Two"))
        {
            c2.setSelected(true);
            //System.out.println("Two");
            //System.out.println(c1.isSelected());
            if(c1.isSelected()==true)
            {
                //System.out.println(c1.getText());
            }
            if(c2.isSelected()==true)
            {
                //System.out.println(c2.getText());
            }
            //System.out.println(c2.isSelected());    
        }        
    }        
}
   
class ItemListDemo
{
    public static void main(String ar[])
    {
        TestWindow t=new TestWindow();
    }
}