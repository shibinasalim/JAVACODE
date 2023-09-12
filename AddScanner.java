import java.util.Scanner;

class AddScanner
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number");
int a=s.nextInt();
System.out.println("Enter the second number");
int b=s.nextInt();
System.out.println("Enter the 3d number");
int c=s.nextInt();
int d=a+b+c;
System.out.println("sum is"+d);

}
}