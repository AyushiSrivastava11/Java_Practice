import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
public class JavaAssignment1{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter The Reciever's name:-");
     String name1= sc.nextLine();
     System.out.println("Enter The Sender's name:-");
     String name2= sc.nextLine();
     System.out.println("\n\n\n");
     Name naam= new Name(name1,name2);
     naam.greetings();
     sc.close();   
    }
}

class Name
{
    String N1,N2;
    Name(String a,String b)
    {
        N1=a;
        N2=b;
    }
    public void greetings()
    {
        /* 
        System.out.println("Hello " + N);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now));  */
        System.out.println("Dear " + N1 +", \n \t It feels nice that you are learning right now. \n \t I am so proud of you. Always work hard and believe in yourself\n Regards, \n " + N2);
        System.out.println("    Date  :   Time     ");
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now));
    }
}