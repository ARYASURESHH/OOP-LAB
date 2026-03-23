import java.util.Scanner;
import java.lang.Math;
interface AP
{
void input();
void area();
void perimeter();
}
class Circle implements AP{
int r=0;
double pi = 3.14,area=0,perimeter=0;
public void input()
{
Scanner c = new Scanner(System.in);
r=c.nextInt();
}
public void area()
{
area = pi*r*r;
System.out.println("Area of circle is :" +area);
}
public void perimeter()
{
perimeter = 2 * pi*r;
System.out.println("Perimeter of Circle is :" +perimeter);
}
}
class Rectangle implements AP{
int l=0, b=0;
double area,perimeter;
public void input()
{
Scanner r = new Scanner(System.in);
l=r.nextInt();
b=r.nextInt();
}
public void area()
{
area = l*b;
System.out.println("Area of rectangle is :" +area);
}
public void perimeter()
{
perimeter = 2 * (l+b);
System.out.println("Perimeter of rectangle is :" +perimeter);
}
}
class Square implements AP{
int a = 0;
double area=0,perimeter=0;
public void input() {
Scanner sq = new Scanner(System.in);
a=sq.nextInt();
}
public void area()
{
area = a*a;
System.out.println("Area of square is: " +area);
}
public void perimeter()
{
perimeter = 4*a;
System.out.println("Perimeter of square is " +perimeter);
}
}
class Triangle implements AP{
int a=0,b=0,c=0;
double area=0,perimeter=0;
public void input()
{
Scanner tr = new Scanner(System.in);
a=tr.nextInt();
b=tr.nextInt();
c=tr.nextInt();
}
public void area()
{
double ar=(a+b+c)/2;
area = Math.sqrt(ar*(ar-a)*(ar-b)*(ar-c));
System.out.println("Area of Triangle  is: " +area);
}
public void perimeter()
{
perimeter = a+b+c;
System.out.println("Perimetre of Triangle is: " +perimeter);
}	
}
public class newinterface {
public static void main(String[] args)
{
int ch;
Circle c =  new Circle();
Rectangle r = new Rectangle();
Square sq = new Square();
Triangle tri = new Triangle();
Scanner sc = new Scanner(System.in);
System.out.println("1:Area of circle ");
System.out.println("2:Area of Rectangle");
System.out.println("3:Perimeter of Circle");
System.out.println("4:Perimeter of Rectangle");
System.out.println("5:Area of Square");
System.out.println("6:Perimeter of Square");
System.out.println("7:Area of Triangle");
System.out.println("8:Perimeter of Triangle");
System.out.println("9:Exit");
while(true)
{
System.out.println("Enter your choice");
ch=sc.nextInt();
switch(ch)
{
case 1: 
System.out.println("Enter the radius of the circle");
c.input();
c.area();
break;
case 2:
System.out.println("Enter the length and breadth of the rectangle");
r.input();
r.area();
break;
case 3:
System.out.println("Enter the radius of the circle ");
c.input();
c.perimeter();
break;
case 4:
System.out.println("Enter the length and breadth of the rectangle");
r.input();
r.perimeter();
break;
case 5:
System.out.println("Enter the length of the Square");
sq.input();
sq.area();
break;
case 6:
System.out.println("Enter the length of the Square");
sq.input();
sq.perimeter();
break;
case 7:
System.out.println("Enter the sides of the triangle");
tri.input();
tri.area();
break;
case 8:
System.out.println("Enter the sides of the triangle");
tri.input();
tri.perimeter();
break;
case 9:
System.out.println("Exiting....");
System.exit(0);
break;
default:
System.out.println("Enter a valid choice");
break;
}
}
}
}
