package oops;

class Base1{
    Base1(){
        System.out.println("im a constructor");
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("u are Derived class  constructor");
    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance_2 {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1();
    }

}
