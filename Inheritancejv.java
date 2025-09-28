class Animal {

    void eat () {

        System.out.println("Animal makes sound"); 
    }
}

class Dog extends Animal {

    @Override void eat () {
        System.out.println("dog barks"); 
    }
}

public class Inheritancejv {
    
    public static void main(String[] args) {
        Animal a = new Dog(); 

        a.eat(); 


    }
}