import java.lang.*;
import java.util.*;
class employee
{
    int eno,esal;
    String ename;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Name,no and salary");
        ename=sc.next();
        eno=sc.nextInt();
        esal=sc.nextInt();

    }
    void putdata()
    {
        System.out.println(""+eno+"\t"+ename+"\t"+esal);

    }
}
class employee{
    public static void main(String args[])
    {
        int n,i;
        employee e[]=new employee[200];
        Scanner sc=new Scanner(System.in);
        System.out.println("how many records do u want to insert");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            e[i]=new employee();
        }
        System.out.println("enter employee information");
        for(i=0;i<n;i++)
        {
            e[i].getdata();
        }
        System.out.println("emp no,emp name,emp salary");
        for(i=0;i<n;i++)
        {
            e[i].putdata();

        }
    }
}