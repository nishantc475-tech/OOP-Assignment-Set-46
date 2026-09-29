class Shape {

    void display(){
        System.out.println("This is a shape");
    }
}

class Quadrilateral extends Shape {

    void display(){
        super.display();
        System.out.println("This is a quadrilateral");
    }
}

class Square extends Quadrilateral {

    int side = 5;

    void display(){
        super.display();
        System.out.println("This is a square.");
        System.out.println("Side of square: " + side);
        System.out.println("Area of square: " + (side * side));
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.display();
    }
}