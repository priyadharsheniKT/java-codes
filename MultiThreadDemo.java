class Test1 extends Thread
{
public void run()
{
System.out.println("Hello java");
}
}
class Test2 extends Thread
{
Test1 x;
Test2(Test1 y)
{
x=y;
}
public void run()
{
System.out.println("Welcome to my world");
x.join();
}
}
class MultiThreadDemo
{
public static void main(String ar[])
{
Test1 t1=new Test1();
Test2 t2=new Test2(t1);
t1.start();
t2.start();
}
}
