//multithreading program
public class MultiThread{
    public static void main(String[] args) {
        EvenThread t1=new EvenThread();
        OddThread t2=new OddThread();

        t1.start();
        t2.start();
    }
}