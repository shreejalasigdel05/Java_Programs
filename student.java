//class and object
public class student {
    int roll;
    String name;
    public void display(){
        System.out.println(roll);
        System.out.println(name);
    }
    public static void main(String[] args) {
        student s=new student();
        s.roll=1;
        s.name="shreejala";
        s.display();
    }
}
