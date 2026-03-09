import java.util.Scanner;

public class OverLoad {

void area(float x) {
System.out.println("The area of the square is " + Math.pow(x , 2) + " sq units");
}
void area(float x , float y){
System.out.println("The area of the rectangle is " + (x * y) + " sq units");
}
void area(double x) {
double z = 3.14 * x * x;
System.out.println("The area of the circle is " + z + " sq units");
}
}
class Over_Load{
public static void main(String[] args) {
OverLoad ob = new OverLoad();
Scanner sc = new Scanner(System.in);
Scanner ar = new Scanner(System.in);
while(true) {
System.out.println("\nEnter your choice");
System.out.println("\n1. Area of the Square");
System.out.println("\n2. Area of the Rectangle");
System.out.println("\n3. Area of the Circle");
System.out.println("\n4. Exit");
int choice;
float a , b;
double x;
choice = sc.nextInt();
switch(choice) {
case 1:
System.out.println("\nEnter the length of the square: ");
a = ar.nextFloat();
ob.area(a);
break;
case 2:
System.out.println("\nEnter the length of the rectangle: ");
a = ar.nextFloat();
System.out.println("Enter the breadth of the rectangle: ");
b = ar.nextFloat();
ob.area(a , b);
break;
case 3:
System.out.println("\nEnter the radius of the circle: ");
x = ar.nextDouble();
ob.area(x);
break;
case 4:
System.out.println("Exiting the program...");
System.exit(0);
default:
System.out.println("Invalid choice");
}
}
}
}
