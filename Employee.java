import java.io.*;
import java.util.Scanner;
class Employee
{ 
 int eNo,eSalary;
 String eName;
 
 void read() throws IOException
 {
   System.out.print("\n");
   Scanner em = new Scanner(System.in);
   System.out.print("Enter the Employee number: ");
   eNo=em.nextInt();
   System.out.print("Enter the Employee name: ");
   eName=em.next();
   System.out.print("Enter the Employee salary: ");
   eSalary=em.nextInt();
 }
 void Display() throws IOException
 {
  System.out.println("Name of the Employee: " + eName);
   System.out.println("salary of the Employee: " + eSalary);
  
  }
public static void main(String args[])throws IOException
{
 int n;
 int emp;
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number of employees: ");
 n=sc.nextInt();
 Employee s[]=new Employee[n];
 for(int i=0;i<n;i++)
 {
  s[i]=new Employee();
  s[i].read();
  
 }
 System.out.print("\nEnter the Employee number to search: ");
 emp=sc.nextInt();

 for(int i=0;i<n;i++)
 {
  if(emp==s[i].eNo)
  {
   s[i].Display();
  }
 }
}
}