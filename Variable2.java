public class Variable2 {
    
    String name; 
    int age; 

    Variable2(String n, int a) {

        name = n; 
        age = a; 
    } 

    
    void displayInfo() {

        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
    }
    public static void main(String[] args) {
        
        Variable2 v1 = new Variable2("Alice", 20); 
        Variable2 v2 = new Variable2("Bob", 22); 

        v1.displayInfo();
        v2.displayInfo(); 


    }
}
