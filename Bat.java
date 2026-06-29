//multiple inheritance
interface Animal{
    void eat();
}
interface Bird{
    void fly();
}
public class Bat implements Animal, Bird{
    public void eat(){
        System.out.println("Bat eats fruits.");
    }
    public void fly(){
        System.out.println("Bats can fly.");
    }
    public static void main(String[] args){
        Bat b=new Bat();
        b.eat();
        b.fly();
    }
}