import complex.inter.*;
import complex.number.*;
class ComplexArithmeticDemo
{
public static void main(String ar[])
{
Complex a=new Complex(ar[0],ar[1]);
Complex b=new Complex(ar[2],ar[3]);
Complex c=new Complex();
Complex test=new Complex();
if(((a.real>-50&&a.img<50)&& (a.img>-50&&a.img<50))&&((b.real>-30&&b.real<30)&&(b.real>-30&&b.img<30)))
{
c=test.add(a,b);
System.out.println("a+b="+test.toString(c));
c=test.sub(a,b);
System.out.println("a-b="+test.toString(c));
c=test.mul(a,b);
System.out.println("a*b="+test.toString(c));
c=test.div(a,b);
System.out.println("a/b="+test.toString(c));
}
else
System.out.println("Invalid input");
}
}