   
  import java.util.Scanner;  
   
   public class ArrayProblem {
    

    public static void main(String[]args) {

    Scanner scanner = new Scanner(System.in); 

    System.out.println("Enter the number of elements"); 

   int size  = scanner.nextInt();             
  
   int[] numbers = new int[size];   



  for(int i = 0; i < size; i++) {

    System.out.println("Enter the elements" + (i + 1) +    " :" );     

    numbers[i] = scanner.nextInt();  
    
  
  }
   
for(int i= 0; i <size; i++ ) {

 System.out.println("The elements in the array are " + numbers[i]  );  


  }
    
  scanner.close(); 


    }
    


}
