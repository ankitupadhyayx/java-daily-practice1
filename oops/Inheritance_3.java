//method overrriding
package oops;
    class A{
        public int a;
        public int Ankit(){
            return 4;
        }
        public void meth2(){
            System.out.println("i am method 2 of claas A");
        }
    }
    class B extends A{
        public void meth3(){
            System.out.println("i am method 3 of claas B");
    }
}
public class Inheritance_3 {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
    }
}

