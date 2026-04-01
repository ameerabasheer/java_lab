import java.util.Scanner;
class InvalidLoginException extends Exception{
public InvalidLoginException(String message){
 super(message);
}}
public class UserAuthentication{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
String username,password;
System.out.println("enter username:");
username=sc.next();
System.out.println("enter password:");
password=sc.next();
try{
if(username.equals("admin") && password.equals("123")){
System.out.println("login successful");
}
else{
throw new InvalidLoginException("invalid username and password");
}
}
catch(InvalidLoginException e){
System.out.println("Exception: " +e.getMessage());
}}}
