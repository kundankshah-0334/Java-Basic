
class patterns{
public static void main(String[] args) {
    // int String = "*";
    // for(int i = 1; i<=4; i++){
    //     for(int j=1; j<=5; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // System.out.println();

    int r=1;
    int c=5;
    // for(int a = 1; a<=r; a++){
    //     for(int b=1;b<=c; b++){
    //         if( a == 1 || b == 1 || a==r || b==c){
    //             System.out.print("*");
    //         }
    //         else{
    //           System.out.print(" ");
    //     }

    //     }
    //     System.out.println();

    // }
    for(int i = 5; i>=0; i--){
        for(int j = 1; j < i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    int n = 5;
    for(int i = 1 ; i < n; i++ ){
        for(int j = 1; j < n-i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();

    }
}
}
