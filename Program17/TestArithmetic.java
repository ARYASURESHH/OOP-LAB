import Arithmetic.*;
import java.util.Scanner;
public class TestArithmetic{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number: ");
double a=sc.nextDouble();
System.out.print("Enter second number: ");
double b=sc.nextDouble();
Addition add=new Addition();
Substraction sub=new Substraction();
Multiplication mul=new Multiplication();
Division div=new Division();
System.out.println("Addition: "+add.add(a,b));
System.out.println("Substraction: "+sub.sub(a,b));
System.out.println("Multiplication: "+mul.mul(a,b));
System.out.println("Division: "+div.div(a,b));
}}       
