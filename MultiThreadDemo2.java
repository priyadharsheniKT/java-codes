class Test1 implements Runnable
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("Hello java");
}
}
}
class Test2 implements Runnable
{
Thread z;
Test2(Thread y)
{
z=y;
}
public void run()
{
try
{
z.join();
for(int i=0;i<10;i++)
{
System.out.println("Welcome to my world");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class MultiThreadDemo2
{
public static void main(String ar[])
{
Test1 t1=new Test1();
Thread x=new Thread(t1);
Test2 t2=new Test2(x);
Thread y=new Thread(t2);
x.start();
y.start();
}
}