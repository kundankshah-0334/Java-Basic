class fibonacci{
public static void main(String[] args) {
 int a=10;
 int first = 0;
 int second = 1;
 for(int i = 0; i<=a; i++){
    System.out.println(first);
    int next = first+second;
    first = second;
    second = next;
 }
}
}
