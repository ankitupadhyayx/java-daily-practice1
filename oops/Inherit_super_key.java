package oops;

class Fristclass{
    int a;

    public int getA() {
        return a;
    }

    Fristclass(int a){
        this.a = a;
    }
    public int  returnone(){
        return 1;

    }
}
class Secondclass extends Fristclass{
    Secondclass(int c){
        super(c);
        System.out.println("i am a constructor");
    }

}
public class Inherit_super_key {
    public static void main(String[] args) {
        Fristclass f= new Fristclass(99);
        Secondclass d = new Secondclass(65);
        System.out.println(f.getA());
    }
}
