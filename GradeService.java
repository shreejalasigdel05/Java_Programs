import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GradeService extends Remote {

    String getGrade(int rollNo) throws RemoteException;

}