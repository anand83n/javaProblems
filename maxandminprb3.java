public class maxandminprb3 {
    
    public static void main(String[] args) {
        

         int[] arr = {10, 25, 3, 47, 15}; 


        int max = arr[0]; 

        int min = arr[0];      

        for(int i = 1; i <arr.length; i++) {

            if( arr[i]> max ) {

                max = arr[i]; 

        }
    } 


        for(int i = 1; i <arr.length; i++) {

            if( arr[i] < min ) {

                min = arr[i];                 

        }
    } 


System.out.println("the max element is " + max); 

System.out.println("the min element is " + min);  

}


}