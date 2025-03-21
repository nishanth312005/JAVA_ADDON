package day4;

class Dog {
    void pet() {
        System.out.println("I have the best dog!");
    }
}

class Breed extends Dog {
    @Override
    void pet() {
        System.out.println("I have the best pet!");
        super.pet(); 
    }
}

public class Task5 {
    public static void main(String[] args) {
        Dog d = new Breed();
        d.pet(); 
    }
}