//method overloading
public class calculator {
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        calculator c= new calculator();
        c.add(3, 2);
        c.add(5, 6, 1);
    }
}

