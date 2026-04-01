import Graphics.*;
import java.util.Scanner;

public class TestPackage_Graphics{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter side of squares:");
int s=sc.nextInt();
Square sq=new Square(s);
System.out.println("perimeter: "+ sq.perimeter());
System.out.println("area: "+ sq.area());
System.out.println("enter radius of circle:");
double r=sc.nextDouble();
Circle ci=new Circle(r);
System.out.println("perimeter: "+ ci.perimeter());
System.out.println("area: "+ ci.area());
System.out.println("enter 3 side of triangle:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
Triangle tr=new Triangle(a,b,c);
System.out.println("perimeter: "+ tr.perimeter());
System.out.println("area: "+ tr.area());
System.out.println("enter length and breadth of rectangle:");
int l = sc.nextInt();
int br = sc.nextInt();
Rectangle re = new Rectangle(l, br);
System.out.println("perimeter: " + re.perimeter());
System.out.println("area: " + re.area());
}
}
