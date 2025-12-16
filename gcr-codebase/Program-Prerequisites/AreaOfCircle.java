import java.util.*;
class AreaOfCircle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int radius=sc.nextInt();
double area=(double)Math.PI*radius*radius;
System.out.println("Area of Circle is "+area);
}
}