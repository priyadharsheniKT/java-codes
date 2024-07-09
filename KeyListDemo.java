import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TestWindow implements KeyListener
{
   
    JFrame f;
    JButton b1,b2;    
    JTextField tf;
    JTextArea ta;
    TestWindow()
    {
        f=new JFrame("Demo");
        b1=new JButton("One");
        b2=new JButton("Two");
        tf=new JTextField("Welcome");
        ta=new JTextArea(200,200);
        //FlowLayout fl=new FlowLayout();
        f.setLayout(null);
        b1.setBounds(30,50,100,40);
        b2.setBounds(140,50,100,40);
        tf.setBounds(30,10,220,40);
        ta.setBounds(30,100,300,300);
        ta.addKeyListener(this);
        Font ft=new Font("Times New Roman",Font.BOLD,25);
        tf.setFont(ft);
        ta.setFont(ft);
        f.add(tf);
        f.add(b1);
        f.add(b2);
        f.add(ta);
        f.setSize(600,600);
        f.setVisible(true);
       
    }
    public void keyPressed(KeyEvent ke)
    {
        //System.out.println(ke.isControlDown());
        System.out.println("text="+ke.getKeyText(ke.getKeyCode()));
      System.out.println("char="+ke.getKeyChar());

        /*if(ke.isShiftDown() && ke.getKeyCode()==ke.VK_X)
       
            System.out.println("Shift+x");
        }
        System.out.println(ke.getKeyText(ke.getKeyCode()));*/
        if(ke.getKeyChar()==ke.VK_ESCAPE)
        {
            //System.out.println(ke.getKeyChar());
            ta.setText("");
            //System.exit(0);
        }
        //System.out.println(ke.getKeyChar());
        //System.out.println(ke.getKeyCode());
    }
    public void keyReleased(KeyEvent ke)
    {
        //System.out.println("Released");
    }
    public void keyTyped(KeyEvent ke)
    {
        //System.out.println("Typed");
    }
   
}

class KeyListDemo
{
    public static void main(String ar[])
    {
        TestWindow t=new TestWindow();
    }
}
