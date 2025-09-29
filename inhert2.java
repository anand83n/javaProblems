class Product {

    public int multiply(int a, int b) {
        int prod = a * b;
        return prod; 
    }

    public int multiply ( int a, int b, int c) {
        int prod = a * b * c; 
        return prod; 
    }

}


public class inhert2 {
    
    public static void main(String[] args) {
        
      Product ob = new Product(); 
    
      int prod1 = ob.multiply(1,2);

      System.out.println("product of 2 numbers is :" + prod1); 

      int prod2 = ob.multiply(1, 2, 3); 
      
     System.out.println("product of 3 numbers is :" + prod2); 

     
    }
}

