class Test1 implements Runnable
{
    Thread x;
    int i;
    Test1()
    {
        i=0;
        x=new Thread(this);
        x.start();
   
    }
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println("SASTRA");
                Thread.sleep(1000);
                i++;
                if(i==15)
                {
                    x.suspend();
                }
                if(i==25)
                {
                    x.stop();
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class TestMain
{
   
    public static void main(String ar[])throws Exception
    {
           
        Test1 t=new Test1();
        while(true)
        {
            //System.out.println(t.i);        
            Thread.sleep(1000);
            if(t.i==15)
            {
                Thread.sleep(5000);
                t.x.resume();
            }
            if(t.i>=24)
            {
                break;
            }
        }
        System.out.println("Bye..");
        //Thread.sleep(15000);
        //t.x.resume();
    }
}
