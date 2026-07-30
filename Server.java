import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String args[]) {

        try {
            LocateRegistry.createRegistry(1099);
            GradeService service = new GradeServiceImpl();
            Naming.rebind("GradeService", service);
            System.out.println("Grade Server Started");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}