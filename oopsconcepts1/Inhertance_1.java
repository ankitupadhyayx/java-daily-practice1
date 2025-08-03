package oopsconcepts1;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("im setter x now");
        this.x = x;
    }

    public void printme(){
        System.out.println("im a constructor");
    }
}
class Derive extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inhertance_1 {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        //b.getX();
    }

}

    