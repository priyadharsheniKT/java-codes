class Area1
{
int length;
int breadth;
float area;
Area1()
{
length=breadth=0;
}
Area1(int x,int y)
{
length=x;
breadth=y;
}
void calc()
{
area=length*breadth;
}
void display()
{
System.out.println("Area="+area);
}
}

class Area2 extends Area1
{
int height;
int volume;
Area2(int x,int y,int z)
{
super(x,y);
height=z;
}
void volume()
{
 volume=length*breadth*height;
}
void display()
{
System.out.println("Volume="+volume);
}
}
class InheritenceDemo
{
public static void main(String ar[])
{
Area2 a=new Area2(5,10,12);
a.volume();
a.display();

}
}