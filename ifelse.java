import java.util.*;
class ifelse{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
//  System.out.println("Enter your Age : ");
//  float a = sc.nextFloat();
// System.out.println("Enter A : ");
//  int a = sc.nextInt();
// System.out.println("Enter B : ");
//  int b = sc.nextInt();
// System.out.println("Enter C : ");
//  int c = sc.nextInt();
//  if(a > 80){
//     System.out.println("Tu marne wala hai ... !!");
//  }
//  else{
//     System.out.println("Tere me time hai ... !!");
//  }
//  if(a%2 == 0){
//     System.out.println("Even......");
//  }
//  else{
//     System.out.println("Odd ......");
//  }
// if(a>b && a>c){
//  System.out.print("A is Greatest ........");
// }
// else if(b>a && b>c){
//  System.out.print("B is Greatest ........");
// }
// else if(c>a && c>b){
//  System.out.print("C is Greatest ........");
// }

int a = sc.nextInt();
switch(a){
    case 1 : System.out.println("You Entered One");
    break;
    case 2 : System.out.println("You Entered Two");
    break;
    case 3 : System.out.println("You Entered Three");
    break;
    case 4 : System.out.println("You Entered Four");
    break;
    case 5 : System.out.println("You Entered Five");
    break;
    default: System.out.println("Out of Machine.......");
}

}
}
