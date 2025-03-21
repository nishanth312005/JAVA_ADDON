package day4;

class Candy {
    void taste() {
        System.out.println("Tastes chocolately!");
    }
}

class Chocolate extends Candy {
    @Override
    void taste() {
        System.out.println("Tastes sweet!");
        super.taste(); 
    }
}

public class Task3 {
    public static void main(String[] args) {
        Candy c = new Chocolate();
        c.taste(); 
    }
}
