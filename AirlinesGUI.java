import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
class Airlines
{
  String passenger_name,source,destination;
  int passenger_id;
  Airlines(String p_name,int p_id,String src,String dest)
  {
    passenger_name = p_name;
    passenger_id = p_id;
    source = src;
    destination = dest;
  }
  //for displaying using arraylist
  public String toString()
  {
    return "Name :" +passenger_name+"  Id :"+passenger_id+"  Boarding at "+source+" Destination "+destination;
  }
}
//for sorting the arraylist
class PassengerNameComparator implements Comparator<Airlines>
{
  public int compare(Airlines obj1, Airlines obj2)
  {
    return obj1.passenger_name.compareTo(obj2.passenger_name);
  }
}
//for exceptionhandling of passengers
class passengerNotFoundException extends Exception
{
  passengerNotFoundException(String str)
  {
      super(str);
  }
}
class AirlinesManagement{
  boolean found;
  ArrayList <Airlines> al = new ArrayList<Airlines>();
  void add_passenger(Airlines obj)
  {
    al.add(obj);
  }
  void search_passenger(int p_id) throws passengerNotFoundException
  {
    String status = "";
    Iterator <Airlines> itr = al.iterator();
    while(itr.hasNext())
    {
      if(itr.next().passenger_id == p_id)
      {
        found = true;
        break;
      }
      else
        found = false;
    }
    if(found)
    {
      status = "Passenger Found";
    }
    else
    {
      //not used
      status = "Passenger not found";
      throw new passengerNotFoundException("Passenger not found in database!!!!");
    }
  }
  String display()
  {
    String p_data = "";
    al.sort(new PassengerNameComparator());
    for(var obj:al)
    {
      p_data += obj +"\n";
      //System.out.println(obj);
    }
    //System.out.println(p_data);
    return p_data;
  }
}
public class AirlinesGUI extends JFrame
{
  JButton add_p,search_p,display_p,back,submit,search;
  JLabel title,p_name,p_id,src,dest,p_search,searchr;
  JTextField p_namet,p_idt,srct,destt,p_searcht;
  JTextArea passengerdata;
  AirlinesManagement am = new AirlinesManagement();
 
  AirlinesGUI()
  {
    super("Jack & Jill Airlines ");
    am = new AirlinesManagement();
    setSize(900,800);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
   
    title = new JLabel("Jack & Jill Airlines");
    title.setFont(new Font("Impact",Font.BOLD,30));
    title.setBounds(350,50,400,70);
   
    add_p = new JButton("Add passenger");
    add_p.setBounds(50,150,200,30);
   
    search_p = new JButton("Search passenger");
    search_p.setBounds(350,150,200,30);
   
    display_p = new JButton("Display Passenger");
    display_p.setBounds(650,150,200,30);
   
    back = new JButton("Go back");
    back.setBounds(750,700,100,30);
   
    p_name = new JLabel("Passenger name ");
    p_name.setBounds(50,200,150,30);
     
    p_namet = new JTextField("");
    p_namet.setBounds(150,200,150,30);
   
    p_id = new JLabel("Passenger id ");
    p_id.setBounds(50,250,150,30);
   
    p_idt = new JTextField("");
    p_idt.setBounds(150,250,150,30);
   
    src = new JLabel("Boarding at:");
    src.setBounds(50,300,150,30);
   
    srct = new JTextField("");
    srct.setBounds(150,300,150,30);
   
    dest = new JLabel("Destination");
    dest.setBounds(50,350,150,30);
   
    destt = new JTextField("");
    destt.setBounds(150,350,150,30);
   
    p_search = new JLabel("Passenger id ");
    p_search.setBounds(50,200,150,30);
   
    p_searcht = new JTextField("");
    p_searcht.setBounds(200,200,150,30);
   
    search = new JButton("Search");
    search.setBounds(400,700,150,30);
   
    searchr = new JLabel("");
    searchr.setBounds(300,400,400,40);
   
    submit = new JButton("Submit");
    submit.setBounds(400,700,150,30);
   
    passengerdata = new JTextArea();
    passengerdata.setBounds(250,200,400,400);
   
    p_name.setVisible(false);
    p_namet.setVisible(false);
    p_id.setVisible(false);
    p_idt.setVisible(false);
    p_search.setVisible(false);
    p_searcht.setVisible(false);
    src.setVisible(false);

srct.setVisible(false);
    dest.setVisible(false);
    destt.setVisible(false);
    submit.setVisible(false);
    search.setVisible(false);
    searchr.setVisible(false);
    passengerdata.setVisible(false);
   
    add(title);
    add(add_p);
    add(search_p);
    add(display_p);
    add(back);
    add(p_name);
    add(p_namet);
    add(p_id);
    add(p_idt);
    add(p_search);
    add(p_searcht);
    add(src);
    add(srct);
    add(dest);
    add(destt);
    add(submit);
    add(search);
    add(searchr);
    add(passengerdata);
   
  add_p.addActionListener(new ActionListener()
  {
    public void actionPerformed(ActionEvent ae)
    {
     
      p_name.setVisible(true);
      p_namet.setVisible(true);
      p_id.setVisible(true);
      p_idt.setVisible(true);
      src.setVisible(true);
      srct.setVisible(true);
      dest.setVisible(true);
      destt.setVisible(true);
      submit.setVisible(true);
      search_p.setVisible(false);
      display_p.setVisible(false);
     
    }
  }
  );
  search_p.addActionListener(new ActionListener()
  {
    public void actionPerformed(ActionEvent ae)
    {
      p_search.setVisible(true);
      p_searcht.setVisible(true);
      search_p.setVisible(true);
      search.setVisible(true);
      add_p.setVisible(false);
      display_p.setVisible(false);
    }
  }
  );
  search.addActionListener(new ActionListener()
  {
    public void actionPerformed(ActionEvent ae)
    {
      try
      {
      am.search_passenger(Integer.parseInt(p_searcht.getText()));
      searchr.setText("Passenger found");
      }
      catch(passengerNotFoundException error)
      {
        searchr.setText("Passenger not found");
        System.out.println("Exception occured :\n" + error);
      }
      searchr.setVisible(true);
    }
  }
  );
  display_p.addActionListener(new ActionListener()
  {
    public void actionPerformed(ActionEvent ae)
    {
      add_p.setVisible(false);
      search_p.setVisible(false);
      passengerdata.setText(am.display());
      passengerdata.setVisible(true);
      display_p.setVisible(true);
    }
  }
  );
  back.addActionListener(new ActionListener()
  {
    public void actionPerformed(ActionEvent ae)
    {
      p_name.setVisible(false);
      p_namet.setVisible(false);
      p_id.setVisible(false);
      p_idt.setVisible(false);
      p_search.setVisible(false);
      p_searcht.setVisible(false);
      src.setVisible(false);
      srct.setVisible(false);
      dest.setVisible(false);
      destt.setVisible(false);
      submit.setVisible(false);
      search.setVisible(false);
      searchr.setVisible(false);
      passengerdata.setVisible(false);
     
      add_p.setVisible(true);
      search_p.setVisible(true);
      display_p.setVisible(true);
    }
  }
  );
  submit.addActionListener(new ActionListener()
  {
    public void actionPerformed(ActionEvent ae)
    {
      Airlines passenger = new Airlines(p_namet.getText(),Integer.parseInt(p_idt.getText()),srct.getText(),destt.getText());
      am.add_passenger(passenger);
      //am.display();
      p_namet.setText("");
      p_idt.setText("");
      srct.setText("");
      destt.setText("");
    }
  }
  );
  setVisible(true);
  }
public static void main(String[] args)
{
  new AirlinesGUI();
}
}