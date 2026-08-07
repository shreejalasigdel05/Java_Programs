//2. Write a Java program to calculate the area and circumference of a circle.
public class circle {
    public int area(double r){
        return (int)(3.14*r*r);
    }
    public int circumference(double r){
        return (int)(2*3.14*r);
    }
    public static void main(String [] args){
       circle c=new circle();
       System.out.println("Area of circle "+ c.area(7));
       System.out.println("Circumference of circle "+ c.circumference(7));
    }
}


