class fact{
    public static int fact(int a){
      if(a == 0 || a== 1){
        return 1;
      }else{
        return a* fact(a-1);
        
      }
    }
public static void main(String[] args) {
    int res =  fact(6);
    System.out.println(res);
}
}
