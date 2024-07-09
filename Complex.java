package complex.number;
import complex.inter.*;
public class Complex implements ArithmeticOperations
{
private double real;
private double img;
public Complex()
{
real=img=0;
}
public Complex(double r,double i)
{
real=r;
img=i;
}
public Complex add(Complex c1,Complex c2)
{
Complex c3=new Complex();
c3.real=c1.real+c2.real;
c3.img=c1.img+c2.img;
return c3;
}
public Complex sub(Complex c1,Complex c2)
{
Complex c3=new Complex();
c3.real=c1.real-c2.real;
c3.img=c1.img-c2.img;
return c3;
}
public Complex mul(Complex c1,Complex c2)
{
Complex c3=new Complex();
c3.real=c1.real*c2.real-c1.img*c2.img;
c3.img=c1.real*c2.img-c1.img*c2.real;
return c3;
}
public Complex div(Complex c1,Complex c2)
{
Complex c3=new Complex();
c3.real=(c1.real*c2.real+c1.img*c2.img)/(c2.real*c2.real+c2.img*c2.img);
c3.img=(c1.img*c2.real-c1.real*c2.img)/(c2.real*c2.real+c2.img*c2.img);
return c3;
}
public void toString(Complex c1)
{
System.out.println("("+c1.real+","+c1.img+")");
}
}