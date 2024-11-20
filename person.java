import java.util.*;
class person
{
String firstname,middlename,lastname;
int len;
void accept()
 {
System.out.println("Enter First Name :");
Scanner s=new Scanner(System.in);
firstname=s.next();
System.out.println("Enter Middle Name :");
middlename=s.next();
System.out.println("Enter Last Name :");
lastname=s.next();
len=middlename.length();
String f=middlename.substring(0,1);
String l=middlename.substring(1,len);
f=f.toUpperCase();
middlename=f+l;
 }
void display()
 {
System.out.println("Last Name :"+lastname);
System.out.println("First Name :"+firstname);
System.out.println("Middle Name :"+middlename);
 }
 public static void main(String a[])
 {
 person p=new person();
p.accept();
p.display();
 }
}
