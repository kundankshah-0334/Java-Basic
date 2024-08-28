import java.util.*;

class twodArray{
public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    System.out.print("Enetr row : ");
    int row = sc.nextInt();
    System.out.print("Enetr column : ");
    int col = sc.nextInt();
     


    int twodArray [][] = new int[row][col];
    for(int i = 0; i<row; i++){
        
        for(int j = 0; j< col; j++){
            twodArray[i][j] = sc.nextInt();
        }
    }
    for(int i=0; i<row;i++){
        for(int j=0; j<col; j++){
            System.out.print(twodArray[i][j]+ "  ");
        }
        System.out.println();
    }
    System.out.print("Enetr numbet to find : ");
    int findNumber = sc.nextInt();

    for(int i = 0; i<row ; i++){
        for(int j = 0; j<col; j++){
            if(twodArray[i][j] == findNumber){
                System.out.println("The index of "+ findNumber + "is " + i + " "+ j );
            }
        }
    }
    // System.out.println(twodArray);
    
}
}

