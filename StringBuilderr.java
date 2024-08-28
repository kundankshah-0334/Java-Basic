import java.util.*;

class StringBuilderr{
public static void main(String[] args) {
    System.out.print("Enter your name");
  Scanner sc= new Scanner(System.in);
String name = sc.next();
  StringBuilder sb = new StringBuilder(name);

  for(int i = 0 ; i <sb.length()/2; i++){
    int front = i;
    int back = sb.length() - 1 - i;

    char atFront = sb.charAt(front);
    char atBack = sb.charAt(back);

    sb.setCharAt(front, atBack);
    sb.setCharAt(back,atFront);

  }
  System.out.println(sb);

}
}
