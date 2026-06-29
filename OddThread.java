//multithreading program
public class OddThread extends Thread{
    public void run(){
        System.out.println("Odd numbers (11-20): ");
        for(int i=11;i<=20;i+=2){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
