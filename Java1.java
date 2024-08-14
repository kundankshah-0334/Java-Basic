import java.util.*;
class Java1 {
public static int addNumber(int a , int b){
    return a+b;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number : ");
    int x = sc.nextInt();
    System.out.println("Enter Second Number : ");
    int y = sc.nextInt();
    System.out.println("The Sum of Two Number is : ");
    System.out.println(addNumber(x,y));
    
}
}


// intejIdea editor
