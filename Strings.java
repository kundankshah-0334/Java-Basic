import java.util.*;

class Strings{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter First name : ");
    String firstName = sc.next();
    System.out.print("Enter Second name :");
    String lastName = sc.next();
    String name = firstName + " "+ lastName;
    System.out.println("The Full name is : "+ firstName + " " + lastName);;
    System.out.println("The lenght of name is : " + name.length());

    
}
}
