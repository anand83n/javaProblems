public class Staticv {
   
        int rollno;
        String name; 
        static String college = "ABCcollege"; 

        Staticv(int r, String n) {
            name = n;
            rollno = r; 
        }

        void show() {

            System.out.println(rollno +" "+ name+ " "+ college+ " "); 
            
        }


    public static void main(String[] args) {
        
      Staticv st1 = new Staticv(17, "Anand"); 
      Staticv st2 = new Staticv(20, "Ashok");

      st1.show();
      st2.show(); 

    Staticv.college = " xyz college"; 
 
    st1.show(); 

    }
}
