import java.util.Scanner;
class NegativeNumberException extends Exception{
public NegativeNumberException(String message){
super(message);
}
}
public class Average{
public static double calculateAverage(int n) throws NegativeNumberException{
Scanner sc=new Scanner(System.in);
double sum=0;
for(int i=1;i<=n;i++){
System.out.print("Enter number "+i+": ");
double num=sc.nextDouble();
if(num<0){
throw new NegativeNumberException("Negative numbers are not allowed!");
}
sum+=num;
}
return sum/n;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
try{
System.out.print("Enter how many numbers: ");
int n=sc.nextInt();
double avg=calculateAverage(n);
System.out.println("Average = "+avg);
}catch(NegativeNumberException e){
System.out.println("Exception: "+e.getMessage());
}catch(Exception e){
System.out.println("Invalid input!");
}
}
}
