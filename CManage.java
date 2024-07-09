import java.util.*;
import java.io.*;
class Customer
{
public String cname;
public int cno;
public String city;
public void getDetails(String n,int no,String c)
{
cname=n;
cno=no;
city=c;
}
}
class CManage
{
Scanner s=new Scanner(System.in);
Customer c[]=new Customer[5];
void addCustomer()
{
System.out.println("Enter no. of customers?");
String s1=s.nextLine();
int n=Integer.parseInt(s1);
for(int i=0;i<n;i++)
{
System.out.println("Enter customer name?");
String s2=s.nextLine();
System.out.println("Enter customer no?");
String s3=s.nextLine();
System.out.println("Enter customer city?");
String s4=s.nextLine();
int x=Integer.parseInt(s3);
c[i].getDetails(s2,x,s4);
}
}
void search(int id)
{
for(int i=0;i<c.length;i++)
{
if(id==c[i].cno)
System.out.println("Record found");
else
System.out.println("Record not found");
}
}
public static void main(String ar[])
{
CustomerManagement cm=new CustomerManagement();
Scanner s=new Scanner(System.in);
for(int i=0;i<cm.c.length;i++)
{
cm.c[i]=new Customer();
}
cm.addCustomer();
System.out.println("Enter cust no to search?");
String s7=s.nextLine();
int no=Integer.parseInt(s7);
cm.search(no);
}
}