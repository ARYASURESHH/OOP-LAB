import java.util.Scanner;
public class CPU{
double price;
public class Processor{
double cores;
String manufacturer;
double getCache (double f){
return f;}}
static class RAM{
double memory;
String manufacturer;
double getClockSpeed(double r)
{
return r;}
}}
class CPUDetails{
public static void main(String[] args){
double p,m;
Scanner s = new Scanner(System.in);
System.out.print("Enter the cache of processor:");
p=s.nextDouble();
System.out.print("Enter the clock speed:");
m=s.nextDouble();
CPU cpu = new CPU();
CPU.Processor processor = cpu.new Processor();
CPU.RAM ram = new CPU.RAM();
cpu.price=(p*1000)+(m*10);
System.out.println("Processor Cache =" + processor.getCache(p));
System.out.println("RAM clock speed = "+ram.getClockSpeed(m));
System.out.println("CPU Price="+cpu.price);
}
}
