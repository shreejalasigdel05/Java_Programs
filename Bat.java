//multiple inheritance
interface Animal1{
    void eat();
}
interface Bird{
    void fly();
}
public class Bat implements Animal1, Bird{
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