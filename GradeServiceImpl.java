import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GradeServiceImpl
        extends UnicastRemoteObject
        implements GradeService {

    public GradeServiceImpl() throws RemoteException {
        super();
    }

    public String getGrade(int rollNo)
            throws RemoteException {

        if (rollNo == 101) {
            return "Student: Ram, Grade: A";
        } else if (rollNo == 102) {
            return "Student: Shyam, Grade: B";
        } else {
            return "Student not found";
        }
    }
}