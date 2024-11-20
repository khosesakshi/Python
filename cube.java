interface printNumber
{
    public void print(int num1);

}
public class cube
{
    public static void main(String args[])
    {
        printNumber p=n->System.out.println("cube is:"+n*n*n);
        p.print(15);
    }
}