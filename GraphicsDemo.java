import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class TestWindow implements MouseListener,MouseMotionListener
{
   
    JFrame f;
    JButton b1,b2;    
    int x1=0,y1=0,x2=0,y2=0;
    Random r;
    TestWindow()
    {
        f=new JFrame("Demo");        
        r=new Random();
        b1=new JButton("dddd");
        f.setLayout(new FlowLayout());
        //b1.addActionListener(this);
        f.addMouseListener(this);
        f.addMouseMotionListener(this);
        f.add(b1);
        f.setSize(600,600);
        //f.setResizable(false);
        f.setVisible(true);
        //Graphics g=f.getGraphics();
        //f.setColor(Color.RED);
        f.setBackground(new Color(100,50,60));
       
    }
    public void mouseExited(MouseEvent me)
    {
        //System.out.println("Exit");
    }
    public void mouseEntered(MouseEvent me)
    {
        //System.out.println("Enter");
    }
    public void mousePressed(MouseEvent me)
    {
           
            x1=me.getX();
            y1=me.getY();
        System.out.println("While Press :"+x1+"  "+y1);
        System.out.println(me.getPoint());
        System.out.println(me.getButton());
        System.out.println("Click Count :"+me.getClickCount());
    }
    public void mouseReleased(MouseEvent me)
    {
       
       
    }
    public void mouseClicked(MouseEvent me)
    {
        //System.out.println("Click");
    }
    public void mouseMoved(MouseEvent me)
    {
        Graphics g=f.getGraphics();
        x2=me.getX();
        y2=me.getY();
        g.setColor(new Color(Math.abs(r.nextInt()%256),Math.abs(r.nextInt()%256),Math.abs(r.nextInt()%256)));
        g.drawLine(x1,y1,x2,y2);
        //x1=x2;
        //y1=y2;
       
        //System.out.println();
    }
    public void mouseDragged(MouseEvent me)
    {
        //System.out.println("Drag");
    }
   

}
   
class GraphicsDemo
{
    public static void main(String ar[])
    {
        TestWindow t=new TestWindow();
    }
}