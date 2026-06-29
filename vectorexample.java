//vector
import java.util.Vector;
public class vectorexample {
    public static void main(String[] args) {
        Vector<String> fruits=new Vector<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Litchi");
        fruits.add("Mango");
        fruits.add("Pineapple");
        System.out.println("Fruits: "+fruits);
        System.out.println("First element is "+fruits.get(0));
        System.out.println("Third element is "+fruits.get(2));
        fruits.remove("Banana");
        System.out.println("After removing banana: "+fruits);
        System.out.println("Size of the fruits is "+fruits.size());
    }
}
