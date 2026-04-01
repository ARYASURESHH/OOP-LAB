import java.util.Scanner;
class InvalidLoginException extends Exception{
public InvalidLoginException(String message){
super(message);
}
}
public class UserAuthentication{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String username,password;
System.out.println("Enter username:");
username=sc.next();
System.out.println("Enter password:");
password=sc.next();
try{
if(username.equals("admin")&&password.equals("1234")){
System.out.println("Login successful");
}
else{
throw new InvalidLoginException("Invalid username or password");
}}
catch(InvalidLoginException e){
System.out.println("Exception: "+e.getMessage());
}}}
