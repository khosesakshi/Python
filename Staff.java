import java.io.*;
import java.util.Scanner;
abstract class Staff {
protected int id;
protected String name;
public Staff(int id, String name) {
this.id = id;
this.name = name;
}
abstract void get_data() throws IOException;
abstract void display();
}
class OfficeStaff extends Staff {
String dept;
OfficeStaff(int a, String b) {
super(a, b);
}
void get_data() throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("\nEnter the ID: ");
id = Integer.parseInt(br.readLine());
System.out.print("Enter the name: ");
name = br.readLine();
System.out.print("Enter the Department name: ");
dept = br.readLine();
System.out.println();
}
void display() {
System.out.println("\nID: " + id);
System.out.println("Name: " + name);
System.out.println("Department: " + dept + "\n");
}
}
class ass3a2 {
public static void main(String[] args) throws IOException {
Scanner sc = new Scanner(System.in);
int st, i;
System.out.print("\nEnter the number of staff: ");
st = sc.nextInt();
Staff s[] = new OfficeStaff[st];
for (i = 0; i < st; i++) {
s[i] = new OfficeStaff(1, "a");
s[i].get_data();
}
for (i = 0; i < st; i++)
s[i].display();
}
}
