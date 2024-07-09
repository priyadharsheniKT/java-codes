import java.util.*;
import java.io.*;



class TestFile

{

	public static void main(String ar[])

	{

		Scanner s=new Scanner(System.in);

		String fc1="";

		try

		{

			System.out.println("Enter First file name");	

			String fn1=s.nextLine();

			FileInputStream fin1=new FileInputStream(fn1);			

			int y;

			while((y=fin1.read())!=-1)

			{

				fc1=fc1+(char)y;

			}

			fin1.close();

			//System.out.println(fc1);

			int index=-1;

			int count=0;
                         System.out.println("Enter the word?");
                         String str=s.nextLine();

			while((index=fc1.indexOf(str,index+1))!=-1)
			{
	count++;
				System.out.println(index);
			}

			System.out.println("No of occurance:"+count);

		}

		catch(Exception e)

		{

			System.out.println(e);

		}

	}

}