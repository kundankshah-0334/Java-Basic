import java.util.*;

class  Array{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter The Size Of Array : ");
  int size = sc.nextInt();
//   System.out.println(size);

  int marks[] = new int[size];

  for(int j=0 ; j<size; j++){
    System.out.print("Enter the "+ j + "number od Array : ");
    marks[j] = sc.nextInt();

  }
  System.out.print("Enetred Array is :" );
  for(int i =0; i< size; i++){
      System.out.print(marks[i]+ ",");
  }

  System.out.print("Enter a number to find in array ");

  int findNumber = sc.nextInt();

  for(int i = 0; i<size; i++){
    if(marks[i] == findNumber){
        System.out.println(" The Number "+ findNumber+ " exist on index " + i + "Array");
    }
   

  }

}
}
