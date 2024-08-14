import java.util.*;
class JavaTut2{
    public static int addNums(int a,int b){
        return a+b;
    }
public static void main(String[] args) {
    // System.out.println(addNums(4,5));
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your First Number: ");
    int a = sc.nextInt();
    System.out.println(a);

    System.out.println("Enter Your Second Number: ");
    int b = sc.nextInt();
    System.out.println(b);

    System.out.println(addNums(a, b));
}
}
