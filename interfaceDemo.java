import java.util.*;
interface operation
{
    double PI=3.14;
    public double getArea();
    public double getVolume();
}
class cylinder implements operation{
    double radius;
    double height;
    public cylinder(double r,double h)
    {
        radius=r;
        height=h;
    }
    public double getArea()
    {
        double a;
        a=(2*PI*this.radius*this.radius)+(2*PI*this.radius*this.height);
        return a;
    }
    public double getVolume()
    {
        double v;
        v=(2*PI*this.radius*this.height);
        return v;
    }
    }
    public class InterfaceDemo
    {
        public static void main(String s[])
        {
            operation o=new cylinder(2,2);
            double ans=o.getArea();
            System.out.println("Volume of cylinder=" +ans);
            double an=o.getVolume();
            System.out.println("volume of cylinder=" +an);

        }
    }
    