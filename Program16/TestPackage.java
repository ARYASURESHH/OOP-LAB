import Graphics.*;
import java.util.Scanner;
public class TestPackage{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter side of square:");
int s=sc.nextInt();
Square sq=new Square(s);
System.out.println("Permeter: "+sq.perimeter());
System.out.println("Area: "+sq.area());
System.out.println("Enter radius of circle:");
double r=sc.nextDouble();
Circle ci=new Circle(r);
System.out.println("Perimeter:"+ci.perimeter());
System.out.println("Area:"+ci.area());
System.out.println("Enter 3 sides of triangle:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
Triangle tr=new Triangle(a,b,c);
System.out.println("Perimeter: "+tr.perimeter());
System.out.println("Area: "+tr.area());
System.out.println("Enter length and breadth of rectangle:");
int l=sc.nextInt();
int br=sc.nextInt();
Rectangle rec= new Rectangle(l,br);
System.out.println("Perimeter: " +rec.perimeter());
System.out.println("Area: "+rec.area());
}
}
