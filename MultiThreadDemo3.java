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
class Test3 implements Runnable
{
Thread z;
Test3(Thread y)
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
System.out.println("Bye");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class MultiThreadDemo3
{
public static void main(String ar[])
{
Test1 t1=new Test1();
Thread x=new Thread(t1);
Test2 t2=new Test2(x);
Thread y=new Thread(t2);
Test3 t3=new Test3(y);
Thread z=new Thread(t3);
x.start();
y.start();
z.start();
}
}