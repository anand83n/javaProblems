public class occuranceprb4 {
    
    public static void main(String[] args) {
         int[] arr = {2, 5, 3, 5, 7, 5};

         int key = 5; 

         int count = 0; 

        for( int i = 0; i < arr.length; i++) {

            if ( arr[i] == key) {
                count++; 
            }
      
        }
    System.out.println(key + " appears "  + count +  " times.");

    }
}
