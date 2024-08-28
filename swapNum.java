class swapNum{
public static void main(String[] args) {
 int a = 70;
 int b = 20;
 System.out.println("Before A : " + a);
 System.out.println("Before B : " + b);
 //**************using third variable****************
//  int c=a;
//  a = b;
//  b=c;
//  System.out.println("After A : " + a);
//  System.out.println("After B : " + b);

 
// **************without using third variable.**************
 a = b+a;
 b= a-b;
 a = a-b;
 System.out.println("After A : " + a);
 System.out.println("After B : " + b);

}
}
