import java.lang.reflect.Method;
class GetMethodsDemo
{
public static void main(String ar[])
{
     Class c=java.lang.String.class;
      Method[] methods = c.getMethods();
      System.out.println("The public methods are:");
      for (int i = 0; i < methods.length; i++) {
         System.out.println(methods[i]);
}
}
}