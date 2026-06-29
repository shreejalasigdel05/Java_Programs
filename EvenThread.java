//multithreading program
public class EvenThread extends Thread{
    public void run(){
        System.out.println("Even numbers (1-10): ");
        for(int i=2;i<=10;i+=2){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}