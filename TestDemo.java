import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
class Test11 implements MouseListener
{
        JButton b1;
        JFrame f;
        JPopupMenu pm;
        JMenu m1,m2,m3;
        JTree jt;
        Test11()
        {
            f=new JFrame();
            f.addMouseListener(this);
           
            f.setSize(600,600);
            DefaultMutableTreeNode soc=new DefaultMutableTreeNode("SoC");
            DefaultMutableTreeNode pg=new DefaultMutableTreeNode("PG");
            DefaultMutableTreeNode ug=new DefaultMutableTreeNode("UG");
            DefaultMutableTreeNode mcse=new DefaultMutableTreeNode("MCSE");
            DefaultMutableTreeNode cse=new DefaultMutableTreeNode("CSE");
            DefaultMutableTreeNode it=new DefaultMutableTreeNode("IT");
            DefaultMutableTreeNode ict=new DefaultMutableTreeNode("ICT");
            DefaultMutableTreeNode seee=new DefaultMutableTreeNode("SEEE");
            DefaultMutableTreeNode some=new DefaultMutableTreeNode("SoME");
            DefaultMutableTreeNode sastra=new DefaultMutableTreeNode("SASTRA");
           
            sastra.add(soc);
            sastra.add(seee);
            sastra.add(some);
           
            soc.add(pg);
            soc.add(ug);
   
            pg.add(mcse);
            ug.add(cse);
            ug.add(it);
            ug.add(ict);

            jt=new JTree(sastra);    
            f.add(jt);    
   

            pm=new JPopupMenu();
            JMenu m1=new JMenu("One");
            JMenu m2=new JMenu("Two");
            JMenuItem m3=new JMenuItem("Three");
            JMenuItem m4=new JMenuItem("Four");
            JMenuItem m5=new JMenuItem("Five");
            pm.add(m1);
            pm.add(m2);
            pm.add(m3);
            pm.add(m4);
            pm.add(m5);
           
               
            f.setVisible(true);            
        }
        public void mousePressed(MouseEvent me)
        {
           
            if(me.getButton()==me.BUTTON3)
            {
                f.add(pm);
                pm.show(f,me.getX(),me.getY());
            }
        }
        public void mouseReleased(MouseEvent me)
        {
        }
        public void mouseExited(MouseEvent me)
        {
        }
        public void mouseEntered(MouseEvent me)
        {
        }
        public void mouseClicked(MouseEvent me)
        {
        }
       
}
class TestDemo
{
    public static void main(String ar[])
    {
        Test11 t=new Test11();
    }
}
